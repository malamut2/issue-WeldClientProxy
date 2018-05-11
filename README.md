# issue-WeldClientProxy
Demonstrates the behaviour of WeldClientProxy with the Java 9 module system.

The original motivation for creating this test case was to find the cause of the following type of exception:
```
java.lang.IllegalAccessError: superinterface check failed: class com.financial.issues.weldclientproxy.tools.HelloLib$Proxy$_$$_WeldClientProxy (in module tools) cannot access class org.jboss.weld.proxy.WeldClientProxy (in unnamed module @0x6ea1bcdc) because module tools does not read unnamed module @0x6ea1bcdc
```
The cause has been found. The exception will occur if
``` java
requires weld.api;
```
is removed from module-info.java.

This has been rather difficult to find out because the problem occurs only in specific environments, specifically in the maven surefire environment.
It seems that, in some cases, the missing module dependency is automatically substituted, or does not matter. 
