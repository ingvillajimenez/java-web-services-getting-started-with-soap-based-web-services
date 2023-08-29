package client;

import java.net.URL; // final class URL

import javax.xml.namespace.QName; // class QName
import jakarta.xml.ws.Service; // class Service

public class GreetingClient {

    public static void main(String[] args) throws Exception {

        URL wsdlUrl = new URL("http://localhost:8081/webservice/greeting?wsdl");

        QName qName = new QName("http://jaxwsservice.com/",
                "MyWebServiceImplementationService");

        Service service = Service.create(wsdlUrl, qName);

        MyWebServiceInterface myService = service.getPort(MyWebServiceInterface.class);

//        MyWebServiceImplementation myService = service.getPort(MyWebServiceImplementation.class);
        //Exception in thread "main" jakarta.xml.ws.WebServiceException: Undefined port type: {http://jaxwsservice.com/}MyWebServiceImplementation
        //	at com.sun.xml.ws.client.WSServiceDelegate.getPort(WSServiceDelegate.java:442)
        //	at com.sun.xml.ws.client.WSServiceDelegate.getPort(WSServiceDelegate.java:449)
        //	at jakarta.xml.ws.Service.getPort(Service.java:210)
        //	at client.GreetingClient.main(GreetingClient.java:19)

        System.out.println(myService.myGreetingMessage("Alice"));

    }
}
