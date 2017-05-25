package Queue;

import java.util.Scanner;

public class QueueImplementation {
    
	private static int queue[];
	private static int front ;
	private static int rear ;
	private static int N ;
	
	QueueImplementation(){
		N=1;
		queue = new int[N];
		front = rear = -1;
	}
	public void enqueue(int data){
		if(isEmpty()){
			front = rear = 0;
		}
		if(rear == queue.length-1){
			resize();
		}
		queue[rear++] = data;
		
	}
	
	private void resize() {
		// TODO Auto-generated method stub
		int[] temp = queue;
		N= 2*N;
		int[] newqueue = new int[N];
		for(int i=0; i< temp.length ;i++){
			newqueue[i] = temp[i];
		}
		queue = newqueue;
	}
	public int dequeue(){
		if(isEmpty()){
			return -1;
		}
		else {
			return queue[front++];
		}
	}
	
	public Boolean isEmpty(){
		if(front == rear) {
			return true;
		}
		else 
			return false;
	}
	
	public int getSize(){
		return rear-front;
	}
	public static void main(String[] args){
		
		QueueImplementation obj = new QueueImplementation();
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		String[] inputArray = new String[number];
		scan.nextLine();
		for(int i =0 ; i<number ;i++){
			inputArray[i] = scan.nextLine();
		}
		for(int i=0; i< number; i++){
			String[] arr = inputArray[i].split(" ");
			if(arr[0].equals("E")){
				obj.enqueue(Integer.parseInt(arr[1]));
				System.out.println(obj.getSize());
			}
			else {
				int val = obj.dequeue();
					System.out.println(val + "," + obj.getSize());
			}
		}
	}
}
