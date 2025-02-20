// Service class with a method to serve
class Service {
    public void serve() {
        System.out.println("Service is serving.");
    }
}

// Client class that depends on Service
class Client {
    private Service service;

    // Constructor to inject the Service dependency
    public Client(Service service) {
        this.service = service;
    }

    // Method to use the Service
    public void doSomething() {
        service.serve();
    }
}

// Main class to demonstrate Dependency Injection
public class DependencyInjection {
    public static void main(String[] args) {
        // Create a Service object
        Service service = new Service();
        // Inject the Service object into the Client
        Client client = new Client(service);
        // Call the doSomething method of the Client
        client.doSomething();
    }
}
