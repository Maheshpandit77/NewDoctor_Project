package com.jbk.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
	if(list!=null) {
	return new ResponseEntity<List<Doctor>>(list,HttpStatus.OK);
	}else {
	return new ResponseEntity<List<Doctor>>(HttpStatus.INTERNAL_SERVER_ERROR);
}
}
@GetMapping(value="getDoctorById/{doctorId}")
public ResponseEntity<Doctor> getDoctorById(@PathVariable Integer doctorId) {
	 Doctor doctor= service.getDoctorById(doctorId);
	 if(doctor!=null) {
		 return new ResponseEntity<Doctor>(doctor,HttpStatus.OK);
		 
	 }else
	 {

			return new ResponseEntity<Doctor>(HttpStatus.INTERNAL_SERVER_ERROR); 
	 }
	
	
}

@PutMapping(value="updateDoctor")
public ResponseEntity<Doctor>updateDoctor(@RequestBody Doctor doctor)
{
	Doctor  dr=service.UpdateDoctor(doctor);
	if(dr!=null) {
		return new ResponseEntity<Doctor>(dr,HttpStatus.OK);
	}else {
		return new  ResponseEntity<Doctor>(HttpStatus.INTERNAL_SERVER_ERROR); 
	}
	
	
	
}




}
