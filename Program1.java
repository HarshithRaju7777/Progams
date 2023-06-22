import java.util.Scanner;

public class Program1 {

		static void calculation(double num1, double num2, String op) {
			if(op.equals("Addition")) {
				
				System.out.println(num1+num2);		
				}
			else if(op.equals("Subtraction")) {
				System.out.println(num1-num2);
			}
			else if (op.equals("Division")) {
				if(num2!=0) {
					System.out.println(num1/num2);
				}else {
				System.out.println("Number 2 shoud not be 0");
				}
			}else if(op.equals("Multiplication")){
				System.out.println(num1*num2);
			}else {
				System.out.println("You Entered wrong choice");
			}
			 
		}

		public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter the Number 1");
			
			double num1=scan.nextInt();
			System.out.println("Enter the Number 2");
			double num2=scan.nextInt();
			System.out.println("Enter the operation to be perform \n "
					+ "* Addition \n "
					+ "* Substraction \n "
					+ "* Multiplication \n "
					+ "* Division");
			String op=scan.next();
			calculation(num1,num2,op);
			 
		}
	}
