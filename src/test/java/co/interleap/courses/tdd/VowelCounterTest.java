package co.interleap.courses.tdd;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VowelCounterTest {

    @Test
    public void emptyStringTest() {
        assertEquals(0, new VowelCounter().count(""));
    }

    @Test
    public void singleVowelTest() {
        assertEquals(1, new VowelCounter().count("a"));
    }

    @Test
    public void multipleVowelTest() {
        assertEquals(5, new VowelCounter().count("aeiou"));
    }
}