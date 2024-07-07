package org.aws;

import software.amazon.awssdk.http.nio.netty.NettyNioAsyncHttpClient;
import software.amazon.awssdk.regions.Region;
import software.amazon.awssdk.services.sqs.SqsAsyncClient;
import software.amazon.awssdk.services.sqs.model.GetQueueUrlRequest;
import software.amazon.awssdk.services.sqs.model.GetQueueUrlResponse;
import software.amazon.awssdk.services.sqs.model.SendMessageRequest;
import software.amazon.awssdk.services.sqs.model.SendMessageResponse;

import java.io.File;
import java.util.concurrent.CompletableFuture;

public class SqsProvider2 {

    private final SqsAsyncClient sqsClient;

    public SqsProvider2() {

        sqsClient = SqsAsyncClient
                .builder()
                .httpClient(NettyNioAsyncHttpClient.builder().maxConcurrency(10).build())
                .region(Region.EU_WEST_1)
                .build();

    }

//    private void logs() {
//        try {
//
//            File file = new File("/usr/local/tomcat/lib/aws-sdk-java-2.24.13.jar");
//            if (file.exists()){
//                System.out.println("aws jar exist "+file.getCanonicalPath());
//            }else{
//                System.out.println("aws jar does NOT exist "+file.getCanonicalPath());
//            }
//
//            System.out.println("MyInterceptor class loader is "+MyInterceptor.class.getClassLoader());
//            System.out.println("SqsAsyncClient class loader is "+SqsAsyncClient.class.getClassLoader());
//
//        }catch (Throwable e){
//            e.printStackTrace();
//        }
//    }

    public void sqsCall() {

        getQueueUrlByName(sqsClient, "shay-test")
                .thenAccept(queueUrl -> {
                    SendMessage(sqsClient, queueUrl).whenComplete((sendMessageResponse, throwable) -> {
                        if (throwable != null) {
                            throwable.printStackTrace();
                        } else {
                            System.out.println("Message sent. ID: " + sendMessageResponse.messageId());
                        }
                    });
                });

    }

    public CompletableFuture<SendMessageResponse> SendMessage(SqsAsyncClient sqsClient, String queueUrl) {
        SendMessageRequest sendMessageRequest = SendMessageRequest.builder()
                .queueUrl(queueUrl)
                .messageBody("hello")
                .build();

        return sqsClient.sendMessage(sendMessageRequest);

    }

    public CompletableFuture<String> getQueueUrlByName(SqsAsyncClient sqsAsyncClient, String queueName) {
        GetQueueUrlRequest getQueueUrlRequest = GetQueueUrlRequest.builder()
                .queueName(queueName)
                .build();

        CompletableFuture<GetQueueUrlResponse> futureResponse = sqsAsyncClient.getQueueUrl(getQueueUrlRequest);

        return futureResponse.thenApply(GetQueueUrlResponse::queueUrl);
    }
}
