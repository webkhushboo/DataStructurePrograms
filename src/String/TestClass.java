package String;

import java.util.Scanner;

public class TestClass {
	public static int minimumOps(String str1, String str2,String[] dict)
	{
	    int m = str1.length();
	    int n = str2.length();
	    int flag =1;
	    if (n != m)
	       return -1;
	    char[] arr1 = str1.toCharArray();
	    char[] arr2 = str2.toCharArray();
	    
	    int j =0;
	    String newWord = str1;
	    int count=0;
	    char charToBeChange;
	    int pos=0;
	    while(!newWord.equals(str2)){
	    	count =0;
	    for(int i=0 ;i <arr1.length;i++){
	        
	    	if(newWord.charAt(i) == dict[j].charAt(i)){
	    		count++;
	    	} 
	    	else {
	    		charToBeChange =newWord.charAt(i);
	    		pos=i;
	    	}
	    		
	    }
	    if(count == arr1.length-1){
	    	newWord = dict[j];
	    	 j++;
	    	 flag++;
	    }
	   
	    }
		return flag;
	    
	}
	 
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		String startWord = scan.nextLine();
		
		String endWord = scan.nextLine();
		int N = scan.nextInt();
		scan.nextLine();
		String[] dict = new String[N];
		for(int i=0;i<N;i++){
			dict[i] = scan.nextLine();
		}
		System.out.println(minimumOps(startWord,endWord,dict));
		
	}
}
