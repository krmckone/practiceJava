// findPrimes.java
/** @author Kaleb McKone
 */
public class findPrimes{
    public static void printPrimes(int end){
	for (int i = 1; i <= end; i++){
	    for (int x = 1; x <= i; x++){
		if (i % x == 0){ 
	            if (x != 1 && x != i){
		        break;
	            }
		    if (i == x){
			System.out.println(i);
	            }
		}	
	    }	    
        }
   }
    

    public static void main(String[] args){
	    printPrimes(Integer.parseInt(args[0]));
    }
}
