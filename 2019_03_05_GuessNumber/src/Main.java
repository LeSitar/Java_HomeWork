import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Привет! Поиграем?");
		System.out.println("Я загадала число, оно больше нуля, но меньше десяти.");
		System.out.println("Угадаешь его с трех попыток?");
		
		GuessGame num1 = new GuessGame(3);
		
		guessGame(num1);
		
		

	}
	
	public static void guessGame(GuessGame a) {
		
		   int count = 0;
		   
		   Scanner sc = new Scanner(System.in);
		   while (count<3) {
		   
	       System.out.println("Введи число:");
	       int number = sc.nextInt();
	       if (a.getHiddenNumber()==number) {
	    	   System.out.println("бинго!");
	    	   count=3;
	       }else{
	    	   System.out.println((count<2) ? "попробуй еще раз!" : "Ups...game over(((");
	    	 
	       };
	       count++;
	       
	       }
		   sc.close();
			   
	       
		
	}
	
	


}
