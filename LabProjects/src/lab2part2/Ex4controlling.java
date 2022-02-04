package lab2part2;
import java.util.ArrayList;

public class Ex4controlling {
	
	private static void printMemberData(ArrayList<Member> mylist)
	{
	for(int i=0;i<mylist.size();i++)
	{
	Member person=mylist.get(i);
	person.printInfo();
	}
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Member member1 = new Member("Tony",41);
		//member1.printInfo();
		
		Member member2 = new Member("Aahmed",20);
		
		member2.setName("Aahmed Ashraf");
		String member2name2=member2.getName();
		//System.out.println(member2name2);
		
		member2.setAge(21);
		int member2age=member2.getAge();
		//System.out.println(member2age);
		System.out.println("");
		
		//member2.printInfo();
		
		
		Member member3 = new Member("Amra",12);
				
		member3.setName("Amra Ashraf");
		String member3name=member3.getName();
		//System.out.println(member3name);
		
		member3.setAge(13);
		int member3age=member3.getAge();
		//System.out.println(member3age);
		//System.out.println("");
		
		//member3.printInfo();
		
		
		ArrayList<Member> memberList = new ArrayList<Member>();
		
		memberList.add(new Member("Leonardo",21));
		memberList.add(new Member("Michelangelo",41));
		memberList.add(new Member("Rafaelo",37));
		memberList.add(1,new Member("Donatello",58));
		memberList.add(member3);
		printMemberData(memberList);
	}

}
