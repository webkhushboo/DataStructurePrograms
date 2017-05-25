package Stack;

import java.util.Scanner;

class stack {
	int top =-1;
	int N= 1;
	int[] stackarr = new int[N];
	
	public void push(int data){
		if(top >= stackarr.length -1)
			resize();
		 stackarr[++top] =data;
	}
	public void resize(){
		int[] temp = stackarr;
		int size = N;
		N = 2*N;
		int[] newArr = new int[N];
		for (int i =0;i<size;i++){
			newArr[i] = temp[i];
		}
		stackarr = newArr;
	}
	
	public boolean isEmpty(){
		return top == -1;
	}
	
	public int pop(){
		if(isEmpty()){
		 return -1;
		}
		else {
		 return	stackarr[top--];
		}	
	}
}
public class MonksLoveForFoodImpl {
    
	
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter no of inputs:");
		int N  = scan.nextInt();
		scan.nextLine();
		String[] array = new String[N];
		stack stack = new stack();
		int i =0;
		while(i<N){
			//System.out.println("Enter input :" +i);
			array[i] = scan.nextLine();
			i++;
		}
		int j=0;
		while(j<N){
			String[] arr = array[j].split(" ");
			if(arr.length > 1){
				stack.push(Integer.parseInt(arr[1]));
			} else {
				int elem = stack.pop();
				if(elem == -1){
					System.out.println("No Food");
				} 
				else System.out.println(elem);
			}
			j++;
		}
	}
}
