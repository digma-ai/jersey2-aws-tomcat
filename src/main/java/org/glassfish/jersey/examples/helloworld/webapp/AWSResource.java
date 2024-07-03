/*
 * Copyright (c) 2012, 2019 Oracle and/or its affiliates. All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Distribution License v. 1.0, which is available at
 * http://www.eclipse.org/org/documents/edl-v10.php.
 *
 * SPDX-License-Identifier: BSD-3-Clause
 */

package org.glassfish.jersey.examples.helloworld.webapp;

import org.aws.SqsProvider;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

/**
 * @author Pavel Bucek
 */
@Path("aws")
public class AWSResource {

    @GET
    @Produces("text/plain")
    public String doAws() {

        try {
            SqsProvider sqsProvider = (SqsProvider) Class.forName("org.aws.SqsProvider").getDeclaredConstructor().newInstance();

            sqsProvider.sqsCall();

            return "Hello World AWS";

        }
//        catch (ReflectiveOperationException e){
//            e.printStackTrace();
//            return "Hello World AWS Error :" + e;
//        }
        catch (Exception e) {
            e.printStackTrace();
            return "Hello World AWS Error :" + e;
        }
    }


}
