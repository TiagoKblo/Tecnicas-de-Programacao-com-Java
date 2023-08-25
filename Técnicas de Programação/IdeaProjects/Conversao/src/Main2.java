import javax.swing.*;

public class Main2 {
    public static void main(String[] args) {
        JFrame tela = new JFrame();
        tela.setContentPane(new formValor().getFormPanel());
        tela.setSize(500,500);
        tela.setVisible(true);
        tela.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}