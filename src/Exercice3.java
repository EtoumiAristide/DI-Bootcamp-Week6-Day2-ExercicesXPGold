import java.util.Scanner;

public class Exercice3 {
    public static void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter The Basic Salary : ");
        double salaire = scanner.nextDouble();

        if (salaire <= 10000) {
            salaire = salaire * (1 + 0.2 + 0.8);
        } else if (salaire <= 20000) {
            salaire = salaire * (1 + 0.25 + 0.9);
        } else {
            salaire = salaire * (1 + 0.3 + 0.95);
        }

        System.out.println("Gross Salary : " + salaire);
    }
}
