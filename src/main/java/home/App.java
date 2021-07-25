package home;

import java.util.Arrays;
import java.util.SortedMap;

public class App {
    public static void main(String[] args) {
        Task task = new Task();




        //    Здесь проверка задач с тестовыми данными
//        task.printArray(task.solution(new int[]{3, 1, 2, 3, 6}));
//        task.printArray(task.solution(new int[]{5, 10, 15, 20, 25}));
//        task.printArray(task.solution(new int[]{1, 1, 1}));
//        task.printArray(task.solution(new int[]{7, 11, 13}));
//        task.printArray(task.solution(new int[]{}));
//        task.printArray(task.solution(null));
//        System.out.println(task.reverseString("EPAM"));
//        System.out.println(task.reverseString("interview"));
//        System.out.println(task.reverseString(null));
//        System.out.println(task.searchMinValue(new int[]{1}));
//        System.out.println(task.searchMinValue(new int[]{5, 4, 4, 7}));
//        System.out.println(task.searchMinValue(new int[]{4, 4}));
//        System.out.println(task.searchMinValue(null));
//        System.out.println(task.searchMinValue(new int[]{}));
//        System.out.println(task.solutionPerimetr(30));
//        System.out.println(task.isPrime(2));
//        System.out.println(task.isPrime(42));
//        System.out.println(task.isPrime(-1));
//        System.out.println(task.isPalindrome(null));
//        System.out.println(task.isPalindrome(""));
//        System.out.println(task.isPalindrome("abc"));
//        System.out.println(task.isPalindrome("aba"));
//        System.out.println(task.isPalindrome("abba"));
//        System.out.println(task.centeredAverage(new int[]{1,3,99}));
//        System.out.println(task.centeredAverage(new int[]{1,4,6,11,88}));
//        System.out.println(task.centeredAverage(new int[]{1,1,1,5,6,8,99}));
//        System.out.println(task.centeredAverage(null));
//        System.out.println(task.centeredAverage(new int[]{1,2}));
//        System.out.println(task.reverseNumber(-541));
//        System.out.println(task.reverseNumber(-33));
//        System.out.println(task.reverseNumber(0));
//        System.out.println(task.reverseNumber(55));
//        System.out.println(task.reverseNumber(122));
//        System.out.println(task.reverseNumber(59841));
//        System.out.println(task.checkFunny("1221"));
//        System.out.println(task.checkFunny("11"));
//        System.out.println(task.checkFunny("12"));
//        System.out.println(task.checkFunny("132"));
//        System.out.println(task.checkFunny("1321"));
//        System.out.println(task.checkFunny("1"));
//        System.out.println(task.checkFunny(null));
//        System.out.println(task.isValid("2*((5-2)/3)"));
//        System.out.println(task.isValid("(5-1)*2)"));
//        System.out.println(task.isValid("()"));
//        System.out.println(task.isValid("()()"));
//        System.out.println(task.isValid(""));
//        System.out.println(task.isValid("))"));
//        System.out.println(task.isValid("(("));
//        System.out.println(task.isValid(")("));
//        System.out.println(task.isValid(null));
//    System.out.println(task.isNumberInArray(null, 5));
//    System.out.println(task.isNumberInArray(new int[]{1, 2, 3, 4}, 5));
//    System.out.println(task.isNumberInArray(new int[]{5, 4, 3}, 5));
//      System.out.println(task.reverseWords("the sky is blue"));
//      System.out.println(task.reverseWords("the cake is a lie"));
//      System.out.println(task.reverseWords(null));
//      System.out.println(task.reverseWords(""));
//      System.out.println("4: " + task.isSemiPrime(4));
//      System.out.println("6: " + task.isSemiPrime(6));
//      System.out.println("9: " + task.isSemiPrime(9));
//      System.out.println("10: " + task.isSemiPrime(10));
//      System.out.println("14: " + task.isSemiPrime(14));
//      System.out.println("15: " + task.isSemiPrime(15));
//      System.out.println("21: " + task.isSemiPrime(21));
//      System.out.println("22: " + task.isSemiPrime(22));
//      System.out.println("3: " + task.isSemiPrime(3));
//      System.out.println("5: " + task.isSemiPrime(5));
//      System.out.println("7: " + task.isSemiPrime(7));
//      System.out.println("8: " + task.isSemiPrime(8));
//      System.out.println("16: " + task.isSemiPrime(11));
//      System.out.println("12: " + task.isSemiPrime(12));
//      System.out.println("13: " + task.isSemiPrime(13));
//      System.out.println("27: " + task.isSemiPrime(27));
//    System.out.println("1");
//    task.printArrayB(task.toggleDoors(1));
//    System.out.println("2");
//    task.printArrayB(task.toggleDoors(2));
//    System.out.println("4");
//    task.printArrayB(task.toggleDoors(4));
//    System.out.println("9");
//    task.printArrayB(task.toggleDoors(9));
//    System.out.println(task.searchInsert(new int[] {1,3,5,6}, 5));
//    System.out.println(task.searchInsert(null, 2));
//    System.out.println(task.searchInsert(new int[] {1,3,5,6}, 7));
//    System.out.println(task.searchInsert(new int[] {1,3,5,6}, 0));
//    System.out.println(task.searchInsert(new int[] {}, 2));
//    System.out.println(task.solutionProfit(new int[] {85, 80, 90, 120, 100}));
//    System.out.println(task.solutionProfit(new int[] {65, 80, 90, 120, 100}));
//    System.out.println(task.solutionProfit(new int[] {65, 80, 90, 120, 121}));
//    System.out.println(task.solutionProfit(new int[] {122, 80, 123, 120, 121}));
//    System.out.println(task.solutionProfit(new int[] {}));
//    System.out.println(task.solutionProfit(null));
//    System.out.println(task.getDecimalFromBinary(0));
//    System.out.println(task.getDecimalFromBinary(11));
//    System.out.println(task.getDecimalFromBinary(110));
//    System.out.println(task.getDecimalFromBinary(100110));
//  Ниже пара задач не из твоих как они работаю хз - правильность под большим вопросом
//    public long countTriangleTriplets(int[] input) {
//      if (input == null) {
//        throw new NullPointerException("Input array is null!");
//      }
//      long result = 0;
//      Arrays.sort(input);
//      for (int k = input.length - 1; k > 1; k--) {
//        int i = 0;
//        int j = k - 1;
//        while (i != j) {
//          if (input[k] < input[i] + input[j]) {
//            result += j - i;
//            j--;
//          } else {
//            i++;
//          }
//        }
//      }
//      return result;
//    }
//
//
//    public boolean isSymmetric(final int[][] matrix) {
//      if (matrix == null) {
//        throw new IllegalArgumentException("Null value given!");
//      }
//      if (matrix.length == 0) {
//        throw new IllegalArgumentException("The given argument is not a valid matrix!");
//      }
//      boolean retval = true;
//      for (int i = 0; retval && i < matrix.length; i++) {
//        if (matrix.length != matrix[i].length) {
//          throw new IllegalArgumentException("The given matrix is not an NxN matrix!");
//        }
//        for (int j = 0; retval && j < matrix[i].length; j++) {
//          int current = matrix[i][j]; int transpose = matrix[j][i];
//          retval = current == transpose;
//        }
//      }
//      return retval;
//    }
//
//    public int equilibrium(int[] array) {
//      if (array == null) {
//        throw new IllegalArgumentException("Parameter 'array' cannot be null.");
//      }
//      int result = -1;
//      long sumFromRight = 0L;
//      long[] sumsFromLeft = new long[array.length];
//      for (int i = array.length - 1; i >= 0; i--) {
//        sumsFromLeft[i] = sumsFromLeft[i - 1] + array[i - 1];
//        sumFromRight = sumFromRight + array[i + 1];
//        if (sumsFromLeft[i] == sumFromRight) {
//          for (int i = 1; i < sumsFromLeft.length; i++) {
//            if (i != array.length - 1) {
//
//              result = i;
//            }
//          }
//        }
//      }
//      return result;
//    }
        // System.out.println(task.isPerfectNumber(6));
    }
}
