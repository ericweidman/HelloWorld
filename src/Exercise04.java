import java.util.HashMap;

/**
 * Created by ericweidman on 2/22/16.
 */
public class Exercise04 {
    public static void main(String[] args) {
        String sentence = "To be or not to be, that is the question.";
        sentence = sentence.toLowerCase();
        sentence = sentence.replace(",", "").replace(".", "");

        String[] words = sentence.split(" ");


        System.out.println(sentence);
        }




    }

