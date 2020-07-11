package blogzadach5;

public class CustomerArray {
    public static void main(String[] args) {
        int [] array = new int[] {1, 15, 23, 72, -13, 0, 19, 4, 7};
        int max = array[0];
        int min = array[0];
        int sum = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            } else if (array[i] < min) {
                min = array[i];
            }
            sum += array[i];
        }
        System.out.println(min);
        System.out.println(max);
        System.out.println(sum);
        System.out.println(sum / array.length);
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                System.out.println(array[i]);
            }
        }
    }
}
