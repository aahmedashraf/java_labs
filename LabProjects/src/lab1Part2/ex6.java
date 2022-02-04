package lab1Part2;

public class ex6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int leg_num=0;
		String animal="goat";
		
				
		switch (animal)
		{
		case "llama":
			leg_num=4;
			System.out.println("a(n) " + animal + " has " + leg_numb + " legs.");
			break;
		case 2:
			animal="goat";
			leg_num=4;
			break;
		case 3:
			animal="cobra";
			leg_num=0;
			break;
		case 4:
			animal="baboon";
			leg_num=4;
			break;
		case 5:
			animal="centipede";
			leg_num=30;
			break;
		case 6:
			animal="ocelot";
			leg_num=4;
			break;
		case 7:
			animal="Cod";
			leg_num=0;
			break;
		case 8:
			animal="human";
			leg_num=2;
			break;
		case 9:
			animal="tarantula";
			leg_num=8;
			break;
		case 10:
			animal="Black scorpion";
			leg_num=8;
			break;
		case 11:
			animal="Paul Allen the german Octopus";
			leg_num=8;
			break;
		case 12:
			animal="Minke whale";
			leg_num=0;
			break;
		case 13:
			animal="klingon";
			leg_num=4;
			break;
		case 14:
			animal="lela";
			leg_num=4;
			break;
		default:
			animal="unknown";
			leg_num=-1;
			break;}
	System.out.println("a(n)" + animal + " has " + leg_num + " legs");}
}
