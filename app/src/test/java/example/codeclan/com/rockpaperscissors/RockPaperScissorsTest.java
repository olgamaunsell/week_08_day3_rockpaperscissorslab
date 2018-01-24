package example.codeclan.com.rockpaperscissors;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by admin on 24/01/2018.
 */

public class RockPaperScissorsTest {

    RockPaperScissors rockPaperScissors;
    private Move userMove1;

    @Before

    public void before(){

        userMove1 = Move.ROCK;
        rockPaperScissors = new RockPaperScissors(userMove1);

    }


    @Test

    public void canGetUserMove(){
        assertEquals(Move.ROCK, rockPaperScissors.getUserMove());

    }
}
