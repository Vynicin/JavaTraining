import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);

        System.out.print("Digite Num1 | Operador | Num2: ");
        double Num1 = Input.nextDouble();
        char   Op   = Input.next().charAt(0);
        double Num2 = Input.nextDouble();

        Double Result = Calculate(Num1, Num2, Op);
        if (Result == null) {
            System.out.println("Operação Inválida!");
            return;
        }

        System.out.println(Result);
    }

    public static Double Calculate(double Num1, double Num2, char Operador){
        return switch (Operador) {
            case '+' -> Num1 + Num2;
            case '-' -> Num1 - Num2;
            case '*' -> Num1 * Num2;
            case '/' -> Num1 / Num2;
            default  -> null;
        };
    }
}