package com.company;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the import java.util.Scanner;<icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        //System.out.println("hello world");



                Scanner sc = new Scanner(System.in);
                System.out.println("Enter a number: ");
                int num = sc.nextInt();  // take input number

                if (num % 3 == 0 && num % 5 == 0) {
                    System.out.println("fizzbuzz");
                } else if (num % 3 == 0) {
                    System.out.println("fizz");
                } else if (num % 5 == 0) {
                    System.out.println("buzz");
                } else {
                    System.out.println(num);
                }

                sc.close();




    }
}