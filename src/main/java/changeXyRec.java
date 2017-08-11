/**
 * Created by Denis Oleynyk on 10.08.17.
 * mail: deoniisii@gmail.com
 */
public class changeXyRec {


    public static String changeXY(String str) {
        String part = "";

       if (str.length() > 1) {
            part = changeXY(str.substring(1));
        }
        if (str.length() == 0) {
            return str;
        }

        char ch = str.charAt(0);
        char newCh = (ch == 'x' ? 'y' : ch);
        return newCh + part;

    }

}
