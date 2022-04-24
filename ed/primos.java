import java.util.Scanner;
public class primos{
    public static void main(String[] args){
        int n1, n2, cont = 0, cont2 = 0;
        try(Scanner input = new Scanner(System.in)){
            System.out.print("Primeiro numero: ");
            n1 = input.nextInt();
            System.out.print("Segundo numero: ");
            n2 = input.nextInt();
            for(int i = n1; i < n2; ++i){
                for(int j = 1; j <= i; ++j){
                    if((i % j) == 0){
                        ++cont;
                    }
                }
                if(cont == 2){
                    ++cont2;
                }
                cont = 0;
            }
            System.out.print(cont2);
        }
    }
}