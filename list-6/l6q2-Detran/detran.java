public class detran {
    public static void main(String args[]){
        
        l6q2 carteira1 = new l6q2(1234);
        carteira1.novaCarteira("AB", 16, 4, 2022);
        carteira1.acresPonto(5);
        carteira1.zerarCnh();
        System.out.println("Pontos devem estar zerados: " + carteira1.getPontos());
        System.out.println("Status da carteira deve ser valido: " + carteira1.getSitu());
        carteira1.acresPonto(20);
        System.out.println("Pontos devem estar no máximo: " + carteira1.getPontos());
        System.out.println("Status da carteira deve ser apreendida: " + carteira1.getSitu());
        carteira1.zerarCnh();
        carteira1.acresPonto(5);
        carteira1.saldoPonto();
    }
}