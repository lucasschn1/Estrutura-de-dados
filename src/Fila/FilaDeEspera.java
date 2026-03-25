package Fila;

import Lista_Encadeada.Livro;

import java.util.LinkedList;
import java.util.Queue;

public class FilaDeEspera {
    private Queue<String> fila;
    private Livro livro;

    public FilaDeEspera(Livro livro) {
        this.fila = new LinkedList<>();
        this.livro = livro;
    }

    public void entrarNaFila(String nomeUsuario) {
        fila.offer(nomeUsuario);
        System.out.println("- " + nomeUsuario +  " entrou na fila de espera " +
                "para o livro: " + livro.getTitulo());
    }

    public void avisarProximo() {
        if (!fila.isEmpty()) {
            String proximo = fila.poll();
            System.out.println("O livro " + livro.getTitulo() + " está disponível! Notificado: " + proximo);
        } else {
            System.out.println("Não fila de espera para o livro: " + livro.getTitulo());
        }
    }

}
