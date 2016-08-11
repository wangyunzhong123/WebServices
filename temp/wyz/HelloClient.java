import wyz.*;
public class HelloClient {
 public static void main(String args[]) { 
  HelloService service=new HelloService();
   Hello helloProxy = service.getHelloPort(); 
   String hello = helloProxy.hello("你好");        
   System.out.println(hello); 
   } 
}
