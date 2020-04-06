public class ArrayIntro {

    public static void main(String[] args){

        int value = 5;
        int[] values = new int[10];

        values[0] = 9;
        values[1] = 21;
        values[2] = 32;
        values[3] = 46;
        values[4] = 54;

        System.out.println(values[0]);
        System.out.println(values[1]);
        System.out.println(values[2]);
        System.out.println(values[3]);
        System.out.println(values[4]);
        System.out.println(values[5]);
        System.out.println(values[6]);
        System.out.println(values[7]);
        System.out.println(values[8]);
        System.out.println(values[9]);

        int[] numbers = {3, 7, 8, 87, 23, 9};
        System.out.println(numbers[2]);

        System.out.println(numbers.length);


    }
}
