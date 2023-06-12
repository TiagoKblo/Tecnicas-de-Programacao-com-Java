public class AcampamentoTeste {
    public static void main(String[] args) {
        Acampamento membro = new Acampamento();
        membro.setNome("Paulo");
        membro.setIdade(34);
        membro.imprimir();
        membro.separarGrupo();
        membro.imprimir();
    }
}