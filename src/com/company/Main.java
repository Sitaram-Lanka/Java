package com.company;
import java.util.Scanner;

public class Main {

    public String userName(String username) {
        return "Hello " + username;
    }

    public int sum(int a, int b){
        return a+b;
    }

    public static void main(String[] args) {
	// write your code here
        // System.out.println("Hello World1..");
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter username");
        String username = myObj.nextLine();

        System.out.println("My name is: " + username);

        Main m= new Main();
        System.out.println(m.userName(username));

        Scanner num1 = new Scanner(System.in);
        System.out.println("Enter first numbers");
        int n1 = num1.nextInt();

        Scanner num2 = new Scanner(System.in);
        System.out.println("Enter second numbers");
        int n2 = num2.nextInt();

        System.out.println("Sum of "+n1+ " and "+ n2 +" is = " +m.sum(n1,n2));


    }
}
