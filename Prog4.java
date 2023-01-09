package HundredPrograms;

import java.util.Scanner;

public class Prog4 {
    public static void main(String[] args) {

        // creating object sc with Scanner class and constructor Scanner
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = sc.nextLine();

        System.out.println("Welcome, "+ name);
    }
}
