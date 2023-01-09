package HundredPrograms;

import java.util.Scanner;

public class Prog5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value in Fahrenheit: ");
        float degree = sc.nextFloat();

        float degCelsius = ((degree - 32) * 5/9 );

        System.out.println("Temperature in Degree Celsius: "+degCelsius);
    }
}
