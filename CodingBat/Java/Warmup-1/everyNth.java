public String everyNth(String str, int n) {

      String solution = "";

        for (int i=0; i<str.length(); i = i + n) {
          solution = solution + str.charAt(i);
        }

      return solution;
}
