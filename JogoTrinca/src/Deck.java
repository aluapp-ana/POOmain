public class Deck {
    private Carta[] cartas;
    private int tamanho;
    private int qtdade;

    public Deck(int tamanho){
        cartas = new Carta[tamanho];
        this.tamanho = tamanho;
        this.qtdade = 0;
    }

    public int quantidade(){
        return this.qtdade;
    }

    public void insereEmbaixo(Carta carta){
        if (this.qtdade == tamanho){
            throw new IndexOutOfBoundsException("Deck cheio!");
        }
        this.cartas[this.qtdade] = carta;
        this.qtdade++;
    }

    public void insereEncima(Carta carta){
        if (this.qtdade == tamanho){
            throw new IndexOutOfBoundsException("Deck cheio!");
        }
        for(int i=qtdade;i>0;i--){
            this.cartas[i] = this.cartas[i-1];
        }
        this.cartas[0] = carta;
        this.qtdade++;
    }

    public Carta retiraDebaixo(){
        if (this.qtdade == 0){
            throw new IndexOutOfBoundsException("Deck vazio!");
        }
        Carta aux = this.cartas[this.qtdade-1];
        this.qtdade--;
        return aux;
    }

    public Carta retiraDecima(){
        if (this.qtdade == 0){
            throw new IndexOutOfBoundsException("Deck vazio!");
        }
        Carta aux = this.cartas[0];
        for(int i=0;i<this.qtdade-1;i++){
            this.cartas[i] = this.cartas[i+1];
        }
        this.qtdade--;
        return aux;
    }

    public Carta olhaDeCima(){
        if (this.qtdade == 0){
            throw new IndexOutOfBoundsException("Deck vazio!");
        }
        return this.cartas[this.qtdade-1];
    }

    public Carta olha(int i){
        if (this.qtdade == 0){
            throw new IndexOutOfBoundsException("Deck vazio!");
        }
        if (i<0 || i>=this.qtdade){
            throw new IndexOutOfBoundsException("Indice de carta inválido!");
        }
        return this.cartas[i];
    }

    public Carta retira(int i){
        if (this.qtdade == 0){
            throw new IndexOutOfBoundsException("Deck vazio!");
        }
        if (i<0 || i>=this.qtdade){
            throw new IndexOutOfBoundsException("Indice de carta inválido!");
        }
        Carta aux = this.cartas[i];
        for(int pos=i; pos<this.qtdade-1; pos++){
            this.cartas[pos] = this.cartas[pos+1];
        }
        this.qtdade--;
        return aux;
    }

    public void insere(Carta carta,int pos){
        if (this.qtdade == tamanho){
            throw new IndexOutOfBoundsException("Deck cheio!");
        }
        if (pos<0 || pos>this.qtdade){
            throw new IndexOutOfBoundsException("posicao inválida!");
        }
        for(int i=qtdade;i>pos;i--){
            this.cartas[i] = this.cartas[i-1];
        }
        this.cartas[pos] = carta;
        this.qtdade++;
    }

    public void trocaPos(int p1,int p2){
        if (this.qtdade == 0 ){
            throw new IndexOutOfBoundsException("Deck vazio!");
        }
        if (p1<0 || p1>this.qtdade){
            throw new IndexOutOfBoundsException("posicao inválida!");
        }
        if (p2<0 || p2>this.qtdade){
            throw new IndexOutOfBoundsException("posicao inválida!");
        }

        Carta aux = cartas[p1];
        cartas[p1] = cartas[p2];
        cartas[p2] = aux;
    }

    @Override
    public String toString() {
        StringBuffer s = new StringBuffer();
        for(int i=0;i<this.qtdade;i++){
            s.append("["+(i+1)+"] "+this.cartas[i].toString()+"\n");
        }
        return s.toString();
    }

    
}
