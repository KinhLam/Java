package C6_Java_B2;

import java.util.Arrays;

public class Strings {

        public static String repeat(char c, int count){
            char[] arr = new char[count];
            Arrays.fill(arr,c);
            return new String(arr);
        }

}