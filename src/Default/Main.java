package Default;

public class Main {

	public static void main(String[] args) {
		BinarySearchTree<Integer> binarySearchTree = new BinarySearchTree<>();
		
		binarySearchTree.add(20);
		binarySearchTree.add(10);
		binarySearchTree.add(50);
		binarySearchTree.add(35);
		binarySearchTree.add(15);
		
		System.out.println("PreOrder:");
		binarySearchTree.preOrder();
	}

}
