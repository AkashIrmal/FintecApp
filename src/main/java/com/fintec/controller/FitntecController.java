package com.fintec.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FitntecController {

	
  @GetMapping("/welcome")
  public ResponseEntity<String> get(){
	  return new ResponseEntity<String>("Welcome to OpenShift", HttpStatus.OK);
  }
}
