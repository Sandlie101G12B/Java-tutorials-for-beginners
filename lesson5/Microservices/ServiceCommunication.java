import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients // Enable Feign Clients
public class ServiceCommunication {

    public static void main(String[] args) {
        // SpringApplication.run starts the Spring Boot application.
        SpringApplication.run(ServiceCommunication.class, args);
    }
}

// FeignClient for communication with another service
@FeignClient(name = "other-service", url = "http://localhost:8081")
interface OtherServiceClient {

    // Endpoint in the other service
    @GetMapping("/api/hello")
    String getHello();
}

@RestController
@RequestMapping("/api")
class CommunicationController {

    private final OtherServiceClient otherServiceClient;

    // Constructor injection of OtherServiceClient
    public CommunicationController(OtherServiceClient otherServiceClient) {
        this.otherServiceClient = otherServiceClient;
    }

    // Endpoint to communicate with the other service
    @GetMapping("/communicate")
    public String communicate() {
        return otherServiceClient.getHello();
    }
}
