package wyz;

/**
 * Created by tianxi on 8/11/16.
 */

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.xml.ws.Endpoint;

@WebService
public class Hello {

    @WebMethod
    public String hello(String name) {
        return "Hello, " + name + "\n";
    }

    public static void main(String[] args) {
        // create and publish an endpoint
        Hello hello = new Hello();
        Endpoint endpoint = Endpoint.publish("http://localhost:9095/hello", hello);
    }
}
