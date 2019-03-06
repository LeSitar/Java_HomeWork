import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class Main {

	public static void main(String[] args) {
		
		List<BankAccount> bankAccounts1 = new ArrayList<>();
		Collections.addAll(bankAccounts1,new BankAccount("EBB343536"),new BankAccount("ABB232425"),
				new BankAccount("BAA121314"));
		
		List<BankAccount> bankAccounts2 = new ArrayList<>();
		Collections.addAll(bankAccounts2,new BankAccount("EBB343578"));
		
		List<BankAccount> bankAccounts3 = new ArrayList<>();
		Collections.addAll(bankAccounts3,new BankAccount("EBB343545"),new BankAccount("AAB232421"));
		
		List<BankAccount> bankAccounts4 = new ArrayList<>();
		Collections.addAll(bankAccounts4,new BankAccount("ABB343537"));
		
		List<BankAccount> bankAccounts5 = new ArrayList<>();
		Collections.addAll(bankAccounts5,new BankAccount("AAB343538"),new BankAccount("BBC232426"),
				new BankAccount("BAA121371"));
		
		Person p1 = new Person("Ivan",bankAccounts1);
		Person p2 = new Person("Anna",bankAccounts2);
		Person p3 = new Person("Mira",bankAccounts3);
		Person p4 = new Person("Mark",bankAccounts4);
		Person p5 = new Person("Lion",bankAccounts5);
		
		List<Person> persons = new ArrayList<>();
		Collections.addAll(persons, p1,p2,p3,p4,p5);
		
		
		Map<String, List<Person>> collect = persons.stream()
				.collect(Collectors.groupingBy(Person::getName)); 
		
		System.out.println(collect);
				
				
		List<String> collect2 = persons.stream().map(Person::getBankAccounts)
		.flatMap(s->s.stream()).map(BankAccount::getIbann)
		.map(s->replaceSymbol(s)).collect(Collectors.toList());
		
		System.out.println(collect2);
		
		

	}
	
	
	
	static String replaceSymbol(String s) {
		
		return s.substring(0, 3) + s.substring(4).replaceAll(".", "*");
					
		}

}
