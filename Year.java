package varsha;
import java.util.Scanner;
public class Year {
	public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter month number (1-12): ");
        int monthChoice = scanner.nextInt();
        
       
        switch (monthChoice) {
            case 1  -> System.out.println("Welcome to January!");
            case 2  -> System.out.println("Welcome to February!");
            case 3  -> System.out.println("Welcome to March!");
            case 4  -> System.out.println("Welcome to April!");
            case 5  -> System.out.println("Welcome to May!");
            case 6  -> System.out.println("Welcome to June!");
            case 7  -> System.out.println("Welcome to July!");
            case 8  -> System.out.println("Welcome to August!");
            case 9  -> System.out.println("Welcome to September!");
            case 10 -> System.out.println("Welcome to October!");
            case 11 -> System.out.println("Welcome to November!");
            case 12 -> System.out.println("Welcome to December!");
            default -> System.out.println("Invalid choice! Please enter a number between 1 and 12.");
        }
        
        scanner.close();
    }

		
	}

