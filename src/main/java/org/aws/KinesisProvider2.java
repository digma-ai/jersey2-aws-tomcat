package org.aws;

import software.amazon.awssdk.regions.Region;
import software.amazon.awssdk.services.kinesis.KinesisClient;

public class KinesisProvider2 {

    public KinesisProvider2() {

        KinesisClient kinesisClient = KinesisClient.builder()
                .region(Region.EU_WEST_1)
                .build();
    }
}
