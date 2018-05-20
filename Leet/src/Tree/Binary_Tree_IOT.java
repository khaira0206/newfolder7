package Tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Binary_Tree_IOT {

	public static void main(String arg[]){

		int data = 1 ;
		TreeNode node = new TreeNode(data);
		node.left = new TreeNode(2);
		
		node.right = new TreeNode(3);
		node.right.right = new TreeNode(4);
		node.right.right.right = new TreeNode(5);
		node.right.right.right.right = new TreeNode(6);
		node.right.right.right.right.right = new TreeNode(8);
		node.right.right.right.right.left = new TreeNode(9);
		
		Binary_Tree_IOT bt = new Binary_Tree_IOT();
		System.out.println(bt.inorderTraversal(node));
		System.out.println(bt.inOrder(node));
		
	}
	
	
	public List<Integer> inorderTraversal(TreeNode root) {
	    List<Integer> list = new ArrayList<Integer>();

	    Stack<TreeNode> stack = new Stack<TreeNode>();
	    TreeNode cur = root;

	    while(cur!=null || !stack.empty()){
	        while(cur!=null){
	            stack.add(cur);
	            cur = cur.left;
	        }
	        cur = stack.pop();
	        list.add(cur.data);
	        cur = cur.right;
	    }

	    return list;
	}
	
	public List<Integer> inOrder(TreeNode root){
		List<Integer> list = new ArrayList<Integer>();

	    Stack<TreeNode> stack = new Stack<TreeNode>();
	    stack.push(root);
		
	    while(!stack.isEmpty()){
	    TreeNode node = stack.pop();
	    
	    list.add(node.data);
	    if(node.right != null) stack.push(node.right);
	    if(node.left != null) stack.push(node.left);
	    
	    }
		return list;
	}
	
}
