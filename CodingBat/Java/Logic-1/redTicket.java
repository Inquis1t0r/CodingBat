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
