package Hora_de_codar_1;
import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args){
        try(Scanner ler = new Scanner(System.in)){
            System.out.println("Informe seu nome: ");
            String nome = ler.nextLine();
            System.out.println("Olá, " + nome);
        }
    }

}
