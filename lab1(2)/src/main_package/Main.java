package main_package;

public class Main {
	private static double ret_budget = Query.ask_for_input("please input ret_budget:");//$10,000
	private static double ret_ssi = Query.ask_for_input("please input ret_ssi:");//$2,642
	private static double inv_safe = Query.ask_for_input("please input inv_safe:");//2%
	private static double ret_term = Query.ask_for_input("pleast input ret_term:");//20
	private static double inv_risky = Query.ask_for_input("please input inv risky");//7%
	private static double lump_sum = Post.calc_post(ret_budget, ret_ssi, inv_safe, ret_term);//PGV
	private static double emp_term = Query.ask_for_input("please enter # years worked:");//40
	private static double emp_save = Pre.calc_emp_save(inv_risky, lump_sum, emp_term);//PGV

	public static void main(String[] args) {
		System.out.print("lump sum:");
		System.out.println(lump_sum);
		System.out.print("emp_save:");
		System.out.print(emp_save);
		
		}

}
	


