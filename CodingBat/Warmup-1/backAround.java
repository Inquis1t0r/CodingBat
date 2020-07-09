public String backAround(String str) {

   String back = str.substring(str.length() - 1);
   return back + str + back;
}
