package main.java;

import java.math.BigDecimal;
import java.util.*;

class MedianSortedArray {

    public static void main(String[] args) {
//        Map<Integer, Integer> test = new HashMap<>();
//        test.put(1, 3);
//        test.put(4, 10);
//        test.put(2, 0);
//        test.put(3, 2);
//
//        Set<Integer> set = new HashSet<>();
//        set.add(10);
//        set.add(4);
//        set.add(3);
//        set.add(0);
//
//        for (Integer inte: set){
//            System.out.println(inte);
//        }

        int[] arr = new int[]{1, 2,3 ,4,6, 8,};
        double d = (new BigDecimal(-1+0).divide(new BigDecimal(2))).doubleValue();
        System.out.println("__"+ d);
    }


}

/*

import java.math.BigDecimal;
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int[] arr = new int[nums1.length + nums2.length];

        int index =-1;

        for(int x : nums1){
            index +=1;
            arr[index] =x;
        }

        for(int x : nums2){
            index +=1;
            arr[index] =x;
        }

        Arrays.sort(arr);

        int len = arr.length;
        boolean isEven = len % 2==0;
        double result =0.0;
        int half = len/2;

        System.out.println(len +"__"+ isEven);

        if(isEven){
            result = (new BigDecimal((arr[half] + arr[half-1]))
            .divide(new BigDecimal(2))).doubleValue();
        }else{
            result = arr[half];
        }

        return result;
    }



        int len1 = nums1.length;
        int len2 = nums2.length;



}
 */