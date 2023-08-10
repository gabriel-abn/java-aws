package collections.maps.find_operations.words_counting;

import java.util.HashMap;

public class WordsCounting {
  private String text;
  private HashMap<String, Integer> words;

  public WordsCounting(String text) {
    this.text = text;
    this.words = new HashMap<String, Integer>();
  }

  public void addWord(String word) {
    int count = 0;

    if (this.text.isEmpty()) {
      throw new RuntimeException("The text is empty");
    }

    for (String w : this.text.split(" ")) {
      if (w.equals(word)) {
        count++;
      }
    }

    this.words.put(word, count);
  }

  public void showWords() {
    if (this.words.isEmpty()) {
      throw new RuntimeException("The words list is empty");
    }

    if (this.text.isEmpty()) {
      throw new RuntimeException("The text is empty");
    }

    System.out.println("Words: ");
    for (String word : this.words.keySet()) {
      System.out.println(word + ": " + this.words.get(word));
    }
  }

  public void removeWord(String word) {
    if (this.words.isEmpty()) {
      throw new RuntimeException("The words list is empty");
    }

    if (this.text.isEmpty()) {
      throw new RuntimeException("The text is empty");
    }

    this.words.remove(word);
  }

  public void getHigherCountWord() {
    if (this.words.isEmpty()) {
      throw new RuntimeException("The words list is empty");
    }

    if (this.text.isEmpty()) {
      throw new RuntimeException("The text is empty");
    }

    String higherCountWord = null;
    int higherCount = Integer.MIN_VALUE;

    for (String word : this.words.keySet()) {
      if (this.words.get(word) > higherCount) {
        higherCount = this.words.get(word);
        higherCountWord = word;
      }
    }

    System.out.println("Higher count word: " + higherCountWord);
  }

  public static void main(String[] args) {
    WordsCounting wordsCounting = new WordsCounting(
        "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed non risus. Suspendisse lectus tortor, dignissim sit amet, adipiscing nec, ultricies sed, dolor.");

    wordsCounting.addWord("Lorem");
    wordsCounting.addWord("ipsum");
    wordsCounting.addWord("dolor");
    wordsCounting.addWord("sit");
    wordsCounting.addWord("amet");
    wordsCounting.addWord("consectetur");
    wordsCounting.addWord("adipiscing");
    wordsCounting.addWord("elit");
    wordsCounting.addWord("Sed");
    wordsCounting.addWord("non");
    wordsCounting.addWord("risus");
    wordsCounting.addWord("Suspendisse");
    wordsCounting.addWord("lectus");
    wordsCounting.addWord("tortor");
    wordsCounting.addWord("dignissim");
    wordsCounting.addWord("sit");
    wordsCounting.addWord("amet");
    wordsCounting.addWord("adipiscing");
    wordsCounting.addWord("nec");
    wordsCounting.addWord("ultricies");
    wordsCounting.addWord("sed");
    wordsCounting.addWord("dolor");

    wordsCounting.showWords();
    wordsCounting.getHigherCountWord();
    wordsCounting.removeWord("Lorem");
    wordsCounting.showWords();
    wordsCounting.getHigherCountWord();
  }
}
