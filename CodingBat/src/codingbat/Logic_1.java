package codingbat;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author inquis1t0r
 */
public class Logic_1 {
    


    public boolean in1To10(int n, boolean outsideMode) {
      if (outsideMode == false){
        if (n >= 1 && n <= 10) {
          return true;
        } else {
            return false;
          }
      } else{
          if (n <= 1 || n >= 10) {
            return true;
          } else{
              return false;
            }
        }
    }

    public String alarmClock(int day, boolean vacation) {
      if (vacation) 
      {
        if(day > 0 && day != 6)
          return "10:00";
        else
          return "off";
      } 
      else if (day > 0 && day != 6)
          return "7:00";
        else
          return "10:00";
    }

    public boolean specialEleven(int n) {
     return (n%11 == 0 || n%11 == 1) ? true : false; 
    }

    public boolean cigarParty(int cigars, boolean isWeekend) {
        if (isWeekend == true && cigars >= 40)
        return true;
      if (!isWeekend && cigars >=40 && cigars <= 60)
        return true;
      else
        return false;
    }

    public int redTicket(int a, int b, int c) {
      int result;

      if(a == b && a == c && b == c && a == 2)
      result = 10;
      else if(a == b && a == c && b == c)
      result = 5;
      else if(a != b && a != c)
      result = 1;
      else
      result = 0;

      return result;  
    }

    public boolean twoAsOne(int a, int b, int c) {
      return (a + b == c || a + c == b || b+c == a) ? true : false;
    }

    public boolean love6(int a, int b) {

      return(a == 6 || b == 6 || a + b == 6 || Math.abs(a - b) == 6 || Math.abs(b - a) == 6)? true : false;
    }
    
    public int sortaSum(int a, int b) {
      if((a + b) >= 10 && (a + b) <= 19)
      return 20;
      else
      return a + b;
  }

    public int teenSum(int a, int b) {

       if(a >= 13 && a <= 19 || b >= 13 && b <= 19)
       return 19;
       else
       return (a + b);
    }
    
    public boolean more20(int n) {
        return  (n%20 == 1 || n%20 == 2) ? true : false;
   }
    
    public boolean squirrelPlay(int temp, boolean isSummer) {
  
        if(temp >= 60 && temp <= 90 && isSummer == false )
        return true;
        else if (temp >= 60 && temp <=100 && isSummer == true)
        return true;
        else 
        return false;
    }
    
    public int caughtSpeeding(int speed, boolean isBirthday) {
        if(speed <= 60 || speed <= 65 && isBirthday == true)
          return 0;
        else if(speed >= 61 && speed <= 80 || speed >= 66 && speed <= 85 && isBirthday == true)
          return 1;
        else
         return 2;
    }
    
    public boolean old35(int n) {
        if(n%3 == 0 && n%5 != 0|| n%3 != 0 && n%5 == 0)
        return true;
        else
        return false;
    }
    
    public int teaParty(int tea, int candy) {
        if(tea < 5 || candy < 5)
        return 0;
        else if (tea >= 5  && tea < 2*candy && candy < 2*tea|| candy >= 5 && candy < 2*tea && tea < 2*candy)   //TODO: make this @#%$ shorter
        return 1;
        else if (tea >= 2*candy || candy >= 2*tea)
        return 2;
        else
        return 3;
    }
    
    public int sumLimit(int a, int b) {
        String sum = Integer.toString(a + b);
        if(String.valueOf(sum).length() == String.valueOf(a).length())
        return a + b;
        else
        return a;
    }
    
    public boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
        if(isAsleep || isMorning && !isMom)
        return false;
        else 
        return true;
    }
    
    public boolean less20(int n) {
      return ( (n%20) == 19 || (n%20) == 18 ) ? true : false; 
    }
    
    

}
