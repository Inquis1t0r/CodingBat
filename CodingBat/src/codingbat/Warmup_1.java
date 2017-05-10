package codingbat;

import java.util.*;


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
        
        public boolean posNeg(int a, int b, boolean negative) {

            if(a < 0 && b > 0 && negative == false)
            return true;
            else if (a > 0 && b < 0 && negative == false)
            return true;
            else if (a < 0 && b < 0 && negative == true)
            return true;
            else
            return false;
            }
        
            public boolean makes10(int a, int b) {
                if(a == 10 || b == 10 ||a + b == 10)
                return true;
                else
                return false;
            }
            
        public String front3(String str) {
                String front;
                if (str.length() >= 3)
                front = str.substring(0, 3);
                else 
                front =  str;
                return String.join("", Collections.nCopies(3, front));
  
            }        
        public boolean stringE(String str) {
                int count = 0;
                for(int temp = 0; temp < str.length(); temp++)
                {
                if(str.charAt(temp) == 'e')
                count++;
                }
                return (count >= 1 && count <= 3) ? true : false;
            }
        
        public boolean startHi(String str) {
            
            String subString;

             if(str.length() < 2)
             return false;
             else
             subString = str.substring(0, 2);
             return (subString.equals("hi")); 
            }
        
        public boolean in1020(int a, int b) {
  
            return ((a >= 10 && a <= 20) || (b >= 10 && b <= 20));
        }
        
        public boolean or35(int n) {
            return (n % 3 == 0) || (n % 5 == 0);
        }
        
        public boolean icyHot(int temp1, int temp2) {
            return ((temp1 < 0 && temp2 > 100) || (temp1 > 100 && temp2 < 0));
        }
        
        public boolean lastDigit(int a, int b) {
            return(a % 10 == b % 10);
        }        
        //TODO rework ^

 
   
}



