package org.aws;

import software.amazon.awssdk.regions.Region;
import software.amazon.awssdk.services.kms.KmsClient;

public class KmsProvider2 {

    public KmsProvider2() {
        KmsClient kmsClient = KmsClient.builder()
                .region(Region.EU_WEST_1)
                .build();
    }
}
