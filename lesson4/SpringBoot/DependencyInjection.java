
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
class ServiceComponent {

    // This method simulates a service that performs some action.
    public void serve() {
        System.out.println("Service is serving.");
    }
}

@Service
class ClientService {

    private final ServiceComponent serviceComponent;

    // Constructor injection of the ServiceComponent.
    @Autowired
    public ClientService(ServiceComponent serviceComponent) {
        this.serviceComponent = serviceComponent;
    }

    // This method calls the serve method of the ServiceComponent.
    public void doSomething() {
        serviceComponent.serve();
    }
}

@SpringBootApplication
public class DependencyInjection {

    public static void main(String[] args) {
        // SpringApplication.run starts the Spring Boot application.
        SpringApplication.run(DependencyInjection.class, args);
    }
}
