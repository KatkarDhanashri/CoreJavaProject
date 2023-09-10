package com.java.oneonone;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Address implements Serializable{
	private static final long serialVersionUID=1L;
   @Id        //use as primary key
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   @Column(name="AddressId")
   private int AddressId;
   
   @Column(name="streetname")
   private String streetname;
   
   @Column(name="city")
   private String city;
   
   @Column(name="state")
   private String state;
   
   @Column(name="zipcode")
   private int zipcode;
   
   
public int getAddressId() {
	return AddressId;
}
public void setAddressId(int addressId) {
	AddressId = addressId;
}
public String getStreetname() {
	return streetname;
}
public void setStreetname(String streetname) {
	this.streetname = streetname;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getState() {
	return state;
}
public void setState(String state) {
	this.state = state;
}
public int getZipcode() {
	return zipcode;
}
public void setZipcode(int zipcode) {
	this.zipcode = zipcode;
}  
}
