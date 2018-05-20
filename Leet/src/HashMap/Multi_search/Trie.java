package HashMap.Multi_search;

import java.util.ArrayList;

public class Trie {
	private TrieNode root = new TrieNode();
	
	public ArrayList<Integer> search(String s) {
		return root.search(s);
	}
	
	public void insertString(String str, int location) {
		root.insertString(str, location);
	}
	
	public TrieNode getRoot() {
		return root;
	}
}