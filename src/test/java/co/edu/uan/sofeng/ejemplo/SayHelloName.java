package co.edu.uan.sofeng.ejemplo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;

import co.edu.uan.sofeng.ejemplo.HelloController.SayHello;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class SayHelloName{

   @Autowired
   private TestRestTemplate template;

   @Test
   public void getHello() throws Exception {

    SayHello sayHello = new SayHello("Jorge");

      ResponseEntity<String> response = template.getForEntity("/say_hello", String.class);
      assertThat(response.getBody()).isEqualTo("Hello Jorge");
   }
}
