package com.jbk.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jbk.Doctor.Doctor;
import com.jbk.dao.doctorDao;
@Service
public class Service_impl implements doctorService {
	@Autowired
	private doctorDao dao;

	@Override
	public Doctor saveDoctor(Doctor dactor) {
		Doctor doctor=dao.saveDoctor(dactor);
		return doctor;
	}

	@Override
	public List<Doctor> getAllDoctors() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Doctor getDoctorById(Integer doctorId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Doctor UpdateDoctor(Doctor doctor) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deletestudentById(Integer doctorId) {
		// TODO Auto-generated method stub
		return false;
	}

}
