public interface IListaOrdenadaItensUnidos<T extends Comparable<T>> {
    public void incluir(T elemento) throws Exception;
    public void insereInicio(T elemento) throws Exception;
    public void insereFinal(T elemento) throws Exception;
    public T get(int index) throws Exception;
    public int getPosElemento(T elemento) throws Exception;
    public void remover(int index) throws Exception;
    public void limpar();
    int getTamanho();
    public boolean contem(T elemento) throws Exception;
    public void imprimeLista();


}

