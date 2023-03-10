package myapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MYfirstApi {
	@GetMapping(value = 
			
			"/api1") // localhost:8090/api1
	public String greet() {
		return "hello from spring boot method 1!";
	}

//	@GetMapping(value = "/api2") // localhost:8090/api2
//	public String greet2() {
//		return "hi from spring boot! method 2";
//	}
}
