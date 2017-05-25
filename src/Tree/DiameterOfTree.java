package Tree;

import java.util.Scanner;


public class DiameterOfTree {

	private static Node root;
	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		int noOfNodes = Integer.parseInt(input.split(" ")[0]);
		int rootData = Integer.parseInt(input.split(" ")[1]);
		root = new Node(rootData);
		int i =0;
		while(i< (2*(noOfNodes-1))){
			String input2 = scan.nextLine();
			int val = scan.nextInt();
			scan.nextLine();
			insert(input2,val);
			i=i+2;
		}
		
		int diameter = getDiameter(root);
		System.out.println(diameter);
		
	}
	static void insert(String str, int data)
	{
	Node current = root;
	char ins[] = str.toCharArray();
	int i;
	for(i = 0; i<ins.length - 1; i++)
	{
	if(ins[i] == 'L')
	{
	if(current.left == null)
	current.left = new Node(-1);
	current = current.left;
	}
	if(ins[i] == 'R')
	{
	if(current.right == null)
	current.right = new Node(-1);
	current = current.right;
	}
	}
	if(ins[i] == 'L')
	{
	    if(current.left == null)
	current.left = new Node(data);
	   else
	   current.left.data = data;
	}
	if(ins[i] == 'R')
	{
	if(current.right == null)
	current.right = new Node(data);
	   else
	   current.right.data = data;
	}
	}
		
	int findDiameter(Node root)
	{
	if(root == null || root.data == -1)
	return 0;
	int diameter = Math.max(findDiameter(root.left), findDiameter(root.right));
	diameter = Math.max(findHeight(root.left) + findHeight(root.right) + 1, diameter);
	return diameter;
	}
	 
	int findHeight(Node root)
	{
	if(root == null)
	return 0;
	return 1 + Math.max(findHeight(root.left) , findHeight(root.right));
	}
	 
	private static int getDiameter(Node root) {
		// TODO Auto-generated method stub
		if(root == null)
		return 0;
		else {
			int lheight = getHeight(root.left);
			int rheight = getHeight(root.right);
			
			int ldiamter = getDiameter(root.left);
			int rdiamter = getDiameter(root.right);
			
			return Math.max(lheight+rheight+1, Math.max(ldiamter, rdiamter));
		}
			
	}

	private static int getHeight(Node node) {
		// TODO Auto-generated method stub
		if(node == null) {
			return 0;
		}
		else {
			return 1 + Math.max(getHeight(node.left),getHeight(node.right));
		}
	}

}
