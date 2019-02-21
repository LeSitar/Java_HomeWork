import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		
		
		Person p1 = new Person ("Vanya", 15, new Address("Filevskaya", 10));
		Person p2 = new Person ("Olya", 21, new Address("Vesennyay", 12));
		Person p3 = new Person ("Kolya", 25, new Address("Dekabristov", 18));
		Person p4 = new Person ("Vasya", 33, new Address("Maslovka", 3));
		Person p5 = new Person ("Liza", 14, new Address("Sadovaya", 14));
		
		
		List<Person> persons = Arrays.asList(p1,p2,p3,p4,p5);
		
		
		
		Map <String,Address> res = persons.stream()
		.filter((p)-> p.getAge() > 17)
		.collect(Collectors.toMap((p) -> p.getName(), (p) -> p.getAddress()));
		
		System.out.println(res);
		

	}

}
