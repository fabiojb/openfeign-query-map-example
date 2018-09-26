package org.example.openfeign.openfeignquerymap;

import feign.QueryMap;
import feign.RequestLine;

public interface Api {
    @RequestLine("GET /200")
    String find(@QueryMap ExamplePojo customPojo);
}