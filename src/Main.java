import Fila.FilaDeEspera;
import Lista_Encadeada.LikedListLivro;
import Lista_Encadeada.Livro;
import Pilha.HistoricoDeNavegacao;

public class Main {
    public static void main(String[] args) {
        // LISTA ENCADEADA (BIBLIOTECA)
        LikedListLivro biblioteca = new LikedListLivro();

        biblioteca.adicionarLivro("Dom Casmurro", "Machado de Assis", 1889);
        biblioteca.adicionarLivro("Duna", "Frank Herbert", 1965);
        biblioteca.adicionarLivro("O Problema dos Três Corpos", " Liu Cixin", 2008);

        biblioteca.listarLivros();

        //PILHAS - (HISTORICO DE NAVEGAÇÃO)
        Livro livroEncontrado1 = biblioteca.buscarLivro("Dom Casmurro");
        Livro livroEncontrado2 = biblioteca.buscarLivro("Duna");


        System.out.println("\n-- HISTORICO DE NAVEGAÇÃO --");
        HistoricoDeNavegacao historico = new HistoricoDeNavegacao();

        if (livroEncontrado1 != null) {
            historico.registrarAcesso(livroEncontrado1);
        }
        if (livroEncontrado2 != null) {
            historico.registrarAcesso(livroEncontrado2);
        }

        historico.mostrarHistorico();


        // FILA - (FILA DE ESPERA)
        if (livroEncontrado2 != null) {
            FilaDeEspera filaDeEspera = new FilaDeEspera(livroEncontrado2);

            filaDeEspera.entrarNaFila("Lucas Schneider");
            filaDeEspera.entrarNaFila("Maria Eduarda");

            System.out.println("\n>> O livro foi devolvido! Atualizando a fila...");
            filaDeEspera.avisarProximo();

            System.out.println(">> O livro foi devolvido novamente! Atualizando a fila...");
            filaDeEspera.avisarProximo();

        }

    }
}
