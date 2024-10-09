public class ProfessorBrigadista extends Professor implements Brigadista{
    public static final int NIVELMAX = 5;
    private int nivelBrigadista;

    public ProfessorBrigadista(String n,double sb,int ch,int nb) {
        super(n,sb,ch);
        this.nivelBrigadista = nb;
    }

    @Override
    public int nivelDeFormacao() { return nivelBrigadista; }

    @Override
    public void incrementaNivelFormacao() { if (nivelBrigadista < NIVELMAX){ nivelBrigadista++; } }
}