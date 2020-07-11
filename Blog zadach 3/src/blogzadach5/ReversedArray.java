package blogzadach5;

public class ReversedArray {
    public static void main (String[] args) throws java.lang.Exception
    {
        int[] list = {0, 1, 5, 18, -3, 19, 22, 52, 38, -5, 2, 90, 14};
        myReverse(list);
        subArray(list, 5 , 7);

    }
    public static int[] myReverse(int [] array) {
        int[] arrayNew = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            arrayNew [i] = array[array.length - 1 - i];
        }
        return arrayNew;
    }
    public static int[] subArray (int [] array, int index, int count) {
        int[] arrayNew = new int[count];
        if (array.length-index >= count) {
            for (int i = 0; i<count; i++) {
                arrayNew [i] = array [index - 1 + i];
            }
        } else {
            int chs = 0;
            for (int i = index-1; i < array.length; i++) {
                arrayNew[chs] = array[i];
                chs++;
            }
            for (int i = chs; i<count; i++) {
                arrayNew [i] = 1;
            }
        }
        return arrayNew;
    }

}
