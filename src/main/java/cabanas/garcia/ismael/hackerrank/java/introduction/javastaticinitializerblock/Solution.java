package cabanas.garcia.ismael.hackerrank.java.introduction.javastaticinitializerblock;

import java.util.Scanner;

public class Solution {

    private static boolean flag = true;

    private static int B = 0;
    private static int H = 0;

    static {
        Scanner sc = new Scanner(System.in);

        B = sc.nextInt();
        H = sc.nextInt();

        sc.close();

        if(B <= 0 || H <= 0)
            try {
                throw new Exception("Breadth and height must be positive");
            } catch (Exception e) {
                System.out.println(e);
                System.exit(0);
            }

    }

    public static void main(String[] args){
        if(flag){
            int area = B*H;
            System.out.println(area);
        }
    }
}
