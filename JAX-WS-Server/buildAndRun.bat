@echo off
call mvn clean compile assembly:single
call java -jar .\target\JAX-WS-Server-jar-with-dependencies.jar
