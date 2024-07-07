package org.aws;

import software.amazon.awssdk.regions.Region;
import software.amazon.awssdk.services.dynamodb.DynamoDbClient;

public class DynamoDbProvider {

    public DynamoDbProvider() {

        DynamoDbClient ddb = DynamoDbClient.builder()
                .region(Region.EU_WEST_1)
                .build();
    }
}
