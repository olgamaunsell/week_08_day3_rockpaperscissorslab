package example.codeclan.com.rockpaperscissors;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class WelcomeActivity extends AppCompatActivity {

    Button play;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        play = findViewById(R.id.playBtn);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.activity_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.action_hello) {
            Toast.makeText(WelcomeActivity.this, R.string.menu_toast_hello,
                    Toast.LENGTH_SHORT).show();
            return true;
        }
        if (item.getItemId() == R.id.action_play) {
            beginGame();
            return true;
        }
        return super.onOptionsItemSelected(item);

    }

    public void beginGame() {
        Intent beginGame = new Intent(this, GameActivity.class);
        startActivity(beginGame);

    }

    public void onPlayButtonClick(View view) {
        beginGame();

    }
}
