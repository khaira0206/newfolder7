package Array;

import java.util.Stack;

class TreeNode {
	int data;
	TreeNode left, right;
	
	public TreeNode(int data){
		this.data = data;
	}
	
}

public class construct_Bin_In_Po {
	
	public TreeNode buildTree(int[] inorder, int[] postorder) {
	    if (inorder.length == 0 || postorder.length == 0) return null;
	    int ip = inorder.length - 1;
	    int pp = postorder.length - 1;
	    
	    Stack<TreeNode> stack = new Stack<TreeNode>();
	    TreeNode prev = null;
	    TreeNode root = new TreeNode(postorder[pp]);
	    stack.push(root);
	    pp--;
	    
	    while (pp >= 0) {
	        while (!stack.isEmpty() && stack.peek().data == inorder[ip]) {
	            prev = stack.pop();
	            ip--;
	        }
	        TreeNode newNode = new TreeNode(postorder[pp]);
	        if (prev != null) {
	            prev.left = newNode;
	        } else if (!stack.isEmpty()) {
	            TreeNode currTop = stack.peek();
	            currTop.right = newNode;
	        }
	        stack.push(newNode);
	        prev = null;
	        pp--;
	    }
	    
	    return root;
	}
	
	public static void main(String args[]){
		
		construct_Bin_In_Po cbt = new construct_Bin_In_Po();
		int[] in = {4,2,5,1,6,3,7};
		int[] po = {4,5,2,6,7,3,1};
		
		cbt.buildTree(in, po);
		
	}

}
