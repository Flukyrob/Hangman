import java.util.Scanner;

public class Game {
    public static void main (String[] Args){

        //create a word for playing
        Word word = new Word("sillysausages");
        //create a player
        Player player = new Player() ;
        //create the game

        //print out the hangman
        //prompt player to guess a letter

        System.out.println("  +---+\n" +
                "  |   |\n" +
                "      |\n" +
                "      |\n" +
                "      |\n" +
                "      |\n" +
                "=========");
        System.out.println("Welcome to Hangman, please guess your first letter: ");

        while (player.lives_remaining > 0) {
            Scanner sc = new Scanner(System.in);
            String guess = sc.nextLine();
            char guessC = guess.charAt(0);
            if (player.guessedLetters.contains(guessC)){
                System.out.println("You've already guessed that, guess again");
            }
            player.guessLetter(guessC);
            //check the guess
            boolean result = word.checkGuess(guessC);




            //if !guess, deduct lives
            if (!result) {
                player.loseLife();
                System.out.println("Opps, guess again!");

                switch (player.lives_remaining){

                    case 6:
                        System.out.println("  +---+\n" +
                                "  |   |\n" +
                                "  O   |\n" +
                                "      |\n" +
                                "      |\n" +
                                "      |\n" +
                                "=========");
                        break;
                    case 5:
                        System.out.println("  +---+\n" +
                                "  |   |\n" +
                                "  O   |\n" +
                                "  |   |\n" +
                                "      |\n" +
                                "      |\n" +
                                "=========");
                        break;
                    case 4:
                        System.out.println("  +---+\n" +
                                "  |   |\n" +
                                "  O   |\n" +
                                " /|   |\n" +
                                "      |\n" +
                                "      |\n" +
                                "=========");
                        break;
                    case 3:
                        System.out.println("  +---+\n" +
                                "  |   |\n" +
                                "  O   |\n" +
                                " /|\\  |\n" +
                                "      |\n" +
                                "      |\n" +
                                "=========");
                        break;
                    case 2:
                        System.out.println("  +---+\n" +
                                "  |   |\n" +
                                "  O   |\n" +
                                " /|\\  |\n" +
                                " /    |\n" +
                                "      |\n" +
                                "=========");
                        break;
                    case 1:
                        System.out.println("Careful, one life reminaing!");
                        System.out.println("  +---+\n" +
                                "  |   |\n" +
                                "  O   |\n" +
                                " /|\\  |\n" +
                                " /    |\n" +
                                "      |\n" +
                                "=========");
                        break;
                    case 0 :
                        System.out.println("GAME OVER!!!!");
                        System.out.println("  +---+\n" +
                                "  |   |\n" +
                                "  O   |\n" +
                                " /|\\  |\n" +
                                " / \\  |\n" +
                                "      |\n" +
                                "=========");
                        break;




                }











                System.out.println("Lives remaining:"+ player.lives_remaining);
            } else System.out.println("Good job! ");
            System.out.println(word.status());
        }
        //get status
        //repeat





    }





}