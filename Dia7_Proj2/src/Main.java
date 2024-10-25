import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        System.out.print("Digite um Número: ");
        int Num = Input.nextInt();
        String Resposta = Logic(Num);

        System.out.println(Resposta);
    }

    public static String Logic(int Num){
        //Caso seja Impar
        if (Num % 2 != 0)         {return "Impar";}

        if (Num >= 2 && Num <= 5) {return "A";}
        if (Num >= 6 && Num <= 20){return "B";}

        //Se for maior que 20
        return "C";
    }
}