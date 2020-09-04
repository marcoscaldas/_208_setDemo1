package application;

import java.util.HashSet;
import java.util.Set;


public class Program {
	public static void main(String[] args) {
		Set<String> set = new HashSet<>(); // hashset nao mante a ordem mas é rapido
	//	Set<String> set = new TreeSet<>(); // mantem a ordem que os elementos foram inseridos mas é mais lento
//		Set<String> set = new LinkedHashSet<>(); //	mantem a ordem e é intermediario
		
		
		
		set.add("TV");
		set.add("Notebook");
		set.add("Tablet");
	  set.removeIf(x -> x.charAt(0) == 'T');
	//  set.removeIf(x -> x.length()>=3);	
	//	set.remove("Tablet");
	//	System.out.println(set.contains("Notebook"));
		
		for (String p : set) {
			System.out.println(p);
			
		}
	}
}