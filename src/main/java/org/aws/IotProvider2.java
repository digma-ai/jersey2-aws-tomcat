package org.aws;

import software.amazon.awssdk.regions.Region;
import software.amazon.awssdk.services.iot.IotClient;

public class IotProvider2 {

    public IotProvider2() {
        IotClient iotClient = IotClient.builder()
                .region(Region.EU_WEST_1)
                .build();
    }
}
