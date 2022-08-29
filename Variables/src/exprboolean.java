import javax.swing.JOptionPane;

public class exprboolean {
    public static void main(String[] args) throws Exception{
        int idade = 2;
        boolean resultado = idade >= 18;
        JOptionPane.showMessageDialog(null, resultado); 
        
        int episodiosAssist = 320;
        int totEspisodios = 970;
        boolean terminou = episodiosAssist == totEspisodios;
        JOptionPane.showMessageDialog(null, terminou);
        /*
            && - operador and
            || - operador or
            !  - not - negação
         */
        String usuario = "academia dos devs";
        String senha = "40028922";
        String usuarioDigitado = "joão";
        String senhaDigitada = "1234";
        boolean loginCorreto = usuario == usuarioDigitado && senha == senhaDigitada;
        System.out.println(loginCorreto);
    }
}
