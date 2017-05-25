package Trie;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class TrieNode {
	String prefix;
	HashMap<Character, TrieNode> children;
	Boolean isWord;

	TrieNode(String prefix) {
		this.prefix = prefix;
		this.children = new HashMap<Character, TrieNode>();
	}

}

public class AutoComplete {
	private static TrieNode root;

	AutoComplete(String[] dict) {
		root = new TrieNode(" ");
		for(String s:dict){
		insert(s);
		}
	}

	public void insert(String Str) {
		TrieNode curr = root;
		char[] arr = Str.toCharArray();
		for (int i = 0; i < Str.length(); i++) {
			if (!curr.children.containsKey(arr[i])) {
				curr.children.put(arr[i], new TrieNode(Str.substring(0, i + 1)));
			}
			curr = curr.children.get(arr[i]);
			if (i == Str.length() - 1)
				curr.isWord = true;
		}
		//root = curr;
	}
	
	public List<String> getWordsForPrefix(String pre){
		List<String> list = new ArrayList<String>();
		TrieNode curr = root;
		for(char c : pre.toCharArray()){
		  if(curr.children.containsKey(c)){
			  curr = curr.children.get(c);
		  }	
		  else 
			  return list;
		}
		findAllChildWords(curr ,list);
		return list;
	}

	private void findAllChildWords(TrieNode curr,List<String> list) {
		// TODO Auto-generated method stub
		if(curr.isWord) 
			list.add(curr.prefix);
		for(char c : curr.children.keySet()){
			findAllChildWords(curr.children.get(c),list);
		}
	}
	
	public static void main(String[] args){
		String [] dict = new String[]{"def","acd","a"};
		AutoComplete object = new AutoComplete(dict);
		List<String> list = object.getWordsForPrefix("a");
		for(int i=0;i<list.size();i++){
			System.out.println(list.get(i));
		}
	}

}
