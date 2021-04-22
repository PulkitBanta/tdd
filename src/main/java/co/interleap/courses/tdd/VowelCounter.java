package co.interleap.courses.tdd;

public class VowelCounter {

    public boolean isVowel(char ch) {
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
            return true;
        return false;
    }

    public int count(String inp) {
        int vowelFound = 0;

        for (char ch : inp.toLowerCase().toCharArray()) {
            if (isVowel(ch))
                vowelFound++;
        }

        return vowelFound;
    }
}
