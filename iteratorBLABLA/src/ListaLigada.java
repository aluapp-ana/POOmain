// Lista com iterador
public class ListaLigada<T> implements Lista<T> {
    private class Nodo<E>{
        public E dado;
        public Nodo<E> prox;

        public Nodo(E dado){
            this.dado = dado;
            this.prox = null;
        }
    }

    private Nodo<T> prim;
    private Nodo<T> ult;
    private int cont;

    public ListaLigada(){//O(1)
        prim = null;
        ult = null;
        cont = 0;
    }

    @Override
    public void add(T dado) {//O(1)
        Nodo<T> aux = new Nodo<>(dado);
        if (prim == null){
            prim = aux;
            ult = aux;
        }else{
            ult.prox = aux;
            ult = aux;
        } 
        cont++;
    }

    @Override
    public String toString(){// O(n)
        Nodo<T> aux = prim;
        StringBuffer sb = new StringBuffer();
        while(aux != null){
            sb.append(aux.dado+"\n");
            aux = aux.prox;
        }        
        return sb.toString();
    }

    @Override
    public int size() {//O(1)
        return cont;
    }

    @Override
    public T get(int indice) {//O(n)
        Nodo<T> aux = prim;
        for(int i=0;i<indice;i++){
            aux = aux.prox;
        }
        return aux.dado;
    }

    public T remove (T dado){return null;}


    /* 
    public T remove (T dado){//simplesmente cadeada
        if (prim.dado == dado) {
            //remove do primeiro
        }
        Nodo<T> aux = prim;
        while (aux != null) {
            if (aux.dado = dado) {
                T temp = aux.dado;

            }
        }
    }



    usando iterator avança de posição em posicão O(1), muito mais rapido que arranjo - usar list iterator para insercao e remocao
    Iterator<Pessoa> it =lst.iterator();//metodo iterator ja cria do inicio
    while (it.hasNext()){
        Pessoa aux = it.next()
        if (aux.getNome().equals(busca)){
            Sop("A idadede " +busca + "e: "+aux.getIdade());
            it.remove(); // remove o corrente removendo em O(1) - n pode dar remove().remove()
        }
    }

    se eu n quiser fazer insercao e remocao
    a partir do while

    for (Pessoa p: lst){//for each do java, percorre a lista com iterador
        if(p.getNome()).equals(busca)){
            sop(p);
        }
    }
    */
}
