import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		
		Person p1 = new Person("Kolya", 12);
		Person p2 = new Person("Anna", 18);
		Person p3 = new Person("Vasya", 22);
		Person p4 = new Person("Nina", 30);
		Person p5 = new Person("Asya", 10);
		Person p6 = new Person("Misha", 3);
		Person p7 = new Person("Nikita", 25);
		
		List <Person> persons = new ArrayList<>();
		Collections.addAll(persons, p1,p2,p3,p4,p5,p6,p7);
		
		
		//Task #10
		Optional<Integer> ageSum = persons.stream().filter(p-> p.getAge()>17)
		.map(Person::getAge).reduce((s1,s2) -> s1+s2);
		
		System.out.println(ageSum);
		
		Integer collect = persons.stream()
		.map(Person::getAge).collect(Collectors.summingInt(((p) -> p <17 ? p: 0)));
				
		System.out.println(collect);
		
		
		//Task #11
		String collect2 = persons.stream().filter(p-> p.getAge()>17)
		.map(Person::getName).collect(Collectors.joining(", "));
		System.out.println("In Germany " +collect2 + " are of legal age.");
		
	
		//Task *
		List <String> list = Arrays.asList("abc", "dcf", "iklmn","de");
		System.out.println(transformToUppercase(list, 3));
		
		Map<Integer, List<String>> collect3 = list.stream().map(String::toUpperCase)
				.collect(Collectors.groupingBy((p) ->p.toString().length())); 
				 
		System.out.println(collect3);

	}
	
	public static List<String> transformToUppercase(List<String> list, int i) {
		
		return list.stream().filter(p -> p.length()==i )
		.map(String::toUpperCase)
		.collect(Collectors.toList());
		
		
	}
	

}
