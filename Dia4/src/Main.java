import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner Input = new Scanner(System.in);
        System.out.print("Digite uma palavra: ");

        String Palavra = Input.next();

        for (int i = 0; i < Palavra.length(); i ++) {

            char Character = Palavra.charAt(i);
            System.out.print(Character + " ");
        }
    }
}