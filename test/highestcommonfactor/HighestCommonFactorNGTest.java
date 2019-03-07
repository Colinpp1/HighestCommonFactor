package highestcommonfactor;

import static org.testng.Assert.*;
import org.testng.annotations.Test;

/**
 *
 * @author Colin
 */
public class HighestCommonFactorNGTest {
    
    public HighestCommonFactorNGTest() {
    }

    /**
     * Test of highestCommonFactor method Simple Test Positive numbers.
     */
    @Test
    public void testPosNumbers() {
        int[] numbers = {3,9,12};
        int expResult = 3;
        int result = HighestCommonFactor.highestCommonFactor(numbers);
        assertEquals(result, expResult);
    }
    
    /**
     * Test of highestCommonFactor method for an empty List.
     */
    @Test
    public void testEmptyList() {
        int[] numbers = {};
        int expResult = -1;
        int result = HighestCommonFactor.highestCommonFactor(numbers);
        assertEquals(result, expResult);
    }
    
     /**
     * Test of highestCommonFactor method for a list with negative numbers.
     */
    @Test 
    public void testNegNumbers(){
         int[] numbers = {-2,-4,-24,-48};
        int expResult = 2;
        int result = HighestCommonFactor.highestCommonFactor(numbers);
        assertEquals(result, expResult);
    }
    
      /**
     * Test of highestCommonFactor method for numbers where Common Factor is One.
     */
    @Test 
    public void testForFactorOne(){
        int[] numbers = {-3,5,7};
        int expResult = 1;
        int result = HighestCommonFactor.highestCommonFactor(numbers);
        assertEquals(result, expResult);
    }
   
     /**
     * Test of highestCommonFactor method for numbers with zero as one of the numbers.
     */  
    @Test
    public void testForZero(){
        int[] numbers = {0,5};
        int expResult =5;
        int result = HighestCommonFactor.highestCommonFactor(numbers);
        assertEquals(result, expResult);
    }
    
     /**
     * Test of highestCommonFactor method for numbers with all numbers as zero
     */  
    @Test
    public void testForZeros(){
        int[] numbers = {0,0,0,0,0,0};
        int expResult =0;
        int result = HighestCommonFactor.highestCommonFactor(numbers);
        assertEquals(result, expResult);
    }
    
    /**
     * Test of highestCommonFactor method for the same number repeated
     */    
    @Test
    public void testSameNumber(){
        int[] numbers = {8,8,8,8,8,8,8};
        int expResult =8;
        int result = HighestCommonFactor.highestCommonFactor(numbers);
        assertEquals(result, expResult);
    }
    
     /**
     * Test of highestCommonFactor method for the same number repeated
     */  
    @Test
    public void testLargeSet(){
        int[] numbers = {64,2,86,104,94,168,1000,100000,50,40,24,896,78};
        int expResult =2;
        int result = HighestCommonFactor.highestCommonFactor(numbers);
        assertEquals(result, expResult);
    }
    /**
     * Test of highestCommonFactor method for list with single value
     */  
    @Test
    public void testSingleNumber(){
        int[] numbers = {89};
        int expResult =89;
        int result = HighestCommonFactor.highestCommonFactor(numbers);
        assertEquals(result, expResult);
    }
    
     /**
     * Test of highestCommonFactor method for a combination of positive and negative numbers.
     */  
    @Test
    public void testNegPosNumbers(){
        int[] numbers = {88,-4,8,-12,-160};
        int expResult =4;
        int result = HighestCommonFactor.highestCommonFactor(numbers);
        assertEquals(result, expResult);
    }
}
