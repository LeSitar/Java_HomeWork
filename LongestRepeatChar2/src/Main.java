import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		Adress adr1 = new Adress("Bolshaya", 34);
		Adress adr2 = new Adress("Mitnaya", 12);
		Adress adr3 = new Adress("Sokolinaya", 4);
		Adress adr4 = new Adress("Kolobov", 17);
		Adress adr5 = new Adress("Ushakova", 14);
		Adress adr6 = new Adress("Gruzinskaya", 21);
		Adress adr7 = new Adress("Sivzev Vrazek", 67);

		
		Person p1 = new Person("Vanya", adr1);
		Person p2 = new Person("Olya", adr7);
		Person p3 = new Person("Misha", adr6);
		Person p4 = new Person("Petya", adr5);
		Person p5 = new Person("Katya", adr4);
		Person p6 = new Person("Zoya", adr3);
		Person p7 = new Person("Kirill", adr2);

		List<Person> persons = new LinkedList<>();
		Collections.addAll(persons, p1,p2,p3,p4,p5,p6,p7);
		
		List<Person> personsSelect = new LinkedList<>();
		Collections.addAll(personsSelect, p3,p4,p7);
		
		
		System.out.println(getAdressbyListPerson(persons, personsSelect));
		System.out.println(getAdressbyPerson(persons, "Kolya"));

	}
	
	public static List<Adress> getAdressbyListPerson(List<Person> persons, List<Person> personsSelect){
		List <Adress> res = new ArrayList<>();
		for (int i = 0; i < personsSelect.size(); i++) {
			
			for (int j = 0; j < persons.size(); j++) {
				if (personsSelect.get(i).getName()==persons.get(j).getName()) {
					res.add(persons.get(j).getAdress());
				}
				
			}	
			
			
		} 
			
		return res;
	}
	
	public static String getAdressbyPerson(List<Person> persons, String name) {
		
		for (int i = 0; i < persons.size(); i++) {
			if(name == persons.get(i).getName()) {
				
				return "by " + name + " is " + persons.get(i).getAdress();
			
			
		} 
	}
		return "not found";
	}
}
