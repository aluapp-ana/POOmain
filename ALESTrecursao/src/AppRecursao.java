public class AppRecursao {
    /*private static int potencia (int base, int exp){
        if(exp == 0){
            return 1;
        }  if(exp == 1){
            return base;
        }else {
            return base *  potencia (base, exp - 1);
        }
    }

    private static void inverte (int [] a, int ini , int fim){
        if(ini <= fim){
            int temp = a[ini];
            a[ini] = a[fim];
            a[fim] = temp;
            inverte (a , ini+1, fim-1);
        }
    }

    public static soma (int [] a) {
        //return soma(a, 0);// comeca no 0
        return soma(a, a.length-1); // somar de tras para frente e + eficiente
    }

    public static int soma(int [] a, int pos) {
        if (pos == 0) {
            return a[0];
            
        }else {
            return a[pos] + soma(a, pos+1);

        /*if (pos == a.length-1) {
            return a[pos];
            
        }else {
            return a[pos] + soma(a, pos+1);
        }
    }
    */
    public static boolean palindromo(String pal){

        return palindromo(pal, 0, pal.length()-1);
    }
    

    public static boolean palindromo(String pal, int ini, int fim){
        if (ini >= fim) {
            return true;

        } else if (pal.charAt(ini) != pal.charAt(fim)) {
            return false;

        }else {
            return palindromo(pal, ini+1, fim-1);
        }
    }

    /*public static void inverte (int [] a){
        inverte(a, 0, a.length-1);
    }
    public static void  escreveArray(int [] a){
        System.out.println("\n[");
        for (int i : v) System.out.println(i+ " ");
        System.err.println("]");
    }
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        System.out.println("2^5 =" + potencia (2 , 5));
        System.out.println("3^4 =" + potencia (3 , 4));

        int[] v = new int[] {1, 2, 3, 4, 5, 6 };
        escreveArray(v);
        inverte (v);
        System.out.println("Depois de inverter...");
        escreveArray(v);


        int soma = soma(v);
        System.out.println("Soma dos valores");
        */
        System.out.println.palindromo("RenneR");
        System.out.println.palindromo("ReNeR");
        System.out.println.palindromo("renner");
    }