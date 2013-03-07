
public class Test {
	public static void main(String [] args){
		int n;
		if(args[0] == ""){
			n = 16;
		}else{
			n = Integer.getInteger(args[0]);
		}
		Tree.createBinaryTree(n);
	}
}
