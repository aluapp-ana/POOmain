public class Locomotiva extends CarroFerroviario{
    private int nroMaxVagoes;

    public Locomotiva (int id, int capCarga, int nroMaxVagoes){
        super(id, capCarga);
        this.nroMaxVagoes = nroMaxVagoes;
    }

    public int getNroMaxVagoes() { return nroMaxVagoes;}

    public String toString(){
        return super.toString()+", NroMaxVagoes: " +getNroMaxVagoes();
    }

}
