# Fibonacci-series
1. The Fibonacci program is invoked by calling a method fib.
2. double data type is used so that float numbers can be used.
3. n is the total number of terms and first term(a) and second term(b) are initialized as 0 and 1.
4. Then, the for loop iterates till n displaying a as the sum of previous two terms.
->1st Iteration:
  Sum = 0 + 1;
  a = 1;
  b = 1;
->2nd Iteration:
  Sum = 1 + 1;
  a = 1;
  b = 2;
->3rd Iteration:
  Sum = 1 + 2;
  a = 2;
  b = 3;
  and so on...
5. The Output is obatined in series for the respective value of n given by the user, like 0,1,1,2,3,5,8,13,21,.....

Test Program
1. Unit testing is done using JUnit.
2. Test case is written for the fib method to check whether it's working properly without any errors.
3. The FibonacciTest is an ordinary class with mulltiple methods, by adding @Test (JUnit annotation) in the beginning it represts as a unit test method.
4. An object tester is created.
5. Then assertArrayEquals() method is used for expected output and desired output as there is a set of output obtained which can be stored in an array.
6. 4 test cases are used with different inputs and different expected outputs.
7. For 1st test case n=8 and expected output is 0,1,1,2,3,5,8,13.
8. For 2nd test case n=0 and expected output is 0.
9. For 3rd test case n=-4 (a signed integer) and expected output is 0.
10. For 4th test case n=5.5 (a float input) and expected output is 0,1,1,2,3.
11. All the above test cases passed and this proves that the program is correct for certain inputs and we're getting the desired output.
