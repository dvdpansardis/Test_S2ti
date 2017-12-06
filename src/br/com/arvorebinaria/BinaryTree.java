package br.com.arvorebinaria;

public class BinaryTree {

	int valor;

	BinaryTree left;
	
	BinaryTree right;

	public BinaryTree(int valor) {
		this.valor = valor;
	}
	
	public void addLeft(BinaryTree left){
		this.left = left;
	}
	
	public void addRight(BinaryTree right){
		this.right = right;
	}
	
	
	public Integer getValor(){
		return this.valor;
	}
	
	public BinaryTree getLeft() {
		return left;
	}

	public BinaryTree getRight() {
		return right;
	}
}
