public class Main {
    public static void main(String[] args) {

        int x = 1;
        double y = 2;
        char z = 'c';

        Integer i = x;
        Double doubled = y;
        Character c = z;

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