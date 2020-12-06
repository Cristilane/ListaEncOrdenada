public class No<T> {
    public T dado;
    public No prox;


    public class ListaEncadeadaOrdenada <T> {
        private No<T> inicio;
    }

    public No(T dado, No prox) {
        this.dado = dado;
        this.prox = null;
    }


    public No(T dado) {
        this.dado = dado;
    }

    public T getDado() {
        return dado;
    }

    public void setDado(T dado) {
        this.dado = dado;
    }

    public No getProx() {
        return prox;
    }

    public void setProx(No prox) {
        this.prox = prox;
    }
}
