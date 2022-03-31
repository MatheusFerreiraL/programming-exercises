// Faça um algoritmo que leia 100 valores e conte quantos estão no intervalo [10,20], escrevendo ao final essa informação.
import java.util.Scanner;
import java.util.ArrayList;
public class l3q6{
    public static void main(String[] args){
        ArrayList<Integer> arr = new ArrayList<Integer>();
        int num;
        try(Scanner input = new Scanner(System.in)){
            for(int i = 0; i < 100; ++i){
                System.out.print("Informe o " + (i+1) +".o valor: ");
                num = input.nextInt();
                arr.add(num);
            }
            for(int i = 0; i < arr.size(); ++i){
                if(arr.get(i) >= 10 && arr.get(i) <= 20){
                    System.out.println(arr.get(i));
                }
            }
        }
    }
}