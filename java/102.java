//package com.company;

import java.util.Scanner;
import java.io.PrintWriter;
import java.io.File;

public class Solution {
    public static void main(String[] args) throws Exception {
        Solution solution = new Solution();
        solution.run();
    }

    private void run() {
        Scanner scan = new Scanner(System.in);

        PrintWriter writer = new PrintWriter(System.out);

        int p = scan.nextInt();
        int k = scan.nextInt();
        writer.println((p/(1+k)/2)*(p/(1+k)/2)*k);
        writer.close();

    }
}
