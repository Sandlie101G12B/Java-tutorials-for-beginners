import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import graphql.schema.GraphQLSchema;
import graphql.schema.StaticDataFetcher;
import graphql.GraphQL;
import graphql.schema.idl.RuntimeWiring;
import graphql.schema.idl.SchemaGenerator;
import graphql.schema.idl.SchemaParser;
import graphql.schema.idl.TypeDefinitionRegistry;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@SpringBootApplication
public class RestfulApisAndGraphQL {

    public static void main(String[] args) {
        // SpringApplication.run starts the Spring Boot application.
        SpringApplication.run(RestfulApisAndGraphQL.class, args);
    }
}

@RestController
@RequestMapping("/api")
class ApiController {

    // Endpoint to handle GET requests in REST API
    @GetMapping("/greet")
    public String greet() {
        return "Greetings from REST API!";
    }
}

@RestController
@RequestMapping("/graphql")
class GraphQLController {

    private final GraphQL graphQL;

    // Constructor to initialize GraphQL schema
    public GraphQLController() {
        String schema = "type Query{hello: String}";
        TypeDefinitionRegistry typeRegistry = new SchemaParser().parse(schema);
        RuntimeWiring wiring = RuntimeWiring.newRuntimeWiring()
                .type("Query", builder -> builder.dataFetcher("hello", new StaticDataFetcher("Hello from GraphQL!")))
                .build();
        GraphQLSchema graphQLSchema = new SchemaGenerator().makeExecutableSchema(typeRegistry, wiring);
        this.graphQL = GraphQL.newGraphQL(graphQLSchema).build();
    }

    // Endpoint to handle GraphQL queries
    @PostMapping
    public Map<String, Object> execute(@RequestBody String query) {
        return graphQL.execute(query).getData();
    }
}
