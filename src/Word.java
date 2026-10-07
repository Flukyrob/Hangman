import java.util.HashSet;
import java.util.Set;


public class Word {

    String secretWord;
    Set<Character> correctLetters;

    public Word(String secretWord){
        this.secretWord = secretWord;
        this.correctLetters = new HashSet<>();
    }

//check the guessed letter against word
public boolean checkGuess(char c){
    if (secretWord.indexOf(c)!= -1){
        correctLetters.add(c);
        return true;
    }
    else return false;
}

//methods
public String status (){
        String status = "";
        for (int i=0;i < secretWord.length();i++){
            if (correctLetters.contains(secretWord.charAt(i))){
                status += secretWord.charAt(i);
            }else status += "_";
        }
        return status;



}

    //check guess against word

}