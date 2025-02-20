
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
public class HandlingApiRequests {

    public static void main(String[] args) {
        // SpringApplication.run starts the Spring Boot application.
        SpringApplication.run(HandlingApiRequests.class, args);
    }
}

@RestController
@RequestMapping("/api")
class ApiController {

    // Endpoint to handle GET requests.
    @GetMapping("/greet")
    public String greet() {
        return "Greetings!";
    }

    // Endpoint to handle POST requests.
    @PostMapping("/echo")
    public String echo(@RequestBody String message) {
        return "Echo: " + message;
    }
}
