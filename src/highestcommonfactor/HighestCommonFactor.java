package highestcommonfactor;

/**
 *
 * @author Colin
 */
public class HighestCommonFactor {

    public static void main(String[] args) {
        int[] test_numbers = new int[]{67,56,90,32,45,60};
        System.out.println(highestCommonFactor(test_numbers));
    }
       
    public static int highestCommonFactor(int[] numbers) {
        int result = -1;
        
        if (numbers.length > 0) {
            result = numbers[0];
        }
    
        for(int number: numbers) {
           result = Math.abs(highestCommonFactor(number, result));
        }

        return result;
    }

    private static int highestCommonFactor(int a, int b) {
        return a == 0 ? b : highestCommonFactor(b % a, a);
    }
}
