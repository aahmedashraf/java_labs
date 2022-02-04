package lab1Part2;

public class ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int var=6;
		if (var%2==0 && var%3==0)
			System.out.println(var+ " is divisible by 2 and 3");
		else
			System.out.println(var+ " is not divisible by 2 and 3");
		
		if (var%7==0 || var%9==0)
			System.out.println(var+ " is divisible by 7 or 9");
		else
			System.out.println(var+ " is not divisible by 7 or 9");
		
		if (var%2==0 && var%3==0 && var%5!=0)
			System.out.println(var+ " is divisible by 2 and 3 but not 5");
		else
			System.out.println(var+ " is not divisible by 2 and 3 and not 5 at the same time");
		

	}

}
