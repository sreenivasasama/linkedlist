package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {

//        reverseANumber(34567);
//        reverseAString("CHAKRI");
//        int[] prices = new int[]{4,7,2,8,4,7,1,9,2,5};
//        int maxProfit = bullAndSellAStock(prices);
//
//        System.out.println("max profit is " + maxProfit);
//            int[] arrayWithDuplicates = new int[]{2,3,3,4,5,6,6,7,8,9,9};
//            System.out.println("Array with duplicates removed and shifted left" + removeDuplicates(arrayWithDuplicates));
//        int[] stockPrices ;
//        stockPrices = new int[]{7, 1, 5, 3, 6, 4};
//        System.out.println("Stock prices max profit   ==> " +  getMaxPrice(stockPrices)) ;

        System.out.println("First occurrence of not repeating char at " +firstUniqChar("loveleetcode") );
//        reverseAString2(new char[]{'R','I','S','H','I'});

        System.out.println(strStr("sadbutsad","sad"));
        String s = " ss";
        s.trim();
        char[] ch = Integer.toString(2043).toCharArray();
        int[] newGuess = new int[ch.length];
        for (int i = 0; i < ch.length; i++)
        {
            newGuess[i] = ch[i] - '0';
            System.out.println("printing the converted int " + ch[i]+ "  " + newGuess[i]);
        }
    }

    private static int strStr(String haystack, String needle) {

        int j = needle.length();
        String sub = "";
        for(int i = 0; i < haystack.length() - j + 1; i++) {
            sub = haystack.substring(i, i+j);
            System.out.println("i=" + i + " j=" + j);
            System.out.println("sub " + sub);
            if (sub.equals(needle))
                return i;
        }

        return -1;

    }

    private static void reverseAString2(char[] s) {

            int j = 0;
            char temp;
            for(int i = s.length - 1; i >= 0 ; i--) {
                if(j<=i) {
                    System.out.println("s[i]" + s[i]);
                    System.out.println("s[j]" + s[j]);
                    temp = s[i];
                    s[i] = s[j];
                    s[j] = temp;
                    j++;
                }
            }
            System.out.println(s);
    }

    public static int firstUniqChar(String s) {
        Map<Character, Integer> countMap = new LinkedHashMap<>();
        int count;
        for(int i = 0; i< s.length(); i++) {
            System.out.println("String char " + s.charAt(i));
            if(countMap.get(s.charAt(i)) == null) {
                countMap.put(s.charAt(i) , 1) ;
                System.out.println("count map " + countMap.toString());
            } else {
                count = countMap.get(s.charAt(i)) + 1;
                countMap.put(s.charAt(i) , count);
                System.out.println("count map2 " + countMap.toString());
            }
        }

        for(int i = 0; i < s.length(); i++) {
            if(countMap.get(s.charAt(i)) == 1 ) {
                return i;
            }

        }
        return -1;
    }

    private static int getMaxPrice(int[] stockPrices) {
        int peak = stockPrices[0];
        int valley = stockPrices[0];
        int maxProfit  = 0;
        int i = 0;
        while(i < stockPrices.length -1 ) {
            System.out.println(i);
            while((i<stockPrices.length - 1) && stockPrices[i] >= stockPrices[i+1])
                i++;
            valley = stockPrices[i];
            while((i<stockPrices.length-1) && (stockPrices[i] <= stockPrices[i+1]))
                i++;
            peak = stockPrices[i];
            maxProfit += peak - valley;
        }
        return maxProfit;
    }

    private static int removeDuplicates(int[] arrayWithDuplicates) {

        int count = 0;
        for(int i = 0; i<arrayWithDuplicates.length; i++) {
            if(i < arrayWithDuplicates.length - 1 && arrayWithDuplicates[i] == arrayWithDuplicates[i+1]) {
                continue;
            }
            arrayWithDuplicates[count] = arrayWithDuplicates[i];
            count++;
        }
        System.out.println("array ==> " + Arrays.toString(arrayWithDuplicates));
        return count;

    }

    private static int bullAndSellAStock(int[] prices) {
        int i = 0;
        int valley = prices[0];
        int peak = prices[0];
        int maxprofit = 0;
        // int[] prices = new int[]{4,7,2,8,4,7,1,9,2,5};
        while (i < prices.length - 1) {
            while (i < prices.length - 1 && prices[i] >= prices[i + 1]) {
                System.out.println("valley loop " + prices[i] + " " + prices[i + 1]);
                i++;
            }
            valley = prices[i];
            System.out.println("final valley " + valley);
            while (i < prices.length - 1 && prices[i] <= prices[i + 1]) {
                System.out.println("Peak loop " + prices[i] + " " + prices[i + 1]);
                i++;
            }
            peak = prices[i];
            System.out.println("final Peak " + peak );
            System.out.println("i value after every loop " + i);
            maxprofit += peak - valley;
        }
        return maxprofit;
    }



    private static void reverseANumber(int i) {
        int rev = 0;
        while(i!=0) {
            rev = rev*10 + i%10;
            i=i/10;
        }
        System.out.println("reverse of a number " + rev);
        StringBuffer sb = new StringBuffer(String.valueOf(rev));
        System.out.println("again reversing a number using string buffer " + new StringBuffer(String.valueOf(rev)).reverse() );
        StringBuilder sbl = new StringBuilder();
        sbl.append(rev);
        System.out.println("again reversing a number using string builder " + sbl.reverse() );
    }


    private static void reverseAString(String name) {
        String rev = "";
        for(int i=name.length() - 1; i>=0;i--) {
            rev = rev + name.charAt(i);
        }
        System.out.println("reverse of a string is " + rev);
    }



        private static boolean containsDuplicate(int[] nums) {

            Set<Integer> numsset = new HashSet<Integer>();
            boolean noDuplicate;
            for(int i = 0; i< nums.length; i++) {
                System.out.println("adding " + nums[i]);
                noDuplicate = numsset.add(nums[i]);
                System.out.println("noDuplicate value after adding " + nums[i] + " " + noDuplicate);
                if(!noDuplicate) {
                    return true;
                }
            }
            return false;
        }
  }