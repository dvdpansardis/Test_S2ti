package br.com.arvorebinaria;

public class MathBinaryTree {

	public static Integer sum(BinaryTree no){
		
		if(no == null) return 0;
		
		return no.getValor() + sum(no.getLeft()) + sum(no.getRight());
		
	}
	
}
