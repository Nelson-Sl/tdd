import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MommifierTest {
    @Test
    void no_vowels_return_original_word() {
        //Given
        VowelChecker checker = new VowelChecker();
        //When
        String word = "qwsdf";
        String result = checker.check(word);
        //Then
        assertEquals(result,word);
    }

    @Test
    void empty_Words_return_words_itself() {
        //Given
        VowelChecker checker = new VowelChecker();
        //When
        String word = "";
        String result = checker.check(word);
        //Then
        assertEquals(result,word);
    }

    @Test
    void with_uncontinuous_vowels_return_original_word() {
        //Given
        VowelChecker checker = new VowelChecker();
        //When
        String word = "kaixin";
        String result = checker.check(word);
        //Then
        assertEquals(result,word);
    }

    @Test
    void with_less_than_30percent_continuous_vowels_return_original_word() {
        //Given
        VowelChecker checker = new VowelChecker();
        //When
        String word = "aiaihhh";
        String result = checker.check(word);
        //Then
        assertEquals(result,word);
    }

    @Test
    void with_more_than_30percent_continuous_vowels_return_word_mommy() {
        //Given
        VowelChecker checker = new VowelChecker();
        //When
        String word = "aa";
        String result = checker.check(word);
        //Then
        assertEquals(result,"amommya");
    }
}
