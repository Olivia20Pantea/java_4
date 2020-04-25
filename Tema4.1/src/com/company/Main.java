package com.company;
import java.util.Random;
    public class Main {
    public static void main(String args[]) {
        int valoare= Interschimbare();
        System.out.print(valoare);
    }
        public static int Interschimbare () {
        // create instance of Random class
            Random rand = new Random();
            // Generate random integers in range 0 to 49
            int r1 = rand.nextInt(50);
            int r2 = rand.nextInt(50);
            int r3 = rand.nextInt(50);
            int r4 = rand.nextInt(50);
            int r5 = rand.nextInt(50);
            // Print random integers
            int [] a=new int[6];
            int k, j, x;
            for (int i = r1; i <= r4; i++) {
                k = i;
                x = a[i];
                for (j = r2; j < r5; j++)
                    if (a[j] < x) {
                        x = a[j];
                        k = j;
                    }
                a[k] = a[i];
                a[i] = x;

            }
            for(int i=r1;i<=r5;i++)
            System.out.println("Random Integers: " +i );

        }
    }



