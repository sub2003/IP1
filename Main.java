import java.util.Scanner;




public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

         System.out.println("Enter your ID: ");
         int ID=sc.nextInt();

         sc.nextLine();

         System.out.println("Enter your name: ");
         String name=sc.nextLine();

         System.out.println("Enter your age: ");
         int age=sc.nextInt();

         System.out.println("Enter your DCN marks: ");
         int DCN=sc.nextInt();

         System.out.println("Enter your IP marks: ");
         int IP=sc.nextInt();

         System.out.println("Enter your MC marks: ");
         int MC=sc.nextInt();
         
         int Total_marks=MC+IP+DCN;
         double Average=Total_marks/3.00;

         System.out.println("     ");

         System.out.println("<------Student details------>");
         
         System.out.println(" ID number is : "+ID);
         System.out.println(" name is : "+name);
         System.out.println(" age is : "+age);
         System.out.println(" DCN mark is : "+DCN);
         System.out.println(" IP mark is : "+IP);
         System.out.println(" MC mark : "+MC);
         System.out.println(" Total marks : "+Total_marks);
         System.out.println(" Average marks  : "+Average);
         
    }

}
