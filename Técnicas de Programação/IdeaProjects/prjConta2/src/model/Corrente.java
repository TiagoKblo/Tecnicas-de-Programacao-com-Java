package model;

public class Corrente extends Conta {
    protected double limite;

    public Corrente(int numero, String nomeCliente, double limite) {
        super(numero, nomeCliente);
        this.limite = limite;
    }

    @Override
    public boolean sacar(double valor) {
        if(valor <=(saldo+limite)){
            saldo -= valor;
            return true;
        }
        return false;
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Limite da conta: " + limite);
    }
}
