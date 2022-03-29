/* Faça um algoritmo que leia 10 números e escreva os que forem pares. Dica: Um número inteiro é par se o resto da sua divisão inteira por 2 é igual a 0. */
import java.util.Scanner;
public class l3q4 {
    public static void main(String[] args){
        int num, cont = 0;
        try(Scanner input = new Scanner(System.in)){
            while(cont != 10){
                System.out.print("Informe o "+ (cont + 1) + ".o valor: ");
                num = input.nextInt();
                if(num % 2 == 0){
                    System.out.println("O número " + num + " É par!");
                }else{
                    System.out.println("O número "+ num + " NÃO é par");
                }
                ++cont;
            }
        }
    }
}