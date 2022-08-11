import java.util.Scanner;

import javax.swing.JOptionPane;

public class ReadKeyb {
    public static void main (String args[]) {
        int numero;
        // Scanner -> classe
        Scanner leitor = new Scanner(System.in);  //informa que vai puxar do sistema, no caso o teclado
        System.out.println("Digite um número: ");
        numero = leitor.nextInt(); //nextInt() é uma função de Scanner
        System.out.println("Número é " + numero);

        float nume;
        Scanner leit = new Scanner(System.in);
        System.out.println("Digite outro número: ");
        nume = leit.nextFloat(); 
        System.out.println("O outro número é " + nume);
        
        String jogo;
        Scanner leito = new Scanner(System.in);
        System.out.println("Digite o nome do jogo: ");
        jogo = leito.next(); // vai pegar apenas a primeira palavra digitada
        System.out.println("O nome do jogo é " + jogo);

        String juego;
        Scanner bode = new Scanner(System.in);
        bode.useDelimiter("[\r\n]+"); // avisa que deve pegar o texto até essas condições aparecerem
        System.out.println("Digite o nome completo do jogo: ");
        juego = bode.next(); // vai pegar até onde tem quebra de linha
        System.out.println("O nome completo é " + juego);

        /*
            Conversão de um tipo para outro:
            para float: Float.parsefloat(string)
            para int: Integer.parseInt(string)
            para double: Double.parseDouble(string)
        */
        
        String game;
        Scanner boto = new Scanner(System.in);
        System.out.println("Digite o nome completo do jogo: ");
        game = boto.nextLine(); // vai pegar até detectar a outra linha
        System.out.println("O nome completo é " + game); 
  

    
}
