package org.aws;

import software.amazon.awssdk.regions.Region;
import software.amazon.awssdk.services.sts.StsClient;

public class StsClient2 {

    public StsClient2() {
        StsClient stsClient = StsClient.builder()
                .region(Region.EU_WEST_1)
                .build();
    }
}
