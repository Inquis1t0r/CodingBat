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
