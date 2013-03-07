
public class Tree {
	
	public static TreeNode createBinaryTree(int n){
		
		if(n < 1){
			return null;
		}
		
		TreeNode rootNode = new TreeNode();
		rootNode.setParentNode(null);
		
		if(n > 1){
			createChildNodes(rootNode, 1, getTreeSize(n), n);
		}
		
		return rootNode;
	}
	
	private static int getTreeSize(int n) {
		return (int)(Math.pow(2, n)) - 1;
	}

	private static void createChildNodes(TreeNode parent, int currentDepth, int maxNodes, 
			int depth){
		currentDepth++;
		TreeNode rightChild = createRightChildOf(parent, currentDepth ,maxNodes);
		TreeNode leftChild = createLeftChildOf(parent, currentDepth, maxNodes);
		if(currentDepth < depth){
			createChildNodes(rightChild, currentDepth, maxNodes, depth);
			createChildNodes(leftChild, currentDepth, maxNodes, depth);
		}
	}
	
	private static TreeNode createRightChildOf(TreeNode parent, int currentDeph, int maxNodes){
		parent.setChildNodeR(new TreeNode());
		parent.getChildNodeR().setParentNode(parent);
		return parent.getChildNodeR();
	}
	
	private static TreeNode createLeftChildOf(TreeNode parent, int currentDepth, int maxNodes){
		parent.setChildNodeL(new TreeNode());
		parent.getChildNodeL().setParentNode(parent);
		return parent.getChildNodeL();
	}
}
