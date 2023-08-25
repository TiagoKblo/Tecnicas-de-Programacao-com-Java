public class Main {
    public static void main(String[] args) {

        Ventilador v1 = new Ventilador();
        v1.marca = "Arno";
        v1.cor = "Branco";
        v1.velocidade = 3;
        v1.ligado = false;


        v1.desligar();
        v1.velocidade();
        v1.status();

        Ventilador v2 = new Ventilador();
        v2.marca = "Arno";
        v2.cor = "Branco";
        v2.velocidade = 1;
        v2.ligado = false;

        v2.status();
        v2.ligar();
        v2.desligar();
        v2.velocidade();
    }
}