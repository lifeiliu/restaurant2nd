package com.marlabstraining.restaurant.entities;

public class Customer {
	private Long cID;
	private String userName;
	private String password;
	private String cName;
	private String cPhoneNumber;
	private String cEmail;
	private String cAddress;

	public Customer() {

	}

	public Customer(Long cID, String cName, String cPhoneNumber, String cEmail, String cAddress) {
		this.cID = cID;
		this.cName = cName;
		this.cPhoneNumber = cPhoneNumber;
		this.cEmail = cEmail;
		this.cAddress = cAddress;
	}

	public Long getcID() {
		return cID;
	}

	public void setcID(Long cID) {
		this.cID = cID;
	}

	public String getcName() {
		return cName;
	}

	public void setcName(String cName) {
		this.cName = cName;
	}

	public String getcPhoneNumber() {
		return cPhoneNumber;
	}

	public void setcPhoneNumber(String cPhoneNumber) {
		this.cPhoneNumber = cPhoneNumber;
	}

	public String getcEmail() {
		return cEmail;
	}

	public void setcEmail(String cEmail) {
		this.cEmail = cEmail;
	}

	public String getcAddress() {
		return cAddress;
	}

	public void setcAddress(String cAddress) {
		this.cAddress = cAddress;
	}

	@Override
	public String toString() {
		return "Customer [cID=" + cID + ", cName=" + cName + ", cPhoneNumber=" + cPhoneNumber + "]";
	}

}
