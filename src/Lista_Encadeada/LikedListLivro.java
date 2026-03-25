package Lista_Encadeada;

public class LikedListLivro {
    private Node head;

    public void adicionarLivro(String titulo, String autor, int ano) {
        Livro livro = new Livro(titulo, autor, ano);
        Node novoNode = new Node(livro);

        if (head == null) {
            head = novoNode;
        } else {
            Node atual = head;

            while (atual.proximo != null) {
                atual = atual.proximo;
            }

            atual.proximo = novoNode;
        }
    }

    public void listarLivros() {
        Node atual = head;

        while (atual != null) {
            System.out.println(
                    "Título: " + atual.livro.titulo +
                    ", Autor: " + atual.livro.autor +
                    ", Ano: " + atual.livro.ano
            );

            atual = atual.proximo;
        }
    }

    public Livro buscarLivro(String tituloBuscado) {
        Node atual = head;

        while (atual != null) {
            if (atual.livro.getTitulo().equals(tituloBuscado)) {
                return atual.livro;
            } else
               atual = atual.proximo;
        }
        System.out.println("Livro: " + tituloBuscado + ". não encontrado");
        return null;
    }
}
