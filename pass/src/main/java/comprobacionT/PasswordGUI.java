package comprobacionT;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PasswordGUI extends JFrame implements ActionListener {

    private JTextField passwordField;
    private JButton submitButton;
    PassComprobation ins;

    public PasswordGUI() {
        super("Password Validation");

        // Crear elementos de la GUI
        passwordField = new JTextField(20);
        submitButton = new JButton("Comprobar");

        // Agregar acción al botón
        submitButton.addActionListener(this);

        // Crear panel y agregar elementos
        JPanel panel = new JPanel();
        panel.add(new JLabel("Password:"));
        panel.add(passwordField);
        panel.add(submitButton);

        // Agregar panel a la ventana
        add(panel);

        // Configurar ventana
        setSize(300, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }



    public void actionPerformed(ActionEvent e) {
        // Obtener contraseña ingresada por usuario
        String password = passwordField.getText();

        ins=new PassComprobation();

        // Validar contraseña

        PassComprobation.NivelSecurity isValid =  ins.comprobacion(password);

        // Mostrar resultado
        if (isValid== PassComprobation.NivelSecurity.DEBIL) {
            JOptionPane.showMessageDialog(this, "El Password es debil!");
        }
       else if (isValid== PassComprobation.NivelSecurity.MEDIA) {
            JOptionPane.showMessageDialog(this, "El Password es media!");
       }

        else {
            JOptionPane.showMessageDialog(this, "El Password es fuerte!");
        }
    }

    public static void main(String[] args) {
        new PasswordGUI();
    }
}