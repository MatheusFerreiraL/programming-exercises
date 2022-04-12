/*Considere um sistema para uma livraria e construa uma classe que represente os livros vendidos na loja. Todo livro possui como atributos nome, autor, preço de custo, edição e ano. Esta classe deve possuir os seguintes métodos:
- método para criar um livro com todos os seus dados.
- Construa um método para calcular o preço de venda do livro. Para isso deve ser informado o percentual de lucro da loja a ser aplicado sobre o preço de custo do livro.
- Construa um método para imprimir os dados de um livro.*/
import java.util.Scanner;
public class Livraria{
    private String name, author;
    private int year, edition;
    private float price;

    public Livraria(String nome, String autor, int ano, int ed, float valor){
        this.name = nome;
        this.author = autor;
        this.year = ano;
        this.edition = ed;
        this.price = valor;
    }

    public float venda(float valor){
        Scanner input = new Scanner(System.in);
        float lucro;
        System.out.print("Informe o percentual de lucro da loja: ");
        lucro = input.nextFloat();
        lucro = (valor * lucro) + valor;
        return lucro;        
    }

    public void print(){
        System.out.println("Nome do livro: " + name);
        System.out.println("Autor: " + author);
        System.out.println("Edicao e Ano: " + edition + year);
        System.out.println("Preço de custo: " + price);
        //System.out.println("Valor de mercado: " + lucro);
    }
}

public class l6q1{
    public static void main(String[] args){
        
    }
}