import java.util.Scanner;

public class InputOutputDemo {
	public static void main(String[] args) {
Scanner input = new Scanner(System.in); //Scanner is used to read users input
System.out.print("Enter an integer: "); //System.out.print is used to display message and print is use for keeping cursor on the same line
int userInt = input.nextInt(); //nextInt is use for reading integer entered by the user 
System.out.print("Enter a decimal number: "); 
double userDouble = input.nextDouble(); //(next(datatype)) 
input.nextLine(); // Consume newline
System.out.print("Enter a word or sentence: ");
String userString = input.nextLine();

System.out.printf("Your integer: %d%n", userInt); //%d format specifier, %n adds new line 
System.out.printf("Your decimal number: %.2f%n", userDouble); //%.2f to format the double to two decimal places.
System.out.printf("Your string: %s%n", userString); //%s as the format specifier for strings.
input.close();
	}
}