public class Vagao extends CarroFerroviario{
    private boolean freio;

    public Vagao(int id, int capCarga, boolean freio) {
        super(id, capCarga);
        this.freio = freio;
    }

    public boolean isFreio() {
        return freio;
    }

    @Override
    public String toString() {
        return super.toString()+", freio=" + freio;
    }

    
    
}
