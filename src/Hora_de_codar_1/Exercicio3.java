package Hora_de_codar_1;
import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        System.out.println("Informe seu nome: ");
        String nome = ler.nextLine();
        System.out.println("Informe sua idade: ");
        int idade = ler.nextInt();
        System.out.println("Olá, " + nome + " sua idade é " + idade);

        ler.close();
    }

}
