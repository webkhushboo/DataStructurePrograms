package String;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args){
		/*Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		for(int i=0 ;i <N ;i++){
			scan.nextLine();
			int input = scan.nextInt();
			int fact = factorial(input);
			System.out.println(fact);
		}*/
		char chars[] = {'x', 'b', 'c'};
        String s = new String(chars);
        System.out.println(s);
		
	}

	private static int factorial(int input) {
		// TODO Auto-generated method stub
        int sum=1;
		if(input ==  1)
			return 1;
		return sum =sum * input * factorial(input-1);
	}
}
