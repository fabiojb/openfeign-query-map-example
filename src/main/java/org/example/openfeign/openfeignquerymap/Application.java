package org.example.openfeign.openfeignquerymap;

import feign.Feign;
import feign.Logger;
import feign.slf4j.Slf4jLogger;

public class Application {

	public static void main(String[] args) {
        ExamplePojo example = new ExamplePojo();
        example.setParam1("foo");
        example.setParam2("bar");

        Api client = Feign.builder()
                        .logger(new Slf4jLogger())
                        .logLevel(Logger.Level.BASIC)
                        .target(Api.class, "https://httpstat.us/");

        String response = client.find(example);
        System.out.println(response);
    }
}
