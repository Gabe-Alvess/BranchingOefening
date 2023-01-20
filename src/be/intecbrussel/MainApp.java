package be.intecbrussel;

public class MainApp {
    public static void main(String[] args) {
        System.out.println("---- Oefening 1 ----");

        int number = 10;

        if (number % 2 == 0) {
            System.out.println(number + " is een even getal.");
        } else {
            System.out.println(number + " is een oneven getal.");
        }

        System.out.println("---- Oefening 2 ----");

        int jaar = 1900;

        if (jaar % 4 == 0 && (jaar % 100 != 0 || jaar % 400 == 0 )) {
            System.out.println(jaar + " is een schrikkeljaar");
        } else {
            System.out.println(jaar + " is geen schrikkeljaar");
        }

        System.out.println("---- Oefening 3 ----");

        System.out.println(jaar % 4 == 0 && ( jaar % 100 != 0 || jaar % 400 == 0 ) ? jaar + " is een schrikkeljaar" : jaar + " is geen schrikkeljaar");

        System.out.println("---- Github oefening ----");

        System.out.println("---- Oefening 1 ----");

        int number1 = 7;
        int number2 = 16;


        if (number1 > number2) {
            System.out.println(number1 + " is groter dan " + number2);
        } else if (number2 > number1) {
            System.out.println(number1 + " is kleiner dan " + number2);
        }

        System.out.println("---- Oefening 2 ----");

        int input = 10;

        if (input > 0) {
            System.out.println(input + " is positief");
        } else if (input < 0) {
            System.out.println(input + " is negatief");
        } else if (input == 0) {
            System.out.println("input is gelijk aan " + input);
        }

        System.out.println("---- Oefening 3 ----");

        String month = "March";
        String daysCount = "0";
    }
}
