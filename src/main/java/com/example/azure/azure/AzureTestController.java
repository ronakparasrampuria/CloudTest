package com.example.azure.azure;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AzureTestController {

	@GetMapping("/")
	public String getDetails() {
		return "Ronak";
	}
}
