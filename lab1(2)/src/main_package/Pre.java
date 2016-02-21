package main_package;

public class Pre extends Main {
	public static double calc_emp_save(double inv_risky, double lump_sum,double emp_term){
		double ent_save = lump_sum*(((inv_risky/100)/12)/((Math.pow(1+(inv_risky/100)/12, emp_term*12))-1));
		//System.out.print(ent_save);
		return ent_save;
		
		
		
		
	}

}
