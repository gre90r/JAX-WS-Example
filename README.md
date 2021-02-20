# JAX-WS Example
This application is a minimum example of a JAX-WS-Client which calls a method from a JAX-WS-Server. JAX-WS is using SOAP for the remote procedure call.

This example has been built on Windows, but is easily adjustable to UNIX systems.

# Dependencies
* Maven
* Java 7+ (compiles with Java 11)
* wsimport.exe
    * download with JDK 7

# Run
1. start JAX-WS-Server
    * run `.\JAX-WS-Server\buildAndRun.bat`
2. generate WSDL
    * run `.\JAX-WS-Client\generateWSDL.bat`
        * this script gets the WSDL from the running server and generates the Java sources for the client
        * adjust `set wsimport="C:\Program Files\Java\jdk1.7.0_80\bin\wsimport.exe"` to your JDK 7 location with wsimport.exe
3. run JAX-WS-Client
    * run `.\JAX-WS-Client\buildAndRun.bat`

# Reference
Introducing SOAP and JAX-WS -> https://www.youtube.com/watch?v=fE1pVSiXNkU
