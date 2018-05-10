package com.financial.issues.weldclientproxy.main;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import com.financial.issues.weldclientproxy.tools.HelloLib;

@ApplicationScoped
public class HelloMain {

    @Inject
    protected HelloLib lib;

    public void sayHello() {
        lib.sayHello();
        System.out.println("Main says: Hello World!");
    }

}
