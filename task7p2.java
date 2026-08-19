class task7p2{
    public static int add(int n){
        if (n>0){
            return n + add(n-1);
        }
        else{
            return 0;
        }
    }
    public static int factorial(int a){
        if (a>=1){
            return a*factorial(a-1);
        }
        else{
            return 1;
        }
    }
    public static int fibonacci(int n){
        if(n<=1){
            return n;
        }
        else{
            return factorial(n-2)+factorial(n-1);
        }
    }
    public static void main(String args[]){
        System.out.println("Sum : "+add(10));

        System.out.println("Factorial : "+factorial(5));

        System.out.println("Fibonnacci : "+fibonacci(12));
        System.out.println();

        System.out.println("---ArithmeticException---");
        try{
            int a=10;
            int b=0;
            System.out.println("First Number : "+a);
            System.out.println("Second Number : "+b);
            double divide = a/b;
            System.out.println("Divide : "+divide);
        }
        catch(ArithmeticException e){
            System.out.println("Divide by Zero is Impossible");
        }

        System.out.println();


        System.out.println("---ArrayIndexOutOfBoundsException---");
        int[] arr={1,2,3};
        try{
            System.out.println("Element at 100 th Position "+arr[100]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Index Out Of Range");
        }
        System.out.println();

        System.out.println("---NumberFormatException---");
        try{
            String name="Saloni";
            System.out.println(name);
            int x=Integer.parseInt(name);
            System.out.println(x);
        }
        catch(NumberFormatException e){
            System.out.println("Invalid Number");
        }
        System.out.println();

        System.out.println("---NullPointerException---");
        try{
            String name=null;
            System.out.println("Name : "+name);
            System.out.println("Length : "+name.length());
        }
        catch(NullPointerException e){
            System.out.println("Object is Null");
        }
        System.out.println();

        System.out.println("---StringIndexOutOfBoundsException---");
        try{
            String word="ABC";
            System.out.println("Word : "+word);
            System.out.println(word.charAt(15));
        }
        catch(StringIndexOutOfBoundsException e){
            System.out.println("String index out of range");
        }

    }
}