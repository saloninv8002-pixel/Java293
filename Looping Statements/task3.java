class task3{
    public static void main (String args []){
        //numbers from 1 to 100
        //do....while loop
        System.out.println("---NUMBERS FROM 1-100 USING DO WHILE LOOP---");
        int i =1;
        do{
            System.out.print(i+" ");
            i++;
        }
        while(i<=100);
        System.out.println();
        System.out.println();
        
        //while
        System.out.println("---NUMBERS FROM 1-100 USING WHILE LOOP---");
        int j =1;
        while(j<=100){
            System.out.print(j+" ");
            j++;
        }
        System.out.println();
        System.out.println();
        
        //For loop
        System.out.println("---NUMBERS FROM 1-100 USING FOR LOOP---");
        for(int q=1;q<=100;q++){
            System.out.print(q + " ");
        }
        System.out.println();
        System.out.println();

        //even number from 1-100 using do while loop
        System.out.println("---EVEN NUMBERS FROM 1-100 USING DO WHILE LOOP---");
        int i3=1;
        do{
            if(i3%2==0){
                System.out.print(i3+" , ");
            }
            i3++;
        }
        while(i3<=100);
        System.out.println();
        System.out.println();


        //even numbers using while loop
        System.out.println("---EVEN NUMBERS FROM 1-100 USING WHILE LOOP ---");
        int i1=1;
        while(i1<=100){
            if(i1%2==0){
                System.out.print(i1+" , ");
            }
            i1++;
        }
        System.out.println();
        System.out.println();

        //even numbers from 1-100 using for loop
        System.out.println("---EVEN NUMBER FROM 1-100 USING FOR LOOP---");
        for (int i2=1;i2<=100;i2++){
            if(i2%2==0){
                System.out.print(i2+" , ");
            }
        }
        System.out.println();
        System.out.println();

        //odd numbers using do while loop
        System.out.println("---ODD NUMBERS FROM 1-100 USING DO WHILE---");
        int j1=1;
        do{
            if(j1%2!=0){
                System.out.print(j1+" , ");
            }
            j1++;
        }
        while(j1<=100);
        System.out.println();
        System.out.println();

        //odd numbers using while loop
        System.out.println("---ODD NUMBERS FROM 1-100 USING WHILE---");
        int j2=1;
        while(j2<=100){
            if(j2%2!=0){
                System.out.print(j2+" , ");
            }
            j2++;
        }
        System.out.println();
        System.out.println();

        //odd numbers using for loop
        System.out.println("---ODD NUMBERS FROM 1-100 USING FOR LOOP---");
        for (int j3=1;j3<=100;j3++){
            if(j3%2!=0){
                System.out.print(j3+" , ");
            }
        }
        System.out.println();
        System.out.println();

        //sum of N natural numbers using do while loop 
        System.out.println("---SUM OF N NATURAL NUMBERS USING DO WHILE LOOP---");
        int N1 = 50;
        System.out.println("Number : "+N1);
        int k1=1,sum1=0;
        do{
            sum1+=k1;
            k1++;
        }
        while(k1<=N1);
        System.out.println("Answer : "+sum1);
        System.out.println();

        //sum of N natural numbers using while loop
        System.out.println("---SUM OF N NATURAL NUMBERS USING WHILE LOOP---");
        int k2=1,sum2=0,N2=20;
        System.out.println("Number : "+N2);
        while(k2<=N2){
            sum2+=k2;
            k2++;
        }
        System.out.println("Answer : "+sum2);
        System.out.println();

        //sum of N natural Numbers using for loop
        System.out.println("---SUM OF N NATURAL NUMBERS USING FOR LOOP---");
        int sum3=0,N3=68;
        System.out.println("Number : "+N3);
        for (int k3=1; k3<=N3;k3++){
            sum3+=k3;
        }
        System.out.println("Answer : "+sum3);
        System.out.println();

        //factorial
        //do..while loop
        System.out.println("---FACTORIAL USING DO WHILE LOOP---");
        int fact2=1,N_2=4,i_2=1;
        System.out.println("Number : "+N_2);
        do{
            fact2*=i_2;
            i_2++;
        }
        while(i_2<=N_2);
        System.out.println("Factorial : "+fact2);
        System.out.println();

        //while loop
        System.out.println("---FACTORIAL USING WHILE LOOP---");
        int fact3=1,i_3=1,N_3=3;
        System.out.println("Number : "+N_3);
        while(i_3<=N_3){
            fact3*=i_3;
            i_3++;

        }
        System.out.println("Factorial : "+fact3);
        System.out.println();

        //for loop
        System.out.println("---FACTORIAL USING FOR LOOP---");
        int fact1=1,N_1=5;
        System.out.println("Number : "+N_1);
        for(int i_1= 1;i_1<=N_1;i_1++){
            fact1*=i_1;
        }
         System.out.println("Factorial : "+fact1);
         System.out.println();


         //reverse a given number using do while loop
         System.out.println("---REVERSE GIVEN NUMBER USING DO WHILE LOOP---");
         int num1=123,rev_1=0,r1=1;
         System.out.println("Number : "+num1);
         do{
            r1=num1%10;
            rev_1=rev_1*10+r1;
            num1=num1/10;
         }
         while(num1>0);
         System.out.println("Reversed Number : "+rev_1);
         System.out.println();

         //while loop
         System.out.println("---REVERSE GIVEN NUMBER USING WHILE LOOP---");
         int num2=456,rev_2=0,r2=1;
         System.out.println("Number : "+num2);
         while(num2>0){
            r2=num2%10;
            rev_2=rev_2*10+r2;
            num2=num2/10;
         }
         System.out.println("Reversed Number : "+rev_2);
         System.out.println();

         //for loop
         System.out.println("---REVERSE GIVEN NUMBER USING FOR LOOP---");
         int num3=789,rev_3=0,r3=1;
         System.out.println("Number : "+num3);
         for(int l=num3; l >0; l=l/10){
            r3=l%10;
            rev_3=rev_3*10+r3;
         }
         System.out.println("Reversed Number : "+rev_3);
         System.out.println();

         //palindrome
         //do while
         System.out.println("---CHECK PALINDROM USING DO WHILE---");
         int num_1=123,r_1=1,rev1=0;
         System.out.println("Number : "+num_1);
         int l1=num_1;
         do{
            r_1=l1%10;
            rev1=rev1*10+r_1;
            l1=l1/10;
        } while(l1>0);
        System.out.println("Reversed Number : "+rev1);
        if(rev1==num_1){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not A Palindrome");
        }
        System.out.println();

        //While Loop
        System.out.println("---CHECK PALINDROM USING WHILE---");
        int num_2=202,r_2=1,rev2=0;
        System.out.println("Number : "+num_2);
        int l2=num_2;
        while(l2>0){
            r_2=l2%10;
            rev2=rev2*10+r_2;
            l2=l2/10;
        }
        System.out.println("Reversed Number : "+rev2);
        if(rev2==num_2){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not a Palindrome");
        }
        System.out.println();
        
        //for loop
        System.out.println("---CHECK PALINDROM USING FOR---");
        int num_3=111,r_3=1,rev3=0;
        System.out.println("Number : "+num_3);
        for(int l3=num_3;l3>0;l3=l3/10){
            r_3=l3%10;
            rev3=rev3*10+r_3;
        }
        System.out.println("Reversed Number : "+rev3);
        if(rev3==num_3){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not a Palindrome");
        }
        System.out.println();

        //count number of digits
        System.out.println("---COUNT NUMBER OF DIGITS USING DO WHILE---");
        int a_1=100,count1=0;
        System.out.println("Number : "+a_1);
        do{
            count1++;
            a_1=a_1/10;
        }while(a_1>0);
        System.out.println("Number of Digits : "+count1);
        System.out.println();

        //while
        System.out.println("---COUNT NUMBER OF DIGITS USING WHILE---");
        int a_2=12,count2=0;
        System.out.println("Number : "+a_2);
        while(a_2>0){
            count2++;
            a_2=a_2/10;
        }
        System.out.println("Number Of Digits : "+count2);
        System.out.println();

        //for loop
        System.out.println("---COUNT NUMBER OF DIGITS USING FOR---");
        int a_3=8,count3=0;
        System.out.println("Number : "+a_3);
        for (int X=a_3;X>0;X=X/10){
            count3++;
        }
        System.out.println("Number Of Digits : "+count3);
        System.out.println();

        //sum of digits
        //do while
        System.out.println("---SUM OF DIGITS USING DO WHILE---");
        int b_1=123,reminder_1=0,sum_1=0;
        System.out.println("Number : "+b_1);
        do{
            reminder_1=b_1%10;
            sum_1+=reminder_1;
            b_1=b_1/10;
        }
        while(b_1>0);
        System.out.println("Sum Of Digits : "+sum_1);
        System.out.println();

        //while loop
        System.out.println("---SUM OF DIGITS USING WHILE---");
        int b_2=456,reminder_2=0,sum_2=0;
        System.out.println("Number : "+b_2);
        while(b_2>0){
            reminder_2=b_2%10;
            sum_2+=reminder_2;
            b_2=b_2/10;
        }
        System.out.println("Sum Of Digits : "+sum_2);
        System.out.println();

        //for loop
        System.out.println("---SUM OF DIGITS USING FOR---");
        int b_3=789,reminder_3=0,sum_3=0;
        System.out.println("Number : "+b_3);
        for (int x_1=b_3;x_1>0;x_1=x_1/10){
            reminder_3=x_1%10;
            sum_3+=reminder_3;
        }
        System.out.println("Sum Of Digits : "+sum_3);
        System.out.println();

        //multiplication table 
        System.out.println("---MULTIPLICATION TABLE USING DO WHILE LOOP---");
        int c_1=5,i_1=1;
        System.out.println("Table Number : "+c_1);
        do{
            System.out.println(c_1+" * "+i_1+" = "+(c_1*i_1));
            i_1++;
        }
        while(i_1<=10);
        System.out.println();

        //while 
        System.out.println("---MULTIPLICATION TABLE USING WHILE LOOP---");
        int c_2=8,I_2=1;
        System.out.println("Table Number : "+c_2);
        while(I_2<=10){
            System.out.println(c_2+" * "+I_2+" = "+(c_2*I_2));
            I_2++;
        }
        System.out.println();

        //for
        System.out.println("---MULTIPLICATION TABLE USING FOR LOOP---");
        int c_3=9;
        System.out.println("Table Number : "+c_3);
        for(int I_3=1;I_3<=10;I_3++){
            System.out.println(c_3+" * "+I_3+" = "+(c_3*I_3));
        }
        System.out.println();

        //fibonacci
        //do while

        System.out.println("---FIBONACCI SERIES USING DO WHILE ---");
        int first_num_1=0,second_num_1=1,Sum_1=0,Num_1=5,count_1=2;
        System.out.println("Number : "+Num_1);
        System.out.println("Fibonacci Series : ");
        System.out.println("Starts with :  "+first_num_1+" , "+second_num_1 );
        do{
            Sum_1=first_num_1+second_num_1;
            first_num_1=second_num_1;
            second_num_1=Sum_1;
            System.out.print(Sum_1+" , ");
            count_1++;
        }
        while(count_1<Num_1);
        System.out.println();

        //while
        System.out.println("---FIBONACCI SERIES USING WHILE ---");
        int first_num_2=0,second_num_2=1,Sum_2=0,Num_2=8,count_2=2;
        System.out.println("Number : "+Num_2);
        System.out.println("Starts with :  "+first_num_2+" , "+second_num_2);
        while(count_2<Num_2){
            Sum_2=first_num_2+second_num_2;
            first_num_2=second_num_2;
            second_num_2=Sum_2;
            System.out.print(Sum_2+" , ");
            count_2++;
        }
        System.out.println();

        //for loop
        System.out.println("---FIBONACCI SERIES USING FOR LOOP ---");
        int first_num_3=0,second_num_3=1,Sum_3=0,Num_3=10;
        System.out.println("Number : "+Num_3);
        System.out.println("Starts with : "+first_num_3+" , "+second_num_3);
        for(int count_3=2; count_3 <Num_3; ++count_3){
            Sum_3=first_num_3+second_num_3;
            first_num_3=second_num_3;
            second_num_3=Sum_3;
            System.out.print(Sum_3+" , ");

        }
        System.out.println();

        //prime number
        //do while
        System.out.println("---PRIME NUMBER USING DO WHILE ---");
        boolean flag=true;
        int Number_1=13,n=2;
        System.out.println("Number : "+Number_1);
        do{
            if(Number_1%n==0){
                flag=false;
            }
            n++;
        }
        while(n<Number_1);
        if(flag==true){
            System.out.println("Prime Number");
        }
        else{
            System.out.println("Not a Prime Number");
        }
        System.out.println();

        //while
        System.out.println("---PRIME NUMBER USING WHILE ---");
        boolean flag_1=true;
        int Number_2=44,n_1=2;
        System.out.println("Number : "+Number_2);
        while(n_1<Number_2){
            if(Number_2%n_1==0){
                flag_1=false;
            }
            n_1++;
        }
        if(flag_1){
            System.out.println("Prime Number");
        }
        else{
            System.out.println("Not a Prime Number");
        }
        System.out.println();

        //for loop
        System.out.println("---PRIME NUMBER USING FOR ---");
        boolean flag_2=true;
        int Number_3=9;
        System.out.println("Number : "+Number_3);
        for (int n_2=2;n_2<Number_3;n_2++){
            if(Number_3%n_2==0){
                flag_2=false;
            }
        }
        if(flag_2){
            System.out.println("Prime Number");
        }
        else{
            System.out.println("Not a Prime Number ");
        }
        System.out.println();

        //prime number from 1-100
        System.out.println("---PRIME NUMBER FROM 1-100 USING FOR ---");

        for(int k=2;k<=100;k++){
            boolean Flag=true;
            for(int p=2;p<100;p++){
                if(k!=p && p<k && k%p==0){
                    Flag=false;
                }
            }
            if(Flag){
            System.out.print(k+" , ");
        }
        }
        System.out.println();

        
    }
}
