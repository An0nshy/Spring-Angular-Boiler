package com.playground.spring.datajpa.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class TutorialController {

	@GetMapping("/demo")
	public ResponseEntity<String> getContent() {
		return ResponseEntity.ok().body("okay");
	}
}
