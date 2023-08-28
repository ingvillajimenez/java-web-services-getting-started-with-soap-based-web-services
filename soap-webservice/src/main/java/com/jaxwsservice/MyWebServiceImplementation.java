package com.jaxwsservice;

import jakarta.jws.WebMethod; // @interface WebMethod
import jakarta.jws.WebService; // @interface WebService

@WebService
public class MyWebServiceImplementation {

    @WebMethod
    public String myGreetingMessage(String myStr) {

        return "Hello, " + myStr + ". Welcome to the world of Web Services!";
    }
}

// Older Tomcat users (versions 9 or older)
// Use version 2.3.2 for jaxws-rt dependency

// Older Tomcat users
// Use javax.jws.WebMethod and javax.jws.WebService;

// In order to solve Exception in thread "main" java.lang.NoClassDefFoundError: jakarta/activation/DataSource
// https://mvnrepository.com/artifact/jakarta.activation/jakarta.activation-api/2.0.0

// Older Tomcat users
// Head to https://mvnrepository.com/artifact/javax.activation/javax.activation-api/1.2.0
