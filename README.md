# CSC360 Exception Handling
 
For this exercise you will write a program, ComputeSum.java, that asks the user to input two integers n1
and n2 such that 0 ≤ n1 ≤ n2. The program will then ask the user to enter a floating point number exp.
Finally, the program computes and displays the value 𝑛1𝑒𝑥𝑝 + ... + 𝑛2𝑒𝑥𝑝.

The first of these two methods, readIntGreaterThanOrEqualTo, should use the Scanner.nextInt() method
to read in the integer (i.e. make the call input.nextInt()). Put the call to nextInt() inside a try block and
catch an InputMismatchException if it occurs. (See Listing 12.5 InputMismatchExceptionDemo.java in
Section 12.2 for an example.) If your code catches such an exception then display an appropriate error
message and prompt the user again. (See example on next page.) Also, if the input value is less than
lowerBound then your method should display a (different) error message and prompt the user again. Do
not use exception handling in the case were the input value is less than lowerBound: simply detect and
deal with that using a simple if-statement.

The second method will be similar but will use Scanner.nextDouble() to read in the user’s value. Again,
deal appropriately with any InputMismatchExceptions that occurs. For this method you do not need to
compare the user’s value with a lower bound.

Your main method should call readIntGreaterThanOrEqualTo twice and readDouble once, and then
compute and display the appropriate sum.

On the next page are two example runs of the program. Use exactly the prompts, error messages, and
report format shown there, including punctuation. Treat it as though this is how your boss said that it
should look, exactly.


In this example I asked the program to compute the value 2^1.5 + 3^1.5 + 4^1.5 + 5^1.5.

Enter an integer greater than or equal to 0: 2
Enter an integer greater than or equal to 2: 5
Enter a floating point number: 1.5
sum = 27.204919434951773


In the next example I asked for the same sum. I made a lot of input mistakes along the way, but got there
eventually. The program gave appropriate prompts and error messages at every step.

Enter an integer greater than or equal to 0: -3
Try again. The number must be greater than or equal to 0.
Enter an integer greater than or equal to 0: two
Try again. An integer is required.
Enter an integer greater than or equal to 0: skjlsks
Try again. An integer is required.
Enter an integer greater than or equal to 0: 2
Enter an integer greater than or equal to 2: one
Try again. An integer is required.
Enter an integer greater than or equal to 2: 1
Try again. The number must be greater than or equal to 2.
Enter an integer greater than or equal to 2: 0
Try again. The number must be greater than or equal to 2.
Enter an integer greater than or equal to 2: -1
Try again. The number must be greater than or equal to 2.
Enter an integer greater than or equal to 2: 5
Enter a floating point number: skjhs
Try again. A floating point number is required.
Enter a floating point number: jjjjj
Try again. A floating point number is required.
Enter a floating point number: 1.5
sum = 27.204919434951773