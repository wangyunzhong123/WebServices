package wyz;

import wyz.classes.Hello;
import wyz.classes.HelloService;

/**
 * Created by tianxi on 8/11/16.
 */
public class Test1 {

    public static void main(String args[]) {
        HelloService service=new HelloService();
        Hello helloProxy = service.getHelloPort();
        String hello = helloProxy.hello("你好");
        System.out.println(hello);
    }
}
