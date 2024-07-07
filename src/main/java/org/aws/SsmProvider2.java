package org.aws;

import software.amazon.awssdk.regions.Region;
import software.amazon.awssdk.services.ssm.SsmClient;

public class SsmProvider2 {


    public SsmProvider2() {
        SsmClient ssmClient = SsmClient.builder()
                .region(Region.EU_WEST_1)
                .build();
    }
}
