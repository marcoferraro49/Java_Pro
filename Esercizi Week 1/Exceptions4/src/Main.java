public class Main {
    public static void main(String[] args) {

        int [] num = new int []{1, 2, 3};
        try {
            System.out.println(checkError(num));
        } catch (Exception e){
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Blocco di codice eseguito");
        }
    }

    public static int checkError (int [] arr) throws Exception {
        try {
            return arr[2]/0;
        } catch (ArithmeticException e) {
            throw new ArithmeticException("Errore: Divisione per zero");
        } catch (ArrayIndexOutOfBoundsException e){
            throw new Exception("Indice fuori dall'array");
        }
    }
}