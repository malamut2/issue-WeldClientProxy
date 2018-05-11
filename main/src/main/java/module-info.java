module main {
    requires cdi.api;
    requires tools;
    requires javax.inject;
    requires weld.se.core;
    requires weld.environment.common;
    requires weld.core.impl;
    requires weld.api;
    exports com.financial.issues.weldclientproxy.main;
    opens com.financial.issues.weldclientproxy.main;
}
