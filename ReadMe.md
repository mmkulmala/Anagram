# Anagram solution with Java
This is my Anagram solution based on my findings in reference section[1].

I tested couple of different solutions and noted that the one I chose was in my opinion the best.

First I read through couple of solutions and tried in my favorite IDE and noted that most of them worked, but
the reason I chose the one I chose, was because it was had time complexity (O-notation) of O(N) and it also had auxiliary
space of O(1), constant as it is using 256 characters always in array.

I also tested with single array (now using two arrays for both Strings), but found a little harder to read than
just having two. This made it easier to debug and see whats going on in code.

I tried also with hashmap[1], but it had worse auxiliary space (O(N) as HashMap uses extra space).

I look at some common anagrams from Wikipedia as well as their meaning[2].

## Solution walkthrough
My idea that I used is based on assumption that Strings are small and stored using 8 bits with length of 256 characters.
This can be easily changed as length is a integer variable and can be changed.

I have two integer arrays with size 256 and they're initialized to 0. Then I iterate through every character of those 
strings and increment the count of characters for both of them. Then arrays are compared and if the count is the same
return true, if not return false.

## Usage
My solution is easily used either by running simple test cases (didn't use Mocking as application is rather simple) to 
test different anagrams that are true and words that are not anagrams, in which case it's assumed that application gives 
back the false.

My solution is also runnable as java application.

The compile the application type:
```
mvn clean install
```
Then I can run the tests by typing (or even without compiling as maven run compile target with test):
```
mvn test
```
Application can also be runned from shell by running following command (notice mvn clean install before):
```
mvn exec:java -Dexec.mainClass="org.marno.AnagramApp" -Dexec.args="evil vile"
```
args is the strings tested to be anagrams.
## References
1. Geeks for Geeks website, 2023, https://www.geeksforgeeks.org/check-whether-two-strings-are-anagram-of-each-other/
2. Wikipedia article, 2023, https://en.wikipedia.org/wiki/Anagram
