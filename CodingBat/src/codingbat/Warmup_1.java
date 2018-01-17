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
            return (a == 10 || b == 10 ||a + b == 10);
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
        
        public boolean nearHundred(int n) {
            return ((Math.abs(100 - n) <= 10) || (Math.abs(200 - n) <= 10));
        }
        
        public boolean hasTeen(int a, int b, int c) {
            return (a>=13 && a<=19) || (b>=13 && b<=19) || (c>=13 && c<=19);
        }
        
        public String delDel(String str) {
            if((str.length() >= 4 && str.substring(1,4).equals("del")))
            return str.substring(0, 1) + str.substring(4);
            else
            return str;
        }
        
        public String startOz(String str) {
            String result = "";

            if (str.length() >= 1 && str.charAt(0)=='o') 
            {
              result = result + str.charAt(0);
            }

            if (str.length() >= 2 && str.charAt(1)=='z') 
            {
              result = result + str.charAt(1);
            }
            return result;

         }
        
        public boolean mixStart(String str) {
            if (str.length() < 3)
            return false;

            String mix = str.substring(1, 3);

            return(mix.equals("ix"));
        }
        
        public int diff21(int n) {
            int abs;

            if(n <= 21)
            abs = Math.abs(21 - n);
            else
            abs = 2 * Math.abs(21 - n);
            return abs;
        }
        
        public String endUp(String str) {
            String str1;

            if(str.length() < 3)
            return str.toUpperCase();
            else
            str1 = str.substring(0,(str.length() - 3)) + str.substring(str.length() - 3).toUpperCase();
            return str1;
        }
    
        public String backAround(String str) {
            
           String back = str.substring(str.length() - 1);
           return back + str + back;
        }
    
        public int close10(int a, int b) {
            
            int aAbs = Math.abs(a - 10);
            int bAbs = Math.abs(b - 10);

             if (aAbs < bAbs) {
                return a;
              }
              else if (aAbs > bAbs)
              return b;
              else 
              return 0;
         }


        public String everyNth(String str, int n) {

              String solution = "";

                for (int i=0; i<str.length(); i = i + n) {
                  solution = solution + str.charAt(i);
                }

              return solution;
        }


      

 
   
}



