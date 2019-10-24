package com.example.cs18aao.diceroller;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    private EditText userInput;
    private int counter = 0;
    private TextView points;
    private TextView counting;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        textView = (TextView) findViewById(R.id.textView);
        userInput = (EditText) findViewById(R.id.userInput);
        points = (TextView) findViewById(R.id.points);
        counting = (TextView) findViewById(R.id.counting);




        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void roll_the_dice (View view){

        TextView tv = (TextView) this.findViewById(R.id.textView);

        Random r = new Random();
        int number = r.nextInt(6);

        tv.setText(Integer.toString(number));


        int  num = Integer.parseInt(userInput.getText().toString());
        if (num < 1 || num > 6)
        {
            Toast.makeText(this, "Invalid input, the number must be 1 - 6", Toast.LENGTH_SHORT).show();
        }
        else if (num == number)
        {
            Toast.makeText(this, "congratulations, you guessed right!", Toast.LENGTH_SHORT).show();
            counter = counter + 1;
            points.setText(Integer.toString(counter));
        }
    }

    public void D_ICE (View view){

        TextView tv = (TextView) this.findViewById(R.id.textView);

        Random r = new Random();
        String question = r.
    }
}










