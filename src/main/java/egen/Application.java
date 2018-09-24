package egen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        //tell springboot how to start embedded tomcat server, deploy REST API
        SpringApplication app = new SpringApplication(Application.class);
        app.run();


    }
}
