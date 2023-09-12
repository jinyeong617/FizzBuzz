public class Multiples {
    public static void main(String[] args) {

        int i = 1;
        int j = 0;
        while (i < 1000);{

            boolean divisibleBy3 = i % 3 == 0;
            boolean divisibleBy5 = i % 5 == 0;

            if (divisibleBy3 && divisibleBy5) {
                j = j + 1;
                i = i + 1;

            } else if (divisibleBy3) {
                j = j + 1;
                i = i + 1;

            } else if (divisibleBy5) {
                j = j + 1;
                i = i + 1;

            } else {
                i = i + 1;

            }

            System.out.println(j);


        }
    }
}
