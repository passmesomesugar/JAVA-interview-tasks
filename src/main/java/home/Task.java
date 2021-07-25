package home;

import static java.lang.Math.sqrt;

import java.util.Arrays;

public class Task {
//  Здесь условия и решения, кое где добавлены вспомагательные методы для вывода в консоль решения, типа как public
//  void printArray(int[] r)

    /*
    1.You are given a non-empty zero-indexed array A consisting of N integers.
    For each number A[i] such that 0<=i<N, we want to count the number of elements of the array that are not the
    divisors of A[i].
    We say that these elements are non-divisors.
    Write a function that given a non-empty zero-indexed array A consisting of N integers, returns a sequence of
    integers representing the amount of non-divisors.
    The sequence should be returned as an array of integers.
    */

    public int[] solution(int[] a) {
        if (a == null) {
            throw new IllegalArgumentException("Null parametr is not allowed.");
        }
        int[] result = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] % a[j] != 0) {
                    result[i]++;
                }
                if (a[j] % a[i] != 0) {
                    result[j]++;
                }
            }
        }
        return result;
    }

    public void printArray(int[] r) {
        for (int i = 0; i < r.length; i++) {
            System.out.println(r[i]);
        }
        System.out.println();
    }

    /*
    2.Given a string as a parameter. Implement a method to reverse the string using a recursive solution. Return with
    the result. Interface to be implemented:
    String reverseString(final String str);
    */

    public String reverseString(final String str) {
        if (str == null) {
            throw new IllegalArgumentException("String can not be null");
        }
        String result = str;
        if (str.length() > 1) {
            result = str.charAt(str.length() - 1) + reverseString(str.substring(0, str.length() - 1));
        }
        return result;
    }
    /*
    3.Implement a method that finds the minimum value of the given array. Check the input before search.
     */

    public int searchMinValue(int[] array) {
        if (array == null) {
            throw new IllegalArgumentException("The Array must not be null");
        }
        if (array.length == 0) {
            throw new IllegalArgumentException("Array cannot be empty");
        }
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

/*
4.Write a function that returns the minimal perimeter of any rectangle whose area is exactly equals to a given number.
A positive integer N is given, representing the area of some rectangle.
The area of a rectangle with A and B sides is A*B, and its perimeter is 2*(A+B).
The goal is to find the minimal perimeter of any rectangle whose area equals N.
The sides of this rectangle should be integers.
Method returns the floored integer square root of the integer parameter.
 */

    public int solutionPerimetr(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("The area of the rectangle must be positive.");
        }
        int result = 0;
        for (int i = (int) sqrt(n); i > 0 && result == 0; i--) {
            if (n % i == 0) {
                result = 2 * (n / i + i);
            }
        }
        return result;
    }

/*
5.Decide whether an integer is prime or not.
Prime numbers are the numbers which can only be divided by 1 and themselves without remainder.
Interface to be implemented:
 */

    public boolean isPrime(int number) {
        if (number < 2) {
            throw new IllegalArgumentException("The investigated number must be greater than 1.");
        }
        boolean isPrime = true;
        int iterateUntil = number / 2;
        for (int i = 2; i <= iterateUntil && isPrime; i++) {
            isPrime = number % i != 0;
        }
        return isPrime;
    }

/*
6.Implement an algorithm that checks whether the string parameter is a palindrome(reads the same forward or reversed)
 string or not.
 */

    public boolean isPalindrome(final String str) {
        boolean result = true;
        if (str == null) {
            result = false;
        } else {
            for (int i = 0; i < str.length() / 2 && result; i++) {
                result = str.charAt(i) == str.charAt(str.length() - 1 - i);
            }
        }
        return result;
    }

/*
7.Return the "centered" average of an array of ints, which is the mean average of the values, except ignoring the
largest and smallest values in the array.
If there are multiple copies of the smallest value, ignore just one copy, and likewise for the largest value. Use int
 division to produce the final average.
Minimum array size of 3 is required, otherwise an IllegalArgumentException must be thrown.
 */

    public int centeredAverage(int[] nums) {
        if (nums == null || nums.length < 3) {
            throw new IllegalArgumentException();
        }
        int min = nums[0];
        int max = nums[0];
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (nums[i] > max) {
                max = nums[i];
            } else if (nums[i] < min) {
                min = nums[i];
            }
        }
        return (sum - (max + min)) / (nums.length - 2);
    }

  /*
8.Write a function that reverses the digits of a signed integer.
 */

    public int reverseNumber(int number) {
        int reversed = 0;
        while (number != 0) {
            reversed = (reversed * 10) + (number % 10);
            number = number / 10;
        }
        return reversed;
    }

  /*
9.Suppose you have a string S which has length N and is indexed from 0 to N-1.
String R is the reverse of the string S.
The string S is funny if the condition |S[i]-S[i-1]|=|R[i]-R[i-1]| is true for every i from 1 to N-1.
Consider the testcase:
   */

    public boolean checkFunny(String s) {
        if (s == null || s.length() < 2) {
            throw new IllegalArgumentException(
                    "Input string must be minimum 2 characters long, and cannot be null.");
        }
        boolean isFunny = true;
        for (int i = 1; i < s.length() && isFunny; i++) {
            int sub1 = s.charAt(i) - s.charAt(i - 1);
            int sub2 = s.charAt(s.length() - i - 1) - s.charAt(s.length() - i);
            if (sub1 != sub2 && sub1 != -sub2) {
                isFunny = false;
            }
        }
        return isFunny;
    }

  /*
    10.Validate the usage of parentheses in a given string, every opening parenthesis must have a closing pair and they
    must be in correct order.
    Traverse through the string only once.
   */

    public boolean isValid(String data) {
        int value = 0;
        if (data != null) {
            for (int index = 0; index < data.length() && value >= 0; index++) {
                if (data.charAt(index) == '(') {
                    value++;
                } else if (data.charAt(index) == ')') {
                    value--;
                }
            }
        }
        return value == 0;
    }

    /*
  11.Given a function, which checks the existence of a given number in a given array.
     */
    public boolean isNumberInArray(int[] numbers, int number) {
        if (numbers != null && numbers.length > 0) {
            for (int index = 0; index < numbers.length; index++) {
                if (numbers[index] == number) {
                    return true;
                }
            }
        }
        return false;
    }

  /*
12.Given an input string, reverse the string word by word.
   */

    public String reverseWords(String input) {
        if (input == null || input.length() == 0) {
            return "";
        }
        String[] arr = input.trim().split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = arr.length - 1; i >= 0; i--) {
            sb.append(arr[i]);
            sb.append(" ");
        }
        return sb.length() == 0 ? "" : sb.substring(0, sb.length() - 1);
    }

/*
13.A prime is a positive integer X that has exactly two distinct divisors: 1 and X.
The first few prime integers are 2, 3, 5, 7, 11 and 13.
A semiprime is a natural number that is the product of two (not necessarily distinct) prime numbers.
The first few semiprimes are 4, 6, 9, 10, 14, 15, 21, 22, 25, 26.
You are given a non-zero positive integer N. The solution should check if the number is a semiprime or not, where N>=2
 */

    public boolean isSemiPrime(int n) {
        if (n < 2) {
            throw new IllegalArgumentException("The parameter should be greater or equal to 2.");
        }
        boolean isCube = false;
        int countRealDivisors = 0;
        for (int i = 2; i <= n / 2 && countRealDivisors < 3 && !isCube; i++) {
            if (n % i == 0) {
                countRealDivisors++;
            }
            if (n == i * i * i) {
                isCube = true;
            }
        }
        return (countRealDivisors == 1 || countRealDivisors == 2) && !isCube;
    }

/*
14. N doors in a row are all initially opened.
You make n passes by the doors.
The first time through, you visit every door and toggle the door (if the door is closed, you open it; if it is open,
you close it).
The second time you only visit every 2nd door (door #2, #4, #6, ...).
The third time, every 3rd door (door #3, #6, #9, ...), etc, until you only visit the nth door. Return the state of
the doors after the last pass! True if open false if closed.
 */

    public boolean[] toggleDoors(int numberOfDoors) {
        boolean[] result = new boolean[numberOfDoors];
        for (int i = 0; i < numberOfDoors; i++) {
            result[i] = true;
        }
        for (int i = 1; i <= numberOfDoors; i++) {
            for (int j = i; j <= numberOfDoors; j = j + i) {
                result[j - 1] = !result[j - 1];
            }
        }
        return result;
    }

    public void printArrayB(boolean[] r) {
        for (int i = 0; i < r.length; i++) {
            System.out.println(r[i]);
        }
        System.out.println();
    }

/*
15. Given a sorted array and a target value, return the index if the target is found.
If not, return the index where it would be if it were inserted in order.
You may assume no duplicates in the array.
 */

    public int searchInsert(int[] sortedArray, int target) {
        if (sortedArray == null || sortedArray.length == 0) {
            return 0;
        }
        return searchInsert(sortedArray, target, 0, sortedArray.length - 1);
    }

    public int searchInsert(int[] sortedArray, int target, int start, int end) {
        int mid = (start + end) / 2;
        if (target == sortedArray[mid]) {
            return mid;
        } else if (target < sortedArray[mid]) {
            return ((start < mid) ? searchInsert(sortedArray, target, start, mid - 1) : start);
        }
        return ((end > mid) ? searchInsert(sortedArray, target, mid + 1, end) : (end + 1));
    }

/*
16. Write a function which returns the maximal possible profit from one transaction during this period.
The function should return 0 if it was impossible to gain any profit.
A zero-indexed array A consisting of N integers is giveb.
It contains daily prices of a stock share for a period of N consecutive days.
If a single share was bought on day P and sold on day Q, and then the A[Q] - A[P] is positive, we call it profit, if
negative, we call it loss.
For example, consider the following array A such that:
If a share was bought on day 0 and sold on day 1, a loss of 5 would occur because A[1] - A[0] = 80-85=-5.
If a share was bought on day 2 and sold on day 3, a profit of 30 would occur because A[3] - A[2] = 120-90=30.
Maximum possible profit was 40. It would occur if a share was bought on day 1 and sold on day 3. As a result. in this
 case the function should return 40.
 */

    public int solutionProfit(int[] array) {
        if (array == null) {
            throw new IllegalArgumentException("Given array must not be null.");
        }
        int max = 0;
        int result = 0;
        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i] > max) {
                max = array[i];
            } else if (max - array[i] > result) {
                result = max - array[i];
            }
        }
        return result;
    }

/*
17. Write a program to convert binary format to decimal number using numeric operations.
 */

    public int getDecimalFromBinary(int binary) {
        int decimal = 0;
        int power = 1;
        while (true) {
            if (binary == 0) {
                break;
            }
            decimal += (binary % 10) * power;
            binary = binary / 10;
            power = power * 2;
        }
        return decimal;
    }
    /*
    18N. Write a method to find out if a number is perfect or not. A perfect number is a positive integer that is equal
    to the sum of its positive divisors excluding the number itself.
    */

    public boolean isPerfectNumber(int number) {
        if (number < 1) {
            return false;
        }
        int temp = 0;
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                temp += i;
            }
        }
        return temp == number;
    }

    /*
    19N. Given an NxN matrix containing integers. Check if the matrix is a symmetric, (In linear algebra, a symmetric
    matrix is a square matrix that is equal to its transpose.) Return true if the matrix is symmetric, false if it's
    not.
    Throw IllegalArgumentException if the given parameter is null or is not a valid NxN matrix.
    */

    public boolean isSymmetric(final int[][] matrix) {
        if (matrix == null) {
            throw new IllegalArgumentException("Null value given!");
        }
        if (matrix.length == 0) {
            throw new IllegalArgumentException("The given argument is not a valid matrix!");
        }
        boolean retval = true;
        for (int i = 0; retval && i < matrix.length; i++) {
            if (matrix.length != matrix[i].length) {
                throw new IllegalArgumentException("The given matrix is not an NxN matrix!");
            }
            for (int j = 0; retval && j < matrix[i].length; j++) {
                int current = matrix[i][j];
                int transpose = matrix[j][i];
                retval = current == transpose;
            }
        }
        return retval;
    }

    /*
    20N. Write a function that returns the minimum absolute summary of array slices.
    An array A of N integers is given. The A[P...Q] is called a slice, where P,Q are integers and 0=<P=<Q<N.
    The sum of slice is total of A[P]+A[P+1]+...+A[Q]. A min abs slice is a slice whose absolute sum is minimal.
    For example, array A such that:
    A=[11,3,-6]
    contains the following slices, among others:
    (0,0), whose absolute sum=|11|=11
    (0,1), whose absolute sum=|11+3|=14
    (0,2), whose absolute sum=|11+3-6|=8
    (1,1), whose absolute sum=|3|=3
    (1,2), whose absolute sum=|3-6|=3
    (2,2), whose absolute sum=|-6|=6
    Both slices 1,1 and 1,2 are minimum absolute slices and their absolute summary equals 3.
    As a result the function should return 3.
    */
    public int solutionSlice(int[] array) {
        if (array == null) {
            throw new IllegalArgumentException("Given array must not be null");
        }
        if (array.length == 0) {
            throw new IllegalArgumentException("The array must not be empty");
        }
        {
            int length = array.length;
            for (int i = 1; i < length; i++) {
                array[i] = array[i - 1] + array[i];
            }
            Arrays.sort(array);
            int result = Math.abs(array[0]);
            for (int i = 1; i < length; i++) {
                int resultForIndex = Math.min(Math.abs(array[i]), array[i] - array[i - 1]);
                result = Math.min(result, resultForIndex);
            }
            return result;
        }
    }

    /*
    21N. Given an array and a number as parameters. The array contains the range of positive integer numbers from 1
    to N - except one - without duplication in random order. Write a method which returns the missing number after
    checking if the collection is valid for the requirements (returns 0 in invalid case).
    */

    public int findMissingNumber(int[] numbers, int n) { /*F*/
        if (numbers == null || numbers.length == 0 || numbers.length + 1 != n) {
            return 0;
        }
        int expectedSum = (n * (n + 1)) / 2, realSum = 0; /*F*/
        int prevNumber = -1;
        Arrays.sort(numbers); /*F*/
        for (Integer number : numbers) {
            if (number >= 1 && number <= n && prevNumber != number) {
                realSum += number; /*F*/
                prevNumber = number; /*F*/
            } else {
                return 0;
            }
        }
        return expectedSum - realSum;
    }

    /*
    22N. A zero-indexed array A consisting of N integers is given. A triplet (P,Q,R) is a triangular.
    If it is possible to build a triangle with sides of lengths A[P], A[Q] and A[R]. In other words,
    triplet (P,Q,R) is triangular if 0=<P<Q<R=<N and:
    A[P] + A[Q] > A[R]
    ...
    Write a function that, given a zero-indexed array A consisting of N integers, returns the number of
    triangular triplets in this array.
    */
    public long countTriangleTriplets(int[] input) {
        if (input == null) {
            throw new NullPointerException("Input array is null");
        } else {
            long result = 0; /*F*/
            Arrays.sort(input);
            for (int k = input.length - 1; k > 1; k--) {
                int i = 0;
                int j = k - 1; /*F*/
                while (i != j) {
                    if (input[k] < input[i] + input[j]) {
                        result += j - i;
                    }
                    i++;
                }
                j--;
            }
            return result;
        }
    }

    /*
    23N. A bracket expression is proper when every opening bracket  has a closing pair and vice versa and the
    opening bracket precedes the closing one.
    Given a string with fixed opening square brackets in it and placeholder ('.') characters.
    If we change the placeholder characters to opening or closing square brackets, how many proper bracket
    expression can be generated?
    Input contains only '[' and '.' .
    Output is a integer ~ a number of possible bracket expressions.
    */
    public int countPossibilities(String input) {
        return brackets(input, 0, 0);
    }

    public int brackets(String pattern, int index, int toClose) {
        int count = 0;
        if (index == pattern.length() || toClose > pattern.length() - index) {

        }
        if (toClose >= 0) {
        }
        if (toClose == 0)
            if (pattern.charAt(index) != '[')
                count = 1;
        return count;
    }

    /*
    24N. The Utopian Tree goes through 2 cycles of growth every year. The first growth cycle occurs during the
    spring, when it doubles in height. The second growth cycle
    */
    long calculateUtopianTreeHeight(byte numberOfCycles) {
        if (numberOfCycles < 0) {
            throw new IllegalArgumentException("");
        } else if (numberOfCycles > 100) {
            throw new IllegalArgumentException("");
        }
        long height = 1;
        for (int i = 1; i <= numberOfCycles; i++) {
            if (i % 2 == 0) {
                height *= 2;
            } else {
                height++;
            }
        }
        return height;
    }

    /*
    25N. Given a number between 0 and 255 incl. Convert this number to its binary form. Return the result or null.
    Keep the number of loops ... .
    */
    public String convertToBinary(Integer number) {
        if (number == null || number < 0 || number > 255) {
            return null;
        } else if (number == 0) {
            return "0";
        }
        Integer remaining = number; /*F*/
        Integer mod; /*F*/
        String result = "";
        while (remaining > 0) {
            mod = remaining % 2;
            result = mod + result;
            remaining = remaining / 2;
        }
        return result;
    }

    /*
    26N. Given an array of integers. Write a method that finds the second highest integer in the array and gives
    back null when there is no second highest.
    */
    public Integer secondHighest(int[] nums) {
        if (nums == null || nums.length < 2) return null;
        Integer highest = null;
        Integer secondHighest = null;
        for (int num : nums) {
            if (highest == null || num > highest) {
                secondHighest = highest;
                highest = num;
            } else if ((secondHighest == null || num > secondHighest) && num != highest) {
                secondHighest = num;
            }
        }
        return secondHighest;
    }
}

