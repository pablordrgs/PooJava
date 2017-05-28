package aula05;

/**
 * Created by Pablo on 07/05/2017.
 */
public class Aula05 {
    public static void main(String[] args) {
        /*ContaBanco conta = new ContaBanco();
        conta.abrirConta("CC");
        conta.fecharConta();
        conta.setStatus(true);
        conta.depositar(150f);
        conta.pagarMensal();
        conta.sacar(350f);
        System.out.println("Tenho " + conta.getSaldo() + " na minha conta do banco");*/

        ContaBanco p1 = new ContaBanco();
        p1.setNumConta(111);
        p1.setDono("Jubileu");
        p1.abrirConta("CC");

        ContaBanco p2 = new ContaBanco();
        p2.setNumConta(2222);
        p2.setDono("Creuza");
        p2.abrirConta("CP");

        //p1.depositar(100);
        p2.depositar(500);

        p2.sacar(100);

        p1.sacar(50);
        p1.fecharConta();

        p1.estadoAtual();
        p2.estadoAtual();
    }
}
