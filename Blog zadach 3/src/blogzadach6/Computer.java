package blogzadach6;

public class Computer {
    private int number;

    public Computer() {
    }

    public Computer(int number) {
        this.number = number;
    }

    public static void main(String[] args) {
        Computer[] comp = new Computer[5];
        for (int i = 0; i < comp.length; i++) {
            comp[i] = new Computer(i);
        }

    }
}
