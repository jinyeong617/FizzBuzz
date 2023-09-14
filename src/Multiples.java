public class Multiples {
    public static void main(String[] args) {

        int j = 0;
        for (int i = 1; i < 1000; i++) {

            if ((i % 3 == 0) || (i % 5 == 0)) {
                j = j + 1;
            }


        }
        System.out.println(j);
    }
}
