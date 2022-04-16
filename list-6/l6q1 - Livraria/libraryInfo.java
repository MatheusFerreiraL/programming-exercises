import java.util.Scanner;
public class libraryInfo {
    public static void main(String args[]){
        float taxa;
        Scanner input = new Scanner(System.in);
        System.out.print("Informe a taxa (em percentual): ");
        taxa = input.nextFloat();
        l6q1 kafka = new l6q1("O Processo","Franz Kafka",1999,3,100);
        kafka.venda(taxa);
        kafka.print();
    }    
}