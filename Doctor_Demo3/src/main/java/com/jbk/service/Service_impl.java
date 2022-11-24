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
    List <Doctor>list=dao.getAllDoctors();
		
		return list;
	}

	@Override
	public Doctor getDoctorById(Integer doctorId) {
		Doctor doctor=dao.getDoctorById(doctorId);
		
		return doctor;
	}

	@Override
	public Doctor UpdateDoctor(Doctor doctor) {
	Doctor dr=	dao.UpdateDoctor(doctor);
		return dr;
	}

	@Override
	public boolean deletestudentById(Integer doctorId) {
		boolean dr = dao.deletestudentById(doctorId);
		return dr;
	}

}
