package br.com.arvorebinaria;

public class TesteSomaNosArvoreBinaria {

	public static void main(String[] args) {
		
		BinaryTree n1 = new BinaryTree(10);
		BinaryTree n2 = new BinaryTree(5);
		BinaryTree n3 = new BinaryTree(6);
		BinaryTree n4 = new BinaryTree(12);
		BinaryTree n5 = new BinaryTree(13);
		BinaryTree n6 = new BinaryTree(13);
		BinaryTree n7 = new BinaryTree(13);
		
		n1.addRight(n2);
		n1.addLeft(n3);
		n2.addRight(n4);
		n3.addRight(n5);
		n4.addLeft(n6);
		n5.addRight(n7);
		
		Integer result = MathBinaryTree.sum(n1);
		
		//10 + 5 + 6 + 12 + 13 + 13 + 13 = 72 
		System.out.println(result == 72);
		
		
		result = MathBinaryTree.sum(n3);
		
		//6 + 13 + 13 =  32
		System.out.println(result == 32);
		
	}

}
