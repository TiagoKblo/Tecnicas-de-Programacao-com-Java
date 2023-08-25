package model;

public abstract class Conta {
    protected int numero;
    protected  String nomeCliente;
    protected double saldo;

    //método construtor
    public Conta(int numero, String nomeCliente){
        this.numero = numero;
        this.nomeCliente = nomeCliente;
        this.saldo = 0.0;

    }

    public boolean depositar(double valor){
        if(valor > 0){
            saldo += valor;
            return true;
        }
        return false;
    }
    public boolean sacar(double valor){
        if(valor <= saldo){
            saldo -= valor;
            return true;
        }
    return false;
    }
    public void imprimir(){
        System.out.println("Núm. Conta: " + numero);
        System.out.println("Cliente: " + nomeCliente);
        System.out.println("Saldo: " + saldo);
    }
}
