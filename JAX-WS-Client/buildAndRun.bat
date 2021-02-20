@echo off
call mvn clean compile assembly:single
call java -jar .\target\JAX-WS-Client-jar-with-dependencies.jar
