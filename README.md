cambiar el contenido de application.properties con lo siguiente :


# Server port
server.port = 8085

# MongoDB configuration
spring.application.name=microservicio-creditos
spring.config.import=configserver:http://localhost:8888
eureka.client.serviceUrl.defaultZone=http://localhost:8761/eureka/
spring.cloud.config.enabled=true
