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

        MyWebServiceImplementation myService = service.getPort(MyWebServiceImplementation.class);

        System.out.println(myService.myGreetingMessage("Alice"));

    }
}
