import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner Input = new Scanner(System.in);

        System.out.print("Digite a Marca: ");
        String Marca = Input.next();
        System.out.print("Digite a Modelo: ");
        String Modelo = Input.next();
        System.out.print("Digite a Ano: ");
        int Ano = Input.nextInt();
        System.out.print("Digite o Valor: ");
        double Valor = Input.nextInt();

        Car NovoCarro = new Car(Marca, Modelo, Ano, Valor);

        System.out.println();
        System.out.println(NovoCarro.GetMarca());
        System.out.println(NovoCarro.GetModelo());
        System.out.println(NovoCarro.GetAno());
        System.out.println("Valor de venda: " + NovoCarro.CalcPreco());
    }
}