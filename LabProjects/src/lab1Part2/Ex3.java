package lab1Part2;

public class Ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=5,b=6,c=1;
		if (a<b && b<c)
			System.out.println("a<b<c");
		else if (a<c && c<b)
			System.out.println("a<c<b");
		else if (b<a && a<c)
			System.out.println("b<a<c");
		else if (b<c && c<a)
			System.out.println("b<c<a");
		else if (c<a && a<b)
			System.out.println("c<a<b");
		else if (c<b && b<a)
			System.out.println("c<b<a");

	}

}
