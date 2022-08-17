import javax.swing.JOptionPane;
import java.util.Random;

public class Dados {
    public static void main(String[] args) {
        //double dado6Faces = 1 + (int) (Math.random() * 6); 
        //JOptionPane.showMessageDialog(null, dado6Faces);

        Random gerador = new Random();
        String faceString = JOptionPane.showInputDialog(null, "Quantas faces tem o dado?");
        int facedado = Integer.parseInt(faceString);
        int resultado = 1 + gerador.nextInt(facedado);
        JOptionPane.showMessageDialog(null, "Voce tirou " + resultado + " no dado.");
    }
}