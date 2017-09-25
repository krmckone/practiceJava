//Factorial.java
public class Factorial{
	
	public static int factorial(int i) {
            if (i == 1) {
		return i;
	    }
	    else {
	        return i * factorial(i - 1);
	    }
	}

	public static void main(String[] args){
            int input = Integer.parseInt(args[0]);
	    System.out.println(factorial(input));
	}
}

