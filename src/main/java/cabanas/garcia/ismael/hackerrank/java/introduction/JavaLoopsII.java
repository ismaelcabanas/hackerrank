package cabanas.garcia.ismael.hackerrank.java.introduction;

import java.util.Scanner;

public class JavaLoopsII
{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            int acumulator = a + ((int) Math.pow(2,0)) * b;
            for(int k=1; k<n; k++){
                System.out.printf("%d ", acumulator);
                acumulator += ((int) Math.pow(2,k)) * b;
            }
            System.out.printf("%d %n", acumulator);
        }
        in.close();
    }
}
