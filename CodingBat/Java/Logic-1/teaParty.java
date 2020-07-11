public int teaParty(int tea, int candy) {
    if(tea < 5 || candy < 5)
    return 0;
    else if (tea >= 5  && tea < 2*candy && candy < 2*tea|| candy >= 5 && candy < 2*tea && tea < 2*candy)   //TODO: make this @#%$ shorter
    return 1;
    else if (tea >= 2*candy || candy >= 2*tea)
    return 2;
    else
    return 3;
}
