package com.tns.java;

public class person {
    private int Age; 
    private String Name;
    private double Tax;
    private double Income;
    private String Gender;
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public double getTax() {
		return Tax;
	}
	public void setTax(double tax) {
		Tax = tax;
	}
	public double getIncome() {
		return Income;
	}
	public void setIncome(double income) {
		Income = income;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	@Override
	public String toString() {
		return "person [Age=" + Age + ", Name=" + Name + ", Tax=" + Tax + ", Income=" + Income + ", Gender=" + Gender
				+ "]";
	}
    
    
}
