# Starter Microservice

Spring boot 2.1.4

service-config:
    Spring Cloud Configuration server (@EnableConfigServer)
    http://localhost:8888/note-service/master

service-register:
    Service discovery: Spring Cloud Netflix Eureka (@EnableEurekaServer)
    http://localhost:8761/

service-note:
    REST Microservice, MongoDB
    http://localhost:8081/config

service-proxy:
    Reverse Proxy ZUUL (@EnableZuulProxy)
    http://localhost:8080/note-service/config

