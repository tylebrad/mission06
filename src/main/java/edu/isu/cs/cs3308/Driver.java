// Bradley Tyler
// Isaac Griffith
// CS 3308
// March - 27 - 2019

// Driver class handling logic to drive the program

package edu.isu.cs.cs3308;
import edu.isu.cs.cs3308.SpellCheck;
import java.util.List;
import java.util.Scanner;

public class Driver<T> implements SpellCheck<T> {
    @Override
    public List<String> check(String s) {
        return null;
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence to check: ");
        String toCheck = scanner.next();
        List<String> results = check(toCheck);
    }
}
