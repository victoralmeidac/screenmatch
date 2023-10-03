public class Filme {

    public double somaDasAvaliacoes;
    String nome;
    int anoDeLancamento;
    boolean incluidoNoPlano;
    double avaliacao;
    int totalDeAvaliacoes;
    int duracaoEmMinutos;


    void exibeFichaTecnica(){
        System.out.println(nome);
        System.out.println(anoDeLancamento);
    }

    double pegaMedia() {
        return somaDasAvaliacoes / totalDeAvaliacoes;
    }

    void avalia(double nota) {
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes++;
    }
}
