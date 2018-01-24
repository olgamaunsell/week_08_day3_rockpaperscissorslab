package example.codeclan.com.rockpaperscissors;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * Created by admin on 24/01/2018.
 */

public class RockPaperScissors {

    private Move userMove;
    private Move computerMove;

    public RockPaperScissors(Move userMove) {
        this.userMove = userMove;
        this.computerMove = generateComputerMove();

    }

    public Move getComputerMove(){
        return this.computerMove;
    }
    public Move generateComputerMove() {
        Move[] allMoves = Move.values();
        Collections.shuffle(Arrays.asList(allMoves));
        return allMoves[0];
    }

    public Move getUserMove() {
        return this.userMove;
    }

    public String play() {

        

        if (this.userMove.equals(this.computerMove)){
            return "Draw";
        }
        else if (this.userMove.equals(Move.ROCK) && this.computerMove.equals(Move.SCISSORS)){
            return "You win, Computer played " + this.computerMove;
        } else if (this.userMove.equals(Move.SCISSORS) && this.computerMove.equals(Move.PAPER)){
            return "You win, Computer played " + this.computerMove;
        } else if (this.userMove.equals(Move.PAPER) && this.computerMove.equals(Move.ROCK)) {
            return "You win, Computer played " + this.computerMove;
        } else {
            return "You lose, Computer played " + this.computerMove;
        }
    }


}
