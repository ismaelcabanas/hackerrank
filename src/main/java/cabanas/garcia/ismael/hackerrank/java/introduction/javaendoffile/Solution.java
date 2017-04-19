package cabanas.garcia.ismael.hackerrank.java.introduction.javaendoffile;

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int lineCount = 1;
        while(sc.hasNextLine()){
            String line = sc.nextLine();
            System.out.printf("%d %s%n", lineCount, line);
            lineCount++;
        }
        sc.close();
    }
}
