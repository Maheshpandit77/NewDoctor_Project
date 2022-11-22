package com.jbk.Doctor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="doctor")
public class Doctor {
	@Id
	private Integer doctorId;
	private String doctorName;
	private String doctorExpireance;
	private String doctorSpecilization;
	private Long doctorMoNo;
	private Integer doctorFees;
	private String doctorCity;
	public Doctor() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Doctor(Integer doctorId, String doctorName, String doctorExpireance, String doctorSpecilization,
			Long doctorMoNo, Integer doctorFees, String doctorCity) {
		super();
		this.doctorId = doctorId;
		this.doctorName = doctorName;
		this.doctorExpireance = doctorExpireance;
		this.doctorSpecilization = doctorSpecilization;
		this.doctorMoNo = doctorMoNo;
		this.doctorFees = doctorFees;
		this.doctorCity = doctorCity;
	}
	public Integer getDoctorId() {
		return doctorId;
	}
	public void setDoctorId(Integer doctorId) {
		this.doctorId = doctorId;
	}
	public String getDoctorName() {
		return doctorName;
	}
	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}
	public String getDoctorExpireance() {
		return doctorExpireance;
	}
	public void setDoctorExpireance(String doctorExpireance) {
		this.doctorExpireance = doctorExpireance;
	}
	public String getDoctorSpecilization() {
		return doctorSpecilization;
	}
	public void setDoctorSpecilization(String doctorSpecilization) {
		this.doctorSpecilization = doctorSpecilization;
	}
	public Long getDoctorMoNo() {
		return doctorMoNo;
	}
	public void setDoctorMoNo(Long doctorMoNo) {
		this.doctorMoNo = doctorMoNo;
	}
	public Integer getDoctorFees() {
		return doctorFees;
	}
	public void setDoctorFees(Integer doctorFees) {
		this.doctorFees = doctorFees;
	}
	public String getDoctorCity() {
		return doctorCity;
	}
	public void setDoctorCity(String doctorCity) {
		this.doctorCity = doctorCity;
	}
	
	

}
