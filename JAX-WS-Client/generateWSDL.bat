@echo off
rem for generating the WSDL your JAX-WS Server has to be running

set WSDL_URL=http://localhost:8080/employee-service?wsdl
set SRC_DIR=.\src\main\java\
set DEST_DIR=.\bin\

mkdir .\bin

rem wsimport has been removed from JDK 11, so downlad JDK 7 to get the executable
set wsimport="C:\Program Files\Java\jdk1.7.0_80\bin\wsimport.exe"

%wsimport% -keep -verbose -s %SRC_DIR% -d %DEST_DIR% %WSDL_URL%
