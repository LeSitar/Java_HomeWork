import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {

		List<BankAccount> accounts = new ArrayList<>();
		
		BankAccount a1= new BankAccount("TYY2346721", new Person("Ivan"));
		BankAccount a2= new BankAccount("LYY2346734", new Person("Maria"));
		BankAccount a3= new BankAccount("PPY2346561", new Person("Liza"));
		BankAccount a4= new BankAccount("ABB2346724", new Person("Ivan"));
		BankAccount a5= new BankAccount("BBC2346778", new Person("Max"));
		BankAccount a6= new BankAccount("CCD2346726", new Person("Kolya"));
		BankAccount a7= new BankAccount("FFG2346725", new Person("Maria"));
		BankAccount a8= new BankAccount("GGH2346721", new Person("Ivan"));
		
		Collections.addAll(accounts,a1,a2,a3,a4,a5,a6,a7,a8 );
		
		//Task #4
		Map<Person, List<BankAccount>> collect = accounts.stream()
				.collect(Collectors.groupingBy((s)->s.getOwner()));
		
		
         Map<Person, List<String>> collect2 = accounts.stream()
        		 .collect(Collectors.groupingBy(BankAccount::getOwner,
                  Collectors.mapping(BankAccount::getIbann, Collectors.toList())));
		
         
         System.out.println(collect);
         System.out.println(collect2);
         
       //Task #5
         Map<Person, List<String>> collect3 = accounts.stream()
        		 .collect(Collectors.groupingBy(BankAccount::getOwner,
                 Collectors.mapping((s)-> replaceSymbol(s.getIbann()), Collectors.toList())));
       
         System.out.println(collect3);
         
        // Task#5 (List all IBANN with star) 
         List<String> ibans = accounts.stream()
        		 .map(BankAccount::getIbann).map(s -> replaceSymbol(s))
        		 .collect(Collectors.toList());
     
         System.out.println(ibans);
       
       //Task #6
         String str2 = "добрый день дорогоие друзья и уважаемые коллеги";
         
             List<String> strings = Arrays.asList(str2.split(" "));
             
             long wordsCount = strings.stream().filter((s)->s.startsWith("д")).count();
                          
             System.out.println(wordsCount);
             
             
             Map<String, Long> collect4 = strings.stream()
            		.collect(Collectors.groupingBy((s)->s.substring(0,1),
            		Collectors.counting()));
    		  
             System.out.println(collect4);
            
        
        ////Task #7    
         String str3 = "2345678";
         boolean allMatchIsDigital = str3.chars().allMatch((s) -> Character.isDigit(s));
         System.out.println(allMatchIsDigital);
         
         
         }
         
        
		
		static String replaceSymbol(String s) {
			
			return s.substring(0, 3) + s.substring(4).replaceAll(".", "*");
						
			}
				
		}


