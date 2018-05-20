package Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class avg_Level_Binary {
	
	public List<Double> averageOfLevels(TreeNode root){
		List<Double> result = new ArrayList<>();
		Queue<TreeNode> queue = new LinkedList<>();
		
		if(root == null) return result;
		
		queue.add(root);
		while(!queue.isEmpty()){
		int n = queue.size();
		double sum = 0.0;
		for(int i = 0; i < n; i++){
			TreeNode node = queue.poll();
			sum += node.data;
			if(node.left != null) queue.offer(node.left);
			if(node.right != null) queue.offer(node.right);
			
		}
		result.add(sum / n);
		}
		return result;
		
	}
	
	public static void main(String args[]){
		int data = 1 ;
		TreeNode node = new TreeNode(data);
		node.left = new TreeNode(2);
		
		node.right = new TreeNode(3);
		node.right.right = new TreeNode(4);
		node.right.right.right = new TreeNode(5);
		node.right.right.right.right = new TreeNode(6);
		
		avg_Level_Binary ab = new avg_Level_Binary();
		System.out.println("Left most value is: " +ab.averageOfLevels(node));
	}

}
