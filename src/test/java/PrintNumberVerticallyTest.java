import org.junit.Test;

public class PrintNumberVerticallyTest {

    @Test
    public void print() {
        new PrintNumberVertically().print(12345);
    }

    @Test
    public void printNegative() {
        new PrintNumberVertically().print(-12345);
    }
}
