import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Main {

	public static void main(String[] args) {

		String s1 = "aaabbbcddddoo";
		List<String> list = new ArrayList<>(Arrays.asList(s1.split("")));
		System.out.println(stringWithRepeatNumber(list));
		
		System.out.println(getStringWithNumberOfRepeatChars("aaaabbcccwwwwww"));
		     
        }
	
	// can use method String to List
	// is this correct or just unnecessary complication?
	
	//public static List<String> stringToList(String s){
	//	return new ArrayList<>(Arrays.asList(s.split("")));
	//	}
	
	// with List
	
	public static String stringWithRepeatNumber(List<String> list) {
		StringBuilder temp= new StringBuilder(list.get(0));
		int count = 1;
				
		for (int i = 0; i < list.size()-1; i++) {
			if (list.get(i).equals(list.get(i+1))) {
				count++;
				}
			else {
				temp.append(count).append(list.get(i+1));
				count = 1;
				}
		}
		temp.append(count);
		String res = temp.toString();
		return res;
	}
	
  
	
	// without List
	
	public static String getStringWithNumberOfRepeatChars(String input) {
		
		int count = 1;
		StringBuffer temp = new StringBuffer().append(input.charAt(0));
		
		for (int i = 1; i < input.length(); i++) {
			if (input.charAt(i-1)==input.charAt(i)) {
				count++;
				}			
			else {
				temp.append(count).append(input.charAt(i));
				count = 1;
			}
		}
		temp.append(count);
		String res = temp.toString();
		return res;
	}

	}
	
	


