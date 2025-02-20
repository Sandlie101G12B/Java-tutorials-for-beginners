import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

@SpringBootApplication
public class CallingExternalAPIs {

    public static void main(String[] args) {
        // SpringApplication.run starts the Spring Boot application.
        SpringApplication.run(CallingExternalAPIs.class, args);
    }

    // Bean for RestTemplate
    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

    // Bean for WebClient.Builder
    @Bean
    public WebClient.Builder webClientBuilder() {
        return WebClient.builder();
    }
}

@RestController
@RequestMapping("/api")
class ApiController {

    private final RestTemplate restTemplate;
    private final WebClient webClient;

    // Constructor injection of RestTemplate and WebClient.Builder
    public ApiController(RestTemplate restTemplate, WebClient.Builder webClientBuilder) {
        this.restTemplate = restTemplate;
        this.webClient = webClientBuilder.baseUrl("https://jsonplaceholder.typicode.com").build();
    }

    // Endpoint to call external API using RestTemplate
    @GetMapping("/resttemplate")
    public String callApiWithRestTemplate() {
        return restTemplate.getForObject("https://jsonplaceholder.typicode.com/posts/1", String.class);
    }

    // Endpoint to call external API using WebClient
    @GetMapping("/webclient")
    public String callApiWithWebClient() {
        return webClient.get().uri("/posts/1").retrieve().bodyToMono(String.class).block();
    }
}
