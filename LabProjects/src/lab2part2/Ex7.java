package lab2part2;

import java.util.ArrayList;

public class Ex7 {

	private static void printMemberData(ArrayList<Member> mylist)
	{
	for(int i=0;i<mylist.size();i++)
	{
	Member person=mylist.get(i);
	person.printInfo();
	}}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Member> mylistA=new ArrayList<Member>();
		mylistA.add(new Member("Leonardo",21));
		mylistA.add(new Member("Rafeolo",41));
		mylistA.add(new Member("Donatello",58));
		
		ArrayList<Member> mylistB=new ArrayList<Member>();
		
			printMemberData(mylistA);
			System.out.println();
			mylistB = mylistA;
			printMemberData(mylistB);
			System.out.println();
			mylistA.remove(1);
			printMemberData(mylistB);
		
		ArrayList<Member> mylistC=new ArrayList<Member>();
		ArrayList<Member> mylistD=new ArrayList<Member>();
		
		mylistC.add(new Member("Leonardo",21));
		mylistC.add(new Member("Rafeolo",41));
		mylistC.add(new Member("Donatello",58));
		
		printMemberData(mylistC);
		System.out.println();
		mylistD = (ArrayList<Member>)mylistC.clone();
		mylistC.remove(1);
		printMemberData(mylistC);
		System.out.println();
		printMemberData(mylistD);
		System.out.println();
		
		System.out.println("Testing" + "\n");
		mylistB=mylistA;
		printMemberData(mylistB);
		mylistA.add(new Member("Aman",30));
		printMemberData(mylistA);
		mylistB = (ArrayList<Member>)mylistA.clone();
		mylistB.remove(1);
		printMemberData(mylistB);
		
	}

}
