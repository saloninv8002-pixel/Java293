class patterns{
    public static void main(String args[]){
        //1 3 5 7 9
        //11 13 15 17 19
        //21 23 25 27 29
        //31 33 35 37 39
        //41 43 45 47 49
        int k=1;
        for (int i=1;i<=5;i++){
            for (int j=1;j<=5;j++){
                System.out.print(k+" ");
                k+=2;
            }
            System.out.println();
        }
        System.out.println();

        //2 4 6 8 10
        //12 14 16 18 20
        //22 24 26 28 30
        //32 34 36 38 40
        //42 44 46 48 50
         int k_1=2;
         for(int i1=1;i1<=5;i1++){
            for(int j1=1;j1<=5;j1++){
                System.out.print(k_1+" ");
                k_1+=2;
            }
            System.out.println();
         }
         System.out.println();

         //AAAAA
         //BBBBB
         //CCCCC
         //DDDDD
         //EEEEE
         for (char s='A';s<='E';s++){
            for (int j1=1;j1<=5;j1++){
                System.out.print(s+" ");
            }
            System.out.println();
         }
         System.out.println();

         //ABCDE
         //ABCDE
         //ABCDE
         //ABCDE
         //ABCDE
         for (int i1=1;i1<=5;i1++){
            for(char s='A';s<='E';s++){
                System.out.print(s+" ");
            }
            System.out.println();
         }
         System.out.println();

         //EEEEE
         //DDDDD
         //CCCCC
         //BBBBB
         //AAAAA
         for (char s='E';s>='A';s--){
            for(int j1=1;j1<=5;j1++){
                System.out.print(s+" ");
            }
            System.out.println();
         }
         System.out.println();

         //EDCBA
         //EDCBA
         //EDCBA
         //EDCBA
         //EDCBA

         for(int i1=1;i1<=5;i1++){
            for(char s='E';s>='A';s--){
                System.out.print(s+" ");
            }
            System.out.println();
         }
         System.out.println();

         //ABCDE
         //FGHIJ
         //KLMN0
         //PQRST
         //UVWXY

         char s='A';
         for(int i1=1;i1<=5;i1++){
            for(int j1=1;j1<=5;j1++){
                System.out.print(s+" ");
                s++;
            }
            System.out.println();
         }
         System.out.println();

         //5
         //44
         //333
         //2222
         //11111

         int n=5;
         for(int i1=1;i1<=5;i1++){
            for(int j1=1;j1<=i1;j1++){
                System.out.print(n+" ");
            }
            n--;
            System.out.println();
         }
         System.out.println();

         //5
         //54
         //543
         //5432
         //54321

         for(int i1=1;i1<=5;i1++){
            int N=5;
            for(int j1=1;j1<=i1;j1++){
                System.out.print(N+" ");
                N--;
            }
            System.out.println();
         }
         System.out.println();

         //A
         //BB
         //CCC
         //DDDD
         //EEEEE

         char S='A';
         for(int i1=1;i1<=5;i1++){
            for(int j1=1;j1<=i1;j1++){
                System.out.print(S+" ");
            }
            S++;
            System.out.println();
         }
         System.out.println();

         //A
         //AB
         //ABC
         //ABCD
         //ABCDE
         for(int i1=1;i1<=5;i1++){
            char s1='A';
            for(int j1=1;j1<=i1;j1++){
                System.out.print(s1+" ");
                s1++;
            }
            System.out.println();
         }

         System.out.println();

         //E
         //ED
         //EDC
         //EDCB
         //EDCBA

         for(int i1=1;i1<=5;i1++){
            char s1='E';
            for(int j1=1;j1<=i1;j1++){
                System.out.print(s1+" ");
                s1--;
            }
            System.out.println();
         }
         System.out.println();

         //E
         //DD
         //CCC
         //BBBB
         //AAAAA

         char s1='E';
         for ( int i1=1;i1<=5;i1++){
            for(int j1=1;j1<=i1;j1++){
                System.out.print(s1+" ");

            }
            s1--;
            System.out.println();
         }
         System.out.println();

         //*****
         //***** 
         //***** 
         //***** 
         //*****
         for(int i1=1;i1<=5;i1++){
            for(int j1=1;j1<=5;j1++){
                System.out.print(" * ");
            }
            System.out.println();
         }
         System.out.println();

         //11111
         //22222
         //33333
         //44444
         //55555
         for(int i1=1;i1<=5;i1++){
            for(int j1=1;j1<=5;j1++){
                System.out.print(i1+" ");
            }
            System.out.println();
         }
         System.out.println();

         //1 2 3 4 5 
         //1 2 3 4 5 
         // 1 2 3 4 5 
         // 1 2 3 4 5 
         // 1 2 3 4 5 
         for(int i1=1;i1<=5;i1++){
            for(int j1=1;j1<=5;j1++){
                System.out.print(j1+" ");
            }
            System.out.println();
         }
         System.out.println();

         //* 
         // * * 
         // * * * 
         // * * * * 
         // * * * * * 
         for(int i1=1;i1<=5;i1++){
            for(int j1=1;j1<=i1;j1++){
                System.out.print(" * ");
            }
            System.out.println();
         }
         System.out.println();

         // 1 
         // 1 2 
         // 1 2 3 
         // 1 2 3 4 
         // 1 2 3 4 5 

         for(int i1=1;i1<=5;i1++){
            for(int j1=1;j1<=i1;j1++){
                System.out.print(j1+" ");
            }
            System.out.println();
         }
         System.out.println();

         //1 
         // 2 2 
         // 3 3 3   
         // 4 4 4 4 
         // 5 5 5 5 5 
         
         for(int i1=1;i1<=5;i1++){
            for(int j1=1;j1<=i1;j1++){
                System.out.print(i1+" ");
            }
            System.out.println();
         }
         System.out.println();

         //* * * * * 
         // * * * * 
         // * * * 
         // * * 
         // * 

         for(int i1=5;i1>=1;i1--){
            for(int j1=1;j1<=i1;j1++){
                System.out.print(" * ");
            }
            System.out.println();
         }
         System.out.println();

        // 1 1 1 1 1 
        // 2 2 2 2 
        // 3 3 3 
        // 4 4 
        // 5 

        int n1=1;
        for(int i1=5;i1>=1;i1--){
            for(int j1=1;j1<=i1;j1++){
                System.out.print(n1+" ");
            }
            n1++;
            System.out.println();
        }
        System.out.println();

        //5 5 5 5 5 
        //4 4 4 4 4 
        // 3 3 3 3 3 
        // 2 2 2 2 2 
        // 1 1 1 1 1 

        for (int i1=5;i1>=1;i1--){
            for(int j1=1;j1<=5;j1++){
                System.out.print(i1+" ");
            }
            System.out.println();
        }
        System.out.println();

        //5 4 3 2 1 
        // 5 4 3 2 1 
        // 5 4 3 2 1 
        // 5 4 3 2 1 
        // 5 4 3 2 1 
        for(int i1=1;i1<=5;i1++){
            for(int j1=5;j1>=1;j1--){
                System.out.print(j1+" ");
            }
            System.out.println();
        }
        System.out.println();

         //* 
         // *  * 
         // *  *  * 
         // *  *  *  * 
         // *  *  *  *  * 
         // *  *  *  * 
         // *  *  * 
         //*  * 
         // * 

        for(int i1=1;i1<=5;i1++){
            for(int j1=1;j1<=i1;j1++){
                System.out.print(" * ");
            }
            System.out.println();
         }
         for(int i1=4;i1>=1;i1--){
            for(int j1=1;j1<=i1;j1++){
                System.out.print(" * ");
            }
            System.out.println();
         }


         

         


    }
}
