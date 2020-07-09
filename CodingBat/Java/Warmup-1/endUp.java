public String endUp(String str) {
    String str1;

    if(str.length() < 3)
    return str.toUpperCase();
    else
    str1 = str.substring(0,(str.length() - 3)) + str.substring(str.length() - 3).toUpperCase();
    return str1;
}
