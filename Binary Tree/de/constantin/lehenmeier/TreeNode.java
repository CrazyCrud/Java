
public class TreeNode {
	private static int numberOfNodes;
	private int id;
	private TreeNode parentNode, childNodeL, childNodeR;
	
	public TreeNode(){
		id = ++numberOfNodes;
	}
	
	protected TreeNode getParentNode() {
		return parentNode;
	}

	protected void setParentNode(TreeNode parentNode) {
		this.parentNode = parentNode;
	}

	protected TreeNode getChildNodeL() {
		return childNodeL;
	}

	protected void setChildNodeL(TreeNode childNodeL) {
		this.childNodeL = childNodeL;
	}

	protected TreeNode getChildNodeR() {
		return childNodeR;
	}

	protected void setChildNodeR(TreeNode childNodeR) {
		this.childNodeR = childNodeR;
	}

	protected int getId(){
		return id;
	}
}
