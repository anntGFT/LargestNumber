package org.example;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {

    static Solution solution;

    String result;
    int[] nums;

    @BeforeAll
    static void setup(){

        solution = new Solution();
    }

    @Test
    public void onlyOneNumber(){

        nums = new  int[] {5};

        result = "5";

        assertEquals(result, solution.largestNumber(nums));
    }

    @Test
    public void twoNumbers(){

        nums = new  int[] {36, 99};

        result = "9936";

        assertEquals(result, solution.largestNumber(nums));
    }

    @Test
    public void fiveNumbers(){

        nums = new  int[] {4,5,3,2,55};

        result = "555432";

        assertEquals(result, solution.largestNumber(nums));
    }

    @Test
    public void ifMultiplesZerosExpectOnlyOne(){

        nums = new  int[] {0,0,0,0};

        result = "0";

        assertEquals(result, solution.largestNumber(nums));
    }

}
