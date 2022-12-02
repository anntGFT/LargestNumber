package org.example;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Solution {
    public Solution(){

    }

    public String largestNumber(int[] nums){

       String result = Arrays.stream(nums)
               .mapToObj(x -> String.valueOf(x))
               .sorted((x, y) -> (x + y).compareTo(y + x) * -1)
               .collect(Collectors.joining());

       if (result.startsWith("0")){

           return "0";
       }else{

          return result;
       }
    }
}