package com.company;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String input = sc.nextLine();
            RPN solve = new RPN(input);
            solve.getResult();
    }


}
