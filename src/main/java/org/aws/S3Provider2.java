package org.aws;

import software.amazon.awssdk.regions.Region;
import software.amazon.awssdk.services.s3.S3Client;

public class S3Provider2 {

    public S3Provider2() {
        S3Client s3 = S3Client.builder()
                .region(Region.EU_WEST_1)
                .build();
    }
}
