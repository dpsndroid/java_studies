public class App {
    public static void main(String[] args) throws Exception {
        // Variáveis do tipo inteiro
        byte numeroPequeno = 125; // até 128 ou -128
        short numeroShort = 32767; // até 32767
        int numeroMaior = -2147483648; // até -2147483648 e positivo
        long numeroEnorme = 922337203685477000l; // valor máximo, acrescentar l para explicar ao java que é do tipo long
        
        // Variáveis do tipo float
        float peso = 78.7f;
        double pi = 3.1498763967965;

        // Variáveis do tipo caractere
        char letra = 'Z'; // só aceitou aspas simples

        // Variável do tipo booleano
        boolean estouComFome = false;

        // Variáveis do tipo string
        String nome = "Daniel Portella"; // Tem que ser aspas duplas, String é maiúsculo porque no java string é classe




        System.out.println(numeroPequeno);
        System.out.println(numeroShort);
        System.out.println(numeroMaior);
        System.out.println(numeroEnorme);
        System.out.println(peso);
        System.out.println(pi);
        System.out.println(letra);
        System.out.println(estouComFome);
        System.out.println(nome);
    }
}
