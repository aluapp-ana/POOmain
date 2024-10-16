public class App {
    public static void main(String[] args) throws Exception {
        //Lista<Pessoa> lst = new ListaArranjo<>();
        Lista<Pessoa> lst = new ListaLigada<>();


        for(int i=0;i<20;i++){
            String nome = "Nome"+i;
            int idade = i+18;
            lst.add(new Pessoa(nome,idade));
        }

        System.out.println(lst);

        String busca = "Nome11";
        
        for(int i=0;i<lst.size();i++){//O(n)
            if (lst.get(i).getNome().equals(busca)){
                System.out.println("A idade de "+busca+" e: "+lst.get(i).getIdade());
                lst.remove(lst.get(i));
            }
        }        
    }
}
