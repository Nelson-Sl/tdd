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

    void with_uncontinuous_vowels_return_original_word() {
        //Given
        VowelChecker checker = new VowelChecker();
        //When
        String word = "kaixin";
        String result = checker.check(word);
        //Then
        assertEquals(result,word);
    }
}
