/* 
Em um sistema para o Detran, a carteira de motorista é representada por um número, CPF do proprietário, tipo (A, B ou AB), data de validade, data de expedição, pontos e situação (Valida, apreendida, vencida).
Quando uma pessoa passa no exame do Detran, uma nova carteira é emitida com os dados do seu proprietário.

Neste momento o proprietário não possui nenhum ponto na carteira. A medida que o tempo passa, se o proprietário fizer alguma infração, ele recebe pontos que são acumulados em sua carteira.  Caso ele ultrapasse 20 pontos sua carteira é apreendida. Esporadicamente, os pontos são zerados. 

Implemente em Java uma classe que represente uma carteira. Forneça métodos para criar uma carteira, acrescentar pontos, consultar o saldo de pontos, zerar a carteira, apreender a carteira, verificar se esta está válida.
*/
public class l6q2 {
    private int cnh = 0, cpf = 0, pontos;
    //dataExpedição
    private int dE, mE, yE;
    //dataValidade
    private int dV, mV, yV;
    private String tipo;
    private String situ;

    public l6q2(int cpf) {
        this.cpf = cpf;
    }

    public void novaCarteira(String type, int de, int me, int ye) {
        //cria nºs únicos para cpf e cnh

        // FAZER VALIDAÇÃO - TIPO, DIA, MES E ANO

        cnh += 1;
        pontos = 0;
        situ = "VALIDA";
        tipo = type;
        //Data de expedição
        dE = de;
        mE = me;
        yE = ye;
        //Data de validade
        dV = de;
        mV = me;
        yV = ye + 5; 

        //VALIDAÇÃO
        System.out.println("\nCPF: " + cpf);
        System.out.println("CNH: " + cnh);
        System.out.println("Situacao da CNH: " + situ);
        System.out.println("Pontos CNH: " + pontos);
        System.out.println("Tipo de CNH: " + tipo);
        System.out.println("Data de expedicao: " + dE  + "/" + mE + "/" + yE);
        System.out.println("Data de vencimento: " + dV  + "/" + mV + "/" + yV);
    }

    public int acresPonto(int points){
        pontos += points;
        if(pontos >= 20){
            situ = "APREENDIDA";
            System.out.print("\n\nLimite de pontos alcancado (" + pontos + ")\nSituacao da CNH: " + situ);
            return pontos;
        }
        System.out.print("Pontos CNH: " + pontos);
        return pontos;
    }

    public void saldoPonto() {
        System.out.println("-----\nCNH : " + cnh + "\nTotal de pontos acumulados: " + pontos);
    }

    public int zerarCnh() {
        pontos = 0;
        situ = "VALIDA";
        System.out.println("-----\nCNH: " + cnh + "\nPontos zerados, situacao: " + situ);
        return pontos;
    }

    public String apreenderCnh() {
        situ = "APREENDIDA";
        System.out.println(">>>>>\nCNH: " + cnh + "\nSituacao CNH: " + situ);
        return situ;
    }

    public void verificaValidade() {
        System.out.println("CNH: " + cnh + "Situacao da CNH : " + situ);
    }

    public int getCnh() {
        return cnh;
    }

    public void setCnh(int cnh) {
        this.cnh = cnh;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public int getPontos() {
        return pontos;
    }

    public void setPontos(int pontos) {
        this.pontos = pontos;
    }

    public int getdE() {
        return dE;
    }

    public void setdE(int dE) {
        this.dE = dE;
    }

    public int getmE() {
        return mE;
    }

    public void setmE(int mE) {
        this.mE = mE;
    }

    public int getyE() {
        return yE;
    }

    public void setyE(int yE) {
        this.yE = yE;
    }

    public int getdV() {
        return dV;
    }

    public void setdV(int dV) {
        this.dV = dV;
    }

    public int getmV() {
        return mV;
    }

    public void setmV(int mV) {
        this.mV = mV;
    }

    public int getyV() {
        return yV;
    }

    public void setyV(int yV) {
        this.yV = yV;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getSitu() {
        return situ;
    }

    public void setSitu(String situ) {
        this.situ = situ;
    }
}