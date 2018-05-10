package com.financial.issues.weldclientproxy.main;

import com.financial.issues.weldclientproxy.tools.HelloLib;
import org.jboss.weld.junit5.WeldInitiator;
import org.jboss.weld.junit5.WeldJunit5Extension;
import org.jboss.weld.junit5.WeldSetup;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

@ExtendWith(WeldJunit5Extension.class)
@ApplicationScoped
public class MainTest {

    @WeldSetup
    private WeldInitiator weld = WeldInitiator.of(
            HelloMain.class, HelloLib.class
    );

    @Inject
    private HelloMain main;

    @Test
    public void testHello() {
        main.sayHello();
    }
}
