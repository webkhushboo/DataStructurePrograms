package Array;

import java.util.HashMap;
import java.util.Map;

public class twoSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int arr[] = new int[] {2,7,1,2};
     int res[] = twoSum(arr,9);
     for(int i=0; i<res.length;i++){
    	 System.out.println(res[i]);
     }
	}
	
	public static int[] twoSum(int [] numbers, int target){
		int result[] = new int[2];
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i =0; i<numbers.length;i++){
		if(map.containsKey(target-numbers[i])){
		result[i] = i+1;
		result[0] = map.get(target-numbers[i]);
		return result;
		} map.put(numbers[i],i+1);
		}
		return result;
		}


}
