package lab2part2;

public class Member //modifier: public, name: Member
{
	private String name; //modifier:private, type:String, name:name
	private int age;
	public Member(String n,int a)//constructor
	{
	name = n;
	age = a;
	}
	public String getName()//getter type string name getName
	{
	return name;
	}
	public void setName(String newname)//setter type string name setName
	{
	name = newname;
	}
	public int getAge()
	{
	return age;
	}
	public void setAge(int newage)
	{
	age = newage;
	}
	public void printInfo()//getter name printInfo
	{
	System.out.println("Name: "+ getName());
	System.out.println("Age: "+ getAge());
	System.out.println("*******************");}
	
	
	

	}



