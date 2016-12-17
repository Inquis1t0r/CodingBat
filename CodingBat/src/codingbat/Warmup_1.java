/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
        } else {
            str = "not " + str;
        }
        return str;
    }
  

  
  
    
    
}
