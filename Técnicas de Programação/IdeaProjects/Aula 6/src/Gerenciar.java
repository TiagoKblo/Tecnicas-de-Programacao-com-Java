public class Gerenciar {
    public static void main(String[] args) {
        //Cadastrar 1 cliente com dois carros
        //Depois vou cadastrar mais 1 cliente com 1 carro
        Cliente cliente1 = new Cliente(1, "Joãozinho");
        Cliente cliente2 = new Cliente(2, "Mariazinha");
        Carro carro1 = new Carro(1,"Fiat", "Argo", 2022, 55000);
        Carro carro2 = new Carro(2, "Nissan", "Frontier", 2015, 85000);
        Carro carro3 = new Carro(3, "Citroen", "C3 Bolinha", 2013, 35000);
        //Joãozinho é dono do carro1 e do carro2
        cliente1.adicionarCarro(carro1);
        cliente1.adicionarCarro(carro2);
        //Mariazinha é dona do C3
        cliente2.adicionarCarro(carro3);
        System.out.println(cliente1);

    }
}