package sheet6;

public class Tree {

	private Node root;
	public Tree() {
		this.root = null;
	}
	public Tree(Node root) {
		this.root = root;
	}
	
	public Node getRoot() {
		return root;
	}
	public void setRoot(Node root) {
		this.root = root;
	}
	public void visit(Node node){
		System.out.println(node.getElement());
	}
	public void preOrder(Node root){
		if(root == null){
			return;
		}
		
		visit(root);
		if(root.hasLeft()){
			preOrder(root.getLeft());
		}
		if(root.hasRight()){
			preOrder(root.getRight());
		}
	}
	public void inOrder(Node root){
		if(root == null){
			return;
		}
		if(root.hasLeft()){
			inOrder(root.getLeft());
		}
		visit(root);
		if(root.hasRight()){
			inOrder(root.getRight());
		}
	}
	public void postOrder(Node root){
		if(root == null){
			return;
		}
		if(root.hasLeft()){
			inOrder(root.getLeft());
		}
		if(root.hasRight()){
			inOrder(root.getRight());
		}
		visit(root);
	}
}
