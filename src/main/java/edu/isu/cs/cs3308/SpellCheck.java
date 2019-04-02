// Bradley Tyler
// Isaac Griffith
// CS 3308
// March - 27 - 2019
package edu.isu.cs.cs3308;
import edu.isu.cs.cs3308.structures.impl.HashSet;
import java.util.List;

public abstract class SpellCheck<T> implements SpellChecker {

    public HashSet<T> dictionary;
    public List<T> holdCheck; // Change name
    public String input;

   // public HashSet<T> fillDictionary(file dic){
        // Fill set somehow
   // }

  //  public List<String> check(String input){
        // If s in in w, then the call to check(s) returns a list containing only s
        // If s in not in w, then the call to check(s) returns a list of every word in w that might be a correct spelling of s
        // including swapping adjacent characters in a word, inserting a single character in between two adjacent characters in a word,
        // deleting a single character from a word, and replacing a character in a word with another character.

        // Logic to check for similar words based on this criteria ^^^^^^^
 //   }
}
