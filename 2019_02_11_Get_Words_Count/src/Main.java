
import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		
		wordsCount();
		System.out.println("This name repeated " + getWordsCount("Anna") + " times" );
		

	}
	
	public static Map <String, Integer> wordsCount= new HashMap<>();
	public static String[] names = {"Ivan", "Masha", "Olga", "Ivan", "Kiril", "Misha", 
			"Olga", "Ivan"};
	
	
	public static Map <String,Integer> wordsCount() {
		
		for (String s : names) {
			if (!wordsCount.containsKey(s)) {
				wordsCount.put(s, 1);
				
			}else {
				wordsCount.put(s, wordsCount.get(s)+1);
			}
		
		}
		return wordsCount;
	}
	
	
	public static int getWordsCount(String name) {
		return wordsCount.containsKey(name) ?  wordsCount.get(name) : 0;
	}
	

}


