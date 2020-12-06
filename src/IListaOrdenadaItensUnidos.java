
public abstract class IListaOrdenadaItensUnidos<T extends Comparable> {
    public abstract void incluir(T elemento) throws Exception;

    public abstract T get(int index) throws Exception;

    public abstract int getPosElemento(T elemento) throws Exception;

    public abstract void remover(int index) throws Exception;

    public abstract void removerPorElemento(T elemento) throws Exception;

    public abstract void limpar() throws Exception;

    public abstract int getTamanho();

    public abstract boolean Contem(T elemento);
}
