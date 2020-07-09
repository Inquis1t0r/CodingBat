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
