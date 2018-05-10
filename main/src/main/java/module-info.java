module main {
    requires cdi.api;
    requires tools;
    requires javax.inject;
    requires weld.se.core;
    exports com.financial.issues.weldclientproxy.main;
    opens com.financial.issues.weldclientproxy.main;
}
