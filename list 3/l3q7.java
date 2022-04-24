// Faça um algoritmo que leia 100 valores e conte quantos estão em cada um dos intervalos [0,25],(25,50], (50,75], (75..100], escrevendo ao final essa informação.
import java.util.Scanner;
import java.util.ArrayList;
public class l3q7 {
    public static void main(String[] args){
        ArrayList<Integer> primeiro = new ArrayList<Integer>();
        ArrayList<Integer> segundo = new ArrayList<Integer>();
        ArrayList<Integer> terceiro = new ArrayList<Integer>();
        ArrayList<Integer> quarto = new ArrayList<Integer>();
        int num;
        try(Scanner input = new Scanner(System.in)){
            for(int i = 0; i < 10; ++i){
                System.out.print("Informe o "+ (i+1) +".o valor: ");
                num = input.nextInt();
                if(num >= 0 && num <= 25){
                    primeiro.add(num);
                }else if(num > 25 && num <= 50){
                    segundo.add(num);
                }else if(num > 50 && num <= 75){
                    terceiro.add(num);
                }else{
                    quarto.add(num);
                }
            }
            System.out.print("Intervalo [0,25]: " + primeiro.size() + "\nIntervalo (25,50]: "+ segundo.size() + "\nIntervalo (50,75]: "+ terceiro.size() +"\nIntervalo (75..100]: "+ quarto.size());
        }
    }
}

