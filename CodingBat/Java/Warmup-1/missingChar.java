public String missingChar(String str, int n) {

      String foo = str.substring(0, n);
      String bar = str.substring(n+1, str.length());

      return foo + bar;
}
