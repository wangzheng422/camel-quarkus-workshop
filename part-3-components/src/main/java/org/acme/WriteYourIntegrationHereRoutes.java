package org.acme;

import javax.enterprise.context.ApplicationScoped;

import org.apache.camel.builder.RouteBuilder;

/**
 * Please write your integration logic here to transfer messages from the source
 * system to the target system.
 */
@ApplicationScoped
public class WriteYourIntegrationHereRoutes extends RouteBuilder {
    @Override
    public void configure() {
      // TODO: Write your route here
      // from("file:target/in-orders")
      //           .to("http:localhost:8080/out-orders");

      // from("file:target/in-orders-recursive/?recursive=true")
      //   .to("file:target/out-orders/");

      from("file:target/in-orders-recursive/?recursive=true")
                .to("activemq:out-orders");
    }
}
