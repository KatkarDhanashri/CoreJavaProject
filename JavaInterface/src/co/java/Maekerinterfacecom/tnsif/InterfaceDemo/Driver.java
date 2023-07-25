package co.java.Maekerinterfacecom.tnsif.InterfaceDemo;

public class Driver {
 public static void main(String[] args) {
	
	Demo d=new Demo();
	d.print();
	d.show();
	
	//Possible with child interface object
	extendedInterface e=new Demo();
	e.print();
	e.show();
}
}
