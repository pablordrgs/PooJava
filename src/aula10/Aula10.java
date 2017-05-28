package aula10;

import aula09.Pessoa;

/**
 * Created by Pablo on 09/05/2017.
 */
public class Aula10 {
    public static void main(String[] args) {

        Pessoa10 pessoa = new Pessoa10();
        Aluno aluno = new Aluno();
        Professor professor = new Professor();
        Funcionario funcionario = new Funcionario();

        pessoa.setNome("Pedro");
        aluno.setNome("Maria");
        professor.setNome("Cláudio");
        funcionario.setNome("Fabiana");

        aluno.setIdade(20);
        funcionario.setSexo("F");

        aluno.setCurso("Informática");

        System.out.println(pessoa.toString());
        System.out.println(aluno.toString());
        System.out.println(professor.toString());
        System.out.println(funcionario.toString());

    }
}
