package com.jaxwsservice;

import jakarta.jws.WebMethod;
import jakarta.jws.WebService;

@WebService
public interface MyWebServiceInterface {

    @WebMethod
    String myGreetingMessage(String name);

}
