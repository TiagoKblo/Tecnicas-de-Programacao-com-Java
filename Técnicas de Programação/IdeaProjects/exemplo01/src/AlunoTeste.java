public class AlunoTeste {
    public static void main(String... args) {
        Aluno alunoPedro = new Aluno();
        alunoPedro.ra = 1;
        alunoPedro.nome = "Pedro Antonio";
        alunoPedro.email = "pedro@gmail.com";
        alunoPedro.curso = "DSM";
        alunoPedro.matricular();
        alunoPedro.desistirDiciplina();
        alunoPedro.cancelarMatricula();

    }
}