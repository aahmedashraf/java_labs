package lab2part1;

public class Ex7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//Q1
		int count=0;
		for (int i=1;i<=10;i++) {
			for (int j=1;j<=10;j++) {
				System.out.println(i + " & " + j);
				count=count+1;
			}}
		System.out.println("total number of pairs= "+count);
		System.out.println(" ");
		
//q2
		int c=0;
		for (int i=1;i<10;i++) {
			for (int j=i+1;j<11;j++) {
				System.out.println(i + " & " + j);
				c+=1;
			}}
		System.out.println("total number of pairs= "+c);
		System.out.println(" ");
		
//q3

		int co=0;
		for (int i=1;i<=4;i++) {
			for (int j=4;j<=8;j++) {
				System.out.println(i + " & " + j);
				co+=1;
			}}
		System.out.println("total number of pairs= "+co);
		System.out.println(" ");
}
}
