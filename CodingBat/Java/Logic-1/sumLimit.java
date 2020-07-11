public int sumLimit(int a, int b) {
    String sum = Integer.toString(a + b);
    if(String.valueOf(sum).length() == String.valueOf(a).length())
    return a + b;
    else
    return a;
}
