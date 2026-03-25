package Pilha;

import Lista_Encadeada.Livro;

import java.util.Stack;

public class HistoricoDeNavegacao {
    private Stack<Livro> historico;

    public HistoricoDeNavegacao() {
        this.historico = new Stack<>();
    }

    public void registrarAcesso(Livro livro) {
        historico.push(livro);
        System.out.println("Você acessou o livro " + livro.getTitulo() + "\n");
    }

    public void mostrarHistorico() {
        System.out.println("Seu histórico de navegação: ");
        if (historico.isEmpty()) {
            System.out.println("Nenhum livro acessado ainda.");
        }

        for (int i = historico.size() - 1; i >= 0; i--) {
            Livro l = historico.get(i);
            System.out.println("Título do livro: " + l.getTitulo());
            System.out.println("Autor: " + l.getAutor());
            System.out.println("Ano: " + l.getAno() + "\n");
        }


    }
}
