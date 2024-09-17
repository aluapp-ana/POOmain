class CarroFerroviario{
    private int id;
    private int capCarga;

    public CarroFerroviario(int id, int capCarga) {
        this.id = id;
        this.capCarga = capCarga;
    }

    public int getId() {
        return id;
    }

    public int getCapCarga() {
        return capCarga;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName()+": Id=" + getId() + ", CapCarga=" + getCapCarga();
    }
}