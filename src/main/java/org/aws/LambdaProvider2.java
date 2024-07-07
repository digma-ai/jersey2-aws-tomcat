package org.aws;

import software.amazon.awssdk.regions.Region;
import software.amazon.awssdk.services.lambda.LambdaClient;

public class LambdaProvider2 {
    public LambdaProvider2() {
        LambdaClient awsLambda = LambdaClient.builder()
                .region(Region.EU_WEST_1)
                .build();
    }
}
