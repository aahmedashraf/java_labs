package lab1Part2;

public class ex6_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String animal;
		int legs=4;
		
		switch(legs) {
		case 0:
			animal="Cobra, cod and minke whale";
			break;
		case 2:
			animal="human";
			break;
		case 4:
			animal="llama, goat, baboon, ocelot, klingon and lela";
			break;
		case 8:
			animal="Tarantula, black scorpion and paul allen";
			break;
		case 30:
			animal="centipede";
			break;
		default:
			animal="unknown";
			break;
	}
System.out.println("a(n)" + animal + " have " + legs + " legs");
}}
