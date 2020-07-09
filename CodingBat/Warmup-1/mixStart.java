public boolean mixStart(String str) {
    if (str.length() < 3)
    return false;

    String mix = str.substring(1, 3);

    return(mix.equals("ix"));
}
