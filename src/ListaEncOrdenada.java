
public class ListaEncOrdenada  {
    public static void main(String[] args) throws Exception {
        IListaOrdenadaItensUnidos listaEncadeadaOrdenada = new ListaEncadeadaOrdenada();

        listaEncadeadaOrdenada.imprimeLista();

        listaEncadeadaOrdenada.insereInicio(4);
        listaEncadeadaOrdenada.imprimeLista();

        listaEncadeadaOrdenada.insereInicio(2);
        listaEncadeadaOrdenada.imprimeLista();

        listaEncadeadaOrdenada.insereFinal(6);
        listaEncadeadaOrdenada.imprimeLista();

        listaEncadeadaOrdenada.insereFinal(8);
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
/*
        listaEncadeadaOrdenada.limpar();
        listaEncadeadaOrdenada.imprimeLista();
*/
        listaEncadeadaOrdenada.incluir(0);
        listaEncadeadaOrdenada.imprimeLista();

        if(listaEncadeadaOrdenada.Contem(11)) {
            System.out.println("Lista contém este elemento");;
        }else
            System.out.println("Lista não contém este elemento");

        listaEncadeadaOrdenada.remover(9);
        listaEncadeadaOrdenada.imprimeLista();


         /*
        //Incluir na lista toda
        listaEncadeadaOrdenada.incluir(0);
        listaEncadeadaOrdenada.imprimeLista();
*/


        //listaEncadeadaOrdenada.limpar();
        //listaEncadeadaOrdenada.imprimeLista();
/*
        listaEncadeadaOrdenada.insereInicio(4);
        listaEncadeadaOrdenada.imprimeLista();
*/
/*
        listaEncadeadaOrdenada.insereFinal(0);
        listaEncadeadaOrdenada.imprimeLista();
*/

    }



}
