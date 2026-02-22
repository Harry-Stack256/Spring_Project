package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;


@RestController
class DemoApplicationTests {



		@RequestMapping("/")
		public String home() {
			return "Hello World!";
		}

	@Test
	void contextLoads() {
	}

}
