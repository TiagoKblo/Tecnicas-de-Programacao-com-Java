import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class formValor {
    private JTextField textField1;
    private JButton button1;
    private JPanel formPanel;

    public JPanel getFormPanel() {
        return formPanel;
    }

    public formValor() {
        button1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int soma = 5;
                int valor = Integer.parseInt(textField1.getText());
                soma += valor;
                JOptionPane.showMessageDialog(null,
                        "REsultado: " + soma,
                        "Titulo",
                        JOptionPane.INFORMATION_MESSAGE);
            }
        });
    }
}