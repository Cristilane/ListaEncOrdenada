import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class ListaEncadeadaOrdenada <T extends Comparable<T>> implements IListaOrdenadaItensUnidos<T> {
    private No<T> inicio;
    private No<T> fim;
    int qtd;

    public ListaEncadeadaOrdenada() {
        this.inicio = null;
        this.fim = null;
        this.qtd=0;
    }

    public boolean isVazia() {
        if (inicio == null) {
            return true;
        }
        return false;
    }

   @Override
    public void insereInicio(T elemento) throws Exception {
        No<T> novoNo = new No<T>(elemento, null);
       for (int i = 0; i <qtd ; i++) {
           if (inicio.dado.equals(elemento)){
               throw new Exception("ESTE ELEMENTO JÁ CONTÉM NA LISTA");
           }
       }
        if (inicio == null) {
            inicio = novoNo;
        } else {
            novoNo.setProx(inicio);
            inicio = novoNo;
        }
        qtd++;
    }
    public No<T> getCauda(){
        No<T> aux = inicio;
        if (aux == null) {
            return null;
        }
        while (aux.getProx() != null) {
            aux = aux.getProx();
        }
        return aux;

    }
    @Override
    public void insereFinal(T elemento) throws Exception{

        No<T> novoNo = new No<T>(elemento, null);
        for (int i = 0; i <qtd ; i++) {
            if (inicio.dado.equals(elemento)){
                throw new Exception("ESTE ELEMENTO JÁ CONTÉM NA LISTA");
            }
        }
        if (inicio == null) {
            inicio = novoNo;
        } else {
            getCauda().setProx(novoNo);
        }
        qtd++;
    }
    public void inserePosicao(T elemento, int posicao) throws Exception {
        for (int i = 0; i <qtd ; i++) {
            if (inicio.dado.equals(elemento)){
                throw new Exception("ESTE ELEMENTO JÁ CONTÉM NA LISTA");
            }
        }
        //Verifica se a posição é válida
        if (posicao == 0) {
            insereInicio(elemento);
            return;
        } else if (posicao == qtd) {
            insereFinal(elemento);
            return;
        } else if (posicao < 0 || posicao > qtd) {
            System.out.println("Posição inválida " + posicao + " para inserção.");
            return;
        }
        //Inserir no meio da lista
        No<T> novoNo = new No<T>(elemento, null);

        No<T> noAnteriorInsercao = inicio;
        for (int i = 0; i < posicao - 1; i++) {
            noAnteriorInsercao = noAnteriorInsercao.getProx();
        }

        No<T> noPosteriorInsercao = noAnteriorInsercao.getProx();
        noAnteriorInsercao.setProx(novoNo);
        novoNo.setProx(noPosteriorInsercao);

        qtd++;
    }
        @Override
    public  void incluir(T elemento) throws Exception {
            for (int i = 0; i <qtd ; i++) {
                if (inicio.dado.equals(elemento)){
                    throw new Exception("ESTE ELEMENTO JÁ CONTÉM NA LISTA");
                }
            }
            No novo = new No(elemento);

            if (inicio == null || inicio.dado.compareTo(elemento) > 0) {
                    //novo vai apontar para a lista
                    novo.prox = inicio;
                    //lista vai ser o novo
                    inicio = novo;
                    this.qtd++;

                } else {
                    //se a lista não for vazia ou, se o primeiro elemento for maior que o novo então
                    //tem que percorer a lista procurando um lugar para o novo item se encaixar de forma ordenada
                    //cria o Nó auxiliar sempre que for pecorrer a lista para não perder o valor da lista verdadeira
                    No aux = inicio;
                    //enquanto aux.proximo for diferente de null e o novo (string que vai ser inserida)
                    //for maior que o aux.proximo.dado
                    while (aux.prox != null && (elemento).compareTo((T) aux.prox.dado) > 0) {
                        //aux avança para o proximo
                        aux = aux.prox;
                    }
                    //agora, o novo.prox aponta para aux.prox e o aux.prox é um novo
                    novo.prox = aux.prox;
                    aux.prox = novo;
                    this.qtd++;
                }


        }
    @Override
    public T get(int index) throws Exception {
        No<T> novo = PegarNo(index);
        if (novo != null) {
            return novo.getDado();
        }
        throw new Exception("Posição solicitada não existe na lista");
    }

    @Override
    public int getPosElemento(T elemento) throws Exception {
        No<T> novo;
        novo = inicio;
        int i = 0;
        while (novo != null) {
            if(novo.dado.equals(elemento)){
                return i;
            }else{
                novo = novo.prox;
                i++;
            }
        }
        throw new Exception("Posição solicitada não existe na lista");
    }

    @Override
    public void remover(int index) throws Exception {
        //remover No pela posição e do tipo objetivo T
        if(index<0||index>=qtd) {
            throw new Exception("Posição inexistente");
        }
        No<T> noAnteriorRemocao= inicio;

        //nó anterior ao que será removido
        for (int i = 0; i < index-1; i++) {
            noAnteriorRemocao=noAnteriorRemocao.getProx();
        }
        No<T> noRemovido = noAnteriorRemocao.getProx();
        //nó no inicio
        if(index==0){
            noRemovido=inicio;
            inicio=noRemovido.getProx();
        }else {
            noAnteriorRemocao.setProx(noRemovido.getProx());
            noRemovido.setProx(null);
        }
        qtd--;
    }

    @Override
    public void removerPorElemento(T elemento) throws Exception {
//remover
        No<T> novo = inicio;
        if(novo.getDado().equals(elemento)){
            inicio = novo.getProx();
            novo.setProx(null);
        } else {
            while(novo.getProx() != null){
                if(novo.getProx().getDado().equals(elemento)){
                    break;
                }
                novo = novo.getProx();
            }
            No aux = novo.getProx();
            novo.setProx(aux.getProx());
            aux.setProx(null);
        }
    }

    @Override
    public void limpar() {
        if(inicio==null){
             System.out.println("Lista Vazia");
        }
        else {
            this.inicio = null;
            this.qtd=0;
        }
    }

    @Override
    public int getTamanho() {
        return qtd;
    }
    private No<T> PegarNo(int posicao) throws  Exception{
        if (posicao >= getTamanho()) {
            throw new Exception("Posição solicitada não existe na lista");
        }
        No<T> auxPegaNo = null;
        for (int i = 0; i <= posicao; i++) {
            if (i == 0) {
                auxPegaNo = this.inicio;
            } else {
                auxPegaNo = auxPegaNo.getProx();
            }
        }
        return auxPegaNo;
    }
    @Override
    public boolean Contem(T elemento) throws Exception {

        for (int i = 0; i < getTamanho(); i++) {
            No<T> Atual = PegarNo(i);
            if (Atual.getDado() != null && Atual.getDado().equals(elemento)) {
                return true;
            }
        }
        return false;
    }


    public void imprimeLista() {
        //Realiza validações
        if(isVazia()) {
            System.out.println("Lista Vazia. Não há elementos para impressão");
            return;
        }
        No<T> auxiliar = inicio;
        while(auxiliar != null) {
            System.out.print(" - " + auxiliar.getDado());
            auxiliar = auxiliar.getProx();
        }
        System.out.println();

    }

}
