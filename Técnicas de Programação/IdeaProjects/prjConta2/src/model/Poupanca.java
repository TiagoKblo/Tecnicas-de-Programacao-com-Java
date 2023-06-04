package model;

public class Poupanca extends Conta {
    protected int diaAniversario;

    public Poupanca(int numero, String nomeCliente, int diaAniversario) {
        super(numero, nomeCliente);
        this.diaAniversario = diaAniversario;
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Dia de Aniversário: " + diaAniversario);
    }
}
