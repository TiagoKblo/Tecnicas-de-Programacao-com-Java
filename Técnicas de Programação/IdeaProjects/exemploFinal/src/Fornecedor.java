public class Fornecedor implements Logavel {
    @Override
    public void efetuarLogin() {
        System.out.println("Fornecedor logou");
        GerenciarAcesso.adicionarLogado(this);
    }

    @Override
    public void efetuarLogout() {
        System.out.println("Fornecedor saiu do sistema");
        GerenciarAcesso.removerLogado(this);
    }
}