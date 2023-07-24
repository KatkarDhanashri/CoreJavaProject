package com.tns.java;

public class TaxCalculator {
	//method for tax calculation
	public void TaxCalculation(person p) {
		if(p.getAge()>65 || p.getGender().equalsIgnoreCase("female")) {
			p.setTax(0);
			System.out.println("Tax was not applicable for female");
		}
		else
		{
			if(p.getIncome()<=160000) {
				
				p.setTax(0);
				System.out.println("Male person Tax was Not Applicable");
				
		  }
		  else if(p.getIncome()>160000 && (p.getIncome()<=500000))
		  {
			  p.setTax((p.getIncome()-160000)*10/100);
		  }
          else if(p.getIncome()>500000 && (p.getIncome()<=800000)) 
          {
        	  p.setTax((p.getIncome()-160000)*20/100+34000);
		  }
          else if(p.getIncome()>800000 && (p.getIncome()<=20000000))
          {
        	  p.setTax((p.getIncome()-160000)*30/100+94000);
}
		}
	}
}
