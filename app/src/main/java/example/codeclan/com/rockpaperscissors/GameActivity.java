package example.codeclan.com.rockpaperscissors;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class GameActivity extends AppCompatActivity {

    Button rock;
    Button scissors;
    Button paper;
    RockPaperScissors game;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.game_activity);



        rock = findViewById(R.id.rock);
        scissors = findViewById(R.id.scissors);
        paper = findViewById(R.id.paper);


        //game = new RockPaperScissors()

    }


    public void onRockButtonClick(View button){


        game = new RockPaperScissors(Move.ROCK);

        String displayResult = game.play();

        Intent intent = new Intent(this, ResultActivity.class);
        intent.putExtra("result", displayResult);


        startActivity(intent);

    }

    public void onScissorsButtonClick(View button){


        game = new RockPaperScissors(Move.SCISSORS);

        String displayResult = game.play();

        Intent intent = new Intent(this, ResultActivity.class);
        intent.putExtra("result", displayResult);


        startActivity(intent);

    }

    public void onPaperButtonClick(View button){


        game = new RockPaperScissors(Move.PAPER);

        String displayResult = game.play();

        Intent intent = new Intent(this, ResultActivity.class);
        intent.putExtra("result", displayResult);


        startActivity(intent);

    }
}
