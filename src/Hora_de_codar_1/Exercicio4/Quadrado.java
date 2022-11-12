package Hora_de_codar_1.Exercicio4;
import java.util.Scanner;

public class Quadrado {

    public static void main(String[] args){
        Scanner lado = new Scanner(System.in);
        System.out.print("Informe o valor do lado: ");
        int valor = lado.nextInt();
        System.out.println("Valor da área: " + valor*valor);

        lado.close();
    }

}
