import java.util.Scanner;

public class pyramid{
public static void main(String[]args) {
Scanner scanner= new Scanner(System.in);
System.out.print("Enter the number of rows for the pyramid:");
int rows= scanner.nextInt();
for (int i = 1; i<=rows; i++) { // rows 
	// Print spaces
	for (int j = rows-i; j > 0; j--) {   // space 
		System.out.print(" ");
	}
	// Print numbers
	for (int k =1; k<=i; k++) {    // 1 2 3 
		System.out.print("* ");
		
	}
	System.out.println();
}
	scanner.close();	
	}
	
}