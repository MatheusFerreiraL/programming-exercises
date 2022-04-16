/*Considere um sistema para uma livraria e construa uma classe que represente os livros vendidos na loja. Todo livro possui como atributos nome, autor, preço de custo, edição e ano. Esta classe deve possuir os seguintes métodos:
- método para criar um livro com todos os seus dados.
- Construa um método para calcular o preço de venda do livro. Para isso deve ser informado o percentual de lucro da loja a ser aplicado sobre o preço de custo do livro.
- Construa um método para imprimir os dados de um livro.*/
public class l6q1{
    private String name, author;
    private int year, edition;
    private float price;

    public l6q1(String nome, String autor, int ano, int ed, float valor){
        this.name = nome;
        this.author = autor;
        this.year = ano;
        this.edition = ed;
        this.price = valor;
    }

    public void venda(float taxa){
        float interest = taxa, total;
        total = (price * interest) + price;
        System.out.println("Valor de mercado: " + total);
    }

    public void print(){
        System.out.println("Nome do livro: " + name);
        System.out.println("Autor: " + author);
        System.out.println("Edicao e Ano: " + edition + "a, " + year);
        System.out.println("Preco de custo: " + price);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getEdition() {
        return edition;
    }

    public void setEdition(int edition) {
        this.edition = edition;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}