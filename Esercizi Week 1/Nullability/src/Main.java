public class Main {
    public static void main(String[] args) {

        try {
            noNull(null, null);
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public static void noNull (Integer numeratore, Integer denominatore) throws Exception {
        if (numeratore == null || denominatore == null) {
            throw new Exception("Uno o entrambi i valori sono null");
        } else {
            System.out.println("I due valori sono diversi da null");
        }
    }
}