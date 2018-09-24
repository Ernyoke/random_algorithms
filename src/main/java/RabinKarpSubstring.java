public class RabinKarpSubstring {
    private static final int PRIME = 3;

    public static int solve(String str, String toSearch) {
        int toSearchHash = firstHash(toSearch);
        int currentHash = firstHash(str.substring(0, toSearch.length()));
        if (toSearchHash == currentHash && compare(str, 0, toSearch)) {
            return 0;
        }
        for (int i = 1; i < str.length() - toSearch.length() + 1; i++) {
            currentHash = hash(str.charAt(i - 1), str.charAt(i + toSearch.length() - 1), currentHash, toSearch.length());
            if (toSearchHash == currentHash && compare(str, i, toSearch)) {
                return i;
            }
        }
        return -1;
    }

    private static int firstHash(String str) {
        int hash = 0;
        for(int i = 0; i < str.length(); i++) {
            hash += str.charAt(i) * Math.pow(PRIME, i);
        }
        return hash;
    }

    private static int hash(char prevFirstChar, char lastChar, int prevHash, int length) {
        int hash = prevHash;
        hash -= prevFirstChar;
        hash /= PRIME;
        hash += lastChar * Math.pow(PRIME, length - 1);
        return hash;
    }

    private static boolean compare(String first, int firstPoz, String second) {
        if (second.length() > first.length() - firstPoz) {
            return false;
        }
        for (int i = 0; i < second.length(); i++) {
            if (first.charAt(firstPoz + i) != second.charAt(i)) {
                return false;
            }
        }
        return true;
    }
}
