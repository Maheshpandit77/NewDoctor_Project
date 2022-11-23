package com.jbk.dao;

import java.util.List;

import org.hibernate.Criteria;
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
		
		try {
		session.save(dactor);
		ts.commit();
		}
		catch(Exception e){
			e.printStackTrace();
			return null;
		}
		finally {
			session.close();
		}
		
		
		
		return dactor;
	}

	@Override
	public List<Doctor> getAllDoctors() {
		Session session=sf.openSession();
		 Criteria criteria=session.createCriteria(Doctor.class);
		 List<Doctor>list=null;
		 try 
		 {
			list= criteria.list();
		 }catch(Exception e) 
		 {
			e.printStackTrace(); 
			return null;
		 }
		 finally 
		 {
			session.close(); 
		 }
		return list;
	}

	@Override
	public Doctor getDoctorById(Integer doctorId) {
		Session session =sf.openSession();
		Doctor doctor=null;
		try {
		doctor=	session.get(Doctor.class, doctorId);
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return null;
		}
		finally {
			session.close();
		}
		
		return doctor;
	}

	@Override
	public Doctor UpdateDoctor(Doctor doctor) {
		Session session =sf.openSession();
		Criteria criteria=session.createCriteria(Doctor.class);
		Transaction tr=session.beginTransaction();
		List<Doctor>list=null;
		try {
			list= criteria.list();
			for(Doctor dt:list)
			if(dt.getDoctorId()==doctor.getDoctorId()) {
				list.remove(dt);
				list.add(doctor);
				tr.commit();
			}}
				
			
			catch (Exception e) {
				e.printStackTrace();
				return null;
			}finally {
				session.close();
			}
			return doctor;
				
			}
		
		
		
		
	

	@Override
	public boolean deletestudentById(Integer doctorId) {
		// TODO Auto-generated method stub
		return false;
	}

}
