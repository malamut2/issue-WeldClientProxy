package com.financial.issues.weldclientproxy.tools;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class HelloLib {

    public void sayHello() {
        System.out.println("Lib says: Hello World!");
    }

}
