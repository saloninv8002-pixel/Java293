public class task7p1{
    public static int int_add(int a,int b){
    return a+b;
}
public static int int_add(int a , int b,int c){
    return a+b+c;
}
public static double double_add( double a, double b){
    return a+b;
} 
public static double double_add(double a,double b,double c){
    return a+b+c;
}
public static double multiply(double a,double b){
    return a*b;
}
public static double multiply(double a,double b,double c){
    return a*b*c;
}
public static int display(int a){
    return a;
}
public static double display(double x){;
    return x;
}public static String display(String name){
    return name;
}
public static int square(int a){
    return a*a;
}
public static double square(double a){
    return a*a;
}
public static int area(int side){
    return side*side;
}
public static double area(double radius){
    return 3.14*radius*radius;
}
public static int area(int length,int breadth){
    return length*breadth;
}
public static int maximum(int a,int b){
    if (a>b){
        return a;
    }
    else{
        return b;
    }
}
public static int maximum(int a,int b,int c){
    if (a>b && a>c){
        return a;
    }
    else if(b>a && b>c){
        return b;
    }
    else{
        return c;
    }
}
public static double average(double a,double b){
    return a+b/2;
}
public static double average(double a,double b , double c){
    return a+b+c/3;
}
public static int calculate(int a,int b ){
    return a+b;
}
public static int calculator (int a, int b,int c){
    return a+b+c;
}
public static double calculate (double a,double b){
    return a*b;
}


public static void main (String args[]){
    System.out.println("Integer Addition of two Numbers : "+int_add(10,20));
    System.out.println("Integer Addition of Three Numbers : "+int_add(10,20,30));
    System.out.println();

    System.out.println("Double Addition of Two Numbers : "+double_add(45.89,20.98));
    System.out.println("Double Addition of Three Numbers : "+double_add(10.67,2.0,30));
    System.out.println();

    System.out.println("Multiplication of Two Numbers : "+multiply(12,3.9));
    System.out.println("Multiplication Of Three Numbers : "+multiply(12.3,45.6,67.8));
    System.out.println();

    System.out.println(display(12));
    System.out.println(display(12.5));
    System.out.println(display("Saloni"));
    System.out.println();

    System.out.println("Square of An Integer : "+square(90));
    System.out.println("Square of a Floating-Point Number : "+square(45.5));
    System.out.println();

    System.out.println("Area of Square : "+area(12));
    System.out.println("Area of Rectangle : "+area(12,3));
    System.out.println("Area of Circle : "+area(89.6));
    System.out.println();

    System.out.println("Maximum of Two Numbers : "+maximum(90,80));
    System.out.println("Maximum of Three Numbers : "+maximum(80,23,45));
    System.out.println();

    System.out.println("Average of Two Numbers : "+average(12,34));
    System.out.println("Avergae of Three Numbers : "+average(23,45,67));
    System.out.println();
    
    System.out.println("Addition of Two numbers : "+calculate(12,3));
    System.out.println("Multiplication of Two Nunbers : "+calculate(12.9,87.4));


}
}