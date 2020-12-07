
public  interface IListaOrdenadaItensUnidos<T extends Comparable> {

    public  void incluir(T elemento) throws Exception;

    //public void insereInicio(T elemento) throws Exception;

    //public void insereFinal(T elemento) throws Exception;

    public  T get(int index) throws Exception;

    public  int getPosElemento(T elemento) throws Exception;

    public void remover(int index) throws Exception;

    public void removerPorElemento(T elemento) throws Exception;

    public  void limpar() throws Exception;

    public  int getTamanho();

    public  boolean Contem(T elemento) throws Exception;

    public void imprimeLista();
}
