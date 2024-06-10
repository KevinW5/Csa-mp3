import java.util.*;

public class Word {
  private ArrayList<String> wordList;
  public Word(ArrayList<String> words) {
    wordList = words;
  }
// Part A
  public boolean isWordChain() {
    for (int i = 1; i < wordList.size(); i++) {
      // Check if every element in wordList except the first contains the previous substring element
      if(wordList.get(i).indexOf(0)==-1){
        return false;
      }
    }
    return true;
  }
//Part B
  public ArrayList<String> createList(String target) {
        // New list
        ArrayList<String> result = new ArrayList<String>();
        int tarlen = target.length();
        for (String word : wordList) {
          // check if each word of the list have length greater than the target and if it contain the target in the front
            if (word.length() >= tarlen && word.substring(0, tarlen).equals(target)) {
              // removes the target in front if true
                result.add(word.substring(tarlen));
            }
        }

        return result;
  }
}
