package com.jbk.dao;

import java.util.List;

import com.jbk.Doctor.Doctor;

public interface doctorDao {
	public Doctor saveDoctor(Doctor dactor);
	public List<Doctor>getAllDoctors();
	public Doctor getDoctorById(Integer doctorId);
	public Doctor UpdateDoctor(Doctor doctor);
	public boolean deletestudentById(Integer doctorId);

}
