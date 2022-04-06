import java.util.Scanner;
public class DiagonalPrincipal_DiagonalSecundaria {
    public static void main(String[] args){
        int l = 3, c = 3;
        Integer[][] mat = new Integer[l][c];
        int somaPrinc = 0, somaSecu = 0, size;
        Scanner input = new Scanner(System.in);
        
        size = l;
        //cria matriz
        for(l = 0; l < 3; ++l){
            for(c = 0; c < 3; ++c){
                System.out.print("Posicao ["+ l +"]["+ c +"]: ");
                mat[l][c] = input.nextInt();
            }
        }
        //imprime matriz
        System.out.println("Print Matriz:");
        for(l = 0; l < 3; ++l){
            for(c = 0; c < 3; ++c){
                System.out.print("["+ mat[l][c]+"]");
            }
            System.out.println("");
        }
        //diagonal principal
        System.out.println("");
        System.out.println("Diagonal Principal:");
        for(l = 0 ; l < 3; ++l){
            System.out.print("["+ mat[l][l] +"]");
            somaPrinc += mat[l][l];
        }
        //diagonal secundaria => size - 1 {(3 - 1)}
        System.out.println("");
        System.out.println("Diagonal Secundaria:");
        for(l = 0; l < 3; l++){
            for(c = 0; c < 3; c++){
                if(l + c == (size-1)){
                    System.out.print("["+ mat[l][c] +"]");
                    somaSecu += mat[l][c];
                }
            }
        }
        //imprime as somas 
        System.out.println("");
        System.out.print("Soma D. Principal: "+ somaPrinc);
        System.out.print("\nSoma D. Secundario: "+ somaSecu);
    }
}
