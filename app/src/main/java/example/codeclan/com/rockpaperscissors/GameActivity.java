package example.codeclan.com.rockpaperscissors;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class GameActivity extends AppCompatActivity {

    ImageButton rock;
    ImageButton scissors;
    ImageButton paper;
    RockPaperScissors game;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.game_activity);

        rock = findViewById(R.id.rock);
        scissors = findViewById(R.id.scissors);
        paper = findViewById(R.id.paper);

    }


    public void onButtonClick(View button){

        Move userMove = Move.valueOf(button.getTag().toString());

        game = new RockPaperScissors(userMove);

        String displayResult = game.play();

        String displayComputerMove = "Computer played: " + game.computerMoveString();
        String displayUserMove = "You played: " + game.userMoveString();

        Intent intent = new Intent(this, ResultActivity.class);
        intent.putExtra("result", displayResult);
        intent.putExtra("computerMove", displayComputerMove);
        intent.putExtra("userMove", displayUserMove);

        startActivity(intent);

    }

}
