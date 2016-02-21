package main_package;

public class Post {
	public static double calc_post(double ret_budget,double ret_ssi,double inv_safe, double ret_term){
		
		
		double lump_sum=(ret_budget-ret_ssi)*((1-(1/(Math.pow(1+(inv_safe/100)/12,ret_term*12 )))))/((inv_safe/100)/12);
		//System.out.print(lump_sum);
		return lump_sum;
	}

}
