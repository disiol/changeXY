import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Denis Oleynyk on 12.08.17.
 * mail: deoniisii@gmail.com
 */
public class TestChangeXY {

    @Test

    public void TestChangeXY1() {
        assertMethod("codex", "codey");

    }

    @Test

    public void TestChangeXY2() {
        assertMethod("xxhixx", "yyhiyy");

    }

    @Test

    public void TestChangeXY3() {
        assertMethod("xhixhix", "yhiyhiy");

    }

    @Test

    public void TestChangeXY4() {
        assertMethod("hiy", "hiy");

    }

    @Test

    public void TestChangeXY5() {
        assertMethod("h", "h");

    }

    @Test

    public void TestChangeXY6() {
        assertMethod("x", "y");


    }

    @Test

    public void TestChangeXY7() {
        assertMethod("", "");

    }

    @Test

    public void TestChangeXY8() {
        assertMethod("xxx", "yyy");

    }

    @Test

    public void TestChangeXY9() {
        assertMethod("yyhxyi", "yyhyyi");

    }

    @Test

    public void TestChangeXY10() {
        assertMethod("hihi", "hihi");
    }



    private static void assertMethod(String input, String expected) {
        String actual = changeXY.changeXY(input);
        assertEquals(expected, actual);

    }

}
