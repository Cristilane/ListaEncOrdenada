
public class ListaEncOrdenadaTest {
    public static void main(String[] args) throws Exception {
        IListaOrdenadaItensUnidos listaEncadeadaOrdenada = new ListaEncadeadaOrdenada();

        listaEncadeadaOrdenada.imprimeLista();

        //Testando quantidade de elementos antes de adicionar
        if (listaEncadeadaOrdenada.getTamanho() > 0) {
            System.out.println("Lista possui: " + listaEncadeadaOrdenada.getTamanho() + " elementos\n");
        } else
            System.out.println("Lista possui: " + listaEncadeadaOrdenada.getTamanho() + " elementos\n");

        listaEncadeadaOrdenada.incluir(3);
        listaEncadeadaOrdenada.imprimeLista();

        listaEncadeadaOrdenada.incluir(1);
        listaEncadeadaOrdenada.imprimeLista();

        listaEncadeadaOrdenada.incluir(4);
        listaEncadeadaOrdenada.imprimeLista();

        listaEncadeadaOrdenada.incluir(7);
        listaEncadeadaOrdenada.imprimeLista();

        //Adicionando entre o elemento 4-7
        listaEncadeadaOrdenada.incluir(6);
        listaEncadeadaOrdenada.imprimeLista();

        //Adicionando no final da lista
        listaEncadeadaOrdenada.incluir(10);
        listaEncadeadaOrdenada.imprimeLista();

        //Adicionando no inicio da lista
        listaEncadeadaOrdenada.incluir(0);
        listaEncadeadaOrdenada.imprimeLista();


        //Verificando se contém
        if (listaEncadeadaOrdenada.Contem(11)) {
            System.out.println("Lista contém este elemento\n");
            ;
        } else {
            System.out.println("Lista não contém este elemento\n");
        }
        /*
        Elemento existente - ok
        listaEncadeadaOrdenada.incluir(1);
        listaEncadeadaOrdenada.imprimeLista();
         */
        //Verficando quantidade de elementos antes de remover
        if (listaEncadeadaOrdenada.getTamanho() > 0) {
            System.out.println("Lista possui: " + listaEncadeadaOrdenada.getTamanho() + " elementos\n");
        } else {
            System.out.println("Lista possui: " + listaEncadeadaOrdenada.getTamanho() + " elementos\n");
        }

        //Remover elemento por posição
        listaEncadeadaOrdenada.remover(6);
        listaEncadeadaOrdenada.imprimeLista();
        //Testando depois da remoção de elemento por posição
        if (listaEncadeadaOrdenada.getTamanho() > 0) {
            System.out.println("Lista possui: " + listaEncadeadaOrdenada.getTamanho() + " elementos\n");
        } else {
            System.out.println("Lista possui: " + listaEncadeadaOrdenada.getTamanho() + " elementos\n");
        }

        //Remover elemento por elemento
        listaEncadeadaOrdenada.removerPorElemento(7);
        listaEncadeadaOrdenada.imprimeLista();
        //Testando depois da remoção de elemento por elemento
        if (listaEncadeadaOrdenada.getTamanho() > 0) {
            System.out.println("Lista possui: " + listaEncadeadaOrdenada.getTamanho() + " elementos\n");
        } else {
            System.out.println("Lista possui" + listaEncadeadaOrdenada.getTamanho() + " elementos\n");
        }

        //Buscando elemento por posição e retornando seu elemento
        if(listaEncadeadaOrdenada.getTamanho()>0) {
            listaEncadeadaOrdenada.get(3);
            System.out.println(" O elemento  da posição 3 é: "+listaEncadeadaOrdenada.get(3)+"\n");
        }else {
            listaEncadeadaOrdenada.get(3);
            System.out.println("Não existe está posição\n");
        }
        //Buscando elemento por elemento e retornando sua posição
        if(listaEncadeadaOrdenada.getTamanho()>0) {
            listaEncadeadaOrdenada.getPosElemento(4);
            System.out.println(" O elemento é 4 está na posição: "+listaEncadeadaOrdenada.getPosElemento(4)+"\n");
        }else {
            listaEncadeadaOrdenada.getPosElemento(4);
            System.out.println("Este elemento não existe\n");
        }
        //limpar lista
        listaEncadeadaOrdenada.limpar();
        listaEncadeadaOrdenada.imprimeLista();


    }


}