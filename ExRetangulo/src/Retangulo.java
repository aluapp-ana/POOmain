public class Retangulo {
    private int lado1;
    private int lado2;

    public Retangulo (int lado1, int lado2){
        if (lado1 < 0)
            throw new IllegalArgumentException (s:"Lado1 deve ser maior que 0")
        this.lado1 = lado1;
        this.lado2 = lado2;
    }
    
    public Retangulo (int lado1, int lado2){
        // lados iguais >>>>> quadrado
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    public Retangulo (int lado1, int lado2){
        this.lado1 = lado1;
        this.lado2 = lado2; 
    }

    public int getLado1() {return lado1;}
    public int getLado2() {return lado2;}
}
