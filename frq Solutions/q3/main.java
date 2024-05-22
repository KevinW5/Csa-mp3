import java.util.*;
public class Main {
  public static void main(String[] args) {
    ArrayList<String> wordList = new ArrayList<String>();
        wordList.add("catch");
        wordList.add("bobcat");
        wordList.add("catchacat");
        wordList.add("cat");
        wordList.add("at");

        Word word = new Word(wordList);
    System.out.println(word.isWordChain());
System.out.println(word.createList("cat"));
  }
}
