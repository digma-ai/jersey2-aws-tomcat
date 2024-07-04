package org.aws;

import com.amazonaws.services.sqs.AmazonSQS;
import com.amazonaws.services.sqs.AmazonSQSClientBuilder;

public class SqsProvider1 {

	private final AmazonSQS sqs;

	public SqsProvider1() {
		sqs = AmazonSQSClientBuilder.standard()
				.withRegion("eu-west-1")
				.build();
	}

	public void sqsCall() {

		String message = "Hello, World!";

		String queueUrl = sqs.getQueueUrl("shay-test").getQueueUrl();

		com.amazonaws.services.sqs.model.SendMessageRequest sendMessageRequest = new com.amazonaws.services.sqs.model.SendMessageRequest(queueUrl, message);
		sqs.sendMessage(sendMessageRequest);

		System.out.println("Message sent to the queue: " + message);

	}

}
