package example.codeclan.com.rockpaperscissors;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;

/**
 * Created by admin on 24/01/2018.
 */

public class ResultActivity extends AppCompatActivity {

    TextView resultText;
    TextView computerMoveText;
    TextView userMoveText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(getClass().toString(), "onCreate is called");
        setContentView(R.layout.result);

        resultText = findViewById(R.id.result);
        userMoveText = findViewById(R.id.userMove);
        computerMoveText = findViewById(R.id.computerMove);

        Intent intent = getIntent();

        Bundle extras = intent.getExtras();

        String result = extras.getString("result");
        String computerMove = extras.getString("computerMove");
        String userMove = extras.getString("userMove");

        resultText.setText(result);
        userMoveText.setText(userMove);
        computerMoveText.setText(computerMove);

    }
}
