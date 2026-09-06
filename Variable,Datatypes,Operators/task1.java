class task1{
    public static void main (String args[]){
        System.out.println(" ");
        
        //Student Details
        System.out.println("-------------------");
        System.out.println("STUDENT DETAILS");
        System.out.println("-------------------");
        int stud_id=20624086;
        String stud_Name ="Saloni";
        int Age=18;
        String stud_Course="CSE";

        System.out.println("ID     : "+stud_id);
        System.out.println("Name   : "+stud_Name);
        System.out.println("Age    : "+Age);
        System.out.println("Course : "+stud_Course);
        System.out.println(" ");

        //Employee Details
        System.out.println("-------------------");
        System.out.println("EMPLOYEE DETAILS");
        System.out.println("-------------------");
        int employee_Id=20624;
        String employee_Name ="Saloni";
        int employee_salary=1200000;
        String employee_dept="CSE";

        System.out.println("ID         : "+employee_Id);
        System.out.println("Name       : "+employee_Name);
        System.out.println("Salary     : "+employee_salary);
        System.out.println("Department : "+employee_dept);
        System.out.println(" ");
        
        //Sum of Two Nums
        System.out.println("---SUM OF TWO NUMS---");
        int a=12,b=14;
        int add=a+b;
        System.out.println("A   : "+a);
        System.out.println("B   : "+b);

        System.out.println("ADD : "+add);
        System.out.println(" ");

        //Averag of 3 Num
        System.out.println("---AVG OF 3 NUMS---");
        int i=12,j=13,k=14;
        int total = i+j+k;
        int avg=total/3;
        System.out.println("Total : "+total);
        System.out.println("Average : "+avg);
        System.out.println(" ");

        //Perimeter and Area Of Rectangle
        System.out.println("---AREA AND PERIMETER OF RECTANGLE---");
        int length=12,breadth=13;
        double rectangle_area=length*breadth;
        double rectangle_perimeter=2*(length+breadth);
        System.out.println("Length : "+length);
        System.out.println("Breadth : "+breadth);
        System.out.println("Area Of Rectangle : "+rectangle_area);
        System.out.println("Perimeter of Rectangle : "+rectangle_perimeter);
        System.out.println(" ");

        //Area ad Circumference of Circle
        System.out.println("---AREA AND CIRCUMFERENCE OF CIRCLE---");
        int radius=12;
        double circle_area=3.14*radius*radius;
        double circumference = 2*3.14*radius;
        System.out.println("Radius : "+radius);
        System.out.println("Area Of Circle : "+circle_area);
        System.out.println("Circumference Of Circle : "+circumference);
        System.out.println(" ");

        //Swap nums with 3rd Variable
        System.out.println("---SWAP NUMBERS USING THIRD VARIABLE---");
        System.out.println();
        int A=12,B=13;
        System.out.println("Before Swapping...");
        System.out.println("A : "+A);
        System.out.println("B : "+B);
        int C=A;
        A=B;
        B=C;
        System.out.println("After Swapping...");
        System.out.println("A : "+A);
        System.out.println("B : "+B);
        System.out.println(" ");

        //Swap nums without 3rd variable
        System.out.println("---SWAP TWO VARIABLE WITHOUT 3RD VARIABLE---");
        int c=42,d=36;
        System.out.println("Before Swapping...");
        System.out.println("A : "+c);
        System.out.println("B : "+d);
        c+=d;
        d=c-d;
        c=c-d;
        System.out.println("After Swapping...");
        System.out.println("A : "+c);
        System.out.println("B : "+d);
        System.out.println(" ");

        //Celcius to Fahrenheit
        System.out.println("---CONVERT TEMP FROM CELCIUS TO FAHRENHEIT---");
        double temp_celcius=30.45;
        System.out.println("Temperature in Celcius : "+temp_celcius);
        double temp_fahrenheit=(temp_celcius*9/5)+32;
        System.out.println("Temperature in Fahrenheit : "+temp_fahrenheit);
        System.out.println(" ");

        //Arithmetic operator
        //ADD,SUB.DIV,MUL,MOD
        System.out.println("---CALCULATOR---");
        System.out.println("1.Addition");
        System.out.println("2.Subtraction");
        System.out.println("3.Multiplication");
        System.out.println("4.Quotient");
        System.out.println("5.Reminder");
        String ch="1";
        int A1 = 12, A2 = 13;
        System.out.println(" ");
        System.out.println("Choice entered : "+ch);
        System.out.println("A : "+A1);
        System.out.println("B : "+A2);
        switch(ch){
            case "1":
                int Add=A1+A2;
                System.out.println("Sum : "+Add);
                break;

             case "2":
                int Sub=A1-A2;
                System.out.println("Difference : "+Sub);
                break;
            
             case "3":
                int Mul=A1*A2;
                System.out.println("Product : "+Mul);
                break;
            
             case "4":
                int Div=A1/A2;
                System.out.println("Quotient : "+Div);
                break;

             case "5":
                int Mod=A1%A2;
                System.out.println("Reminder : "+ Mod);
                break;

            default:
                System.out.println("Please Enter from the given choice (1/2/3/4/5) ");
                break;
        }
        System.out.println(" ");

        //Average and total
        System.out.println("---TOTAL AND AVERAGE---");
        int tamil_mark=90,eng_mark=98,maths_mark=100,social_mark=99,science_mark=91;
        System.out.println("Tamil Marks : "+tamil_mark);
        System.out.println("English Marks : "+eng_mark);
        System.out.println("Maths Marks : "+maths_mark);
        System.out.println("Science Marks : "+science_mark);
        System.out.println("Social Marks : "+social_mark);
        int total_mark=tamil_mark+eng_mark+maths_mark+social_mark+science_mark;
        double average_mark=total_mark/5;
        System.out.println("Total Marks : "+total_mark);
        System.out.println("Average : "+average_mark);
        System.out.println();

        //Square and cube
        System.out.println("---SQUARE AND CUBE---");
        int n=12;
        System.out.println("Number : "+n);
        System.out.println("Square : "+(n*n));
        System.out.println("Cube : "+(n*n*n));
        System.out.println();

        //Simple interest
        System.out.println("---SIMPLE INTEREST---");
        double p=100000;
        double r=12;
        double t=12;
        double Simple_Interest=(p*r*t)/100;
        System.out.println("Principle value : "+p);
        System.out.println("Rate : "+r);
        System.out.println("Time : "+t);
        System.out.println("Simple Interest : "+Simple_Interest);
        System.out.println();

        //Compound interest
        System.out.println("---COMPOUND INTEREST---");
        double p_ci=100000;
        double r_ci=12;
        int t_ci=12;
        double Compound_Interest=(p_ci*Math.pow((1+r_ci/100),t_ci))-p_ci;
        System.out.println("Principle value : "+p_ci);
        System.out.println("Rate : "+r_ci);
        System.out.println("Time : "+t_ci);
        System.out.println("Compound Interest : "+Compound_Interest);
        System.out.println();

        //relational operator
        //Max of Two Nums
        System.out.println("---GREATEST OF TWO NUMS---");
        int n1=12,n2=33;
        System.out.println("A : "+n1);
        System.out.println("B : "+n2);
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

        //Two nums equal
        System.out.println("---CHECK TWO NUMS ARE EQUAL---");
        int N1=12,N2=33;
        System.out.println("A : "+N1);
        System.out.println("B : "+N2);
        if(N1==N2){
            System.out.println("Both are equal");
        }
        else{
            System.out.println("Not equal ");
        }
        System.out.println();

        //Largest of 3 numbers
        System.out.println("---LARGEST OF 3 NUMBER---");
        int num_1=12,num_2=2,num_3=12;
        System.out.println("A : "+num_1);
        System.out.println("B : "+num_2);
        System.out.println("C : "+num_3);
        System.out.println(" ");
        if (num_1==num_2 && num_2==num_3){
            System.out.println("All Values are same ");
        }
        else if(num_1>=num_2 && num_1>=num_3){
            System.out.println("The Biggest Value : "+num_1);
            System.out.println(" ");
        }
        else if (num_2>=num_1 && num_2>=num_3){
            System.out.println("The Biggest Value : "+num_2);
            System.out.println(" ");
        }
        else{
            System.out.println("The Biggest Value : "+num_3);
            System.out.println(" ");
        }


        //greater than 100
        System.out.println("---CHECK IF THE NUM IS GREATER THAN 100---");
        int P=200;
        System.out.println("Number : "+P);
        if(P>100){
            System.out.println("Greater than 100 ");
        }
        else if (P<100){
            System.out.println("Less than 100");
        }
        else{
            System.out.println("Ëqual to 100");
        }
        System.out.println();


        // Check <,>,==  50
        System.out.println("---CHECK IF THE NUM IS >,<,== 50---");
        int p1=200;
        System.out.println("Number : "+p1);
        if(p1>50){
            System.out.println("Greater than 50 ");
        }
        else if (p1<50){
            System.out.println("Less than 50");
        }
        else{
            System.out.println("Equal to 50");
        }
        System.out.println();

        //logical Operators
        //Pass in all subjects
        System.out.println("---CHECK PASS IN ALL SUBJECTS---");
        int T=80,E=88,M=90,S=99,SS=100;
        System.out.println("Tamil Marks : "+T);
        System.out.println("English Marks : "+E);
        System.out.println("Maths Marks : "+M);
        System.out.println("Science Marks : "+S);
        System.out.println("Social Marks : "+SS);
        System.out.println();
        if(T>=35 && E>=35 && M>=35 && S>=35 && SS>=35){
            System.out.println("PASS in all subjects");
        }
        else{
            System.out.println("Failed");
        }
        System.out.println();

        //Eligible for Discount Based On age and Membership
        System.out.println("---ELIGIBLE FOR DISCOUNT---");
        boolean membership=true;

        System.out.println("Age : "+Age);
        if(membership){
            System.out.println("Membership : Yes");
        }
        else{
            System.out.println("Membership : No");
        }

        if(Age>=18 && Age<=60){
            if(membership){
                System.out.println("25% Discount");
            }
            else{
                System.out.println("10% Discount");
            }
        }
        else if (membership){
            System.out.println("15% Discount");

        }
        else{
            System.out.println("No Discount");
        }
        System.out.println();

        //username and password
        System.out.println("---USERNAME AND PASWORD---");
        String correct_username="Saloni";
        String correct_password="1234";
        String username="Salo";
        String password="1234";
        System.out.println("UserName : "+username);
        System.out.println("Password : "+password);
        if(correct_username==username && correct_password==password){
            System.out.println("Login Successfull");
        }
        else if (correct_username==username && correct_password!=password){
            System.out.println("Invalid Password!!");
        }
        else if (correct_username!=username && correct_password==password){
            System.out.println("Username Not Found");
        }
        else{
            System.out.println("Invalid");
        }
        System.out.println();

        //Not operator
        System.out.println("---NOT OPERATOR !!---");
        boolean logged_in=false;
        if( ! logged_in){
            System.out.println("Please Log In");
        }
        System.out.println();

        //Check if number lies btw 1 and 50
        System.out.println("---CHECK NUMBER LIES BTW 1-50---");
        int N=20;
        System.out.println("Number : "+N);
        if (N>=1 && N<=50){
            System.out.println("lies within the range");
        }
        else{
            System.out.println("Not within the Range");
        }
        System.out.println();

        //BONUS QUESTION
        //day name based on day number
        System.out.println("---DAY NAME BASED ON NUMBER---");
        String check="1";
        System.out.println("Choice Entered : "+check);
        switch(check){
            case "1":
                System.out.println("1.Sunday");
                break;
            case "2":
                System.out.println("2.Monday");
                break;
            case "3":
                System.out.println("3.Tuesday");
                break;
            case "4":
                System.out.println("4.Wednesday");
                break;
            case "5":
                System.out.println("5.Thursday");
                break;
            case "6":
                System.out.println("6.Friday");
                break;
            case "7":
                System.out.println("7.Saturday");
                break;
            default:
                System.out.println("Please Enter from the Choice (1/2/3/4/5/6/7)");
                break;
        }
        System.out.println();

        //Month name based on month number
        System.out.println("---MONTH NAME BASED ON MONTH NUMBER---");
        String Ch="7";
        System.out.println("Choice Entered : "+Ch);

        switch(Ch){
            case "1":
                System.out.println("January");
                break;
            case "2":
                System.out.println("February");
                break;
            case "3":
                System.out.println("March");
                break;
            case "4":
                System.out.println("April");
                break;
            case "5":
                System.out.println("May");
                break;
            case "6":
                System.out.println("June");
                break;
            case "7":
                System.out.println("July");
                break;
            case "8":
                System.out.println("August");
                break;
            case "9":
                System.out.println("September");
                break;
            case "10":
                System.out.println("October");
                break;
            case "11":
                System.out.println("November");
                break;
            case "12":
                System.out.println("December");
                break;
            default:
                System.out.println("Invalid Choice !!");
                break;
        }
        System.out.println();

        //Smallest of Three Numbers
        System.out.println("---SMALLEST OF THREE NUMBERS---");
        int B1=12,B2=13,B3=78;
        System.out.println("A : "+B1);
        System.out.println("B : "+B2);
        System.out.println("C : "+B3);

        if(B1==B2 && B2==B3){
            System.out.println("All Values are same ");
        }
        else if (B1<=B2 && B1<=B3){
            System.out.println("Smallest Value : "+B1);
        }
        else if (B2<=B1 && B2<=B3){
            System.out.println("Smallest Value : "+B2);
        }
        else{
            System.out.println("Smallest Value : "+B3);
        }
        System.out.println();

        //Num Divisible by 5
        System.out.println("---NUMBER DIVISIBLE BY 5---");
        int C1=12;
        System.out.println("Number : "+C1);
        if(C1%5==0){
            System.out.println("Divisible By 5 ");
        }
        else{
            System.out.println("Not Divisible by 5");
        }
        System.out.println();

        //Num divisible by both 3 and 5
        System.out.println("---NUMBER DIVISIBLE BY BOTH 3 AND 5---");
        int c1=12;
        System.out.println("Number : "+c1);
        if(c1%5==0 && c1%3==0){
            System.out.println("Num Divisible by both 3 and 5");
        }
        else if (c1%5==0 && c1%3!=0){
            System.out.println("Divisible Only by 5");
        }
        else if (c1%5!=0 && c1%3==0){
            System.out.println("Divisible Only by 3");
        }
        else{
            System.out.println("Not Divisible by both 5 and 3");
        }
        System.out.println();

        //abs value
        System.out.println("---ABSOLUTE VALUE---");
        int b1=-12;
        System.out.println("Number : "+b1);
        System.out.println("Absolute Value : "+Math.abs(b1));
        System.out.println();

        //Vowels or consonants
        System.out.println("---VOWEL OR CONSONANT---");
        char s='a';
        if(s=='a'||s=='e'||s=='i'||s=='o'||s=='u'){
            System.out.println("Vowel - LowerCase");
        }
        else if(s=='A'||s=='E'||s=='I'||s=='O'||s=='U'){
            System.out.println("Vowel - UpperCase");
        }
        else{
            System.out.println("Consonant");
        }
        System.out.println();

        //Max of 4 nums2
        System.out.println("---MAX  OF 4 NUMS---");
        int B4=12;
        if(B1==B2 && B2==B3 && B3==B4){
            System.out.println("All Values are Same ");
        }
        else if(B1>=B2 && B1>=B3 && B1>=B4){
            System.out.println("The Biggest Number : "+B1);
        }
        else if(B2>=B1 && B2>=B3 && B2>=B4){
            System.out.println("The Biggest Number : "+B2);
        }
        else if(B3>=B1 && B3>=B2 && B3>=B4){
            System.out.println("The Biggest Number : "+B3);
        }
        else{
           System.out.println("The Biggest Number : "+B4);
         }
         System.out.println();

         //EB Bill Calculator
         System.out.println("---EB BILL CALCULATOR---");
         int unit_consumed=500;
         System.out.println("Units Consumed : "+unit_consumed);
         if(unit_consumed<=100){
            System.out.println("Free");
        }
        else if(unit_consumed<=200){
            System.out.println("2.25 per Unit"); 
            System.out.println("Price : "+(unit_consumed*2.25));
        }
        else if(unit_consumed<=400){
            System.out.println("4.50 per Unit");
            System.out.println("Price : "+unit_consumed*4.50);
        }
        else if(unit_consumed<=500){
            System.out.println("6.00 per Unit ");
            System.out.println("Price : "+(unit_consumed*6));
        }
        else{
            System.out.println("8.00 per Unit");
            System.out.println("Price : "+(unit_consumed*8));
        }
        System.out.println(" ");

        //Moblie Recharge
        System.out.println("---MOBILE RECHARGE---");
        double Recharge_amt =1000;
        System.out.println("Recharge Amount : "+Recharge_amt);
        if(Recharge_amt<100){
            System.out.println("No Discount");
        }
        else if (Recharge_amt<299){
            System.out.println("5% Discount");
            System.out.println("Discount Price : "+(Recharge_amt*0.05));
            System.out.println("Final Price : "+(Recharge_amt-(Recharge_amt*0.05)));
        }
        else if (Recharge_amt<499){
            System.out.println("10% Discount");
            System.out.println("Discount Price : "+(Recharge_amt*0.10));
            System.out.println("Final Price : "+(Recharge_amt-(Recharge_amt*0.10)));
        }
        else if (Recharge_amt<999){
            System.out.println("15% Discount");
            System.out.println("Discount Price : "+(Recharge_amt*0.15));
            System.out.println("Final Price : "+(Recharge_amt-(Recharge_amt*0.15)));
        }
        else{
            System.out.println("20% Discount");
            System.out.println("Discount Price : "+(Recharge_amt*0.20));
            System.out.println("Final Price : "+(Recharge_amt-(Recharge_amt*0.20)));
        }
        System.out.println();

        //movie ticket based on age
        System.out.println("---MOVIE TICKET BASED ON AGE---");
        System.out.println("Age : "+Age);
        if(Age<5){
            System.out.println("Free");
        }
        else if (Age<=12){
            System.out.println("Price : 100");
        }
        else if (Age<=17){
            System.out.println("Price : 150");
        }
        else if (Age<=59){
            System.out.println("Price : 250");
        }
        else{
            System.out.println("Price : 120 (Senior Citizen Discount)");
        }
        System.out.println();

        //BODY MASS INDEX
        System.out.println("---BODY MASS INDEX (BMI)---");
        double weight_kgs=60,height_m=1.52;
        System.out.println("Weight : "+weight_kgs+" kg");
        System.out.println("Height : "+height_m+" m");
        double BMI=weight_kgs/(height_m*height_m);
        System.out.println("Body Mass Index (BMI) : "+BMI);
        if(BMI<=18.5){
            System.out.println("Under Weight");
        }
        else if (BMI<25){
            System.out.println("Normal Weight");
        }
        else if (BMI<30){
            System.out.println("Over Weight");
        }
        else{
            System.out.println("Obese");
        }
        System.out.println();

        //Salary after tax
        System.out.println("---SARY AFTER TAX REDUCTION---");
        double annualIncome=2000000;
        System.out.println("Annual income : "+annualIncome);
        if(annualIncome<=400000){
            System.out.println("No Tax");
            System.out.println(" ");
        }
        else if (annualIncome<=800000){
            System.out.println("5% Tax ");
            System.out.println("Taxed Amount : "+(annualIncome*0.05));
            System.out.println("Salary After Reduction of tax : "+(annualIncome-(annualIncome*0.05)));
         }
         else if (annualIncome<=1200000){
            System.out.println("10% Tax ");
            System.out.println("Taxed Amount : "+(annualIncome*0.10));
            System.out.println("Salary After Reduction of tax : "+(annualIncome-(annualIncome*0.10)));
        }
        else if (annualIncome<=1600000){
            System.out.println("15% Tax ");
            System.out.println("Taxed Amount : "+(annualIncome*0.15));
            System.out.println("Salary After Reduction of tax : "+(annualIncome-(annualIncome*0.15)));
        }
        else if (annualIncome<=2000000){
            System.out.println("20% Tax ");
            System.out.println("Taxed Amount : "+(annualIncome*0.20));
            System.out.println("Salary After Reduction of tax : "+(annualIncome-(annualIncome*0.20)));
        }
        else if (annualIncome<=2400000){
            System.out.println("25% Tax ");
            System.out.println("Taxed Amount : "+(annualIncome*0.25));
            System.out.println("Salary After Reduction of tax : "+(annualIncome-(annualIncome*0.25)));
        }
        else{
            System.out.println("30% Tax ");
            System.out.println("Taxed Amount : "+(annualIncome*0.30));
            System.out.println("Salary After Reduction of tax : "+(annualIncome-(annualIncome*0.30)));
            
        }
        System.out.println();

        //Blood Dontaion
        System.out.println("---BLOOD DONATION CRITERIA---");
        System.out.println("Age : "+Age);
        System.out.println("Weight : "+weight_kgs);
        if(Age>=18 && Age<=59){
            if(weight_kgs>=50){
                System.out.println("Eligible to Donate ");
            }
            else{
                System.out.println("Not Eligible to Donate");
            }
        }
        else{
            System.out.println("Not Eligible To Donate");
        }
        System.out.println();

        //Driving license
        System.out.println("---DRIVING LICENSE ELIGIBILITY---");
        System.out.println("Age : "+Age);
        if(Age>=18){
            System.out.println("Eligible for License");
        }
        else{
            System.out.println("Not Eligible for Lisence");
        }
        System.out.println();

        //Season based on Month
        System.out.println("---SEASON BASED ON MONTH---");
        String Choice="1";
        System.out.println("Choice Entered : "+Choice);
        switch(Choice){
            case "1":
                System.out.println("Selected Month : January");
                System.out.println("Season : Winter");
                break;
            case "2":
                System.out.println("Selected Month : February");
                System.out.println("Season : Winter");
                break;
            case "12":
                System.out.println("Selected Month : December");
                System.out.println("Season : Winter");
                break;
    
            case "3":
                System.out.println("Selected Month : March");
                System.out.println("Season : Summer");
                break;
            case "4":
                System.out.println("Selected Month : April");
                System.out.println("Season : Summer");
                break;
            case "5":
                System.out.println("Selected Month : May");
                System.out.println("Season : Summer");
                break;

            case "6":
                System.out.println("Selected Month : June");
                System.out.println("Season : Monsoon");
                break;
            case "7":
                System.out.println("Selected Month : July");
                System.out.println("Season : Monsoon");
                break;
            case "8":
                System.out.println("Selected Month : August");
                System.out.println("Season : Monsoon");
                break;
            case "9":
                System.out.println("Selected Month : September");
                System.out.println("Season : Monsoon");
                break;

            case "10":
                System.out.println("Selected Month : October");
                System.out.println("Season : Post Monsoon");
                break;
            case "11":
                System.out.println("Selected Month : November");
                System.out.println("Season : Post Monsoon");
                break;

            default:
                System.out.println("Invaid Option");
                break;
        }
        System.out.println();

        //Department name and based on Department Code
        System.out.println("---DEPARTMENT NAME BASED ON DEPARTMENT CODE---");
        String Check="CSE";
        System.out.println("Choice Entered : "+Check);

        switch(Check){
            case "CSE":
                System.out.println("Computer Science and Engineering ");
                break;

            case "ECE":
                System.out.println("Electronics and Communication Enginnering ");
                break;

            case "EEE":
                System.out.println("Electrical and Electronic Engineering ");
                break;

            case "MECH":
                System.out.println("Mechanical Engineering ");
                break;
            
            case "CIVIL":
                System.out.println("Civil Engineering");
                break;

            case "IT":
                System.out.println("Information Technology");
                break;

            case "AIDS":
                System.out.println("Artificial Intelligence and DataScience ");
                break;

            default:
                System.out.println("Invalid Option");
                break;

        }
        System.out.println();

        //Shopping Bill Discount
        System.out.println("---SHOPPING BILL---");
        double initial_amount=2999;
        System.out.println("Bill Amount : "+initial_amount);

        if(initial_amount<1000){
            System.out.println("No Discount");
        }
        else if (initial_amount<2999){
            System.out.println("5% Discount");
            System.out.println("Discount amount : "+(initial_amount*0.05));
            System.out.println("Final Price : "+(initial_amount-(initial_amount*0.05)));

        }
        else if (initial_amount<4999){
            System.out.println("10% Discount");
            System.out.println("Discount amount : "+(initial_amount*0.10));
            System.out.println("Final Price : "+(initial_amount-(initial_amount*0.10)));
            
        }
        else if (initial_amount<9999){
            System.out.println("15% Discount");
            System.out.println("Discount amount : "+(initial_amount*0.15));
            System.out.println("Final Price : "+(initial_amount-(initial_amount*0.15)));
            
        }
        else{
            System.out.println("20% Discount");
            System.out.println("Discount amount : "+(initial_amount*0.20));
            System.out.println("Final Price : "+(initial_amount-(initial_amount*0.20)));
            }
        System.out.println();

        //Hotel Menu
        System.out.println("-------------");
        System.out.println("HOTEL MENU");
        System.out.println("--------------");
        System.out.println("1.Idly");
        System.out.println("2.Dosa");
        System.out.println("3.Vada");
        System.out.println("4.Chapathi");
        System.out.println("5.Puri");
        System.out.println("6.Pongal");
        System.out.println("7.Coffee");
        System.out.println("8.Tea");

        String choice="1";
        System.out.println();
        System.out.println("Choice Entered : "+choice);
        System.out.println();

        switch (choice) {
            case"1":
            System.out.println("Idly - 30");
            break;

            case"2":
            System.out.println("Dosa - 60");
            break;

            case"3":
            System.out.println("Vada - 15");
            break;

            case"4":
            System.out.println("Chapathi - 50");
            break;

            case"5":
            System.out.println("Puri - 60");
            break;

            case"6":
            System.out.println("Pongal - 35");
            break;

            case"7":
            System.out.println("Coffee - 15");
            break;

            case"8":
            System.out.println("Tea - 10");
            break;

            default:
                System.out.println("Invalid Option");
            
        }
        System.out.println();


        }
        }
