package Search;

import java.util.*;
class BinarySearch {
    public static int search(int[] arr , int l, int r ,int key){
        int mid = (l+r)/2;
        if(key == arr[mid])
           return mid;
        else if(key > arr[mid])
           return search(arr ,mid+1 ,r, key);
        else if(key < arr[mid])
            return search(arr , l, mid-1,key);
		return mid;
         
    }
    public static void main(String args[] ) throws Exception {
    Scanner scan = new Scanner(System.in);
    int N = scan.nextInt();
    int[] arr = new int[N];
    
    scan.nextLine();
    for(int i =0;i<N;i++){
       arr[i] = scan.nextInt();
                
    }
    Arrays.sort(arr);
    //scan.nextLine();
    int noOfQueries = scan.nextInt();
    int[] rank = new int[noOfQueries];
    scan.nextLine();
    for(int i=0; i<noOfQueries;i++){
    	scan.nextLine(); 
    	rank[i] = scan.nextInt();
    	
    }  
    for(int i =0;i<noOfQueries; i++){
    	 int ran = search(arr ,0 ,N-1, rank[i]);
    	 System.out.println(ran+1);
    }
    }
}
