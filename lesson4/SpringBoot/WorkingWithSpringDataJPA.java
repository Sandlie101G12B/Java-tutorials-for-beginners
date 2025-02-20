
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.List;

@SpringBootApplication
public class WorkingWithSpringDataJPA {

    public static void main(String[] args) {
        // SpringApplication.run starts the Spring Boot application.
        SpringApplication.run(WorkingWithSpringDataJPA.class, args);
    }
}

@Entity
class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    // Getters and setters for the fields.
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

@Repository
interface UserRepository extends JpaRepository<User, Long> {
    // JpaRepository provides CRUD operations for the User entity.
}

@RestController
@RequestMapping("/users")
class UserController {

    private final UserRepository userRepository;

    // Constructor injection of the UserRepository.
    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    // Endpoint to get all users.
    @GetMapping
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    // Endpoint to create a new user.
    @PostMapping
    public User createUser(@RequestBody User user) {
        return userRepository.save(user);
    }
}
