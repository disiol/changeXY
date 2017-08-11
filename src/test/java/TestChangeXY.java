import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Denis Oleynyk on 12.08.17.
 * mail: deoniisii@gmail.com
 */
public class TestChangeXY {

    @Test

    public void TestChange_codex() {
        assertMethod("codex", "codey");

    }

    @Test

    public void TestChange_xxhixx() {
        assertMethod("xxhixx", "yyhiyy");

    }

    @Test

    public void TestChange_xhixhix() {
        assertMethod("xhixhix", "yhiyhiy");

    }

    @Test

    public void TestChange_hiy() {
        assertMethod("hiy", "hiy");

    }

    @Test

    public void TestChange_h() {
        assertMethod("h", "h");

    }

    @Test

    public void TestChange_x() {
        assertMethod("x", "y");


    }

    @Test

    public void TestChangeX__() {
        assertMethod("", "");

    }

    @Test

    public void TestChange_xxx() {
        assertMethod("xxx", "yyy");

    }

    @Test

    public void TestChange_yyhxyi() {
        assertMethod("yyhxyi", "yyhyyi");

    }

    @Test

    public void TestChange_hihi() {
        assertMethod("hihi", "hihi");
    }



    private static void assertMethod(String input, String expected) {
        String actual = changeXY.changeXY(input);
        assertEquals(expected, actual);

    }

}
