package java2022;
import java.util.Scanner; 

public class Student {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        
		System.out.println("Enter the num1 : ");
		int num1=sc.nextInt(); 
		
		System.out.println("Enter the num2 : ");
		int num2=sc.nextInt(); 
		
		int total=num1+num2;  
		
//		double avg=total/2.0;  //-> type 1 
		double avg=(double)total/2; // -> casting 
		
		
		System.out.println("Total is : "+total);
		System.out.println("Average  is : "+avg);

	}

}
