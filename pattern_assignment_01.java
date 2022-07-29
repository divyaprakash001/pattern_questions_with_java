package com.divya;

public class pattern_assignment_01 {
    public static void main(String[] args) {
//        Q.1 Print INEURON

        System.out.println("Question. 1\n");

        int n=10;     // use in all loops.

        for(int i=0; i<n; i++)
        {
            for(int j=0; j<n; j++)
            {
                if(j==0 )
                {
                    System.out.print("*");      // I
                }
            }
            System.out.print(" ");

            for(int j=0; j<n; j++)
            {
                if(j==0 || j==(n-1) || i==j)    //N
                {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }

            System.out.print(" ");
            for(int j=0; j<n; j++)
            {
                if(i==0 || i==(n-1) || i==(n-1)/2 || j==0)   //E
                {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }

            System.out.print(" ");
            for(int j=0; j<n; j++)
            {
                if(j==0 && i!=(n-1) || j==n-1 && i!=(n-1) || i==n-1 && j!=0 && j!=n-1)    //U
                {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }

            System.out.print(" ");

            for(int j=0; j<n; j++)
            {
                if(j==0 || i==0 && j!=n-1|| i==(n-1)/2 && j!=(n-1) ||  i-j==(i+1) || j==n-1 && i<(n-1)/2 && i!=0 || i>(n-1)/2 && j>= (n-1)/2 && i==j)         //R
                {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }

            System.out.print(" ");

            for(int j=0; j<n; j++)
            {
                if(j==0 && i!=0 &&i!=(n-1) || j==n-1 && i!=0 && i!=(n-1) || i==n-1 && j!=0 && j!=n-1 || i==0 && j!=0 && j!= n-1)   //O
                {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }


            System.out.print(" ");

            for(int j=0; j<n; j++)
            {
                if(j==0 || j==(n-1) || i==j)      //N
                {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }


        System.out.println("\n\n");   // print new line without content

//        ----------------------------------------------------------------------------------


//		Question.2
        System.out.println("Question. 2\n");
        n=5;
        for(int i=1; i<n; i++)
        {
            for(int j=0; j<n; j++)
            {
                System.out.print(i);
            }System.out.println();
        }
        System.out.println("\n\n");

//        ---------------------------------------------------------


//		Question.3
        System.out.println("Question. 3\n");
        n=14;
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<n; j++)
            {
                if(i==0 || j==0 || i ==(n-1) || j==(n-1) | i+j<=(n-1)/2 || j-i>=(n-1)/2)
                {
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }System.out.println();
        }

        System.out.println("\n\n");

//		---------------------------------------------------------

//		Q4.
        System.out.println("Question. 4\n");

        n=14;
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<n; j++)
            {
                if(i >=(n-1)/2 && i-j==(n-1)/2 || j>=(n-1)/2 && i+j==n+(n-4)/2 || i-j>=(n-1)/2 || i + j >= n+(n-1)/2)
                {
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }System.out.println();
        }
        System.out.println("\n\n");

//        ---------------------------------------------------------------

//		Question. 5
        System.out.println("Question. 5\n");
        n=14;
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<n; j++)
            {
                if(i == 0 || j==0  || i==(n-1) || i+j<=(n-1)/2 || i-j>=(n-1)/2)
                {
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }System.out.println();
        }
        System.out.println("\n\n");


        System.out.println("--------------------------------------- Thanks Naveen Sir, Abbas Sir And The Team ----------------------------------------");
//        -------------------------------------------------------END-----------------------------------------------------------















    }
}
