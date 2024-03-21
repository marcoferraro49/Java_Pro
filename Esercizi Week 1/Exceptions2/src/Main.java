public class Main {
    public static void main(String[] args) {

        try {
            checkFunction('2');
        } catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
    }
    public static void checkFunction (char n) {
        if (Character.isDigit(n)){
                System.out.println("Il carattere è un numero");
            } else {
                throw new ArithmeticException("Il carattere non è un numero");
            }
    }
}