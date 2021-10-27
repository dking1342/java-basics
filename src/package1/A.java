package package1;
import package2.*;

public class A {

    protected String protectedAMessage = "Protected message in A class";

    // example of private
    // cannot print the private message
    // B b = new B();
    // System.out.println(b.privateMsg);

    public String publicMessage(){
        C c = new C();
        return c.publicMsg;
    }

    public String protectMsgs(){
        return this.protectedAMessage;
    }



}