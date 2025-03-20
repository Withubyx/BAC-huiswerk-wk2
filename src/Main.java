public class Main {
    public static void main(String[] args) {

        int number = 6;
        int input1 = 4;
        int input2 = 20;
        String name = "Henk";
        String beverage = "Beer";

        hello();
        positiveOrNegative(number);
        positiveOrZeroOrNegative(number);
        bartender(beverage, name);
        sum(input1, input2);
    }
    private static void hello() {
        System.out.println("Hello, World");
    }
    private static void positiveOrNegative(int number) {
        if (number > 0) {
            System.out.println("This number is positive!");
        } else {
            System.out.println("This number is negative!");
        }
    }
    private static void positiveOrZeroOrNegative(int number) {
        if (number > 0) {
            System.out.println("This number is positive!");
        } else if (number == 0) {
            System.out.println("This number is zero!");
        } else {
            System.out.println("This number is - negative!");
        }
    }
    private static void bartender(String beverage, String name) {
        switch (beverage) {
            case "Water":
                System.out.println(name + " ordered Water");
                break;
            case "Beer":
                System.out.println(name + " ordered Beer");
                break;
            case "Cocktail":
                System.out.println(name + " ordered Cocktail");
            default:
                System.out.println(name + " ordered Other");
        }
    }
    private static void sum(int input1, int input2) {
            System.out.print("The sum of " + input1 + " and " + input2 + " is " + (input1 + input2));
    }
}
