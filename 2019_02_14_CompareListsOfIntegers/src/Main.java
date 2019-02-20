import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		List<Integer> list1 = Arrays.asList(5,10,4,3,2,1,6);
		List<Integer> list2 = Arrays.asList(7,10,2,3,1,1,6);
		
		System.out.println(compareListsInt(list1, list2));
		
		
	}
	
	
	public static List<String> compareListsInt(List<Integer> list1, List<Integer> list2){
		
		List<String> resCompare = new ArrayList<>();
		for (int i = 0; i < list1.size(); i++) {
			
			resCompare.add(list1.get(i)!= list2.get(i)? "No":"Yes");
			
		}
			
		
		return resCompare;
		
	}
}
