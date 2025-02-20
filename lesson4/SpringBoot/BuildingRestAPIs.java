
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class BuildingRestAPIs {

    public static void main(String[] args) {
        // SpringApplication.run starts the Spring Boot application.
        SpringApplication.run(BuildingRestAPIs.class, args);
    }
}

@RestController
@RequestMapping("/api")
class ApiController {

    // Endpoint to handle GET requests.
    @GetMapping("/hello")
    public String sayHello() {
        return "Hello, World!";
    }
}
