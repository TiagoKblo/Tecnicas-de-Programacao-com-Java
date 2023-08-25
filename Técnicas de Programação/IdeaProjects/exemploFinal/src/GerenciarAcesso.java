import java.util.ArrayList;
import java.util.List;

public class GerenciarAcesso {
    //Lista estática de logáveis
    public static List<Logavel> logados = new ArrayList<>();

    public static void main(String[] args) {
        Gerente gerenteZe = new Gerente();
        Secretaria secretariaMaria = new Secretaria();
        Secretaria secretariaJulia = new Secretaria();
        Operador operadorJoao = new Operador();
        Cliente clienteRomao = new Cliente();
        Fornecedor fornecedorEstrela = new Fornecedor();
        //Tentano operador
        //operadorJoao.efe... nao tem
        gerenteZe.efetuarLogin();
        secretariaMaria.efetuarLogin();
        clienteRomao.efetuarLogin();
        fornecedorEstrela.efetuarLogin();
        GerenciarAcesso gerenciarAcesso = new GerenciarAcesso();
        clienteRomao.efetuarLogout();
        gerenciarAcesso.listarLogados();


    }

    public static void adicionarLogado(Logavel obj){
        logados.add(obj);
    }

    public static void removerLogado(Logavel obj){
        logados.remove(obj);
    }

    public void listarLogados(){
        System.out.println("Total de pessoas logadas: "
                + logados.size());
        for(Logavel logado: logados){
            System.out.println("Tipo log: " + logado.getClass());
        }

    }
}