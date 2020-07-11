public int caughtSpeeding(int speed, boolean isBirthday) {
    if(speed <= 60 || speed <= 65 && isBirthday == true)
      return 0;
    else if(speed >= 61 && speed <= 80 || speed >= 66 && speed <= 85 && isBirthday == true)
      return 1;
    else
     return 2;
}
