public class Ventilador {
    String marca;
    String cor;
    int velocidade;
    boolean ligado;
    void status() {
        System.out.println("Marca: " + this.marca);
        System.out.println("Cor: " + this.cor);
        System.out.println("Velocidade: " + this.velocidade);
        System.out.println("Est� ligado? " + this.ligado);
    }

    void ligar(){
        if (this.ligado == true){
            System.out.println("ERRO! O ventilador j� est� ligado");
        } else {
            System.out.println("O ventilador est� ligado");
        }

    }
    void desligar(){
        this.ligado = false;

    }
    void velocidade(){
        this.velocidade = 1;

    }
}
