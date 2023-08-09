package collections.Map.BasicOperations.Dictionary;

import java.util.HashMap;

public class Dictionary {
  private HashMap<String, String> dictionary;

  public Dictionary() {
    this.dictionary = new HashMap<String, String>();
  }

  public void addWord(String word, String definition) {
    this.dictionary.put(word, definition);
  }

  public void removeWord(String word) {
    if (this.dictionary.isEmpty()) {
      throw new RuntimeException("The dictionary is empty");
    }

    this.dictionary.remove(word);
  }

  public void printDictionary() {
    if (this.dictionary.isEmpty()) {
      throw new RuntimeException("The dictionary is empty");
    }

    System.out.println("Dictionary: ");
    for (String word : this.dictionary.keySet()) {
      System.out.println(word + ": " + this.dictionary.get(word));
    }
  }

  public void updateWord(String word, String definition) {
    if (this.dictionary.isEmpty()) {
      throw new RuntimeException("The dictionary is empty");
    }

    this.dictionary.replace(word, definition);
  }

  public String getWord(String word) {
    if (this.dictionary.isEmpty()) {
      throw new RuntimeException("The dictionary is empty");
    }

    return this.dictionary.get(word);
  }
}
