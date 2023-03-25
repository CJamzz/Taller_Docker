package co.edu.uan.sofeng.ejemplo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController; 

@RestController 
public class HelloController {
   @GetMapping("/")
   public String index() {
      return "Welcome to Spring Boot!";
   }

   public class SayHello {
      public SayHello(String string) {
      }

      public SayHello() {
      }

      @GetMapping("/say_hello")
      public String sayHello(@RequestParam(defaultValue = "World") String name) {
         return "Hello World";
      }
   } 
} 
