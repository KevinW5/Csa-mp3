import java.util.*;

public class Word {
  private ArrayList<String> wordList;
  public Word(ArrayList<String> words) {
    wordList = words;
  }

  public boolean isWordChain() {
    for (int i = 1; i < wordList.size(); i++) {
      if(wordList.get(i).indexOf(0)==-1){
        return false;
      }
    }
    return true;
  }

  public ArrayList<String> createList(String target) {
        ArrayList<String> result = new ArrayList<String>();
        int tarlen = target.length();

        for (String word : wordList) {
            if (word.length() >= tarlen && word.substring(0, tarlen).equals(target)) {
                result.add(word.substring(tarlen));
            }
        }

        return result;
  }
}
