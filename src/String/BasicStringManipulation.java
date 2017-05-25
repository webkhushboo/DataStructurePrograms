package String;

import java.util.Scanner;

public class BasicStringManipulation {

	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		
		
		for(int i=0; i< N;i++){
			scan.nextLine();
			String inputStr  = scan.next();
			int l = scan.nextInt();
			int r = scan.nextInt();
			String subStr = inputStr.substring(l, r+1);
			String output =arrangeIndescending(subStr);
			System.out.println(inputStr.substring(0,l)+output+ inputStr.substring(r+1,inputStr.length()));
		}
	}

	private static String arrangeIndescending(String subStr) {
		// TODO Auto-generated method stub
		char[] arr = subStr.toCharArray();
		for(int i =0; i<arr.length;i++){
			for(int j=0 ;j < arr.length-1 ; j++)
			if(arr[j] < arr[j+1]){
				char temp = arr[j];
				arr[j] =arr[j+1];
				arr[j+1] =temp;
			}
		}
		return String.valueOf(arr);
	}
}
