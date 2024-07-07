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

import org.aws.ProvidersFactory;
import org.aws.SqsProvider1;
import org.aws.SqsProvider2;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import java.util.Date;

/**
 * @author Pavel Bucek
 */
@Path("aws")
public class AWSResource {





    @Path("2")
    @GET
    @Produces("text/plain")
    public String doAws2() {

        try {
            System.out.println("in doAws2");

            //create all aws providers
            ProvidersFactory.createProviders();

            SqsProvider2 sqsProvider2 = (SqsProvider2) Class.forName("org.aws.SqsProvider2").getDeclaredConstructor().newInstance();

            sqsProvider2.sqsCall();

            return "Hello World AWS 2 " + new Date();

        } catch (Exception e) {
            System.out.println("error in doAws2 " + e);
            e.printStackTrace();
            return "Hello World AWS 2 Error :" + e;
        }
    }


    @Path("1")
    @GET
    @Produces("text/plain")
    public String doAws1() {

        try {
            System.out.println("in doAws1");

            SqsProvider1 sqsProvider1 = (SqsProvider1) Class.forName("org.aws.SqsProvider1").getDeclaredConstructor().newInstance();

            sqsProvider1.sqsCall();

            return "Hello World AWS 1 " + new Date();

        } catch (Exception e) {
            System.out.println("error in doAws1 " + e);
            e.printStackTrace();
            return "Hello World AWS 1 Error :" + e;
        }
    }




}
