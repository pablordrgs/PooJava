package aula02;

/**
 * Created by Pablo on 07/05/2017.
 */
public class Caneta {
    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    private boolean tampada; //tampada é privada, então outra classe não pode mudar seus atributos.

    public void status(){
        System.out.println("Modelo: ");
        System.out.println("Uma caneta " + this.cor);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga);
        System.out.println("Está tampada? " + this.tampada);
    }

    public void rabiscar(){
        if (this.tampada == true){
            System.out.println("ERRO! Não posso rabiscar");
        } else {
            System.out.println("Estou rabiscando!");
        }

    }

    public void tampar(){
        this.tampada = true;
        //o metodo tampar pode mudar o tampada pois faz parte da mesma classe
        //e pode ser usada em outras classes para modificar o tampada.

    }

    public void destampar(){
        this.tampada = false;

    }

}
