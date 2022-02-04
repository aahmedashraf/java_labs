package lab2part1;

public class ex8p1 {
	
	private static void PrintArray(int[][] array)
	{
	for(int i=0;i<array.length;++i)
	{
	for(int j=0;j<array[i].length;++j)
	{
	System.out.print(array[i][j] + " ");
	}
	System.out.println();
	}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int c=25,z=25;
		int myarray[][]=new int[3][10];
		for (int i=0;i<=2;i++) {
			for (int j=0;j<=9;j++) {
				if (i==0) {
					myarray[i][j]=c;
					c+=25;}
				else if (i==1) {
					myarray[i][j]=z;
					z+=25;}
				else
					myarray[i][j]=5000;
				}}
		PrintArray(myarray);

	
}}
