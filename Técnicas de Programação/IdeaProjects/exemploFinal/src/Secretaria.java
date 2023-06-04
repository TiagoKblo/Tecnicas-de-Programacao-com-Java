public class Secretaria extends Funcionario implements Logavel{
    @Override
    public void efetuarLogin() {
        System.out.println("Secretaria logou");
        GerenciarAcesso.adicionarLogado(this);
    }

    @Override
    public void efetuarLogout() {
        System.out.println("Secretaria saiu do sistema");
        GerenciarAcesso.removerLogado(this);
    }
}