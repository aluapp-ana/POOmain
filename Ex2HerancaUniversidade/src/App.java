public class App {

    public static void impFuncionario(Funcionario f){
        System.out.println(f.getNome());
        System.out.println(f.calculaSalarioLiquido());
        if (f instanceof Pesquisador) {// se n tivesse isso, poderia pegar dados de tecnico e professor, seria ruim se acontecesse
            System.out.println("É um pesquisador");
            Pesquisador aux = (Pesquisador)f;//casting para nao ter problema,garantido que f é um pesquisador
            System.out.println(aux.getCargaHorariaDePesquisa());

        }
    }
    // olhar alternativa do copstein

    public static void main(String[] args) throws Exception {
        Tecnico tec = new Tecnico("Ze",7000,4);
        Professor prof = new Professor("Primo do Ze",15000,30);
        Pesquisador pesq = new Pesquisador("Amigo do Ze", 15000, 30, 5);
        
        impFuncionario(tec);
        impFuncionario(prof);
        impFuncionario(pesq);


    /* 
        System.out.println();
        System.out.println(tec);
        System.out.println(prof);
        System.out.println(pesq);
        */
    }
}
