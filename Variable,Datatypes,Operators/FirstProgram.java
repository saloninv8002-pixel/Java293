class FirstProgram{
    public static void main (String args[]){
        System.out.println("Hello, World!");

        System.out.println("----------------");
        System.out.println("STUDENT DETAIL");
        System.out.println("----------------");
        String Name="Saloni";
        int phoneNumber = 1234567891;
        float cgpa=9.5f;
        char attendance='P';
        System.out.println("Name : "+Name);
        System.out.println("Phone Number : "+phoneNumber);
        System.out.println("CGPA : "+cgpa);
        System.out.println("Attendance : "+attendance);

        // OPERATORS 
        //ARITHMETIC OPERATOR
        System.out.println("-------ARITHMETIC OPERATORS---------");
        int x=40;
        float y =43.8f;

        System.out.println("X = "+x+" Y = "+y);
        System.out.println("SUM : "+(x+y));
        System.out.println("DIFFERENCE : "+(x-y));
        System.out.println("PRODUCT : "+(x*y));
        System.out.println("QUOTIENT : "+(x/y));
        System.out.println("REMINDER : "+(x%y));

        //ASSIGNMENT OPERATOR
        System.out.println("------ASSIGNMENT OPERATOR----------");
        int a=10 , b=40;

        System.out.println("A : "+a+" B : "+b);
        a+=b ;//a=a+b
        System.out.println("A : "+a+" B: "+b);
        a-=b ;//a=a-b
        System.out.println("A : "+a+" B : "+b);
         a*=b ;//a=a*b
        System.out.println("A : "+a+" B : "+b);
         a/=b ;//a=a/b
        System.out.println("A : "+a+" B : "+b);
         a%=b ;//a=a%b
        System.out.println("A : "+a+" B : "+b);

        //RELATIONAL OPERATOR
        System.out.println("-----RELATIONAL OPERATOR---------");
        int i=23, j=45;

        System.out.println("i > j: "+(i>j));
        System.out.println("i >= j: "+(i>=j));
        System.out.println("i < j: "+(i<j));
        System.out.println("i <= j: "+(i<=j));
        System.out.println("i == j: "+(i==j));
        System.out.println("i != j: "+(i!=j));

        //LOGICAL OPERATOR
        System.out.println("-----LOGICAL OPERATOR---------");
        int A=11,B=10;
        double C=13.88;

        System.out.println("A>=B and A>=C"+((A>B) && (A>C)));
        System.out.println("A>=B OR A>=C"+((A>B) || (A>C)));
        System.out.println(" NOT A>=B "+(!(A>B)));

        //INCREMENT, DECREMENT
        System.out.println("-----INCREMENT AND DECREMENT---------");
        int k=12,l=13;

        System.out.println("k : "+k+" l : "+l);
        System.out.println("k : "+(k++)+" l : "+(l++));

        l=++k;//Pre-Increment
        System.out.println("k : "+k+" l : "+l);

        l=k++;//Post-Increment
        System.out.println("k : "+k+" l : "+l);

        l=--k;//Pre-Decrement
        System.out.println("k : "+k+" l : "+l);
        
        l=k--;//Post-Decrement
        System.out.println("k : "+k+" l : "+l);
        



    }
}
