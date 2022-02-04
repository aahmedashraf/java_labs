package lab1;

public class ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double c = -52.2, b=2.3;
		final double pi=3.142;
		final String name="Aahmed Ashraf";
		boolean d = true;
		String e = "I am ", f = "a student";
		int g = 0, a=100;
		char h = '!'; 
		long x;
		double y;
		String z;
	
		
		y = a+b;
		System.out.println(y);
		
		//d is boolean so cant perform calculations  y = a + d;
		
		z = e + f;
		System.out.println(z);
		
	    y = b*c;
		System.out.println(y);
	    
		//z is a string, cant perform calculation z = name / g;
		//z is a string, cant perform calculations z = c / g;
		//cant assign doubke to long x = 10; x= Math.pow(x,3);System.out.println(x);
		
		z = name + "is" + f + h;
		System.out.println(z);
		
		//name is a string, cant perform calculations y = (name + 10)/(name + h);
		
		//d is boolean so cant perform calculations  x = (a +b)/(d+c);
		
		y = 100.3;
		y = (y / (a + b)) - c;
		System.out.println(y);
		
	    // z is a string cant perform calculations x= Math.sqrt(Math.pow(y,y)+Math.pow(z,z));
		
		 //f is string,h is char, cant use calculations name = "Is " + f - h;
		
		y=(pi+1/pi+2)/(pi+3);
		System.out.println(y);
		
		y=-2;
        Math.cbrt((Math.pow(y, y))/b);
    	System.out.println(y);
		
		y = b/g;
		z = y + name;
		System.out.println(z);
		
		//cant perform calcualtion z = name; z = b/g + z;
		
		y = -2.3;
		y = a*(Math.pow(y,2))+b*y+c;
		System.out.println(y);
    
       //d is boolean y=y-(Math.pow(a-b, Math.pow(b-c,c-d)));

        

	}

}
