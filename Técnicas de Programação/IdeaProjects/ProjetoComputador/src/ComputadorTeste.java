public class ComputadorTeste {
    public static void main(String[] args) {
        Computador computador1 = new Computador();
        computador1.setMarca("hp");
        computador1.setModelo("Novo");
        computador1.setCor("Prata");
        computador1.setNumeroSerie(123);
        computador1.setPreco(5000.0);
        //computador1.imprimir();
        computador1.calcularValor();
        //computador1.imprimir();

        Computador computador2 = new Computador();
        computador2.setMarca("ibm");
        computador2.setModelo("ZS");
        computador2.setNumeroSerie(345);
        computador2.setCor("Preto");
        computador2.setPreco(7000.0);
        computador2.imprimir();
        computador2.calcularValor();
        computador2.imprimir();
        boolean ok = computador2.alterarValor(6000.0);
        if(ok){
            System.out.println("Valor alterado com sucesso");
        }else{
            System.out.println("Valor inválido");
        }
        computador2.imprimir();

    }
}