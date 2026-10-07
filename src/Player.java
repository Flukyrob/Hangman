import java.util.Set;
import java.util.HashSet;

public class Player {

    //number of lives at beginning of game
    int lives_remaining = 7;
    //guessed words for this player
    Set<Character> guessedLetters;

    public Player (){
        this.guessedLetters = new HashSet<>();
    }
    //method for the player to input a guess
    public void guessLetter(char c){

        //already guessed letters

        if (!guessedLetters.contains(c)){
            guessedLetters.add(c);
        }
    }
    public void loseLife() {
        lives_remaining--;
    }

}