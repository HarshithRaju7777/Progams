 import java.util.Scanner;
 
	public class Program2 {
		
     static void generateSeries(int a) {
	        int num = 1;
	        
	        for (int i = 1; i <= a; i++) {
	            System.out.print(num + " ");
	            num += 2;
	        }
	    }
	    public static void main(String[] args) {
	    	Scanner scan = new Scanner(System.in);
	    	System.out.println("Enter the number");
	        int a = scan.nextInt();
	         
	        
	        generateSeries(a);
	    }
	}


