import java.security.InvalidParameterException;

public class ListSingleLinked {

  private class Node {
    public int element ;
    public Node next ;
   
    public Node(int e) {
       element = e ;
      next = null ;
    }
  }

  private Node head ;
  private Node tail ;
  private int count ;
  private Node aux = head;
  
  // Construtor
  public ListSingleLinked ( ) {
      head = null ;
      tail = null ;
      count = 0;
  }

  //
  // insere no início da lista
  //
  public void add(int valor) {
    Node novo;
    novo = new Node(valor);

    novo.next = head;
    head = novo;

    if (count == 0)
      tail = novo;
    
    count++;
  }

  public void insereFim(int valor) {
    Node novo;
    novo = new Node(valor);

    if (count == 0)  {
       head = novo;
    } else {
         tail.next = novo;
    }

    tail = novo;
    count++;

  }

  public void show() {
    
    System.out.println("[");
    while (aux != null) {
      System.out.println(aux.element + " ");
      aux = aux.next;
    }
    
    System.out.println("]");
  }


// insere no fim, supondo que n!ao tem tail

  public void insereF(int val) {
    Node novo;
    novo = new Node(val);

    if (count == 0)  {
       head = novo;
    }
    /* uma variavel cominhar no vetor
    node aux = head;

    while (aux.next != null){
    aux= aux.next;
    }
    aux.next = novo;
    */
  }

  public void add(int index , int element ) {
     if (index <0 || index >= count) {
        throw new InvalidParameterException("indice invalido");
     }

     // TODO 
    }

  public int indexOf(int valor) {
     {
        while (aux != null) {
            aux = aux.next;
          }
          return indexOf(element);
    } 
    return -1;
  }

  public int geimport java.security.InvalidParameterException;

  public class ListSingleLinked {
  
    private class Node {
      public int element ;
      public Node next ;
     
      public Node(int e) {
         element = e ;
        next = null ;
      }
    }
  
    private Node head ;
    private Node tail ;
    private int count ;
    
    // Construtor
    public ListSingleLinked ( ) {
        head = null ;
        tail = null ;
        count = 0;
    }
  
    //
    // insere no início da lista
    //
    public void add(int valor) {
      Node novo;
      novo = new Node(valor);
  
      novo.next = head;
      head = novo;
  
      if (count == 0)
        tail = novo;
      
      count++;
    }
  
    public void insereFim(int valor) {
      Node novo;
      novo = new Node(valor);
  
      if (count == 0)  {
         head = novo;
      } else {
           tail.next = novo;
      }
  
      tail = novo;
      count++;
  
    }
  
    public void show() {
      Node aux = head;
      System.out.println("[");
      while (aux != null) {
        System.out.println(aux.element);
        aux = aux.next;
      }
      
      System.out.println("]");
    }
  
  
  // insere no fim, supondo que n!ao tem tail
  
    public void insereF(int val) {
      // TODO
    }
  
    public void add(int index , int element ) {
       if (index <0 || index >= count) {
          throw new InvalidParameterException("indice invalido");
       }
  
       // TODO 
      }
  
    public int indexOf(int valor) { // mostra a posicao em que os elementos estao
      System.out.println("[");
      for ()
      return -1;
    }
  
    public int get(int index) {
       if (index <0 || index >= count) {
           throw new InvalidParameterException("indice invalido");
       }
  
       Node aux = head;
       for (int i = 0; i<index; i++) {
           aux = aux.next;
       }
       return aux.element;
  
  
  
    }
  }t(int index) {
     if (index <0 || index >= count) {
         throw new InvalidParameterException("indice invalido");
     }

     Node aux = head;
     for (int i = 0; i<index; i++) {
         aux = aux.next;
     }
     return aux.element;



  }
}