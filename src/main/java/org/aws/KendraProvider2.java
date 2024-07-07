package org.aws;

import software.amazon.awssdk.regions.Region;
import software.amazon.awssdk.services.kendra.KendraClient;

public class KendraProvider2 {

    public KendraProvider2() {
        KendraClient kendra = KendraClient.builder()
                .region(Region.EU_WEST_1)
                .build();
    }
}
