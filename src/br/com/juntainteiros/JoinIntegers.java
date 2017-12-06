package br.com.juntainteiros;

import java.util.List;
import java.util.stream.Collectors;

public class JoinIntegers {
	
	public static Integer joinIntegers(Integer numA, Integer numB) {
		
		List<Character> seqNumA = String.valueOf(numA).chars().mapToObj(c -> (char) c).collect(Collectors.toList());
		List<Character> seqNumB = String.valueOf(numB).chars().mapToObj(c -> (char) c).collect(Collectors.toList());
		
		Integer result = Integer.valueOf(serialize(seqNumA, seqNumB));
		
		return result >= 1000000 ? -1 : result;
	}

	private static String serialize(List<Character> seqNumA, List<Character> seqNumB) {
		
		if (seqNumA.isEmpty() && seqNumB.isEmpty()) return "";
		
		String a = "", b = "" ;
		
		if(!seqNumA.isEmpty()) a = seqNumA.remove(0).toString(); 
		if(!seqNumB.isEmpty()) b = seqNumB.remove(0).toString();
		
		return  a + b + serialize(seqNumA, seqNumB);
				
	}

}
