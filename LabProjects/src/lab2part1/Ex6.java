package lab2part1;
		
public class Ex6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		for(int i=1;i<5;i++)
		{
		for(int j=1;j<i+1;j++)
		{
		System.out.print(i);
		}}
	System.out.println(" ");
		
	//q1
		for(int i=2;i<=6;i++)
		{
		for(int j=1;j<i+1;j++)
		{
		System.out.print(i);
		}}
	System.out.println(" ");

	//q3
		for(int i=1;i<=5;i+=2)
		{
		for(int j=1;j<i+1;j++)
		{
		System.out.print(i);
		}}
		System.out.println(" ");
	
	//q4
		for(int i=1;i<8;i++)
		{
		for(int j=1;j<i+1;j+=2)
		{
		if (i%2!=0)
			System.out.print(i);
		}}
	System.out.println(" ");
			 					
	//q5
		for(int i=5;i>=1;i--)
		{
		for(int j=1;j<=i;j++)
		{
		System.out.print(i);
		}}
	System.out.println(" ");
	
	//q6
		int c=1;
		for(int i=5;i>=1;i--)
		{
		for(int j=1;j<=c;j++)
		{
		System.out.print(i);
		}
		c+=1;}
	System.out.println(" ");  
	
	//q7
		for(int i=1;i<=5;i+=2)
		{
			for(int z=1;z<=i;z++) {
				System.out.print("+");}
			if (i!=5) {
				for(int j=1;j<=i+1;j++)
				{
				System.out.print("*");
				}}}
	System.out.println(" ");
	
	//q8
		for(int i=1;i<=6;i+=3)
		{
			for(int z=1;z<=i+1;z++) {
				System.out.print("-");}
					for(int j=1;j<=i+2;j++)
					{
					System.out.print("*");
					}
						for(int k=1;k<=i+3;k++)
						{
						System.out.print("+");
						}}
	System.out.println(" ");
		
	
	

}}
