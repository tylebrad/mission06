# CS 3308 Mission 02

## Due: Tuesday April 2, 2019 @ 2300

## Purpose

* To gain experience in the implementation and use of Sets

## Problem Statement
Write a spell-checker class that stores a lexicon of words, W, in a set, and implements a method, check(s), which performs a **spell check** on the string *s* with respect to the set of words, *W*. If *s* is in *W*, then the call to `check(s)` returns a list containing only *s*, as it is assumed to be spelled correctly in this case. If *s* is not in *W*, then the call to `check(s)` returns a list of every word in W that might be a correct spelling of *s*. Your program should be able to handle all the common ways that *s* might be a misspelling of a word in *W*, including swapping adjacent characters in a word, inserting a single character in between two adjacent characters in a word, deleting a single character from a word, and replacing a character in a word with another character.

You will need to implement your own version of a Set as a modified form of a HashMap. The use of the Java built in sets or maps, will be marked as a zero.

You will need to read in the provided dictionary from the `data` directory and use this to construct the lexicon of words, W.

## Assignment

1. Fork this repository
2. Implement your set class in the package `edu.isu.cs.cs3308.structures.impl` it will need to implement the provided `Set` interface found in package `edu.isu.cs.cs3308.structures`
3. Construct a `Driver` class in the package `edu.isu.cs.cs3308` which contains the logic to drive the program.
  * The Driver will need to provide a means to accept a string of text from Standard Input at the console.
  * The program will then need to find all misspelled words in the original string.
  * Once the misspelled words are found, it should show each misspelled word and the top five options for those words. If no misspelled words are found then it should inform the user there were no mistakes.
  * The following are examples of the program working:

```
Enter a sentence to check: inserting a single character in between two adjacent characters in a word, deleting a single characeter from a word

Misspelled Words:
  1. characeter: [character]

Enter a sentence to check: Hello World!

No misspellings!
```

4. Construct a class which performs the spell check functions, and which implements the `SpellChecker` interface found in package `edu.isu.cs.cs3308`

## Submission

When you have completed the assignment (all tests pass) or it is reaching midnight of the due date, make sure you have completed the following:

1. Committed all changes to your repo
2. Pushed your changes to GitHub
3. Tagged your repo as "COMPLETE"
4. Pushed the "COMPLETE" tag to GitHub
5. Submitted your repository URL to Moodle in the Mission 01 submission section.

## Grading -- 50 Points

* Set implemented correctly -- 20 Points
* SpellChecker implemented correctly -- 20 Points
* Driver implemented -- 5 Points
* Code documented and well formatted -- 5 points
