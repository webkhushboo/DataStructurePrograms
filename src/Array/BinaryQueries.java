package Array;

import java.util.Scanner;

public class BinaryQueries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner scan = new Scanner(System.in);
     int N = scan.nextInt();
     int Q = scan.nextInt();
     int[] arr = new int[N];
     StringBuilder output = new StringBuilder();
     scan.nextLine();
     for(int i=0; i< N;i++){
    	 arr[i]  =scan.nextInt();
     }
     scan.nextLine();
     String[] queries = new String[Q];
     for(int i=0;i<Q;i++){
    	 queries[i] = scan.nextLine();
    	 String[] inputQueries = queries[i].split(" ");
    	 int q =Integer.parseInt(inputQueries[0]);
    	 if(q == 1){
    		 int b =Integer.parseInt(inputQueries[1])-1;
    		 //flipDigit(arr ,b );
    		 if(arr[b] == 0){
    				arr[b] =1;
    			}
    			else {
    				arr[b]=0;
    			}
    	 }
    	 else {
    		 int b =Integer.parseInt(inputQueries[2])-1;
    		 if(arr[b]==0){
    				output.append("EVEN");
    			}
    			else {
    				output.append("ODD");
    			}
    	 }
    	 output.append("\n");
     }
     
     System.out.println(output);
	}

	



}
