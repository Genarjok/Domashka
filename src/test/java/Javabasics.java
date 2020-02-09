import org.junit.jupiter.api.Test;

public class Javabasics {
    @Test
    public void javabasics() {
        sumTwodigits(10, 15);

        sumTwodigits(10,15);

        sumTwodigits("30", "45");
    }

    private void sumTwodigits(int a, int b) {
        int c = a + b;
        System.out.println("Sum is:" +c);
    }
    private void sumTwodigits(String a, String b) {
        int c = Integer.parseInt(a);
        int d = Integer.parseInt(b);

        sumTwodigits(c,d);
    }
}