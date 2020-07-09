        public boolean startHi(String str) {
            
            String subString;

             if(str.length() < 2)
             return false;
             else
             subString = str.substring(0, 2);
             return (subString.equals("hi")); 
            }
