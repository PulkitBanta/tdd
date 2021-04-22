package co.interleap.courses.tdd;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VowelCounterTest {

    @Test
    public void emptyString() {
        assertEquals(0, new VowelCounter().count(""));
    }

    @Test
    public void singleVowel() {
        assertEquals(1, new VowelCounter().count("a"));
    }

    @Test
    public void multipleVowels() {
        assertEquals(5, new VowelCounter().count("aeiou"));
    }

    @Test
    public void vowelAndConsonantLowerCase() {
        assertEquals(2, new VowelCounter().count("hello"));
    }
}