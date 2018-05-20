package Tree;

import java.util.LinkedList;
import java.util.Queue;

class TreeNode{
	
	int data;
	TreeNode left;
	TreeNode right;
	
	public TreeNode(int data){
		this.data = data;
	}
}

public class bottom_Left_Val {
	 int ans=0, h=0;
	public int findBottomLeftValue(TreeNode root) {
        findBottomLeftValue(root, 1);
        return ans;
    }
    public void findBottomLeftValue(TreeNode root, int depth) {
        if (h<depth) {ans=root.data;h=depth;}
        if (root.left!=null) findBottomLeftValue(root.left, depth+1);
        if (root.right!=null) findBottomLeftValue(root.right, depth+1);
    }
	

	public static void main(String args[]){
		
		int data = 1;
		
		TreeNode node = new TreeNode(data);
		node.left = new TreeNode(2);
		
		node.right = new TreeNode(3);
		node.right.right = new TreeNode(4);
		node.right.right.right = new TreeNode(5);
		node.right.right.right.right = new TreeNode(6);
		node.right.right.right.left = new TreeNode(7);
		node.left.left = new TreeNode(8);
		node.left.left.left = new TreeNode(9);
		node.left.left.left.left = new TreeNode(10);
		//node.left.left.left.left.left = new TreeNode(2);
		
		bottom_Left_Val bl = new bottom_Left_Val();
		data = bl.findBottomLeftValue(node);
		
		System.out.println("Left most value is: " +data);
		
		
	}
	
}
