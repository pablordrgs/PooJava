package aula02;

/**
 * Created by Pablo on 07/05/2017.
 */
public class Livro {
    String nome;
    String autor;
    String editora;
    int paginas;
    int marcacao;
    boolean lendo;

    void lendo(){
        if (lendo == true){
            System.out.println("Estou lendo");
        } else {
            System.out.println("Não estou lendo");
        }
    }

    void aberto(){
        System.out.println("Estou na página " + this.marcacao);
    }
}
