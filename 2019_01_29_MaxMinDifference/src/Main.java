import java.util.ArrayList;
import java.util.Collections;


public class Main {

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<>();
		Collections.addAll(list, 6,9,5,7,18,21,6);
		System.out.println(list);
		System.out.println(MaxMinElementDifference(list));

	}
	
	public static int MaxMinElementDifference(ArrayList<Integer> list) {
		
		
		return Collections.max(list) - Collections.min(list);
	}

}
