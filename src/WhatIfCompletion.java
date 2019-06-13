import java.util.Scanner;

public class WhatIfCompletion {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);

        int num1, num2;

        System.out.print("First number? : ");
        num1 = keyboard.nextInt();

        System.out.print("Second number? : ");
        num2 = keyboard.nextInt();

        int sum = num1 + num2;

        if(sum > 200 && sum < 1000){
            System.out.println("Your Sum is: " + sum + "*~");
        }else if(sum < 200){
            System.out.println("Your Sum is: " + sum + "~");
        }else {
            System.out.println("Your Sum is: " + sum + "*");
        }

        System.out.println("Your Product is: " + (num1 * num2));
        System.out.println("Your Average is: " + ((num1 + num2)/2));
    }
}
