package aula04;

/**
 * Created by Pablo on 07/05/2017.
 */
public class Aula04 {
    public static void main(String[] args) {
        Caneta04 c1 = new Caneta04("NIC", 0.7f, "Amarela");
        //c1.setModelo("BIC");
        //c1.setPonta(0.5f);
        c1.status();

        System.out.println("Tenho uma caneta " + c1.getModelo() + ", com a ponta " + c1.getPonta());
    }
}
