package codingbat;

/**
 *
 * @author inquis1t0r
 */
public class Warmup_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here 
    }
   
    public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        if (aSmile && bSmile || !aSmile && !bSmile) {
            return true;
        } else {
            return false;
        }
    }

    public boolean sleepIn(boolean weekday, boolean vacation) {
        if (weekday == false || vacation == true) {
            return true;
        } else {
            return false;
        }
    }

    public int sumDouble(int a, int b) {
        int sum = a + b;
        if (a != b) {
            return sum;
        } else {
            return (sum * 2);
        }
    }

    public String notString(String str) {
        if (str.length() >= 3 && str.substring(0, 3).equals("not")) {
            return str;
            }
        else       
        return "not " + str;
       
    }
  
    public int intMax(int a, int b, int c) {
      int max=0;
      if ( a > b && a > c)
      max = a;

      else if ( b > c && b > a)
      max = b;

      else 
      max = c;

      return max;

    }
    
    public boolean parrotTrouble(boolean talking, int hour) {
      if ( talking == true && hour< 7 ||talking == true && hour > 20)
        return true;
      else
        return false;
    }

    
        public String front22(String str) {
            if (str.length() >= 2) {
                String myString = str.substring(0, 2);
                return myString + str + myString;
            } else {
                String myString = str.substring(0, 0);
                return str + str + str;
            }

        }
   
}



