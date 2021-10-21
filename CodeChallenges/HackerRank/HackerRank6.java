// The challenge here is to read n lines of input until you reach EOF, then number and print all n lines of content.

// Hint: Java's Scanner.hasNext() method is helpful for this problem.

// Input Format

// Read some unknown n lines of input from stdin(System.in) until you reach EOF; each line of input contains a non-empty String.

// Output Format

// For each line, print the line number, followed by a single space, and then the line content received as input.
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class HackerRank6 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
   int i = 0;
   while(scan.hasNext()){
         i++;
         System.out.println(i + " " + scan.nextLine());
        }
    }
}