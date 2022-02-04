package lab2part2;
import java.util.ArrayList;
import java.util.List;

public class Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Double> heightsList=new ArrayList<Double>();
		heightsList.add(150.5);
		heightsList.add(170.5);
		heightsList.add(180.6);
		heightsList.add(165.0);
		heightsList.add(150.5);
		heightsList.add(170.5);
		heightsList.add(180.6);
		heightsList.add(165.0);
		heightsList.add(180.6);
		heightsList.add(165.0);
		heightsList.remove(2);
		heightsList.add(154.5);
		heightsList.add(175.5);
		heightsList.add(150.6);
		heightsList.add(163.0);
		heightsList.add(164.0);
		
		for (int i = 0; i < heightsList.size(); i++) {

		    for (int j = heightsList.size() - 1; j > i; j--) {
		        if (heightsList.get(i) > heightsList.get(j)) {

		            double tmp = heightsList.get(i);
		            heightsList.set(i,heightsList.get(j));
		            heightsList.set(j,tmp);

		        }

		    }


		           }
		
		System.out.println("The size of the ArrayList is: " + heightsList.size());
		
		for (int k=0;k<heightsList.size();k++) {
			System.out.println(heightsList.get(k));
		}
		

}}
