package br.com.juntainteiros;

public class JuntaInteiros {

	public static void main(String[] args) {
		Integer numA = 10256;
		Integer numB = 512;
		
		Integer result = JoinIntegers.joinIntegers(numA, numB);
		
		System.out.println(result == -1);
		
		
		numA = 1025;
		numB = 51;
		
		result = JoinIntegers.joinIntegers(numA, numB);
		
		System.out.println(result == 150125);
	}
	

}
