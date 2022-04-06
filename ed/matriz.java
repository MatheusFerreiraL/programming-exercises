import java.util.Scanner;
public class matriz {
    public static void main(String[] args){
        Integer[][] matrix = new Integer[3][3];
        int maior = 0, maiorL = 0, maiorC = 0;
        Scanner input = new Scanner(System.in);
        
        //cria matriz
        for(int l = 0; l < 3; ++l){
            for(int c = 0; c < 3; ++c){
                System.out.print("Posicao ["+ l +"]["+ c +"]: ");
                matrix[l][c] = input.nextInt();
                if(matrix[l][c] > maior){
                    maior = matrix[l][c];
                    maiorL = l;
                    maiorC = c;
                }
            }
        }
        //imprime matriz
        System.out.println("Print Matriz:");
        for(int l = 0; l < 3; ++l){
            for(int c = 0; c < 3; ++c){
                System.out.print("["+ matrix[l][c]+"]");
            }
            System.out.println("");
        }
        //imprime index do maior valor
        System.out.print("Maior index:\n["+ maiorL +"]["+ maiorC +"]");
    }
}
