import java.util.*;

public class WordsInDictRecursive {
    private Set<String> dictionary;

    public WordsInDictRecursive() {
        dictionary = new HashSet<>();
        dictionary.add("pee");
        dictionary.add("nut");
        dictionary.add("butter");
        dictionary.add("jelly");
        dictionary.add("time");
        dictionary.add("fast");
        dictionary.add("man");
        dictionary.add("peenut");
    }

    public boolean solve(String word) {
        List<String> words = new ArrayList<>();
        Set<String> memory = new HashSet<>();
        return solveRec(word, words, memory);
    }

    private boolean solveRec(String word, List<String> words, Set<String> memory) {
        if (memory.contains(word)) {
            return true;
        }
        if (word.length() == 0) {
            return true;
        }
        boolean res = false;
        for(int i = 1; i <= word.length(); i++) {
            String firstPart = word.substring(0, i);
            if (dictionary.contains(firstPart)) {
                words.add(firstPart);
                memory.add(words.stream().reduce((a, b) -> a + b).orElse(""));
                res = solveRec(word.substring(i), words, memory);
                if (res) {
                    break;
                }
                words.remove(firstPart);
            }
        }
        return res;
    }
}
