public class App {
    public static void main(String[] args) {
      System.out.println();
  
      ListSingleLinked lista;
      lista  = new ListSingleLinked();
      lista.show();
      lista.insereFim(10);
      lista.add(5);
      lista.add(7);
      lista.show();
      lista.insereFim(3);
      lista.insereFim(4);
      lista.show();
      lista.add(2, 6);
      lista.add(0, 8);
      lista.show();
      System.out.printf("indexOf(6): %d\n", lista.indexOf(6));
      System.out.printf("indexOf(16): %d\n", lista.indexOf(16));
    }
  }
  