package aula09;

/**
 * Created by Pablo on 08/05/2017.
 */
public class Aula09 {
    public static void main(String[] args) {

        Pessoa[] pessoa = new Pessoa[2];
        pessoa[0] = new Pessoa("Pablo", 30, "M");
        pessoa[1] = new Pessoa("Thatiana", 29, "F");

        Livro[] livro = new Livro[3];
        livro[0] = new Livro("Serial Killers", "Harold", 400, pessoa[1]);
        livro[1] = new Livro("Deuses Americanos", "Neil Gaiman", 400, pessoa[0]);
        livro[2] = new Livro("Eu sou a lenda", "Richard", 300, pessoa[0]);

        System.out.println(livro[1].detalhes());
    }
}
