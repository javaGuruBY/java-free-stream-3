import java.util.ArrayList;

public class PhraseAnalyser {

    public String analyse(String text) {
        String startOfText = "Make";    // этот текс нужно сравнить с введеным текстом в начале
        String endOfText = "great again";   // этот текс нужно сравнить с ввеенным текстом в конце
        int charactersText = text.length(); // считаем количетсво символов  в веденном тексте
        int charactersStartOfText = startOfText.length(); // считаем количетсво символов у "Make"
        int charactersEndOfText = endOfText.length(); // считаем количетсво символов у "great again"
        boolean theBeginningOfTheTextIsFound = false; // если начало текста совпадает с startOfText = true
        boolean endOfTextMatches = false;   // если начало текста совпадает с endOfText = true
        // если введенном тексте >= кол-ву символов у "Make"
        if (charactersText >= charactersStartOfText){
            // проверяем начало текста совпадает ли оно с startOfText
            theBeginningOfTheTextIsFound = text.substring(0, charactersStartOfText).equals(startOfText);
        }
        // если введенном тексте >= кол-ву символов у "great again"
        if (charactersText >= charactersEndOfText){
            // проверяем начало текста совпадает ли оно с endOfText
            endOfTextMatches = text.substring(charactersText - charactersEndOfText, charactersText).equals(endOfText);
        }
        // если начало совпадает и конец совпадает
        if (theBeginningOfTheTextIsFound && endOfTextMatches) {
            return "It stands no chance";
        }
        // если начало совпадает или конец совпадает
        else if (theBeginningOfTheTextIsFound || endOfTextMatches){
            return "It could be worse";
        }
        // в остальных случаях
        else {
            return "It is fine, really";
        }

    }
}