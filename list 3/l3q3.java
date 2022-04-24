/* Faça um algoritmo que escreva todos os números entre 1 e 200 que são múltiplos de 11. */
public class l3q3 {
    public static void main(String[] args){
        for(int i = 1; i <= 200; ++i){
            if(i % 11 == 0){
                System.out.println(i);
            }
        }
    }
}
