import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Date relogio = new Date();
        System.out.println("Hora do sistema é: " + relogio.toString());
        System.out.println("Idioma do sistema é: " + System.getProperty("user.language"));
        System.out.println("Versão do sistema é: " + System.getProperty("os.version"));
        System.out.println("Resolução da tela é: " + java.awt.Toolkit.getDefaultToolkit().getScreenSize());
    }
}