package main.java;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class LengthOfLongestSubstring {

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("boyandboysgirls"));
    }

    private static int lengthOfLongestSubstring(String s) {

        if(s.isEmpty()){
            return 0;
        }

        if(s.length() == 1){
            return 1;
        }

        int l =0;
        int res;

        Set<String> set = new HashSet<String>();

        int max =0;

        for(var i=0; i< s.length(); i++){
            var val = String.valueOf(s.charAt(i));
            while(set.contains(val)){
            set.remove(String.valueOf(s.charAt(l)));
            l += 1;
        }
            set.add(val);
            int unique = i-l+1;
            if(max < unique){
                max = unique;
            }
        }

        return max;

    }
}