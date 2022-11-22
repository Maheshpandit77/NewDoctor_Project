package com.jbk.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jbk.Doctor.Doctor;
import com.jbk.service.doctorService;

@RestController
@RequestMapping("/doctor")

public class Controller {
@Autowired
private doctorService service;

@PostMapping(value="/saveDoctor")
public ResponseEntity<Doctor>  saveDoctor(@RequestBody Doctor doctor) {
	Doctor doct=service.saveDoctor(doctor);
	return new ResponseEntity<Doctor>(doct,HttpStatus.OK);
	
	
}
@GetMapping(value="getAllDoctors")
public ResponseEntity<List<Doctor>>getAllDoctors(){
	
	List<Doctor>list=service.getAllDoctors();
	return new ResponseEntity<List<Doctor>>(list,HttpStatus.OK);
	
}
//mahesh





}
