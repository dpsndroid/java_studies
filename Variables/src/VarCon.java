public class VarCon {
    public static void main(String[] args) {
        String nomeIncompleto; // declarando a variável
        nomeIncompleto = "Naruto Uzumaki"; // inicializando a variável
        System.out.println(nomeIncompleto); // usando a variável
        String nomeCompleto = "Son Goku"; // declarando e inicializando a variável
        System.out.println(nomeCompleto); // usando a variável
        String filme = "Vingadores"; //%s
        int anoLancamento =2015; //%d
        int duracao = 240;
        float notaCritica = 8.7f;  //%f
        char letraInicial = 'V'; // %c
        boolean foiSucesso = true; // %b

        System.out.println(filme);
        System.out.println(anoLancamento);
        System.out.println(duracao);
        System.out.println(notaCritica);
        System.out.println(letraInicial);
        System.out.println(foiSucesso);
        System.out.println("O filme "+ filme +" lançado em "+ anoLancamento + " durou " + duracao + " minutos." );
        System.out.format("O filme %s lançado em %d tem uma duração de %d minutos.\n", filme, anoLancamento, duracao);  // \n serve para quebra de linha
        String texto = "O filme "+ filme +" lançado em "+ anoLancamento + " durou " + duracao + " minutos.";
        System.out.println(texto);
        String texto2 = String.format("O filme %s lançado em %d tem uma duração de %d minutos.\n", filme, anoLancamento, duracao);
        System.out.println(texto2);

        String canal = "Academia dos Devs ";
        String mensagem = "Se inscreva no canal ";
        String mensagem2 = "Obrigado o/";
        String mensagemFinal = mensagem + canal + mensagem2;
        int metaInscritos = 1000;
        System.out.println(mensagemFinal);
        String mensagemFinal2 = String.format("%s, %s. A meta é de %d inscritos, %s", mensagem, canal, metaInscritos, mensagem2);
        System.out.println(mensagemFinal2);



    }
}
