package lista;

import basicas.Contato;

public class Celula {
    private Contato contato;
    private Celula anterior;
    private Celula proximo;

    public Celula(Contato contato) {
        this.contato = contato;
        this.anterior = null;
        this.proximo = null;
    }

    public Contato getContato() {
        return contato;
    }

    public Celula getAnterior() {
        return anterior;
    }

    public Celula getProximo() {
        return proximo;
    }

    public void setAnterior(Celula anterior) {
        this.anterior = anterior;
    }

    public void setProximo(Celula proximo) {
        this.proximo = proximo;
    }
}



