package Hora_de_codar_1.Exercicio4;
import java.util.Scanner;

public class Retangulo {

    public static void main(String[] args){
        Scanner ler_base = new Scanner(System.in);
        Scanner ler_altura = new Scanner(System.in);
        System.out.println("Informe a base: ");
        int base = ler_base.nextInt();
        System.out.println("Informe a altura: ");
        int altura = ler_altura.nextInt();
        System.out.println("Valor da área: " + altura*base);

        ler_base.close();
        ler_altura.close();
    }

}
