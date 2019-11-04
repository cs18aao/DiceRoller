package com.example.cs18aao.diceroller;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class newDice extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_dice);
    }

    public void DiceCancel (View view) {
        Intent i = new Intent(newDice.this, MainActivity.class);
        startActivity(i);
    }

    public void DiceSave (View view) {
        Intent i = new Intent(newDice.this, MainActivity.class);
        startActivity(i);
    }
}
