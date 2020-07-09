        public boolean stringE(String str) {
                int count = 0;
                for(int temp = 0; temp < str.length(); temp++)
                {
                if(str.charAt(temp) == 'e')
                count++;
                }
                return (count >= 1 && count <= 3) ? true : false;
            }
