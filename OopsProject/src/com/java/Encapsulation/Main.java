package com.java.Encapsulation;
class Person {
	  private String name; // private = restricted access

	  // Getter
	  public String getName() {
	    return name;
	  }

	  // Setter
	  public void setName(String newName) {
	    this.name = newName;
	  }
	}
public class Main {
public static void main(String[] args) {
	Person myObj = new Person();
   myObj.setName("John");  // error
    System.out.println(myObj.getName());
 
}
}
