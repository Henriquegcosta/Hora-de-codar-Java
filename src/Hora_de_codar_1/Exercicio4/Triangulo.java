package Hora_de_codar_1.Exercicio4;
import java.util.Scanner;

public class Triangulo {

    public static void main(String[] args){
        Scanner numbers = new Scanner(System.in);
        System.out.println("Informe a base: ");
        int base = numbers.nextInt();
        System.out.println("Informe a altura: ");
        int altura = numbers.nextInt();
        System.out.println((base * altura) / 2);

        numbers.close();
    }
}
