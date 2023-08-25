package model;

public class Caixa {
    private double saldo;

    public void sacar(double valor){
        if(valor<= saldo){
            saldo-= valor;
        }
    }

    public void  depositar(double valor){
        if(valor >0){
            saldo+= valor;
        }
    }

    public double getSaldo() {
        return saldo;
    }
}
