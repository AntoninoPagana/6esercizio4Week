public class Main {
    public static void main(String[] args) {
        stampaSomma2Int(5,9);
        stampaCarattere('d');
        stampaSomma2Integer(9,12);
        stampaCharacter('s');

        //Scrivere un un valore primitivo per int, double e char e fare autoboxing
        int primoValore = 5;
        double secondoValore = 3.2;
        char terzoValore = 'c';
        Integer primoValoreInteger = primoValore;
        Double secondoValoreDouble = secondoValore;
        Character terzoValoreCharacter = terzoValore;

        //Scrivere un oggetto per Integer, Double e Character e fare Unboxing
        Integer primoValore2 = 5;
        Double secondoValore2 = 7.3;
        Character terzoValore2 = 'h';
        int primoValore2int = primoValore2;
        double secondoValore2double = secondoValore2;
        char terzoValore2char = terzoValore2;


    }
    //Scrivere una funzione che accetti in input 2 int e ne stampi la somma
    public static void stampaSomma2Int(int val1, int val2){
        int somma = val1 + val2;
        System.out.println("Somma degli int " + val1 + " e " + val2 + " = " + somma);
    }
    //Scrivere una funzione che accetti in input 1 char lo stampi
    public static void stampaCarattere(char carattere){
        System.out.println("Il char che hai scelto e' " + "'" + carattere + "'");
    }
    //Scrivere una funzione che accetti in input 2 Integer e ne stampi la somma
    public static void stampaSomma2Integer(int val1, int val2){
        int somma = val1 + val2;
        System.out.println("Somma degli Integer " + val1 + " e " + val2 + " = " + somma);
    }
    //Scrivere una funzione che accetti in input 1 Character lo stampi
    public static void stampaCharacter(Character carattere){
        System.out.println("Il Character che hai scelto e' " + "'" + carattere + "'");
    }
}
