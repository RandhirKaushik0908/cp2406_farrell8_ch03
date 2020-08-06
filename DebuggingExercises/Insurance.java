import java.util.Scanner;

public class Insurance {
    public static void main(String[] args){
        int birthYear, currentYear, premium;
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the year of your birth: ");
        birthYear = input.nextInt();
        System.out.print("Please enter the current year: ");
        currentYear = input.nextInt();
        premium = calculatePremium(birthYear, currentYear);
        System.out.println("The amount of premium for you will be " + premium);
    }
    public static int calculatePremium(int yearOfBirth, int currentYear){
        int age, ageDecade, premium;
        age = currentYear - yearOfBirth;
        ageDecade = age / 10;
        System.out.println(ageDecade);
        premium = (ageDecade + 15) * 20;
        return premium;
    }
}
