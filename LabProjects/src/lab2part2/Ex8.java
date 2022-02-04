package lab2part2;

public class Ex8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int c=25,z=25;
		int arr1[][]=new int[4][11];
		for (int i=0;i<=1;i++) {
			for (int j=0;j<=9;j++) {
					arr1[i][j]=c;
					c+=25;}}
		for (int w=1;w<=2;w++) {
			for (int k=0;k<=9;k++) {
					arr1[w][k]=z;
					z+=25;}}
			for (int p=2;p<=3;p++) {
				for (int l=0;l<=9;l++) {
					arr1[p][l]=5000;			
			}}
			for (int o=0;o<=2;o++) {
				for (int e=0;e<=9;e++) {
						System.out.print(arr1[o][e]);}
				System.out.println();}
}}
