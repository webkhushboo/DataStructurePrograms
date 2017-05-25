package Tree;

import java.util.Scanner;


public class SubTreePreOrderTraversal {
   public static void main(String[] args){
	   BinarySearchTree tree = new BinarySearchTree();
	   Scanner scan = new Scanner(System.in);
	   int number = scan.nextInt();
	   scan.nextLine();
	   for(int i=0; i< number;i++){
		   tree.insert(scan.nextInt());
	   }
	   scan.nextLine();
	   int searchItem = scan.nextInt();
	   Node temp = tree.searchNode(tree.root,searchItem);
	   tree.printPreOrderTraversal(temp);
   }
	
}
