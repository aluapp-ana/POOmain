import java.util.Arrays;

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

    public void insereEncima(Carta carta){//"eh o zero"
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
        Carta aux = this.cartas[this.qtdade-1];// para segurar o endereço/referencia e não perder o objeto
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
        return this.cartas[0];
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

    //String = imutavel
    //String x = "ola"
    //String x = new String ("ola")
    //x = x + "mamao" imp
    //String xaux = new String(-----)
    @Override
    public String toString() {
        StringBuffer s = new StringBuffer(); 
        s.append("Deck:\n");
        for(int i=0;i<this.qtdade;i++){
            s.append(this.cartas[i].toString()+"\n");
        }
        return s.toString();
    }
}