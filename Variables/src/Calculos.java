import javax.swing.JOptionPane;

public class Calculos {
    public static void main (String[] args) {
        int numeroA = 5;
        int numeroB = 6;
        
        int res = Math.abs(numeroA); // retorna o valor absoluto
        int rex = (int) Math.pow(10, 2); // é 10 elevado a 2, o int em parenteses é para forçar a exibição em inteiro
        int reca = (int) Math.ceil(10.54); // arredonda para cima
        int recu = (int) Math.floor(2.59); // arredonda para baixo
        double valor = Math.min(numeroA, numeroB); // vai exibir o menor
        double valore = Math.max(numeroA, numeroB); // vai exibir o maior


        int resultado = numeroA + numeroB;
        double resultado2 = 7.0 / 3;

        int resto = 11 % 2 ;

        // possui a precedência de sinais padrão nos cálculos

        JOptionPane.showMessageDialog(null, resultado, "Matemática", JOptionPane.INFORMATION_MESSAGE);

        JOptionPane.showMessageDialog(null, resultado2, "Matemática", JOptionPane.INFORMATION_MESSAGE);

        JOptionPane.showMessageDialog(null, resto, "Matemática", JOptionPane.INFORMATION_MESSAGE);

        int contador = 0;
        JOptionPane.showMessageDialog(null, contador, "Matemática", JOptionPane.INFORMATION_MESSAGE);
        contador ++;
        JOptionPane.showMessageDialog(null, contador, "Matemática", JOptionPane.INFORMATION_MESSAGE);
        contador ++;
        JOptionPane.showMessageDialog(null, contador, "Matemática", JOptionPane.INFORMATION_MESSAGE);
        contador += 10;
        JOptionPane.showMessageDialog(null, contador, "Matemática", JOptionPane.INFORMATION_MESSAGE);
        contador *= 10;
        JOptionPane.showMessageDialog(null, contador, "Matemática", JOptionPane.INFORMATION_MESSAGE);
        
        JOptionPane.showMessageDialog(null, ++contador, "Matemática", JOptionPane.INFORMATION_MESSAGE);
        

    }
}