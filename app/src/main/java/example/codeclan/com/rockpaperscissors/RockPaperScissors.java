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

    public Move getUserMove() {
        return this.userMove;
    }

    public Move generateComputerMove() {
        Move[] allMoves = Move.values();
        Collections.shuffle(Arrays.asList(allMoves));
        return allMoves[0];
    }

    public Move getComputerMove(){
        return this.computerMove;
    }


    public String computerMoveString(){
        return getComputerMove().toString().toLowerCase();
    }

    public String userMoveString(){
        return getUserMove().toString().toLowerCase();
    }

    public String play() {

        if (this.userMove.equals(this.computerMove)){
            return "Draw";
        }
        else if (this.userMove.equals(Move.ROCK) && this.computerMove.equals(Move.SCISSORS)){
            return "You win !";
        } else if (this.userMove.equals(Move.SCISSORS) && this.computerMove.equals(Move.PAPER)){
            return "You win !";
        } else if (this.userMove.equals(Move.PAPER) && this.computerMove.equals(Move.ROCK)) {
            return "You win !";
        } else {
            return "You lose !";
        }
    }


}
