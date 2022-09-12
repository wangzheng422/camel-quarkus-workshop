package org.acme;

import javax.enterprise.context.ApplicationScoped;

import org.apache.camel.builder.RouteBuilder;

@ApplicationScoped
public class MyRoutes  extends RouteBuilder /*TODO-FROM-CAMEL-QUARKUS-DOC*/ {
    @Override
    public void configure() {
        /*TODO-FROM-CAMEL-DOC*/from("timer:myTimer")
                .setBody(constant("Transformed message content"))
                .to("log:myLogCategory");
    }
}
