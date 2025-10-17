package lista;

import basicas.Contato;

public class ListaDupla {
    private Celula inicio;
    private Celula fim;
    private int tamanho;

    public ListaDupla() {
        inicio = fim = null;
        tamanho = 0;
    }

    public void adicionar(Contato contato) {
        Celula nova = new Celula(contato);
        if (inicio == null) {
            inicio = fim = nova;
        } else {
            fim.setProximo(nova);
            nova.setAnterior(fim);
            fim = nova;
        }
        tamanho++;
    }

    public void listar() {
        Celula aux = inicio;
        while (aux != null) {
            System.out.println(aux.getContato());
            aux = aux.getProximo();
        }
    }

    public void remover(String nome) {
        Celula atual = inicio;
        while (atual != null) {
            if (atual.getContato().getNome().equalsIgnoreCase(nome)) {
                if (atual == inicio) {
                    inicio = atual.getProximo();
                    if (inicio != null) inicio.setAnterior(null);
                } else if (atual == fim) {
                    fim = atual.getAnterior();
                    fim.setProximo(null);
                } else {
                    atual.getAnterior().setProximo(atual.getProximo());
                    atual.getProximo().setAnterior(atual.getAnterior());
                }
                tamanho--;
                System.out.println("Contato removido: " + nome);
                return;
            }
            atual = atual.getProximo();
        }
        System.out.println("Contato não encontrado.");
    }

    public void removerPosicao(int pos) {
        if (pos < 0 || pos >= tamanho) {
            System.out.println("Posição inválida.");
            return;
        }

        Celula atual = inicio;
        for (int i = 0; i < pos; i++) atual = atual.getProximo();

        if (atual == inicio) inicio = atual.getProximo();
        else if (atual == fim) fim = atual.getAnterior();
        else {
            atual.getAnterior().setProximo(atual.getProximo());
            atual.getProximo().setAnterior(atual.getAnterior());
        }

        tamanho--;
        System.out.println("Contato removido da posição " + pos);
    }

    public Contato pesquisarPorNome(String nome) {
        Celula atual = inicio;
        while (atual != null) {
            if (atual.getContato().getNome().equalsIgnoreCase(nome)) {
                return atual.getContato();
            }
            atual = atual.getProximo();
        }
        return null;
    }
}

