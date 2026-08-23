import java.util.Arrays;
import java.util.Random;

public class Program{
    public static String armstrong(int n){
        int count=0;
        int x=n;
        int y=n;
        int sum_1=0;
        while(x>0){
            int R=x%10;
            count+=1;
            x=x/10;
        }
        while(y>0){
            int reminder_1=y%10;
            sum_1+=(Math.pow(reminder_1,count));
            y=y/10;
        }
        if (sum_1==n){
            return "Armstrong Number";
        }
        else{
            return "Not an Armstrong Number";
        }
    }
    public static int fibonacci(int n){
        if(n<=1){
            return n;
        }
        else{
            return fibonacci(n-2)+fibonacci(n-1);
        }
    }
    public static void main(String args[]){

    System.out.println(armstrong(153));

    System.out.println("---FIBONACCI---");
    System.out.println("Fibonnacci : "+fibonacci(12));
    System.out.println();

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

    System.out.println("---REVERSING STRING---");
    String sent="INDIA IS MY COUNTRY";
    System.out.println("String : "+sent);
    StringBuilder sb=new StringBuilder(sent);
    System.out.println("Reversed String : "+sb.reverse());


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

    //4-DIGIT PASSWORD
    System.out.println("---4-PASSWORD GENERATOR---");
    Random r_random=new Random();
    char[] ch={'A','B','C','D','E','F','G','H','I','J',
    'K','L','M','N','O','P','Q','R','S','T','U','V','W',
    'X','Y','Z','1','2','3','4','5','6','7','8','9','0','@',
     '#','$','*'};
    String S="";
    for(int i=0;i<4;i++){
        int num_9=r_random.nextInt(ch.length);
        S+=ch[num_9];
    }
    System.out.println("4-Digit Pass : "+S);

    //6-DIGIT PASSWORD
    System.out.println("---6-PASSWORD GENERATOR---");
    Random r_random_1=new Random();
    char[] ch_1={'A','B','C','D','E','F','G','H','I','J',
    'K','L','M','N','O','P','Q','R','S','T','U','V','W',
    'X','Y','Z','1','2','3','4','5','6','7','8','9','0','@',
     '#','$','*'};
    String S_1="";
    for(int i=0;i<6;i++){
        int num_9=r_random_1.nextInt(ch_1.length);
        S_1+=ch[num_9];
    }
    System.out.println("6-Digit Pass : "+S_1);

    //4-DIGIT-OTP
    System.out.println("---4-DIGIT-OTP---");
    Random random=new Random();
    String s_2="";
    for(int i=0;i<4;i++){
        int num_8=random.nextInt(10);
        s_2+=String.valueOf(num_8);
    }
    System.out.println(s_2);

    //6-DIGIT OTP
    System.out.println("---6-DIGIT-OTP---");
    Random random2=new Random();
    String s_3="";
    for(int i=0;i<6;i++){
        int num_7=random2.nextInt(10);
        s_3+=String.valueOf(num_7);
    }
    System.out.println(s_3);

    //EB BILL
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
    System.out.println();

    //Mobile number validation
    System.out.println("---VALIDATING PHONE NUMBER USING MATCHES---");
    String phone_number="9884327890";
    System.out.println("Phone Number : "+phone_number);
    System.out.println("Is Phone Number Valid ? "+phone_number.matches("\\d{10}"));
    System.out.println();

    //check alphabet 
    String name1="Saloni";
    System.out.println("String : "+name1);
    System.out.println("String only Alphabet : "+name1.matches("[a-z A-Z]+"));
    System.out.println();

    //check digit
    String S3="09876";
    System.out.println("String  : "+S3);
    System.out.println("String Contains Only Digits ? "+S3.matches("\\d+"));
    System.out.println();

    //vowel checking
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

    //vowel counting
    System.out.println("---VOWEL COUNTING---");
    String s1="Saloni";
    int count=0;
    for (int i=0;i<s1.length();i++){
    char letter=s1.charAt(i);
    if (Character.toUpperCase(letter) == 'A' ||
        Character.toUpperCase(letter) == 'E' ||
        Character.toUpperCase(letter) == 'I' ||
        Character.toUpperCase(letter) == 'O' ||
        Character.toUpperCase(letter) == 'U'){
            count+=1;
         }
        }
        System.out.println("Vowels : "+count);
        

        //odd numbers using while loop
        System.out.println("---ODD NUMBERS FROM 1-100 USING WHILE---");
        int j2=1;
        int count_2=0;
        while(j2<=100){
            if(j2%2!=0){
                count_2+=1;
                System.out.print(j2+" , ");
            }
            j2++;
        }
        System.out.println();
        System.out.println("Number of Odd Numbers from 1-100 : "+count_2);
        System.out.println();

        //even number
        System.out.println("---EVEN NUMBER FROM 1-100 USING FOR LOOP---");
        int count_1=0;
        for (int i2=1;i2<=100;i2++){
            if(i2%2==0){
               System.out.print(i2+" , ");
                count_1+=1;
            }
        }
        System.out.println();
        System.out.println("Number of Even Numbers From 1-100 : "+count_1);
        System.out.println();

        //prime number
        System.out.println("---PRIME NUMBER FROM 1-100 USING FOR ---");
        int count_prime=0;
        for(int k=2;k<=100;k++){
            boolean Flag=true;
            for(int p=2;p<100;p++){
                if(k!=p && p<k && k%p==0){
                    Flag=false;
                }
            }
            if(Flag){
            count_prime+=1;
            System.out.print(k+" , ");
        }
        }
        System.out.println();
        System.out.println("Number of Prime Numbers from 1-100 : "+count_prime);
        System.out.println();

        System.out.println("---CALCULATORS---");

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
        System.out.println("Principal value : "+p_ci);
        System.out.println("Rate : "+r_ci);
        System.out.println("Time : "+t_ci);
        System.out.println("Compound Interest : "+Compound_Interest);
        System.out.println();

        //Public Provident Fund Calculator (ppf)
        System.out.println("---PUBLIC PROVIDENT FUND (PPF) CALCULATOR---");
        System.out.println();

        double Initial_Investment=10000;
        double Annual_Investment=20000;
        double Investment_Period=5;
        double Interest_Rate=7;

        System.out.println("Initial Investment (Amount Deposited at the beginning) : "+Initial_Investment);
        System.out.println("Annual Investment (Amount Deposited EveryYear) : "+Annual_Investment);
        System.out.println("Investment Period (number of years) : "+Investment_Period);
        System.out.println("Interest Rate (%) (Annual PPF interest rate) : "+Interest_Rate);

        double Total_Investment=Initial_Investment+(Annual_Investment*Investment_Period);
        double Interest=(Total_Investment*Interest_Rate*Investment_Period)/100;
        double Maturity_Amount=Total_Investment+Interest;

        System.out.println("Total Investment : "+Total_Investment);
        System.out.println("Total Interest Earned : "+Interest);
        System.out.println("Maturity Amount : "+Maturity_Amount);
        System.out.println();

        //recurring deposit
        System.out.println("---RECURRING DEPOSIT CALCULATOR---");
        System.out.println();

        double Monthly_Deposit=2000;
        double Investment_Period_1=2;
        double Interest_Rate_1=7;

        System.out.println("Monthly Deposit (Amount Deposited Every Month ) : "+Monthly_Deposit);
        System.out.println("Investment Period (Number of Years) : "+Investment_Period_1);
        System.out.println("Interest Rate (%) (Annual Interest rate) : "+Interest_Rate_1);


        double Total_Deposit=Monthly_Deposit*Investment_Period_1*12;
        double Interest_1=(Total_Deposit*Interest_Rate_1*Investment_Period_1)/100;
        double Maturity_Amount_1=Total_Deposit+Interest_1;

        System.out.println("Total Deposit : "+(Total_Deposit));
        System.out.println("Total Interest Earned : "+(Interest_1));
        System.out.println("Maturity Amount : "+Maturity_Amount_1);
        System.out.println();

        //fixed deposit
        System.out.println("---FIXED DEPOSIT---");

        double p_ci_1=100000;
        double r_ci_1=12;
        int t_ci_1=12;

        System.out.println("Principal value : "+p_ci_1);
        System.out.println("Rate : "+r_ci_1);
        System.out.println("Time : "+t_ci_1);

        double Compound_Interest_1=(p_ci_1*Math.pow((1+r_ci_1/100),t_ci_1))-p_ci_1;
        double Maturity_Amount_ci=p_ci_1+Compound_Interest_1;

        System.out.println("Compound Interest : "+Math.ceil(Compound_Interest_1));
        System.out.println("Maturity Amount : "+Math.ceil(Maturity_Amount_ci));
        System.out.println();

        //GST
        System.out.println("---GST CALCULATOR---");

        double Original_Amount=10000;
        double GST_Rate=18;

        System.out.println("Original Amount : "+Original_Amount);
        System.out.println("GST rate (%) : "+GST_Rate);

        double GST_Amount=(Original_Amount*GST_Rate)/100;
        double Final_Amount=Original_Amount+GST_Amount;

        System.out.println("GST Amount : "+GST_Amount);
        System.out.println("Final Amount : "+Final_Amount);
        System.out.println();

        //Loan Emi
        System.out.println("--- LOAN EMI---");
        System.out.println();

        double Principal_2=100000;
        double Interest_rate_2=12;
        double Loan_Tenure=2;

        System.out.println("Principal Amount (amount borrowed) : "+Principal_2);
        System.out.println("Rate of Interest (%) (annual interest rate) : "+Interest_rate_2);
        System.out.println("Loan Tenure (Number Of Years) : "+Loan_Tenure);

        double Monthly_interest_rate = Interest_rate_2/(12*100);
        int N= (int)Loan_Tenure*12;
        double EMI_1=(Principal_2*Monthly_interest_rate*(Math.pow(1+Monthly_interest_rate,N)))/((Math.pow(1+Monthly_interest_rate,N))-1);

        System.out.println("Monthly Rate Of Interest : "+Monthly_interest_rate);
        System.out.println("Number of Monthly Payments : "+N);
        System.out.println("EMI : "+Math.ceil(EMI_1));
        System.out.println();

        System.out.println("---CONVERTION---");

        //gram to sovereign
        System.out.println("---GRAM TO SOVEREIGN---");
        double weight_grams=50;
        System.out.println("Weight in Grams : "+weight_grams);
        double weight_sovereign=weight_grams/8;
        System.out.println("Weight in Sovereign : "+weight_sovereign);
        System.out.println();

        //sovereign to gram
        System.out.println("---SOVEREIGN TO GRAM---");
        double weight_sovereign_1=8;
        System.out.println("Weight in Sovereign : "+weight_sovereign_1);
        double weight_grams_1=weight_sovereign_1*8;
        System.out.println("Weight in Grams : "+weight_grams_1);
        System.out.println();

        //Kilometer to miles
        System.out.println("---KILOMETER TO MILES---");
        double kilometer=43.89;
        double miles=kilometer*0.621;
        System.out.println("Distance in Kilometers : "+kilometer+" Km");
        System.out.println("Distance in Miles : "+miles+" Miles");
        System.out.println();

        //miles to kilometer
        System.out.println("---MILES TO KILOMETER---");
        double Miles=30.28;
        double kiloMeter=Miles*1.609;
        System.out.println("Distance in Miles : "+Miles+" Miles");
        System.out.println("Distance in Kilometers : "+kiloMeter+" Km");
        System.out.println();

    //even or odd
    System.out.println("---CHECK ODD OR EVEN---");
    int num=65;
    System.out.println("Number : "+num);
    if(num%2==0){
        System.out.println("Even Number");
        System.out.println(" ");
    }
    else{
        System.out.println("Odd Number");
        System.out.println(" ");
    }

    //leap year
    System.out.println("---CHECK LEAP YEAR---");
    int _Year=2008;
    System.out.println("Year : "+_Year);
    if((_Year%4==0 && _Year%100!=0)||_Year%400==0){
        System.out.println(" Leap Year ");
    }
    else{
        System.out.println("Not a Leap Year");
    }
    System.out.println();

    //binary to decimal
    System.out.println("---BINARY TO DECIMAL CONVERSION---");
    int Binary_Number_1=101101;
    System.out.println("Binary Number : "+Binary_Number_1);
    int result=0;
    int place=1;
    while(Binary_Number_1>0){
        int reminder=Binary_Number_1%10;
        result+=reminder*place;
        place=place*2;
        Binary_Number_1/=10;
    }
    System.out.println("Decimal Number : "+result);
    System.out.println();

    System.out.println("---BINARY TO DECIMAL CONVERSION---");

    int Binary_Number=101101;
    System.out.println("Binary Number : "+Binary_Number);

    int Decimal_Number=0;
    int power=0;
    String x=String.valueOf(Binary_Number);

    for(int count_binary=x.length()-1;count_binary>=0;count_binary--){
        char number=x.charAt(count_binary);
        int Number=Character.getNumericValue(number);
        Decimal_Number+= Number*(Math.pow(2,power));
        power++;
    }

    System.out.println("Decimal Number : "+Decimal_Number);
    System.out.println();

    //octal to decimal
    System.out.println("--OCTAL TO DECIMAL---");
    int octal_num=157;
    System.out.println("Octal Number : "+octal_num);
    int result_1=0;
    int power_1=1;
    while(octal_num>0){
        int reminder=octal_num%10;
        result_1+=reminder*power_1;
        power_1=power_1*8;
        octal_num/=10;
    }
    System.out.println("Decimal Number : "+result_1);

    //linear search
    System.out.println("---LINEAR SEARCH---");
    int target=12;
    boolean flag_3=false;
    System.out.println("Target : "+target);
    int[] arr={90,34,56,78,9,12};
    for (int i=0;i<arr.length;i++){
        if(target==arr[i]){
            flag_3=true;
            break;
        } 
    }
    if(flag_3){
        System.out.println("Element Found");
    }
    else{
        System.out.println("Element Not Found");
    }

    //binary search
    System.out.println("---BINARY SEARCH---");
    boolean flag_4=false;
    Arrays.sort(arr);
    int mid=(int)arr.length/2;
    if(arr[mid]==target){
        System.out.println("Element Found");
    }
    else if(arr[mid]<target){
        for(int i=mid;i<arr.length;i++){
            if(arr[i]==target){
                flag_4=true;
                break;
            }
        }
    }
    else{
        for (int j=0;j<mid;j++){
            if(arr[j]==target){
                flag_4=true;
                break;
            }
        }
    }
    if(flag_4){
        System.out.println("Element Found");
    }
    else{
        System.out.println("Element Not Found");
    }

    //bubble sort
    System.out.println("---BUBBLE SORT---");
    int[] arr_1={90,56,78,34,12};
    for(int i=0;i<arr_1.length;i++){
        for(int j=0;j<arr_1.length-1;j++){
            if(arr_1[j]>arr_1[j+1]){
                int c=arr_1[j];
                arr_1[j]=arr_1[j+1];
                arr_1[j+1]=c;
            }
        }
    }
    for(int k=0;k<arr_1.length;k++){
        System.out.println(arr_1[k]);
    }

    //decimal to binary
    System.out.println("---DECIMAL TO BINARY---");
    String l="";
    int Decimal_Number_1=1234;
    System.out.println("Decimal Number : "+Decimal_Number_1);
    int quotient=Decimal_Number_1/2;
    while(quotient>0){
        int reminder=Decimal_Number_1%2;
        l+=String.valueOf(reminder);
        quotient=Decimal_Number_1/2;
        Decimal_Number_1/=2;
    }
    System.out.print("Binary Number : ");
    for(int i=l.length()-1;i>=0;i--){
        System.out.print(l.charAt(i));
    }
    System.out.println();

    //decimal to octal
    System.out.println("---DECIMAL TO OCTAL---");
    String l_1="";
    int Decimal_Number_2=1234;
    System.out.println("Decimal Number : "+Decimal_Number_2);
    int quotient_1=Decimal_Number_2/8;
    while(quotient_1>0){
        int reminder=Decimal_Number_2%8;
        l_1+=String.valueOf(reminder);
        quotient_1=Decimal_Number_2/8;
        Decimal_Number_2/=8;
    }
    System.out.print("Octal Number : ");
    for(int i=l_1.length()-1;i>=0;i--){
        System.out.print(l_1.charAt(i));
    }
    System.out.println();

    //decimal to hexa
    System.out.println("---DECIMAL TO HEXADECIMAL---");
    String l_2="";
    char[] hex={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
    int Decimal_Number_3=1234;
    System.out.println("Decimal Number : "+Decimal_Number_3);
    int quotient_2=Decimal_Number_3/16;
    while(quotient_2>0){
        int reminder=Decimal_Number_3%16;
        
        l_2+=hex[reminder];
        quotient_2=Decimal_Number_3/16;
        Decimal_Number_3/=16;
    }
    System.out.print("HexaDecimal Number : ");
    for(int i=l_2.length()-1;i>=0;i--){
        System.out.print(l_2.charAt(i));
    }
    System.out.println();

}

}