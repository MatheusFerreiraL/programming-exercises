/* Faça um algoritmo que escreva todos os números pares entre 1 e 50. */
public class l3q2 {
    public static void main(String[] args){
        for(int i = 1; i <= 50; ++i){
            if(i % 2 == 0){
                System.out.println(i);
            }
        }
    }
}