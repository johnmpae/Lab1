package main_package;
import java.util.*;
public class Query extends Main{
	public static double ask_for_input(String request){
		@SuppressWarnings("resource")
		Scanner user_input = new Scanner(System.in);
		
		System.out.print(request);
		double value = user_input.nextInt();
		return value;
	}
	

}
