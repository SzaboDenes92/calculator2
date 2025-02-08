import java.util.Scanner;

public class calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Írd be az első számot:");
        double a = scanner.nextDouble();
        System.out.println("Írd be a második számot:");
        double b = scanner.nextDouble();
        System.out.println("Válassz műveletet (+, -, *, /):");
        String op = scanner.next();

        double eredmeny = 0;
        switch (op) {
            case "+":
                eredmeny = a + b;
                break;
            case "-":
                eredmeny = a - b;
                break;
            case "*":
                eredmeny = a * b;
                break;
            case "/":
                if (b != 0)
                    eredmeny = a / b;
                else {
                    System.out.println("Hiba: Osztás nullával!");
                    System.exit(1);
                }
                break;
            default:
                System.out.println("Érvénytelen művelet!");
                System.exit(1);
        }

        System.out.println("Eredmény: " + eredmeny);
    }
}
