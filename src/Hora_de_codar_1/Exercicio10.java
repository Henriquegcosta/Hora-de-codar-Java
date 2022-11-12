package Hora_de_codar_1;
import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[4];
        int sum = 0;

        for(int i = 0; i < 4; i++){
            System.out.print("Digite a nota: ");
            numbers[i] = scanner.nextInt();
        }
        for(int j = 0; j < numbers.length; j++){
            sum+= numbers[j];
        }
        int media = sum/4;
        if(media >= 6){
            System.out.println("Parabéns voce foi aprovado!");
        }else {
            System.out.println("Eita... Você foi reprovado :(");
        }
    }
}
