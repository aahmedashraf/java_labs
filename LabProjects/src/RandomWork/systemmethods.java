package RandomWork;

public class systemmethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		long before = System.currentTimeMillis();
		for (int i=0;i<=1;i++) 
		System.out.println("I am ironman");
		long after= System.currentTimeMillis();
		System.out.println(after - before);
		System.out.println(System.getenv("windir"));
	
	}
	}

