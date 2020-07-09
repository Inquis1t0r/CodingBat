public String frontBack(String str) {
  return (str != null && !str.isEmpty() && str.length() != 1) ? (str.charAt(str.length() - 1) + str.substring(1, str.length() - 1) + str.charAt(0)) : str;
}
