public class Car {

    private String Marca;
    private String Modelo;
    private int    Ano;
    private double Valor;

    Car(String Marca, String Modelo, int Ano, double Valor){
        this.Marca  = Marca;
        this.Modelo = Modelo;
        this.Ano    = Ano;

        this.Valor  = Valor;
    }

    public String GetMarca(){
        return Marca;
    }
    public String GetModelo(){
        return Modelo;
    }
    public int GetAno(){
        return Ano;
    }

    public double CalcPreco(){

        return Math.floor(Valor * 1.1 * 1000)/ 1000;
    }

}
