import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Date relogio = new Date();
        System.out.println("Hora do sistema �: " + relogio.toString());
        System.out.println("Idioma do sistema �: " + System.getProperty("user.language"));
        System.out.println("Vers�o do sistema �: " + System.getProperty("os.version"));
        System.out.println("Resolu��o da tela �: " + java.awt.Toolkit.getDefaultToolkit().getScreenSize());
    }
}