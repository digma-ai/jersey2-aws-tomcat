package org.aws;

import software.amazon.awssdk.regions.Region;
import software.amazon.awssdk.services.ec2.Ec2Client;

public class Ec2Provider2 {
    public Ec2Provider2() {
        Ec2Client ec2 = Ec2Client.builder()
                .region(Region.EU_WEST_1)
                .build();
    }
}
