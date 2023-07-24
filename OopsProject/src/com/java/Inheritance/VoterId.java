package com.java.Inheritance;

public class VoterId {
     
	private String Name;
	private Long AdharNo;
	private Long PANNo;
	private String Address;
	
	public VoterId() {
		super();
		// TODO Auto-generated constructor stub
	}
	public VoterId(String name, Long adharNo, Long pANNo, String address) {
		super();
		Name = name;
		AdharNo = adharNo;
		PANNo = pANNo;
		Address = address;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public Long getAdharNo() {
		return AdharNo;
	}
	public void setAdharNo(Long adharNo) {
		AdharNo = adharNo;
	}
	public Long getPANNo() {
		return PANNo;
	}
	public void setPANNo(Long pANNo) {
		PANNo = pANNo;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	
	@Override
	public String toString() {
		return "VoterId [Name=" + Name + ", AdharNo=" + AdharNo + ", PANNo=" + PANNo + ", Address=" + Address + "]";
	}
	
}

