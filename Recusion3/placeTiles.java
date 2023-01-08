package Recusion3;

public class placeTiles {

    public static int PlaceTiels(int n, int m) {
        if (n < m) {
            return 1;
        }

        if (n == m) {
            return 2;
        }
        // vertically

        int vertPlacement = PlaceTiels(n - m, m);

        // horizental

        int horPlacement = PlaceTiels(n - 1, m);
        return vertPlacement + horPlacement;
    }

    public static void main(String[] args) {
        int n = 4, m = 2;
        int placement = PlaceTiels(n, m);
        System.out.println(placement);
    }
}
