import java.util.*;

public class tcs_String {
        public static boolean pallindrone(String str) {
            for (int i = 0; i < str.length() / 2; i++) {
                if (str.charAt(i) == str.charAt(str.length() - 1 - i)) {
                    return true;

                }
            }
            return false;
        }

        public static void countvowelconsant(String str) {
            int vowels = 0, consonants = 0, whitespace = 0;
            str = str.toLowerCase();
            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowels++;
                } else if (ch == ' ') {
                    whitespace++;
                } else {
                    consonants++;
                }

            }
            System.out.println("vowels are = " + vowels);
            System.out.println("consonents are = " + consonants);
            System.out.println("whitespaces are = " + whitespace);
        }

        public static void asciivalue(char ch) {
            int ascii = ch;
            System.out.println(ascii);
        }

        public static String stringcompress(String str) {
            String newstr = " ";
            for (int i = 0; i < str.length(); i++) {
                Integer count = 1;
                while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                    count++;
                    i++;

                }
                newstr += str.charAt(i);
                if (count > 1) {
                    newstr += count.toString();

                }
            }
            return newstr;
        }

        public static float getshortestpath(String str) {
            int x = 0, y = 0;
            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                if (ch == 'N') {
                    y++;
                } else if (ch == 'S') {
                    y--;
                } else if (ch == 'W') {
                    x--;
                } else {
                    x++;
                }
            }
            int X2 = x * x;
            int Y2 = y * y;
            return (float) Math.sqrt(X2 + Y2);

        }

        public static void removevowels(String str) {
            String newstr = str.toLowerCase();
            for (int i = 0; i < newstr.length(); i++) {
                char ch = newstr.charAt(i);
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    continue;

                }
                System.out.print(ch);
            }
        }

        public static String removecharacter(String str, int n) {
            StringBuffer bf = new StringBuffer();
            for (int i = 0; i < n; i++) {
                int ascii = (int) str.charAt(i);
                if (str.charAt(i) >= 65 && str.charAt(i) <= 90 || str.charAt(i) >= 97 && str.charAt(i) <= 122) {

                    bf.append(str.charAt(i));
                }
            }
            return bf.toString();
        }
    
public static String swap(String s,int i, int j){
    StringBuilder str = new StringBuilder(s);
    str.setCharAt(i, s.charAt(j));
    str.setCharAt(j, s.charAt(i));
    return str.toString();
}
public static String removeBrackets(String str){
    StringBuilder sb = new StringBuilder();
    for(int i=0; i<str.length(); i++){
        char ch = str.charAt(i);
        if (ch!='('&& ch!=')') {
            sb.append(str.charAt(i));
            
        }
    }
    return sb.toString();
}
public static int addnumber(String str){
    String tempsum = "0";
    int sum = 0;
    for(int i= 0; i<str.length(); i++){
        char ch = str.charAt(i);
        if (Character.isDigit(ch)) {
            tempsum+=ch;
            
        }else{
            sum+=Integer.parseInt(tempsum);
            tempsum = "0";
        }
    }
    return  sum+Integer.parseInt(tempsum);
}
public static String Capsendorsi(String str, int size){
    StringBuffer sb = new StringBuffer(str);
    for(int i=0; i<size; i++){
     if (i==0||i==(size-1)) {
        sb.setCharAt(i, Character.toUpperCase((char)(int)str.charAt(i))); 
     }else if(str.charAt(i)==' '){
         sb.setCharAt((i-1), Character.toUpperCase((char)(int)str.charAt(i-1)));
        sb.setCharAt((i+1),Character.toUpperCase((char)(int)str.charAt(i+1)));
     }
    }
    return sb.toString();
}
    public static void main(String[] args) {
   String str = "Nishant Sharma";
   int size= str.length();
    System.out.println(Capsendorsi(str, size));
   //System.out.println(addnumber(str));
   //System.out.println(removeBrackets(str));
//    int i=0;
//    int j = str.length()-1;
//    while (i<=j) {
//     str = swap(str, i, j);
//     i++;
//     j--;
    
//    }
//    System.out.println(str+" ");
  // System.out.println(getshortestpath(str));
    }
}