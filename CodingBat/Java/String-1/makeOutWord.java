public String makeOutWord(String out, String word) {
    String mySubstring1 = out.substring(0, 2);
    String mySubstring2 = out.substring(2, 4);
    return mySubstring1 + word + mySubstring2;
}
