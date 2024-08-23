import javax.swing.*;

public class Principal {

    public static void main (String[] args)
    {
        int result = JOptionPane.showConfirmDialog(
                null,
                "¿Quieres continuar?",
                "Ejemplo de JOptionPane con Botones",
                JOptionPane.YES_NO_CANCEL_OPTION
        );

        if (result == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(null, "Presionaste Sí.");
        } else if (result == JOptionPane.NO_OPTION) {
            JOptionPane.showMessageDialog(null, "Presionaste No.");
        } else if (result == JOptionPane.CANCEL_OPTION) {
            JOptionPane.showMessageDialog(null, "Presionaste Cancelar.");
        } else if (result == JOptionPane.CLOSED_OPTION) {
            JOptionPane.showMessageDialog(null, "Cerraste el cuadro de diálogo.");
        }
    }
}
