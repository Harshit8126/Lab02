package main;

import java.util.Scanner;

/**
 * @author harshitVerma
 * @version 1.0
 **/

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Your Name:");
        String name = scanner.nextLine();

        System.out.println("Welcome " + name);
    }
}
