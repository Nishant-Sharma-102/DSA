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

    public static String swap(String s, int i, int j) {
        StringBuilder str = new StringBuilder(s);
        str.setCharAt(i, s.charAt(j));
        str.setCharAt(j, s.charAt(i));
        return str.toString();
    }

    public static String removeBrackets(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch != '(' && ch != ')') {
                sb.append(str.charAt(i));

            }
        }
        return sb.toString();
    }

    public static int addnumber(String str) {
        String tempsum = "0";
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isDigit(ch)) {
                tempsum += ch;

            } else {
                sum += Integer.parseInt(tempsum);
                tempsum = "0";
            }
        }
        return sum + Integer.parseInt(tempsum);
    }

    public static String Capsendorsi(String str, int size) {
        StringBuffer sb = new StringBuffer(str);
        for (int i = 0; i < size; i++) {
            if (i == 0 || i == (size - 1)) {
                sb.setCharAt(i, Character.toUpperCase((char) (int) str.charAt(i)));
            } else if (str.charAt(i) == ' ') {
                sb.setCharAt((i - 1), Character.toUpperCase((char) (int) str.charAt(i - 1)));
                sb.setCharAt((i + 1), Character.toUpperCase((char) (int) str.charAt(i + 1)));
            }
        }
        return sb.toString();
    }

    public static void frequency(String str) {
        int[] freq = new int[26];
        for (int i = 0; i < str.length(); i++) {
            freq[str.charAt(i) - 'a']++;
        }
        for (int i = 0; i < 26; i++) {
            if (freq[i] != 0)
                System.out.print((char) (i + 'a'));
            System.out.print(freq[i] + " ");

        }
    }

    public static void nonrepeat(String str, int size) {
        int freq[] = new int[200];
        char s[] = str.toCharArray();
        for (int i = 0; i < size; i++) {
            if (str.charAt(i) == ' ')
                continue;

            else {
                freq[(int) str.charAt(i)]++;
            }

        }
        for (int i = 0; i < size; i++) {
            if (freq[(int) str.charAt(i)] == 1 && s[i] != ' ') {
                System.out.print(s[i] + " ");

            }
        }
    }

    public static String sortString(String str1) {
        char[] ch = str1.toCharArray();
        Arrays.toString(ch);
        return new String(ch);
    }

    public static boolean ingram(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;

        }
        str1 = sortString(str1);
        str2 = sortString(str2);
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;

            }
        }
        return true;
    }

    public static void occuring(String str) {
        str = sortString(str);
        int count = 0;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == str.charAt(i + 1)) {
                count++;

            }

        }
        if (count > 1) {
            System.out.println(count);

        }
    }

    // ANOTHER METHOD TO SORT THE STRING
    public static String sortStirngg(String str) {
        char[] st = str.toCharArray();
        for (int i = 0; i < st.length - 1; i++) {
            for (int j = 0; j < st.length - 1 - i; j++) {
                if (st[j] > st[j + 1]) {
                    char temp = st[j];
                    st[j] = st[j + 1];
                    st[j + 1] = temp;

                }

            }

        }
        return new String(st);
    }

    public static void occuringg(String str) {
        int count[] = new int[256];
        int max = 0;
        for (char ch : str.toCharArray()) {
            count[ch]++;

        }
        for (int i = 0; i < 256; i++) {
            if (count[i] > 0) {
                System.out.print((char) i + " ==appears.=" + count[i]);
                System.out.println();

            }
        }

    }

    public static String removeduplicate(String str) {
        String ans = " ";
        for (int i = 0; i < str.length(); i++) {
            int j = 0;
            for (j = 0; j < i; j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    break;

                }
            }
            if (i == j) {
                ans += str.charAt(i);

            }
        }
        return ans;

    }

    public static void printallduplicates(String str) {
        int[] count = new int[256];

        for (char ch : str.toCharArray()) {
            count[ch]++;
        }
        for (int i = 0; i < 256; i++) {
            if (count[i] > 1) {
                System.out.print((char) i + " = rapeat = " + count[i]);
                System.out.println();

            }

        }

    }

    public static String removecharformstrtwo(String str1, String str2) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < str1.length(); i++) {
            int flag = 0;
            for (int j = 0; j < str2.length(); j++) {
                if (str1.charAt(i) == str2.charAt(j)) {
                    flag = 1;
                }
            }
            if (flag != 1)
                sb.append(str1.charAt(i));

        }

        return sb.toString();
    }

    public static String lexicographic(String str){
        StringBuffer ans = new StringBuffer();
        for(int i=0; i<str.length(); i++){
            int ascii =(int)str.charAt(i);
            if (ascii==90) {
                ans.insert(i, (char)(65));
                
            }else if (ascii==122) {
                ans.insert(i, (char)(97));
            }
            else if (ascii>=65 && ascii<90 || ascii>=97 && ascii<122) {
                ans.insert(i,(char)(ascii+1));
                
            }


        }
        return ans.toString();
    }
    public static void main(String[] args) {
       String str = "java";

    System.out.println(lexicographic(str));
        // System.out.println();
        // // printallduplicates(str);
        // System.out.println(removecharformstrtwo(str1, str2));
        // occuringg(str);
        // System.out.println(sortStirngg(str));
        // occuring(str);
        // String str2 = "TEGERNI";
        // System.out.println(ingram(str1, str2));
        // int size= str.length();
        // nonrepeat(str, size);
        // System.out.println(Capsendorsi(str, size));
        // System.out.println(addnumber(str));
        // System.out.println(removeBrackets(str));
        // int i=0;
        // int j = str.length()-1;
        // while (i<=j) {
        // str = swap(str, i, j);
        // i++;
        // j--;

        // }
        // System.out.println(str+" ");
        // System.out.println(getshortestpath(str));
    }
}