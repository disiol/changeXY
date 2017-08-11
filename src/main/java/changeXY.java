import java.util.Arrays;

/**
 * Created by Denis Oleynyk on 10.08.17.
 * mail: deoniisii@gmail.com
 */
public class changeXY {






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
