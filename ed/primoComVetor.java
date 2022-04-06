import java.util.Scanner;
public class primoComVetor {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Integer[] vet = new Integer[8];
        Integer[] primos = new Integer[8];
        int cont = 0, total=0;
        
        //preenche
        for(int i = 0; i < 8; ++i){
            System.out.print("Informe o "+ i +".o numero: ");
            vet[i] = input.nextInt();
        }
        //verifica
        for(int i = 0; i < 8; ++i){
            for(int j = 1; j <= vet[i]; ++j){
                if((vet[i] % j) == 0){
                    cont++;
                }
            }
            if(cont == 2){
                primos[i] = i;
            }
            cont = 0;
        }
        //exibe index
        for(int i = 0; i < 8; ++i){
            if (primos[i] != null)
            {   System.out.println(primos[i]);
            }    
        }
    }
}