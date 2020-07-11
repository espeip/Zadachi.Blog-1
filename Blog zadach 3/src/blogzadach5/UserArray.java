package blogzadach5;

public class UserArray {
    public static void main(String[] args) {
        int [] list = new int[] {5, 18, 0, 17, 4, 1};
        addStart(list, 8);
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i]);
        }
    }
    public static void add(int [] array) {
        int[] arrayNew = new int[array.length+1];
        for (int i = 0; i < array.length; i++) {
            arrayNew[i] = array[i];
        }
        array = new int[array.length];
        for (int i = 0; i < array.length-1; i++) {
            array[i] = arrayNew[i];
        }
    }
    public static void addStart(int[] array, int value) {
        int[] arrayNew = new int[array.length+1];
        for (int i = 0; i < array.length; i++) {
            arrayNew[i] = array[i];
        }
        array = new int[array.length];
        array[0] = value;
        for (int i = 1; i < array.length; i++) {
            array[i] = arrayNew[i];
        }
    }
}
