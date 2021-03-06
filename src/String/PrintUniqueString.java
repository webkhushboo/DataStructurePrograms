package String;

import java.io.File;
import java.util.Scanner;
import java.util.TreeMap;

public class PrintUniqueString {

	public static void printUniqueString() {
		try {
			String str ="";
			TreeMap<String,Integer> map = new TreeMap<String,Integer>();
			Scanner scan = new Scanner(new File("Resources/hello.txt"));
		    while (scan.hasNextLine()) {
		        Scanner s2 = new Scanner(scan.nextLine());
		        while (s2.hasNext()) {
		             str = s2.next();
		            if(!map.containsKey(str)){
						map.put(str, 1);
					} else {
						map.put(str, map.get(str) +1); 
					}
		           // System.out.println(str);
		        }
		        s2.close();
		    }
			System.out.println(map.firstKey());
			
			scan.close();
		} catch (Exception e) {
			System.out.println("Error Message :" + e.getMessage());
		}
	}
	
	public static void main(String[] args){
		printUniqueString();
	}
}
