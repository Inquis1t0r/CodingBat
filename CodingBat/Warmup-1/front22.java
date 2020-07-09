        public String front22(String str) {
            if (str.length() >= 2) {
                String myString = str.substring(0, 2);
                return myString + str + myString;
            } else {
                String myString = str.substring(0, 0);
                return str + str + str;
            }

        }
