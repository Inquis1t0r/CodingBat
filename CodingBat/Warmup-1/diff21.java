public int diff21(int n) {
    int abs;

    if(n <= 21)
    abs = Math.abs(21 - n);
    else
    abs = 2 * Math.abs(21 - n);
    return abs;
}
