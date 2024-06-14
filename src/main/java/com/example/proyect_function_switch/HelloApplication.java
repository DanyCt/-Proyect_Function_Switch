package com.example.proyect_function_switch;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Scanner;

public class HelloApplication{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        printAnyString("Hi you are the best program, the programs has some options swch option");
        printAnyString("Please types any option");
        String readingString = scanner.nextLine();
        switch (readingString.toLowerCase()) {

            case "a":
                printAnyString("Row you are in sum program, if is necessary to type tow numbers.");
                printAnyString("Typing the first number");
                int numberOne = scanner.nextInt();
                printAnyString("Typing the first number");
                int numberTwo = scanner.nextInt();
                int sumResult = sumNumbers(numberOne, numberTwo);
                printAnyString("The result of suma is: " + sumResult);
                break;

            case "b":

                readString();
                break;

            case "c":

                printAnyString("Typing the first number");
                double numberfirst = scanner.nextInt();
                printAnyString("The result of cos is: " + numberC(numberfirst));
                break;
        }

    }

    public static void printAnyString(String message){
        System.out.println(message);
    }

    public static int sumNumbers(int numberOne, int numberTwo) {
        int result = numberOne+numberTwo;
        return  result;
        //return numberOne+numberTwo;
    }

    public static void readString (){
        Scanner scanner = new Scanner(System.in);
        printAnyString("Typing the text");
        String text = scanner.nextLine();
        System.out.println(text);
    }

    public static double numberC(double inputNumber) {

        return  Math.cos(inputNumber);
        //return numberOne+numberTwo;

    }
}