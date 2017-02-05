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
    } 
    else 
      {
        return false;
      }
  } 
  else
  {
      if (n <= 1 || n >= 10) {
        return true;
      } 
      else 
        {
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

  if(n%11 == 0 || n%11 == 1)
  return true;
  else
  return false;
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
  if (a + b == c || a + c == b || b+c == a)
  return true;
  else 
  return false;
}






}
