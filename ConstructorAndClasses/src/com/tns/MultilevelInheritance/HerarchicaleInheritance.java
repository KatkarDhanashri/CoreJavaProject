package com.tns.MultilevelInheritance;
class bird{
	private String name;
	private String colour;
	private String Voice;
	public bird(String name, String colour, String voice) {
		super();
		this.name = name;
		this.colour = colour;
		Voice = voice;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public String getVoice() {
		return Voice;
	}
	public void setVoice(String voice) {
		Voice = voice;
	}
	@Override
	public String toString() {
		return "bird [name=" + name + ", colour=" + colour + ", Voice=" + Voice + "]";
	}
}
class peacock extends bird{

	public peacock(String name, String colour, String voice) {
		super(name, colour, voice);
		
	}
	
}
class sparrow extends bird{

	public sparrow(String name, String colour, String voice) {
		super(name, colour, voice);
		
	}
	
}
class parrot extends bird{

	public parrot(String name, String colour, String voice) {
		super(name, colour, voice);
	}
}
class duck extends bird{
    
	public duck(String name, String colour, String voice) {
		super(name, colour, voice);
		
	}	
}
public class HerarchicaleInheritance {
public static void main(String[] args) {
	
	sparrow s=new sparrow("sparrow","grey","chiv..chi.chiv");
	System.out.println(s);
	
	parrot p=new parrot("parrot","green","ppp...ppp..pp");
	System.out.println(p);
	
	duck d=new duck("duck","while","duu..sad..... sdssd");
	System.out.println(d);
}
}
