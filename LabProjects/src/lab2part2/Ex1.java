package lab2part2;

public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double min=1000,max=0;
		double avg,var,total=0;
		double[] heights = {165.5, 170, 180, 150};
		int lengt=heights.length;
		System.out.println(lengt);
		
		for (int i=0; i<lengt; i++) {
			var=heights[i];
			if (var < min)
				min=var;
			if (var > max)
				max=var;
			total+=var;
			System.out.println(var);}
			avg=total/lengt;
			System.out.println("average of all heights is "+avg);
			System.out.println("Min height is "+min+" and max height is "+max);

	}

}
