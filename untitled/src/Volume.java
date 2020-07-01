public class Volume {
    public static void main(String[] args) {
        double R = 12;
        double h = 4;

        double V = Math.PI * Math.pow(R, 2) * h; // Объем цилиндра
        double S = 2 * Math.PI * R * h + Math.PI * Math.pow(R, 2) * 2;
        System.out.println(V);
        System.out.println(S);
    }
}
