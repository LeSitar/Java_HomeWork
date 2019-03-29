import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.stream.Stream;

public class SumNumberFromFile {
	
	public static void main(String[] args) {
			
		try (BufferedReader reader = new BufferedReader (new FileReader ("number.txt"))){
			
			Stream<String> lines = reader.lines();
			int sum = lines
				    .map(line -> line.split("\\n")).flatMap(Arrays::stream)
				    .map(s->Integer.parseInt(s)).reduce((s1, s2) -> s1 + s2).orElse(0);
			System.out.println(sum);
			
		} catch (IOException ex) {
			ex.printStackTrace();
		}
		
		
			
		}
		
	}


