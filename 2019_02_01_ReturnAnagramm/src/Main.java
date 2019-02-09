import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Main {

	public static void main(String[] args) {
		
		String n1 = "Anna";
		String n2 = "Ivan";
		
		System.out.println(isWordAnagramm(n1, n2));
		
		List <String> words = new ArrayList<>();
		Collections.addAll(words, "Ivan", "Oleg", "Anna", "Nana", "Navi", 
				"Inav","Max","Robert");
		System.out.println(returnAnagramms(words, "Inav"));

	}
	
	
	public static List<String> returnAnagramms(List<String> words, String word){
		List<String> anagramms = new ArrayList<>();
		//anagramms.add(word);
		
		for (String w : words) {
			if(isWordAnagramm(w, word)) {
				anagramms.add(w);

			}
		}
		
		return anagramms;

	}
	
	public static boolean isWordAnagramm(String a, String b ) {
		
		if (a.length()==b.length()) {
			
			a = a.toLowerCase();
			b = b.toLowerCase();
			
			List<Character> charListA = new ArrayList<Character>();

			for (char c : a.toCharArray()) {
			  charListA.add(c);
			}

			List<Character> charListB = new ArrayList<Character>();

			for (char c : b.toCharArray()) {
			  charListB.add(c);
			}
			
			return charListA.containsAll(charListB);
			
			
			
		}
		
		
		return false;
	}

}
