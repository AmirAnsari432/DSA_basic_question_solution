package Recusion3;

public class callGuest {

    public static int CallGuests(int n) {

        if (n <= 1) {
            return 1;
        }

        // single
        int way1 = CallGuests(n - 1);
        // pair
        int way2 = (n - 1) * CallGuests(n - 2);
        return way1 + way2;
    }

    public static void main(String[] args) {
        int n = 10;
        System.out.println(CallGuests(n));

    }
}
