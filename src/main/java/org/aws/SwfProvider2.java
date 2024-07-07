package org.aws;

import software.amazon.awssdk.regions.Region;
import software.amazon.awssdk.services.swf.SwfClient;

public class SwfProvider2 {

    public SwfProvider2() {
        SwfClient swf = SwfClient.builder()
                .region(Region.EU_WEST_1)
                .build();
    }
}
