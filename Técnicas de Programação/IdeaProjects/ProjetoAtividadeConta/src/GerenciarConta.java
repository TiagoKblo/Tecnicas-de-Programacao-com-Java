import java.util.ArrayList;
import java.util.List;

public class GerenciarConta {

    public List<Conta> contas = new ArrayList<>();

    public static void main(String[] args) {
        //criar um menu, como o da lousa
        //pedir a opcao para o usuario
        //montar switch case
        GerenciarConta gerenciarConta = new GerenciarConta();
        int opcao = 0;
        do {
            //montar o menu
            System.out.println("Menu Principal");
            System.out.println("1. Cadastrar");
            System.out.println("2. Consultar");
            System.out.println("3. Depositar");
            System.out.println("4. Sacar");
            System.out.println("9. SAIR");
            System.out.println("Escolha sua opção: ");
            opcao = Integer.parseInt(gerenciarConta.sc.nextLine());
            switch (opcao){
                case 1:
                    gerenciarConta.execCadastrar();
                    break;
                case 2:
                    gerenciarConta.execConsultar();
                    break;
                case 3:
                    gerenciarConta.execDepositar();
                    break;
                case 4:
                    gerenciarConta.execSacar();
                    break;
                case 9:
                    System.out.println("Fim do programa. FUI");
                    break;
                default:
                    System.out.println("Escolha inválida");
            }
        }while(opcao!=9);
    }


    public void execCadastrarConta(){
        //pedir os dados ao usuario para criar uma conta. No final adicionar ela
        //na lista (contas)
        f(cc.getNumConta()!=null) {
            System.out.println("Conta já cadastrada");
            return;
        }
        System.out.println("Digite o num. da conta");
        cc.setNumConta(sc.nextLine());
        System.out.println("Digite o nome do cliente");
        cc.setNomeCliente(sc.nextLine());
        System.out.println("Digite a agencia da conta");
        cc.setAgencia(sc.nextLine());
        System.out.println("Conta cadastrada com sucesso");
    }

    public void execDepositar(){
        double valor;
        System.out.println("Digite o valor do depósito");
        valor = Double.parseDouble(sc.nextLine());
        cc.depositar(valor);


    }

    public void execSacar(){
        double valor;
        System.out.println("Digite o valor do saque");
        valor = Double.parseDouble(sc.nextLine());
        boolean ok = cc.sacar(valor);
        if(ok){
            System.out.println("Saque efetuado com sucesso");
        }else{
            System.out.println("Saldo insuficiente");
        }


    }

    public void execExibirSaldo(){
        System.out.print("Digite o id da conta: ");
        String id = scanner.nextLine();

        Conta conta = buscarConta(id);

        if (conta != null) {
            System.out.println("Saldo: " + conta.getSaldo());
            return;
        }

        System.out.println("Conta não encontrada");
    }


    public void execMostrarPatrimonio(){
        double patrimonio = 0;

        for (Conta conta : contas) {
            patrimonio += conta.getSaldo();
        }

        System.out.println("Patrimônio do banco: " + patrimonio);
    }


    }
