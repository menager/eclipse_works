package Other;

class Node {
	int data;
	Node left, right;
	
	Node(int d){
		data = d;
		right = left = null;
	}
}

class Value {
	int maxSize = 0;
	boolean isBst = false;
	int min = Integer.MAX_VALUE; 
	int max = Integer.MIN_VALUE;
}

public class BinaryTree {

	static Node root;
	Value val = new Value();
	
	int largestBst(Node node){
		
		largestBstUtil(node, val, val, val, val);
		
		return val.maxSize;
	}
	
	int largestBstUtil(Node node, Value minRef, Value maxRef,
			Value maxSizeRef, Value isBstRef){
		// base case
		if (node == null){
			isBstRef.isBst = true;
			return 0;
		}
		
		
		return 0;
	}
}
