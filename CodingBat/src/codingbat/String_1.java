package codingbat;

/**
 *
 * @author inquis1t0r
 */
public class String_1 {

    public String helloName(String name) {
        return ("Hello " + name + "!");
        
    }

        public String makeOutWord(String out, String word) {
            String mySubstring1 = out.substring(0, 2);
            String mySubstring2 = out.substring(2, 4);
            return mySubstring1 + word + mySubstring2;
        }

    public String firstHalf(String str) {
        int i = str.length() / 2;
        String mySubstring = str.substring(0, i);

        return mySubstring;
    }

}
