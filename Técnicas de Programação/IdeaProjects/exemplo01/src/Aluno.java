public class Aluno {
    //1. atributos
    long ra;
    String nome;
    String email;
    String curso;

    //2. métodos

    void matricular(){
        System.out.println("Aluno:" + nome);
        System.out.println("Seu ra é: " + ra);
        System.out.println("Parabéns você foi matriculado");
    }
    void cancelarMatricula(){
        System.out.println("Aluno: " + nome);
        System.out.println("teve sua matrícula cancelada");

    }
    void desistirDiciplina(){
        System.out.println("Você perdeu o prazo. Tem que pagar tudo");

    }
}
