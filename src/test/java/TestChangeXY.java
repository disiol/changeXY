import org.junit.Test;

/**
 * Created by Denis Oleynyk on 12.08.17.
 * mail: deoniisii@gmail.com
 */
public class TestChangeXY {

    @Test

    public void TestChangeXY1(){


    }

    protected static void assertMethod(String input, String expected) {
        String actual = new changeXY(input);
        String status = actual.equals(expected) ? "OK" :
                "FALL " + " expected: '" + expected + "'  but was: '" + actual +"'";
        System.out.println(status);
    }

}
