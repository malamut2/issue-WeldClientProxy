package com.financial.issues.weldclientproxy.main;

import org.jboss.weld.environment.se.Weld;

import javax.enterprise.inject.spi.CDI;

public class MainExecutor {

    public static void main(String[] args) {
        new Weld().initialize();
        HelloMain mainInstance = CDI.current().select(HelloMain.class).get();
        mainInstance.sayHello();
    }

}
