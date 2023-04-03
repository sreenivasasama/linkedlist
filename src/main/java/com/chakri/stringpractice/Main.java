package com.chakri.stringpractice;

public class Main {

    public  static void main(String[] args) {
        String stringToReverse = "SAME";
        System.out.println(reverseString(stringToReverse));
        System.out.println(reverseString2(stringToReverse));
        String stringToRotate = "SAMETHING";
        System.out.println(rotateString(stringToRotate, 3));
        System.out.println(leftrotateString(stringToRotate, 3));
        System.out.println(rightrotateString(stringToRotate, 3));
        System.out.println(isAnagram(stringToRotate, "THINGAMES"));

    }

    private static String leftrotateString(String stringToRotate, int i) {
        return stringToRotate.substring(i) + stringToRotate.substring(0,i);
    }

    private static String rightrotateString(String stringToRotate, int i) {
        return stringToRotate.substring(stringToRotate.length() -i) + stringToRotate.substring(0,stringToRotate.length()-i);
    }
    private static boolean isAnagram(String stringToRotate, String thingsame) {
        String doubleString = stringToRotate + stringToRotate;
        if(doubleString.contains(thingsame))
            return true;
        else
            return false;
    }

    private static String rotateString(String stringToRotate, int d) {
        char[] charArrayToRotate = stringToRotate.toCharArray();
        char[] a = new char[charArrayToRotate.length];
        for(int i=0; i< charArrayToRotate.length;i++){
            a[(i + d) % stringToRotate.length()] = charArrayToRotate[i];
        }
        return new String(a);
    }

    private static String reverseString2(String stringToReverse) {
        int j= 0;
        char[] charArray = stringToReverse.toCharArray();
        char temp;
        for(int i = charArray.length-1; i>=0; i--, j++){
            if(j<=i) {
                temp = charArray[i];
                charArray[i] = charArray[j];
                charArray[j] = temp;
            }
        }
        return new String(charArray);
    }

    private static String reverseString(String stringToReverse) {
        StringBuilder sb = new StringBuilder();
        for(int i = stringToReverse.length()-1 ; i>=0 ; i--){
            sb.append(stringToReverse.charAt(i));

        }

        return sb.toString();
    }
}
