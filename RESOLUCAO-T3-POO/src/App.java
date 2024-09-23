import java.time.LocalDate;

public class App {

    public static void impPassagem(Passagem p){
        System.out.println("Data: "+p.getData());
        System.out.println("Nro voo: "+p.getNroVoo());
        System.out.println("Custo final: "+p.custoFinal());
        
        if (p instanceof Economica) {
            Economica aux = (Economica)p;
            System.out.println(aux.custoFinal());
    
        
        //System.out.println(p.custoFinal());}
        }
    }


    public static void main(String[] args){
        LocalDate data = LocalDate.of(2024,8,30);

        System.out.println("----------------");

        Economica pe = new Economica(data,1024,500);
        System.out.println(pe);

         
        Executiva ex = new Executiva(LocalDate.now(), 1024, 500, 1);
        System.out.println(ex);

        PrimeiraClasse pc = new PrimeiraClasse(LocalDate.now().plusDays(5), 1024, 500, 2);
        System.out.println(pc);

        System.out.println("----------------");

        
    }
}

