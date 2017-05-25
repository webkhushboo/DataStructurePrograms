package String;

import java.util.HashMap;
import java.util.Scanner;

public class Pangrams {
	
public static void main(String args[]){
	Scanner scan = new Scanner(System.in);
	String str  = scan.nextLine();
	
	HashMap<Character , Integer> hmap = new HashMap<Character , Integer>();
	for(char ch : str.toCharArray()){
	if(hmap.containsKey(ch)){
		hmap.put(ch, hmap.get(ch)+1);
	}
	else {
		hmap.put(ch, 1);
	}
	
	}
	
	if(hmap.size() == 26) {
		System.out.println("Pangrams");
	}
	else {
		System.out.println("Not Pangrams");
	}
}
}
