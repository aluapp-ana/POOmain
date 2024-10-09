public class ProfessorAdministrador extends Professor implements Administrador{
    private String cargo;
    private double adicional;

    public ProfessorAdministrador(String nome, double salarioBase, 
                                  int cargaHorariaSemanal, String cargo,double adicional) {
        super(nome, salarioBase, cargaHorariaSemanal);
        this.cargo = cargo;
        this.adicional = adicional;
    }

    public String getCargo() {
        return cargo;
    }

    public double getAdicional() {
        return adicional;
    }
}
