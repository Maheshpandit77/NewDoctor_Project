package com.jbk.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jbk.Doctor.Doctor;
@Repository
public class dao_Impl implements doctorDao {
@Autowired
private SessionFactory sf;
	@Override
	public Doctor saveDoctor(Doctor dactor) {
		
		Session session =sf.openSession();
		Transaction ts=session.beginTransaction();
		session.save(dactor);
		ts.commit();
		session.close();
		
		
		return dactor;
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
