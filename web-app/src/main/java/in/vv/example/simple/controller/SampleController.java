package in.vv.example.simple.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.vv.example.simple.responseVO.HelloResponse;

@RestController
@RequestMapping("/sample")
public class SampleController {
	
	@RequestMapping("/hello")
	public HelloResponse sayHello() {
		return new HelloResponse("Vishwa Vijay", "Hello Vishwa Vijay");
	}
	
}
