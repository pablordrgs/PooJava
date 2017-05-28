package aula05;

/**
 * Created by Pablo on 07/05/2017.
 */
public class ContaBanco {
    //Atributos
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    //Metodos especiais
    public void ContaBanco() {
        this.saldo = 0;
        this.status = false;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    //Métodos Personalizados
    public void abrirConta(String tipo){
        this.setTipo(tipo);
        this.setStatus(true);
        if (tipo.equals("CC")){
            //this.saldo = 50f;
            this.setSaldo(50f);
        } else if (tipo.equals("CP")){
            //this.saldo = 150f;
            this.setSaldo(150f);
        }
        System.out.println("A conta do " + this.getDono() + " foi aberta com sucesso");
    }

    public void fecharConta(){
        if (this.saldo > 0){
            System.out.println("Conta com dinheiro, " + this.getDono());
        } else if (this.saldo < 0){
            System.out.println("Conta em débito " + this.getDono());
        } else {
            this.setStatus(false);
            System.out.println("Conta fechada com sucesso " + this.getDono());
        }
    }

    public void depositar(float dinheiro){
        if (this.isStatus()){
            this.setSaldo(this.getSaldo() + dinheiro);
            System.out.println("Depósito realizado com sucesso " + this.getDono());
        } else {
            System.out.println("Impossível despositar " + this.getDono());
        }
    }

    public void sacar(float saque){
        if (this.isStatus()){
            if (this.getSaldo() >= 0 && this.getSaldo() >= saque){
                this.setSaldo(this.getSaldo() - saque);
                System.out.println("Saque realizado com sucesso no valor de " + saque + " " + this.getDono());
            } else {
                System.out.println("Saldo insuficiente");
            }
        } else {
            System.out.println("Impossivel sacar");
        }
    }

    public void pagarMensal(){
        int mensalidade = 0;
        if (this.getTipo().equals("CC")){
            mensalidade = 12;
        } else if (this.getTipo().equals("CP")){
            mensalidade = 20;
        }

        if (this.isStatus()){
            if (saldo > mensalidade){
                setSaldo(getSaldo() - mensalidade);
            } else {
                System.out.println("Saldo insuficiente");
            }
        } else {
            System.out.println("Impossivel pagar");
        }
    }

    public void estadoAtual(){
        System.out.println("------------------------------");
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.isStatus());
    }
}
