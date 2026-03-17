public class Main {
    public static void main(String[] args) {

        LikedListLivro biblioteca = new LikedListLivro();

        biblioteca.adicionarLivro("Dom Casmurro", "Machado de Assis", 1889);
        biblioteca.adicionarLivro("Duna", "Frank Herbert", 1965);
        biblioteca.adicionarLivro("O Problema dos Três Corpos", " Liu Cixin", 2008);

        biblioteca.listarLivros();
    }
}
