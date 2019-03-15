import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Person {
	
	private String name;
	private int age;
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

	public static void main(String[] args) {

		List<Person> persons = new ArrayList<>();
		
try (BufferedReader reader = new BufferedReader (new FileReader ("persons.csv"))){
	
	 String line;
     while ((line = reader.readLine()) != null) {
        persons.add(new Person (line.substring(0, line.indexOf(",")), 
        		Integer.valueOf(line.substring(line.indexOf(",")+2))));
        		  
     }
		} catch (IOException ex) {
			ex.printStackTrace();
		}

		List<Person>pr1 =persons.stream().sorted(Comparator.comparing(Person::getAge))
		.collect(Collectors.toList());
		System.out.println(pr1 );
	}

}
