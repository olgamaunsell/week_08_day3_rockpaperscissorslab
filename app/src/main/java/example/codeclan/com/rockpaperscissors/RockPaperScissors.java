package example.codeclan.com.rockpaperscissors;

/**
 * Created by admin on 24/01/2018.
 */

public class RockPaperScissors {

    private Move userMove;

    public RockPaperScissors(Move userMove){
        this.userMove = userMove;

    }

    public Move getUserMove() {
        return this.userMove;
    }
}
