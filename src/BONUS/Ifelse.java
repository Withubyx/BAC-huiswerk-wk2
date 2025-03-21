package BONUS;

import java.util.Scanner;

public class Ifelse {


    public static void main(String[] args) {

//        input opdracht 1
        Scanner scanner01 = new Scanner(System.in);
        System.out.print("Type een nummer: ");
        evenOdd(scanner01.nextInt());

//        input opdracht 2
        byte grade = 5;
        grader(grade);

//        input opdracht 3
        Scanner scanner02 = new Scanner(System.in);
        System.out.print("Type een getal: ");
        int n1 = scanner02.nextInt();
        Scanner scanner03 = new Scanner(System.in);
        System.out.print("Type een getal: ");
        bigger(n1, scanner02.nextInt());

//        input opdracht 4
        Scanner scanner04 = new Scanner(System.in);
        System.out.print("Type een getal: ");
        checker(scanner04.nextInt());

//        input opdracht 5
        Scanner scanner05 = new Scanner(System.in);
        System.out.print("Type uw leeftijd ");
        age(scanner05.nextInt());

//        input opdracht 6
        Scanner scanner06 = new Scanner(System.in);
        System.out.print("Type hier een tekst: ");
        lengthText(scanner06.nextLine());

//        input opdracht 7
        Scanner scanner07 = new Scanner(System.in);
        System.out.print("Voer een jaartal in: ");
        leapYear(scanner07.nextInt());

//        input methode 8
        Scanner scanner08 = new Scanner(System.in);
        System.out.print("Voer een getal in ");
        int number1 = scanner08.nextInt();
        Scanner scanner09 = new Scanner(System.in);
        System.out.print("Voer een getal in ");
        int number2 = scanner09.nextInt();
        Scanner scanner10 = new Scanner(System.in);
        System.out.print("Voer een getal in ");
        max(number1, number2, scanner10.nextInt());


//        input methode 9
        Scanner scanner11 = new Scanner(System.in);
        System.out.print("Voer een lengte in van 1 zijde van driehoek ");
        int side1 = scanner11.nextInt();
        Scanner scanner12 = new Scanner(System.in);
        System.out.print("Voer een lengte in van andere zijde van driehoek ");
        int side2 = scanner12.nextInt();
        Scanner scanner13 = new Scanner(System.in);
        System.out.print("Voer een lengte in van overgebleven zijde van driehoek ");
        triangle(side1, side2, scanner13.nextInt());

//        input methode 10
        Scanner scanner14 = new Scanner(System.in);
        System.out.print("Type getal 1 van 2 voor berekening in ");
        double cn1 = scanner14.nextInt();
        Scanner scanner15 = new Scanner(System.in);
        System.out.print("Type getal 2 van 2 voor berekening in ");
        double cn2 = scanner15.nextInt();
        Scanner scanner16 = new Scanner(System.in);
        System.out.println("Kies (type) een operator uit de volgende opties: +, -, *, / ");
        calc(cn1, cn2, scanner15.next().charAt(0));

    }
//        methode opdracht 1
    public static void evenOdd(int number) {
        if (number % 2 == 0) {
            System.out.println("Het getal is even\n");
        } else {
            System.out.println("Het getal is oneven\n");
        }
    }
//        methode opdracht 2
    public static void grader(byte grade) {
         if (grade >= 8) {
             System.out.println("grade A\n");
         } else if (grade >= 6) {
             System.out.println("grade B\n");
         } else if (grade >= 4) {
             System.out.println("grade C\n");
         } else if (grade >= 2) {
             System.out.println("grade D\n");
         } else {
             System.out.println("grade F\n");
         }
    }
//        methode opdracht 3
    public static void bigger(int number1, int number2) {
        if (number1 > number2) {
            System.out.println(number1 + " is groter dan " + number2 + "\n");
        } else if (number1 < number2) {
            System.out.println(number2 + " is groter dan " + number1 + "\n");
        } else {
            System.out.println(number1 + " is even groot als " + number2 + "\n");
        }
    }
//        methode opdracht 4
    public static void checker(int number) {
        if (number > 0) {
            System.out.println(number + " is positief\n");
        } else if (number == 0) {
            System.out.println(number + " is nul\n");
        } else {
            System.out.println(number + " is negatief\n");
        }
    }
//        methode opdracht 5
    public static void age(int number) {
        if (number < 12) {
            System.out.println("Je bent een kind\n");
        }    else if (number < 18) {
            System.out.println("Je bent een puber\n");
        }   else if (number < 65) {
            System.out.println("Je bent een volwassene\n");
        }   else {
            System.out.println("U bent een senior\n");
        }
    }
//        methode opdracht 6
    public static void lengthText(String length) {
//        System.out.print(length.length());
//        int lengthnumber = (length.length());
        if (length.length() < 10) {
            System.out.println("De ingevoerde tekst was kort\n");
        } else if (length.length() < 21) {
            System.out.println("De ingevoerde tekst was middellang\n");
        } else {
            System.out.println("De ingevoerde tekst was lang\n");
        }
    }
//        methode opdracht 7
    public static void leapYear(int year) {
        if (year%400 == 0) {
            System.out.println(year + " is een schrikkeljaar\n");
        } else if (year%4 == 0 && year%100!=0) {
            System.out.println(year + " is een schrikkeljaar\n");
        } else {
            System.out.println(year + " is geen schrikkeljaar\n");
        }
    }
//        methode opdracht 8
    public static void max(int nmbr1, int nmbr2, int nmbr3) {
        int nmbr4 = Math.max(nmbr1, nmbr2);
        System.out.println("Het grootste getal van de 3 ingevoerde is: " + Math.max(nmbr3, nmbr4) + "\n");
    }
//        methode opdracht 9
    public static void triangle(int side1, int side2, int side3) {
        if (side1 == side2 && side3 == side1 ) {
            System.out.println("De driehoek is gelijkzijdig\n");
        } else if (side1 == side2 || side2 == side3 || side3 == side1) {
            System.out.println("De driehoek is gelijkbenig\n");
        } else {
            System.out.println("De driehoek is ongelijkzijdig\n");
        }
    }
//        methode opdracht 10
    public static void calc(double number1, double number2, char operator) {
        switch (operator) {
            case '+':
                double result1 = number1 + number2;
                System.out.println("Resultaat berekening is :" + result1 + "\n");
                break;
            case '-':
                double result2 = number1 - number2;
                System.out.println("Resultaat berekening is :" + result2 + "\n");
                break;
            case '*':
                double result3 = number1 * number2;
                System.out.println("Resultaat berekening is :" + result3 + "\n");
                break;
            default:
                double result4 = number1 / number2;
                System.out.println("Resultaat berekening is :" + result4 + "\n");
        }
    }
}

