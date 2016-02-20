package labpackage;

import java.util.Scanner;

public class Preretirement extends Postretirement {
	public static double calc_emp_save(){

		double emp_risky = 7;
        @SuppressWarnings("resource")
		
		
		
		int emp_term = askForData("enter something now");
	
		double emp_save;
		emp_save = lump_sum*(((emp_risky/100)/12)/((Math.pow(1+(emp_risky/100)/12, emp_term*12))-1));
		System.out.print(emp_save);
	
		
		return emp_save;
	}

}
