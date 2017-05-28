package aula02;

/**
 * Created by Pablo on 07/05/2017.
 */
public class Passeio {
    String local;
    String horario;
    String data;
    String cia;
    boolean marcado;

    void aceitou(){
        if (marcado == true){
            System.out.println("Vou ao " + this.local + " com a " + this.cia);
        } else {
            System.out.println("Ela não aceitou");
        }
    }
}
