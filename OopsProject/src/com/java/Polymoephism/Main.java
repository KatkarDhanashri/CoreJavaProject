package com.java.Polymoephism;
class Animal{
	public void animalSound() {
	    System.out.println("The animal makes a sound");
	  }
}
class Dog extends Animal {
	  public void animalSound() {
	    System.out.println("The dog says: bow wow");
	  }
	}
class Pig extends Animal {
	  public void animalSound() {
	    System.out.println("The pig says: wee wee");
	  }
	}
public class Main {
public static void main(String[] args) {
	Animal myAnimal = new Animal();  
    Animal myPig = new Pig();  // Create a Pig object
    Animal myDog = new Dog();  // Create a Dog object
    myAnimal.animalSound();
    myPig.animalSound();
    myDog.animalSound();
}
}
