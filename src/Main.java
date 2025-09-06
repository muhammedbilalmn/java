import java.time.LocalDate;

public class  Main {
    public static void main(String[] args) {

        System.out.printf("Hello and welcome!");

//        Premitive datatypes
        int num = 100;
        byte numbyte = -128;
        short numshort = 3_598;
        float number = 3.14f;
        double numdouble = 3.144333;
        char str = 'a';
        long lg = 12_34_5509l;
        boolean bl = false;
        System.out.println(num);
        System.out.println(numbyte);
        System.out.println(numshort);
        System.out.println(number);
        System.out.println(numdouble);
        System.out.println(str);
        System.out.println(bl);

//        Reference datatypes or non-primitive datatypes

        String strg = new String("Bilal");
        System.out.println(strg);
        System.out.println(strg.toUpperCase());
        LocalDate now = LocalDate.now();
        System.out.println(now);
        System.out.println(now.getDayOfWeek());

    }
}