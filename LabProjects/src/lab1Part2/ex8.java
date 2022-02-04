package lab1Part2;
import java.util.Scanner;
public class ex8 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner myscanner = new Scanner(System.in);
		System.out.print("Enter a value ");
		int val = myscanner.nextInt();
		if (val%2==0)
			System.out.println("value is even");
		else
			System.out.println("value is odd");		
	}

}
