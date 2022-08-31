public class Condicao1 {
    public static void main(String[] args) {
        boolean estaChovendo = false;
        boolean temGuardachuva = false;
        if (estaChovendo == true && temGuardachuva == true) {
            System.out.println("Boa, não está molhando");
        } else if (estaChovendo == true){
            System.out.println("Você pode dançar na chuva");
        } else {
            System.out.println("Não está chovendo, mentira!!!");
        }
        String video = "batman";
        String categoria = (video == "batman")? "anime": "serie";
        System.out.println(categoria);
    }
}