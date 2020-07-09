        public boolean makes10(int a, int b) {
            return (a == 10 || b == 10 ||a + b == 10);
        }
            
        public String front3(String str) {
                String front;
                if (str.length() >= 3)
                front = str.substring(0, 3);
                else 
                front =  str;
                return String.join("", Collections.nCopies(3, front));
  
            }  
