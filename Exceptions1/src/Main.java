public class Main {
    public static void main(String[] args) {

        try {
            System.out.println(checkError(31));
        } catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
    }

    public static boolean checkError(int numero){
        if (numero > 0 && numero < 30){
            return true;
        } else {
            throw new ArithmeticException("Il numero non rientra nel range 0-30");
        }
    }
}