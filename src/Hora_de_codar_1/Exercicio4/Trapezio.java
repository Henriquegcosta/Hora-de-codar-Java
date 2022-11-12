package Hora_de_codar_1.Exercicio4;
import java.util.Scanner;

public class Trapezio {

    public static void main(String[] args){
        Scanner numbers = new Scanner(System.in);
        System.out.println("Informe a diagonal maior: ");
        int diagonal_maior = numbers.nextInt();
        System.out.println("Informe a diagonal menor: ");
        int diagonal_menor = numbers.nextInt();
        System.out.println("Informe a altura: ");
        int altura = numbers.nextInt();
        System.out.println(((diagonal_maior + diagonal_menor)*altura) / 2);

        numbers.close();
    }

}
