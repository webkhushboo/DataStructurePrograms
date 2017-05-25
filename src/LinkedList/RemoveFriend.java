package LinkedList;

import java.util.Scanner;

public class RemoveFriend {

	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		scan.nextLine();
		String[] input = new String[N];
		String[] order = new String[N];
		
		for(int i=0;i<N;i++){
			input[i] = scan.nextLine();
			int noOfElements = Integer.parseInt(input[i].split(" ")[0]);
			int noOfElementToBeRemoved = Integer.parseInt(input[i].split(" ")[1]);
			order[i] = scan.nextLine();
		}
	}
}
