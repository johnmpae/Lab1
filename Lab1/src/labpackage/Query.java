package labpackage;
import java.util.*;

public abstract class Query extends Main {
	public static int askForData(String query_text){
		
		
		//int emp_term; //Number of years working, example is 40
		//int inv_risky; //annual return preretirement
		//int inv_safe;  //annual return postretirement
		//int ret_term;  //number of years retired
		//int ret_budget;//payment per month postretirement
		//double lump_sum =1454485.55;//top of the mountain
		//int ret_ssi;//income from social security postretirement
		
		
		
		
		Scanner user_input = new Scanner(System.in);
		
		System.out.print(query_text);
		int value = user_input.nextInt();
		return value;
		
//		System.out.print("enter annual return before retirement: ");
//		inv_risky = user_input.nextInt();
//		System.out.print("enter annual return after retirement: ");
//		inv_safe = user_input.nextInt();
//		System.out.print("enter number of years retired: ");
//		ret_term = user_input.nextInt();
//		System.out.print("enter monthly payment from savings PR: ");
//		ret_budget = user_input.nextInt();
//		System.out.print("enter ssi monthly payment: ");
//		ret_ssi = user_input.nextInt();
		
		
		
				
		
	}

}
