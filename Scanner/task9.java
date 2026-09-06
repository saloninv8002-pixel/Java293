import java.util.Scanner;
public class task9{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter Name : ");
        String Name=sc.next();
        System.out.println( "Welcome "+Name);

        //Calculator
        System.out.println("---CALCULATOR---");

        System.out.println("1.Addition");
        System.out.println("2.Subtraction");
        System.out.println("3.Multiplication");
        System.out.println("4.Quotient");
        System.out.println("5.Reminder");

        System.out.print("Enter First Number : ");
        int A1=sc.nextInt();
        System.out.print("Enter Second Number : ");
        int A2=sc.nextInt();
        System.out.print("Enter your Choice : ");
        int ch=sc.nextInt();

        System.out.println();
        System.out.println("Choice entered : "+ch);
        System.out.println("A : "+A1);
        System.out.println("B : "+A2);
        switch(ch){
            case 1:
                int Add=A1+A2;
                System.out.println("Sum : "+Add);
                break;

             case 2:
                int Sub=A1-A2;
                System.out.println("Difference : "+Sub);
                break;
            
             case 3:
                int Mul=A1*A2;
                System.out.println("Product : "+Mul);
                break;
            
             case 4:
                int Div=A1/A2;
                System.out.println("Quotient : "+Div);
                break;

             case 5:
                int Mod=A1%A2;
                System.out.println("Reminder : "+ Mod);
                break;

            default:
                System.out.println("Please Enter from the given choice (1/2/3/4/5) ");
                break;
        }
        System.out.println();

        //positive, negative, or zero
        System.out.println("---POSITIVE,NEGATIVE,ZERO---");
        System.out.print("Enter Number : ");
        int a=sc.nextInt();
        if (a>0){
            System.out.println("Positive Number");
        }
        else if(a<0){
            System.out.println("Negative Number");
        }
        else{
            System.out.println("Zero");
        }

        //even or odd
        System.out.println("---EVEN OR ODD---");
        System.out.print("Enter Number : ");
        int a1=sc.nextInt();
        if(a1%2==0){
            System.out.println("Even Number");
        }
        else{
            System.out.println("Odd Number");
        }

        //eligible to vote
        System.out.println("---VOTE---");
        System.out.print("Enter Age : ");
        int age=sc.nextInt();
        if (age>=18){
            System.out.println("Eligible to Vote");
        }
        else{
            System.out.println("Not Eligible to Vote");
        }
        
        //two numbers and print the greater number
        System.out.println("---GREATEST OF TWO NUMS---");
        System.out.print("Enter First Number : ");
        int n1=sc.nextInt();
        System.out.print("Enter Second Number : ");
        int n2=sc.nextInt();
        if(n1>n2){
            System.out.println("The Biggest Number : "+n1);
        }
        else if (n1<n2){
            System.out.println("The Biggest Number : "+n2);
        }
        else{
            System.out.println("Both are equal ");
        }
        System.out.println();

        //three numbers and print the largest number
        System.out.println("---LARGEST OF 3 NUMBER---");
        System.out.print("Enter First Number : ");
        int num_1=sc.nextInt();
        System.out.print("Enter Second Number : ");
        int num_2=sc.nextInt();
        System.out.print("Enter First Number : ");
        int num_3=sc.nextInt();
        System.out.println();

        if (num_1==num_2 && num_2==num_3){
            System.out.println("All Values are same ");
        }
        else if(num_1>=num_2 && num_1>=num_3){
            System.out.println("The Biggest Value : "+num_1);
        }
        else if (num_2>=num_1 && num_2>=num_3){
            System.out.println("The Biggest Value : "+num_2);
        }
        else{
            System.out.println("The Biggest Value : "+num_3);
        }
        System.out.println();


        //Grading System
    System.out.println("---GRADING SYSTEM---");
    System.out.print("Marks secured : ");
    int mark=sc.nextInt();
    if(mark>=90){
        System.out.println("Grade A");
        System.out.println(" ");
    }
    else if (mark>=80){
        System.out.println("Grade B");
        System.out.println(" ");
    }
    else if (mark>=70){
        System.out.println("Grade C");
        System.out.println(" ");
    }
    else if (mark>=50){
        System.out.println("Grade D");
        System.out.println(" ");
    }
    else{
        System.out.println(" Fail ");
        System.out.println(" ");
    }
    sc.close(); 
    }
    
}
