public class Cliente implements Logavel {
    @Override
    public void efetuarLogin() {
        System.out.println("Cliente logou");
        GerenciarAcesso.adicionarLogado(this);
    }

    @Override
    public void efetuarLogout() {
        System.out.println("Cliente saiu do sistema");
        GerenciarAcesso.removerLogado(this);
    }
}