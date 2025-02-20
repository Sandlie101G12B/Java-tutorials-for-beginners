
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

class Service {

    // This method simulates a service that performs some action.
    public String serve() {
        return "Service is serving.";
    }
}

class Client {

    private final Service service;

    // The Client class depends on the Service class.
    public Client(Service service) {
        this.service = service;
    }

    // This method calls the serve method of the Service class.
    public String doSomething() {
        return service.serve();
    }
}

public class MockingWithMockito {

    @Test
    public void testDoSomething() {
        // Mockito is a framework for creating mock objects.
        // Mocking is used to simulate the behavior of real objects in controlled ways.
        Service mockService = Mockito.mock(Service.class);

        // Define the behavior of the mock object.
        when(mockService.serve()).thenReturn("Mocked Service is serving.");

        // Use the mock object in the Client class.
        Client client = new Client(mockService);

        // Verify that the Client class behaves as expected when using the mock object.
        assertEquals("Mocked Service is serving.", client.doSomething());
    }
}
