package Tree;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;



public class SerializationOfTree {

	
	public static void main(String[] args) throws ClassNotFoundException{
	    BinarySearchTree tree = new BinarySearchTree();
	    tree.insert(10);
	    tree.insert(5);
	    tree.insert(11);
	    tree.insert(4);
	    tree.insert(12);
		FileOutputStream fout;
		FileInputStream fin;
		try {
			fout = new FileOutputStream("f.txt");
			ObjectOutputStream out=new ObjectOutputStream(fout);
			tree.serialize(tree.root, out);
			System.out.println("AFter deserialization");
			fin = new FileInputStream("f.txt");
			ObjectInputStream in = new ObjectInputStream(fin);
			tree.deSerialize(tree.root, in);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
		
		
	}
}
