import java.util.Arrays;

public class VowelChecker {
    static String vowelLetters = "[aeiou]";

    public String check(String word) {
        int vowelCount = 0;
        String[] wordArray = word.split("");
        for(int i = 0; i < wordArray.length; i++){
            if(i == 0) {
                if(wordArray[i].matches(vowelLetters)){
                    vowelCount++;
                }
            }else{
                if(wordArray[i].matches(vowelLetters)){
                    vowelCount++;
                    if(wordArray[i-1].equals(wordArray[i])){
                        wordArray[i-1] += "mommy";
                    }
                }
            }
        }
        if(vowelCount / wordArray.length > 0.3) {
            StringBuilder result = new StringBuilder();
            for(int j = 0; j < wordArray.length; j++) {
                result.append(wordArray[j]);
            }
            return result.toString();
        }
        return word;
    }
}
