package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> students = new ArrayList<>(Arrays.asList("Obi", "Ada", "John"));

        while (true) {
            System.out.println("STUDENTS LIST");
            for (String student: students) {
                System.out.println(student);
            }

            System.out.println("1. Add Student");
            System.out.println("2. Add Score");
            System.out.println("3. Update Score");
            System.out.println("4. View Student's Score");
            System.out.println("5. Exist");
            System.out.println("=========================");
            System.out.print("Choose an Option>> ");
            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    break;

                case 2:
                    break;

                case 3:
                    break;

                case 4:
                    break;

                case 5:
                    System.out.println("Existing...");
                    System.exit(0);

                default:
                    System.out.println("Invalid option");
            }
        }

    }
}