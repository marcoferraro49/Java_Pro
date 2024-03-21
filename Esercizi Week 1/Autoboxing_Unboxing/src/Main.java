public class Main {
    public static void main(String[] args) {

        int x = 1;
        double y = 2.1;
        char z = 'c';

        //Esempi di autoboxing
        Integer i = x;
        Double doubled = y;
        Character c = z;

        //Esempi di unboxing
        int var1 = i;
        double var2 = doubled;
        char var3 = c;

        System.out.println(sum(x, 6));
        System.out.println(sum1(i, 3));
        System.out.println(aChar(z));
        System.out.println(aChar1(c));
    }

    public static int sum (int x, int y){
        return x+y;
    }
    public static char aChar (char x){
        return x;
    }
    public static Integer sum1 (Integer x, Integer y){
        return x+y;
    }
    public static Character aChar1 (Character x){
        return x;
    }

}