package com.services.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 * health – Shows application health information (a simple ‘status’ when accessed over an unauthenticated connection or full message details when authenticated); it’s not sensitive by default
/info – Displays arbitrary application info; not sensitive by default
/metrics – Shows ‘metrics’ information for the current application; it’s also sensitive by default
/trace – Displays trace information (by default the last few HTTP requests)
 * @author venkat
 * 
 * http://localhost:8080/health
 *
 */
@RestController
public class SimpleRestController {
	@GetMapping("/example")
	public String example() {
		return "Hello User abcdasdasdsd d!.jdajdlkasjdlk! ";
	}
}
