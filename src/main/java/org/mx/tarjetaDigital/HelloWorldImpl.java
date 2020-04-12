
package org.mx.tarjetaDigital;

import javax.jws.WebService;

@WebService(endpointInterface = "org.mx.tarjetaDigital.HelloWorld")
public class HelloWorldImpl implements HelloWorld {

    public String sayHi(String text) {
        return "Hello " + text;
    }
    @Override
    public String saybye(String text){
        return  "Bye "+ text;
    }
}

