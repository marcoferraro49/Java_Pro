public class Main {
    public static void main(String[] args) {

        try {
            System.out.println(checkDivBy0(8, 0));
        } catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
    }

    public static int checkDivBy0 (int num1, int num2){
        if (num2 != 0){
            return num1/num2;
        } else {
            throw new ArithmeticException("Errore: divisione per zero");
        }
    }
}