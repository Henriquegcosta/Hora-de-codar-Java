package Hora_de_codar_1.Exercicio4;
import java.util.Scanner;

public class Circulo {

    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        System.out.print("Informe o raio: ");
        int raio = ler.nextInt();
        int diametro = raio * raio;
        double pi = 3.14;

        System.out.println("A area do circulo é: " + diametro * pi);
        ler.close();

    }

}
