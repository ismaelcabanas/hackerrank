package cabanas.garcia.ismael.hackerrank.java.introduction;

import java.util.Scanner;

/**
 * Created by XI317311 on 07/04/2017.
 */
public class JavaDataTypes {
    public static void main(String []argh)
    {

        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();

        for(int i=0;i<t;i++)
        {

            try
            {
                long x=sc.nextLong();
                System.out.println(x+" can be fitted in:");
                if(x>=-Math.pow(2,8) && x<=Math.pow(2,8)-1)System.out.println("* byte");
                if(x>=-Math.pow(2,16) && x<=Math.pow(2,16)-1)System.out.println("* short");
                if(x>=-Math.pow(2,32) && x<=Math.pow(2,32)-1)System.out.println("* int");
                if(x>=-Math.pow(2,64) && x<=Math.pow(2,64)-1)System.out.println("* long");
            }
            catch(Exception e)
            {
                System.out.println(sc.next()+" can't be fitted anywhere.");
            }

        }
    }
}
