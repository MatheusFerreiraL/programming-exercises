/* Faça um algoritmo que leia números até que seja digitado um número negativo, e escreva todos que forem pares. */
import java.util.Scanner;
import java.util.ArrayList;
public class l3q5 {
    public static void main(String[] args){
        float num = 0;
        ArrayList<Float> pares = new ArrayList<Float>();
        try(Scanner input = new Scanner(System.in)){
            do{
                System.out.print("Informe um valor: ");
                num = input.nextFloat();
                if(num % 2 == 0){
                    pares.add(num);
                }
            }while(num >= 0);
            System.out.println("Lista de números pares: ");
            for(int i = 1; i < pares.size(); ++i){
                System.out.println(pares.get(i));
            }
        }
    }
}