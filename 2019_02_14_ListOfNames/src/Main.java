import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		List<String> names = new ArrayList<>();
		Collections.addAll(names, "Ivan", "Maria","Stephan","John","Amalia");
		System.out.println(selectiveNames(names));
		

	}
	
	public static List<String> selectiveNames(List<String> names){
		List<String> choiceNames = new ArrayList<>();
		
		names.forEach(s-> {if (s.length()!=4) {choiceNames.add(s);}});
		
		return choiceNames;
	}

}
