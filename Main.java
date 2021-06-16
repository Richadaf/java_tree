package sheet6;

public class Main {

	public static void main(String[] args){
		Node n1 = new Node("Liam");
		Node n2 = new Node("Howl");
		Node n3  = new Node ("San");
		Node n4 = new Node ("Calcifer");
		Node n5 = new Node ("Kiki");
		Node n6 = new Node ("Ponyo");
		Node n7 = new Node ("Sophie");
		
		n1.setLeft(n2);
		n1.setRight(n3);
		
		n2.setLeft(n4);
		n2.setRight(n5);
		
		n3.setLeft(n6);
		n3.setRight(n7);
		
		
		Tree tree = new Tree(n1);
		System.out.println("----------------------");
		System.out.println("\tPRE ORDER");
		System.out.println("----------------------");
		tree.preOrder(tree.getRoot());
		System.out.println("----------------------");
		System.out.println("\tIN ORDER");
		System.out.println("----------------------");
		tree.inOrder(tree.getRoot());
		System.out.println("----------------------");
		System.out.println("\tPOST ORDER");
		System.out.println("----------------------");
		tree.postOrder(tree.getRoot());
		
		System.out.println();
	}
}
