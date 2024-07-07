package org.aws;

import software.amazon.awssdk.regions.Region;
import software.amazon.awssdk.services.sesv2.SesV2Client;

public class SesProvider2 {


    public SesProvider2() {
        SesV2Client sesv2Client = SesV2Client.builder()
                .region(Region.EU_WEST_1)
                .build();
    }
}
