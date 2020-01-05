import java.util.Scanner;

public class TripPlanner {
    public static void main(String[] args) {
        Greeting();
        TravelTimeAndBudget();
        TimeDifference();
        CountryArea();
    }

    public static void Greeting() {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Trip Planner!");
        System.out.print("What is your name? ");
        String name = input.nextLine();
        System.out.print("Nice to meet you " + name + ", where are you travelling to? ");
        String place = input.nextLine();
        System.out.println("Great! " + place + " sounds like a great trip");
        System.out.println("**********");
        System.out.println();
    }

    public static void TravelTimeAndBudget() {
        Scanner input = new Scanner(System.in);
        System.out.print("How many days are you going to spend travelling? ");
        int days = input.nextInt();
        input.nextLine();
        System.out.print("How much money, in USD, are you planning to spend on your trip? ");
        int moneyUSD = input.nextInt();
        input.nextLine();
        System.out.print("What is the three letter currency symbol for your travel destination? ");
        String letter = input.nextLine();
        System.out.print("How many " + letter + " are there in 1 USD? ");
        double exchange = input.nextDouble();
        input.nextLine();
        System.out.println();
        int hours = days * 24;
        int minutes = hours * 60;
        System.out.println("If you are travelling for " + days + " days that is the same as " + hours + " hours or " + minutes + " minutes");
        double perDayUSD = moneyUSD / days;
        System.out.println("If you are going to spend $" + moneyUSD + " USD that means per day you can spend up to $" + perDayUSD + " USD");
        double moneyExchanged = moneyUSD * exchange;
        double perDayExchangedMoney = moneyExchanged / days;
        System.out.println("Your total budget in " + letter + " is " + moneyExchanged + letter + " , which per day is " + String.format("%.2f",perDayExchangedMoney) + " " + letter);
        System.out.println("**********");
        System.out.println();
    }

    public static void TimeDifference() {
        Scanner input = new Scanner(System.in);
        System.out.print("What is the time difference, in hours, between your home and your destination? ");
        int time = input.nextInt();
        input.nextLine();
        double midnight = 0 + time;
        double noon = 12 + time;
        System.out.println("That means that when it is midnight at home it will be " + String.format("%.2f", midnight) + " in your travel destination\nand when it is noon at home it will be " + String.format("%.2f", noon));
        System.out.println("**********");
        System.out.println();
    }

    public static void CountryArea() {
        Scanner input = new Scanner(System.in);
        System.out.print("What is the square area of your destination country in km2? ");
        int km = input.nextInt();
        input.nextLine();
        double miles = km / (1.609 * 2);
        System.out.println("In miles2 that is " + miles);
        System.out.println("**********");
        System.out.println();
    }
}
