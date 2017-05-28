package aula10;

/**
 * Created by Pablo on 09/05/2017.
 */
public class Aluno extends Pessoa10{

    private int matricula;
    private String curso;

    public void cancelarMatricula(){
        System.out.println("Matrícula será cancelada");
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
}
