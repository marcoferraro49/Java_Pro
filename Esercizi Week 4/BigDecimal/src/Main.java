import java.math.BigDecimal;
import java.math.RoundingMode;

public class Main {
    public static void main(String[] args) {

        BigDecimal big1 = BigDecimal.valueOf(9.45);
        BigDecimal big2 = BigDecimal.valueOf(7.43);

        Operazione operazione = Operazione.DIVISIONE;
        System.out.println("BigDecimal 1 = " + big1);
        System.out.println("BigDecimal 2 = " + big2);
        System.out.println("Operazione : " + operazione);
        System.out.println("Risultato = " + calcola(big1, big2, operazione));


    }
    public static BigDecimal calcola(BigDecimal num1, BigDecimal num2, Operazione operazione){
        BigDecimal result = BigDecimal.ZERO;

        switch (operazione){
            case ADDIZIONE -> {
                result = num1.add(num2);
                break;
            }
            case SOTTRAZIONE -> {
                result = num1.subtract(num2);
                break;
            }
            case MOLTIPLICAZIONE -> {
                result = num1.multiply(num2);
                break;
            }
            case DIVISIONE -> {
                result = num1.divide(num2, RoundingMode.CEILING);
                break;
            }
            case MIN -> {
                result = num1.min(num2);
                break;
            }
            case MAX -> {
                result = num1.max(num2);
                break;
            }
        }
        return result;
    }
}