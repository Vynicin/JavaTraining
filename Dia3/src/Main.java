import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int QUANTIDADE_MAXIMA = 5;

        Scanner input = new Scanner(System.in);
        System.out.print("Digite um Número: ");

        int    Numeros       = input.nextInt();
        String NumerosString = Integer.toString(Numeros);
        int    Quantidade    = NumerosString.length();

        if (Quantidade > QUANTIDADE_MAXIMA) {
            System.out.println(STR."Seu Número tem mais de \{QUANTIDADE_MAXIMA} digitos");
            return;
        }

        System.out.println(STR."Seu Número tem \{Quantidade} digitos");
    }
}