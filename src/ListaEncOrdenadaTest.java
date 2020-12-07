
public class ListaEncOrdenadaTest {
    public static void main(String[] args) throws Exception {
        IListaOrdenadaItensUnidos listaEncadeadaOrdenada = new ListaEncadeadaOrdenada();

        listaEncadeadaOrdenada.imprimeLista();

        listaEncadeadaOrdenada.incluir(3);
        listaEncadeadaOrdenada.imprimeLista();

        listaEncadeadaOrdenada.incluir(1);
        listaEncadeadaOrdenada.imprimeLista();

        listaEncadeadaOrdenada.incluir(7);
        listaEncadeadaOrdenada.imprimeLista();


        listaEncadeadaOrdenada.incluir(9);
        listaEncadeadaOrdenada.imprimeLista();

        listaEncadeadaOrdenada.incluir(10);
        listaEncadeadaOrdenada.imprimeLista();

        listaEncadeadaOrdenada.incluir(0);
        listaEncadeadaOrdenada.imprimeLista();

        if(listaEncadeadaOrdenada.Contem(11)) {
            System.out.println("Lista contém este elemento");;
        }else {
            System.out.println("Lista não contém este elemento");
        }
        listaEncadeadaOrdenada.incluir(1);
        listaEncadeadaOrdenada.imprimeLista();


    }

}
