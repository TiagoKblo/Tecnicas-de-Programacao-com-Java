import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private int idCliente;
    private String nome;
    private List<Carro> carros;


    //métodos construtores da classe
    public Cliente(int idCliente, String nome){
        this.idCliente = idCliente;
        this.nome =nome;
        this.carros = new ArrayList<>();
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Carro> getCarros() {
        return carros;
    }

    public void setCarros(List<Carro> carros) {
        this.carros = carros;
    }

    //método para adicionar um carro do cliente na lista
    public void adicionarCarro(Carro carro){
        //adiciono o carro na lista de carros
        carros.add(carro);
    }

    @Override
    public String toString() {
        String dados = "Dados do cliente: \n" +
                "Id: " + idCliente + "\n" +
                "Nome: " + nome + "\n" +
                "Lista de Carros cadastrados: \n";

        String str_carros = "";
        for (Carro carro : getCarros()){
            str_carros += carro.toString() + "\n";
        }
        return dados + str_carros;

    }
}