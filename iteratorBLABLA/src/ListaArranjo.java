public class ListaArranjo<T> implements Lista<T>{
    public static final int TMAX = 100;
    private T[] base;
    private int proxLivre;

    public ListaArranjo(){//O
        base = (T[])(new Object[TMAX]);
        proxLivre = 0;
    }

    @Override
    public void add(T dado) {//
        base[proxLivre] = dado;
        proxLivre++;
    }

    @Override
    public int size() {//O(n)
        return proxLivre;
    }

    @Override
    public T get(int i) {//
        return base[i];
    }

    //remocao com lista ligada
    public T remove(T dado){//O(n)
        if (proxLivre == 0)return null; 
        for (int i=0; i<proxLivre; i++){
            if (base[i] == dado) {
                T aux = base[i];
                for (int j=i; j<proxLivre-1; j++){
                    base[j] = base[j+1];
                }
                proxLivre--;
                return aux;
            }
        }
        return null;
    }

    @Override
    public String toString() {//O(n)
        StringBuffer sb = new StringBuffer();
        for(int i=0;i<proxLivre;i++){
            sb.append(base[i]+"\n");
        }
        return sb.toString();
    }
}

