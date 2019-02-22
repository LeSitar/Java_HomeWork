import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		
		Stream<String> str1 = Stream.of("Ivan","Sasha","Anna", "Ivan", "Kolya", "Lena","Peter","Anna" );
		
		List<String> uniqueNames = str1.distinct().collect(Collectors.toList());
		System.out.println(uniqueNames);
		
		
		Person p1 = new Person("Anna", 18);
		Person p2 = new Person("Peter", 18);
		Person p3 = new Person("Vasya", 18);
		Person p4 = new Person("Olga", 12);
		Person p5 = new Person("Sasha", 10);
		Person p6 = new Person("Max", 12);
		Person p7 = new Person("Liza", 21);

		List<Person> persons = new ArrayList<>();
		Collections.addAll(persons, p1,p2,p3,p4,p5,p6,p7);
		
		
		Map<Integer,List<Person>> res = persons.stream()
		.collect(Collectors.groupingBy((s)->s.getAge()));
		
		
		System.out.println(res);
		
	}

}
