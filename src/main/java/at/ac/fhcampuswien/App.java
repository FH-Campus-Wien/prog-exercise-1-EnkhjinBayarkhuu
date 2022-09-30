package at.ac.fhcampuswien;

import org.graalvm.compiler.phases.graph.ScheduledNodeIterator;

import javax.swing.*;
import java.util.Scanner;

public class App {

    //todo Task 1
    public void sayHelloWorld(){
        // input your solution here
        System.out.println("Hello World!");
    }

    //todo Task 2
    public void helloRobot(){
        // input your solution here
        System.out.println("0123456789012345678901");
        System.out.println("         __");
        System.out.println(" _(\\    |@@|");
        System.out.println("(__/\\__ \\--/ __");
        System.out.println("   \\___|----|  |   __");
        System.out.println("       \\ }{ /\\ )_ / _\\");
        System.out.println("       /\\__/\\ \\__O (__");
        System.out.println("      (--/\\--)    \\__/");
        System.out.println("      _)(  )(_");
        System.out.println("     `---''---`");

    }

    //todo Task 3
    public void sumOfLiterals(){
        // input your solution here

                char z = 'Z';
                int int_z = z;

                String face = "0xface";
                int int_face = Integer.decode(face);

                int octal = 012;

                Long long_wert = 80L;
                int int_long = Math.toIntExact(long_wert);

                double double_wert = 44e-1f;
                int int_double =(int) double_wert;

                float float_wert = 5.5f;
                int int_float = (int) float_wert;

                double double_wert8 = 8.88e1;
                int int_double8 = (int) double_wert8;

                double double_wert9 = 99.9;
                int int_double9 = (int) double_wert9;

                int sum = int_z + int_face + octal + int_long + int_double +  int_float + int_double8 + int_double9;


                System.out.println(sum);


                // Hilfe von: https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html





    }

    //todo Task 4
    public void addTwoNumbers(){
        // input your solution here
      Scanner scanner = new Scanner(System.in);

      int number1 = scanner.nextInt();
      int number2 = scanner.nextInt();
      System.out.println(number1 + number2);

    }

    //todo Task 5
    public void swapTwoNumbers(){
        // input your solution here
        int x = 9;
        int y = 4;

        int tmp = x;
        tmp = x;
        x = y;
        y = tmp;

    }

    //todo Task 6
    public void compareTwoNumbers(){
        // input your solution here

    }

    //todo Task 7
    public void ratingSalesPerson(){
        // input your solution here
    }

    //todo Task 8
    public void getCommissionRate(){
        // input your solution here
    }

    //todo Task 9
    public void leapyear(){
        // input your solution here
    }

    //todo Task 10
    public void transposedNumbers(){
        // input your solution here
    }


    public static void main(String[] args){
        App exercise1 = new App();

        System.out.println("Task 1: Say Hello World");
        exercise1.sayHelloWorld();

        System.out.println("\nTask 2: Hello Robot");
        exercise1.helloRobot();

        System.out.println("\nTask 3: Literals");
        exercise1.sumOfLiterals();

        System.out.println("\nTask 4: Add two Numbers");
        exercise1.addTwoNumbers();

        System.out.println("\nTask 5: Swap two Numbers without using a helper variable");
        exercise1.swapTwoNumbers();

        System.out.println("\nTask 6: Compare two Numbers");
        exercise1.compareTwoNumbers();

        System.out.println("\nTask 7: Rating Sales Person");
        exercise1.ratingSalesPerson();

        System.out.println("\nTask 8: Commission Rate");
        exercise1.getCommissionRate();

        System.out.println("\nTask 9: Leapyear");
        exercise1.leapyear();

        System.out.println("\nTask 10: Transposed Numbers");
        exercise1.transposedNumbers();
    }
}