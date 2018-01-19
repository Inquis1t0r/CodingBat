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
public class Logic_2 {
    
        public int luckySum(int a, int b, int c) {
              int answer = 0;

              if (a != 13 && b != 13 && c != 13)
              answer = a + b + c;
              else if (a == 13)
              answer =  0;
              else if (a != 13 && b == 13 && (c != 13 || c == 13))
              answer =  a;
              else if (a != 13 && b != 13 && c == 13)
              answer =  a + b;

              return answer;
        }

    
}
