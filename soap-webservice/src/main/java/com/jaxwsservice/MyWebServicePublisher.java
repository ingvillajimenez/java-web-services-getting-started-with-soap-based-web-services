package com.jaxwsservice;

import jakarta.xml.ws.Endpoint; // abstract class Endpoint

public class MyWebServicePublisher {

    public static void main(String[] args) {
        //WARNING: An illegal reflective access operation has occurred
        //WARNING: Illegal reflective access by com.sun.xml.ws.model.Injector (file:/Users/juan/.m2/repository/com/sun/xml/ws/jaxws-rt/3.0.0/jaxws-rt-3.0.0.jar) to method java.lang.ClassLoader.defineClass(java.lang.String,byte[],int,int)
        //WARNING: Please consider reporting this to the maintainers of com.sun.xml.ws.model.Injector
        //WARNING: Use --illegal-access=warn to enable warnings of further illegal reflective access operations
        //WARNING: All illegal access operations will be denied in a future release

        Endpoint.publish("http://localhost:8081/webservice/greeting",
                new MyWebServiceImplementation());
    }
}