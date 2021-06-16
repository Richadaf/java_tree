package sheet6;

public class Node {

	private Object element;
	private Node left;
	private Node right;
	

	public Node(Object element, Node left, Node right) {
		this.element = element;
		this.left = left;
		this.right = right;
	}
	public Node(Object element){
		this.element = element;
		this.left =this.right = null;
	}
	public Node getLeft() {
		return left;
	}
	public void setLeft(Node left) {
		this.left = left;
	}
	public Object getElement() {
		return element;
	}
	public void setElement(Object element) {
		this.element = element;
	}
	public Node getRight() {
		return right;
	}
	public void setRight(Node right) {
		this.right = right;
	}
	public boolean hasLeft(){
		return (left != null);
	}
	public boolean hasRight(){
		return (right != null);
		
	}
}
