package com.example.kush.firstassignment;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private String[] hands = {"rock", "paper", "scissors"};
    private int ppoints = 0;
    private int cpoints = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void buttonClicked(View view) {
        Button b = (Button) view;
        String player = b.getText().toString().toLowerCase();
        determineWinner(player);
    }

    public void determineWinner(String player) {
        int idx = new Random().nextInt(hands.length);
        String computer = hands[idx];

        if (player.equals(computer)) {
            restoreColor();
            Toast.makeText(this, "You tied!", Toast.LENGTH_SHORT).show();
        }

        else if (player.equals("scissors") && computer.equals("paper")) {
            Button playerb = (Button) findViewById(R.id.scissors);
            Button computerb = (Button) findViewById(R.id.paper);
            restoreColor();
            playerb.setTextColor(Color.parseColor("#0000FF"));
            computerb.setTextColor(Color.parseColor("#FF0000"));

            Toast.makeText(this, "Scissors cuts paper! You won!", Toast.LENGTH_SHORT).show();
            ppoints++;
            TextView playerPoints = (TextView) findViewById(R.id.playerPoints);
            playerPoints.setText("Your score: " + Integer.toString(ppoints));
        }

        else if (player.equals("paper") && computer.equals("scissors")) {
            Button playerb = (Button) findViewById(R.id.paper);
            Button computerb = (Button) findViewById(R.id.scissors);
            restoreColor();
            playerb.setTextColor(Color.parseColor("#FF0000"));
            computerb.setTextColor(Color.parseColor("#0000FF"));

            Toast.makeText(this, "Scissors cuts paper! You lost!", Toast.LENGTH_SHORT).show();
            cpoints++;
            TextView playerPoints = (TextView) findViewById(R.id.computerPoints);
            playerPoints.setText("Computer score: " + Integer.toString(cpoints));
        }

        else if (player.equals("rock") && computer.equals("scissors")) {
            Button playerb = (Button) findViewById(R.id.rock);
            Button computerb = (Button) findViewById(R.id.scissors);
            restoreColor();
            playerb.setTextColor(Color.parseColor("#0000FF"));
            computerb.setTextColor(Color.parseColor("#FF0000"));

            Toast.makeText(this, "Rock crushes scissors! You won!", Toast.LENGTH_SHORT).show();
            ppoints++;
            TextView playerPoints = (TextView) findViewById(R.id.playerPoints);
            playerPoints.setText("Your score: " + Integer.toString(ppoints));
        }

        else if (player.equals("scissors") && computer.equals("rock")) {
            Button playerb = (Button) findViewById(R.id.scissors);
            Button computerb = (Button) findViewById(R.id.rock);
            restoreColor();
            playerb.setTextColor(Color.parseColor("#FF0000"));
            computerb.setTextColor(Color.parseColor("#0000FF"));

            Toast.makeText(this, "Rock crushes scissors! You lost!", Toast.LENGTH_SHORT).show();
            cpoints++;
            TextView playerPoints = (TextView) findViewById(R.id.computerPoints);
            playerPoints.setText("Computer score: " + Integer.toString(cpoints));
        }

        else if (player.equals("paper") && computer.equals("rock")) {
            Button playerb = (Button) findViewById(R.id.paper);
            Button computerb = (Button) findViewById(R.id.rock);
            restoreColor();
            playerb.setTextColor(Color.parseColor("#0000FF"));
            computerb.setTextColor(Color.parseColor("#FF0000"));

            Toast.makeText(this, "Paper covers rock! You won!", Toast.LENGTH_SHORT).show();
            ppoints++;
            TextView playerPoints = (TextView) findViewById(R.id.playerPoints);
            playerPoints.setText("Your score: " + Integer.toString(ppoints));
        }

        else if (player.equals("rock") && computer.equals("paper")) {
            Button playerb = (Button) findViewById(R.id.rock);
            Button computerb = (Button) findViewById(R.id.paper);
            restoreColor();
            playerb.setTextColor(Color.parseColor("#FF0000"));
            computerb.setTextColor(Color.parseColor("#0000FF"));

            Toast.makeText(this, "Paper covers rock! You lost!", Toast.LENGTH_SHORT).show();
            cpoints++;
            TextView playerPoints = (TextView) findViewById(R.id.computerPoints);
            playerPoints.setText("Computer score: " + Integer.toString(cpoints));
        }
    }

    private void restoreColor() {
        Button scissorsb = (Button) findViewById(R.id.scissors);
        Button rockb = (Button) findViewById(R.id.rock);
        Button paperb = (Button) findViewById(R.id.paper);
        scissorsb.setTextColor(Color.parseColor("#000000"));
        rockb.setTextColor(Color.parseColor("#000000"));
        paperb.setTextColor(Color.parseColor("#000000"));
    }
}
