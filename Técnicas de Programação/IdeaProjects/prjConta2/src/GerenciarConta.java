import model.Corrente;

public class GerenciarConta {
    public static void main(String[] args) {
//criar uma conta corrente para José depositar e sacar valores depois apresentar saldo e dado das contas.
        Corrente contaZe = new Corrente(11, "José Silva", 1000);
        boolean deuCerto;

        deuCerto=contaZe.depositar(100);
        if(!deuCerto){
            System.out.println("Valor depositado inválido");
        }
        contaZe.depositar(200);
        contaZe.imprimir();
        deuCerto=contaZe.sacar(150);
        if(deuCerto) {
            System.out.println("Saque Realizado com Sucesso");
        }else{
            System.out.println("Saldo Insuficiente");
        }
        contaZe.imprimir();
    }
}