import java.util.Arrays;

/**
 * Created by Denis Oleynyk on 10.08.17.
 * mail: deoniisii@gmail.com
 */
public class changeXY {

    public static void main(String[] args) {

        assertMethod("codex", "codey");
        assertMethod("xxhixx", "yyhiyy");
        assertMethod("xhixhix", "yhiyhiy");
        assertMethod("hiy", "hiy");
        assertMethod("h", "h");
        assertMethod("x", "y");
        assertMethod("", "");
        assertMethod("xxx", "yyy");
        assertMethod("yyhxyi", "yyhyyi");
        assertMethod("hihi", "hihi");

    }

    protected static void assertMethod(String input, String expected) {
        String actual = changeXY(input);
        String status = actual.equals(expected) ? "OK" :
                "FALL " + " expected: '" + expected + "'  but was: '" + actual +"'";
        System.out.println(status);
    }


    public static String changeXY(String str) {

        char[] chars = str.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == 'x'){
                chars[i] ='y';
            }else{
                // do nothing
            }

        }
        return new String(chars);
    }

}
