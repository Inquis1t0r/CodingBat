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
