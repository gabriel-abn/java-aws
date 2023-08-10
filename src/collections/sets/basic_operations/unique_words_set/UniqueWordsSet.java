package collections.sets.basic_operations.unique_words_set;

import java.util.HashSet;

public class UniqueWordsSet {
  private HashSet<String> uniqueWordsSet;

  public UniqueWordsSet() {
    this.uniqueWordsSet = new HashSet<>();
  }

  public void addWord(String word) {
    this.uniqueWordsSet.add(word);
  }

  public void printUniqueWords() {
    System.out.println("Unique words: " + this.uniqueWordsSet);
  }

  public void checkWord(String word) {
    if (this.uniqueWordsSet.contains(word)) {
      System.out.println("Word " + word + " is in the set");
    } else {
      System.out.println("Word " + word + " is not in the set");
    }
  }

  public static void main(String[] args) {
    UniqueWordsSet uniqueWordsSet = new UniqueWordsSet();

    uniqueWordsSet.addWord("Hello");
    uniqueWordsSet.addWord("World");
    uniqueWordsSet.addWord("Hello");
    uniqueWordsSet.addWord("Java");
    uniqueWordsSet.addWord("Java");

    uniqueWordsSet.printUniqueWords();

    uniqueWordsSet.checkWord("Hello");
    uniqueWordsSet.checkWord("World");
    uniqueWordsSet.checkWord("Java");
    uniqueWordsSet.checkWord("Python");
  }
}
