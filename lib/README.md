[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/UI90ICT7)
# Recursion Practice

This exercise is designed to help you develop your understanding of recursion in Java. Recursion is a powerful technique where a method calls itself to solve smaller instances of a problem.

## How to Think Recursively

Each recursive function should follow this structure:

1. **Base Case:**  
   What is the simplest version of the problem that you can solve directly, without any further recursion?

2. **Recursive Case:**  
   Break the problem into a smaller version of itself. Call the same function with a simpler input.

3. **Trust the Recursion:**  
   Don't try to follow every recursive call in your head! Write the base case, write the recursive case, and assume the method works as promised for the smaller version.

<br>

# Practice Problems

The problems below are organized in **three tiers**. You should work through them in order. Try to complete all problems in Tier 1 and Tier 2. Tier 3 is **optional** and more challenging.

## Tier 1: Basic Recursion

### 1. Count Down Timer
Write a recursive function `countDown(int n)` that prints numbers from `n` down to `1`.


### 2. Sum of Natural Numbers
Write a recursive function `sum(int n)` that returns the sum of numbers from `1` to `n`.


### 3. Even Numbers in a Range
Write a recursive function `printEvens(int start, int end)` that prints all even numbers between `start` and `end` (inclusive).

## Tier 2: Strings and Numbers

### 4. Reverse a String
Write a recursive function `reverse(String s)` that returns the reversed string.

### 5. Check if a String is a Palindrome
Write a recursive function `isPalindrome(String s)` that returns `true` if the string is a palindrome.

### 6. Power Function
Write a recursive function `power(int base, int exponent)` that computes base to the power of exponent.  
Example: `power(2, 3) → 8`

### 7. Decimal to Binary
Write a recursive function `toBinary(int n)` that returns the binary representation of `n` as a string.  
Example: `toBinary(10) → "1010"`

### 8. Sum of Digits
Write a recursive function `sumOfDigits(int n)` that returns the sum of all digits in `n`.  
Example: `sumOfDigits(1234) → 10`

## Tier 3: Arrays and Advanced Practice

### 9. Sum of Array
Write a recursive function `sumArray(int[] arr, int n)` that returns the sum of the first `n` elements of the array.  
Example: `sumArray([1, 2, 3, 4], 4) → 10`

### 10. Find Maximum in an Array
Write a recursive function `findMax(int[] arr, int n)` that returns the max value in the first `n` elements of an array.

### 11. Count Occurrences of a Character
Write a recursive function `countChar(String s, char c)` that returns how many times `c` appears in the string `s`.  
Example: `countChar("hello", 'l') → 2`

### 12. Generate Subsets of a String
Write a recursive function `generateSubsets(String s)` that prints all subsets of the string.  
Example: `generateSubsets("abc") → "", "a", "b", "c", "ab", "ac", "bc", "abc"`