package org.aws;

import software.amazon.awssdk.regions.Region;
import software.amazon.awssdk.services.firehose.FirehoseClient;

public class FirehoseProvider2 {

    public FirehoseProvider2() {
        FirehoseClient firehoseClient = FirehoseClient.builder()
                .region(Region.EU_WEST_1)
                .build();
    }
}
