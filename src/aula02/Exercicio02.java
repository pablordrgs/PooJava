package aula02;

/**
 * Created by Pablo on 07/05/2017.
 */
public class Exercicio02 {
    public static void main(String[] args) {

        Livro l1 = new Livro();
        l1.nome = "Serial Killers";
        l1.autor = "Harold Schechter";
        l1.editora = "Darkside";
        l1.paginas = 473;
        l1.marcacao = 100;
        l1.lendo = true;
        l1.lendo();
        l1.aberto();

        Passeio p1 = new Passeio();
        p1.local = "Motel";
        p1.data = "Quarta-feira";
        p1.horario = "19h";
        p1.cia = "Ruiva";
        p1.marcado = true;
        p1.aceitou();
    }
}
