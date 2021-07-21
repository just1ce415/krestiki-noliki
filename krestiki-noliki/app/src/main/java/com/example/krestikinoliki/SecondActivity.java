package com.example.proj3;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class SecondActivity extends Activity {

    ImageButton b1;
    ImageButton b2;
    ImageButton b3;
    ImageButton b4;
    ImageButton b5;
    ImageButton b6;
    ImageButton b7;
    ImageButton b8;
    ImageButton b9;
    Button toMenu;
    Button Retry;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second);

        b1 = findViewById(R.id.b1);
        b2 = findViewById(R.id.b2);
        b3 = findViewById(R.id.b3);
        b4 = findViewById(R.id.b4);
        b5 = findViewById(R.id.b5);
        b6 = findViewById(R.id.b6);
        b7 = findViewById(R.id.b7);
        b8 = findViewById(R.id.b8);
        b9 = findViewById(R.id.b9);
        toMenu = findViewById(R.id.toMenu);
        Retry = findViewById(R.id.retry);

        toMenu.setEnabled(false);
        Retry.setEnabled(false);

        final TicTac game = new TicTac();
        final int[] pole = new int[9];

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!game.isTurn()) {
                    if (pole[0] == 0) {
                        b1.setImageResource(R.drawable.krest);
                        pole[0] = 1;
                        game.setTurn(true);
                    }
                }
                else {
                    if (pole[0] == 0) {
                        b1.setImageResource(R.drawable.noll);
                        pole[0] = 2;
                        game.setTurn(false);
                    }
                }

                if (game.IsEnd(pole)){
                    End();
                }
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!game.isTurn()) {
                    if (pole[1] == 0) {
                        b2.setImageResource(R.drawable.krest);
                        pole[1] = 1;
                        game.setTurn(true);
                    }
                }
                else {
                    if (pole[1] == 0) {
                        b2.setImageResource(R.drawable.noll);
                        pole[1] = 2;
                        game.setTurn(false);
                    }
                }

                if (game.IsEnd(pole)){
                    End();
                }
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!game.isTurn()) {
                    if (pole[2] == 0) {
                        b3.setImageResource(R.drawable.krest);
                        pole[2] = 1;
                        game.setTurn(true);
                    }
                }
                else {
                    if (pole[2] == 0) {
                        b3.setImageResource(R.drawable.noll);
                        pole[2] = 2;
                        game.setTurn(false);
                    }
                }

                if (game.IsEnd(pole)){
                    End();
                }
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!game.isTurn()) {
                    if (pole[3] == 0) {
                        b4.setImageResource(R.drawable.krest);
                        pole[3] = 1;
                        game.setTurn(true);
                    }
                }
                else {
                    if (pole[3] == 0) {
                        b4.setImageResource(R.drawable.noll);
                        pole[3] = 2;
                        game.setTurn(false);
                    }
                }

                if (game.IsEnd(pole)){
                    End();
                }
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!game.isTurn()) {
                    if (pole[4] == 0) {
                        b5.setImageResource(R.drawable.krest);
                        pole[4] = 1;
                        game.setTurn(true);
                    }
                }
                else {
                    if (pole[4] == 0) {
                        b5.setImageResource(R.drawable.noll);
                        pole[4] = 2;
                        game.setTurn(false);
                    }
                }

                if (game.IsEnd(pole)){
                    End();
                }
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!game.isTurn()) {
                    if (pole[5] == 0) {
                        b6.setImageResource(R.drawable.krest);
                        pole[5] = 1;
                        game.setTurn(true);
                    }
                }
                else {
                    if (pole[5] == 0) {
                        b6.setImageResource(R.drawable.noll);
                        pole[5] = 2;
                        game.setTurn(false);
                    }
                }

                if (game.IsEnd(pole)){
                    End();
                }
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!game.isTurn()) {
                    if (pole[6] == 0) {
                        b7.setImageResource(R.drawable.krest);
                        pole[6] = 1;
                        game.setTurn(true);
                    }
                }
                else {
                    if (pole[6] == 0) {
                        b7.setImageResource(R.drawable.noll);
                        pole[6] = 2;
                        game.setTurn(false);
                    }
                }

                if (game.IsEnd(pole)){
                    End();
                }
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!game.isTurn()) {
                    if (pole[7] == 0) {
                        b8.setImageResource(R.drawable.krest);
                        pole[7] = 1;
                        game.setTurn(true);
                    }
                }
                else {
                    if (pole[7] == 0) {
                        b8.setImageResource(R.drawable.noll);
                        pole[7] = 2;
                        game.setTurn(false);
                    }
                }

                if (game.IsEnd(pole)){
                    End();
                }
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!game.isTurn()) {
                    if (pole[8] == 0) {
                        b9.setImageResource(R.drawable.krest);
                        pole[8] = 1;
                        game.setTurn(true);
                    }
                }
                else {
                    if (pole[8] == 0) {
                        b9.setImageResource(R.drawable.noll);
                        pole[8] = 2;
                        game.setTurn(false);
                    }
                }

                if (game.IsEnd(pole)){
                    End();
                }
            }
        });

        toMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SecondActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

        Retry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Activity activity = SecondActivity.this;
                activity.recreate();
            }
        });
    }

    private void End (){
        toMenu.setEnabled(true);
        Retry.setEnabled(true);
        b1.setEnabled(false);
        b2.setEnabled(false);
        b3.setEnabled(false);
        b4.setEnabled(false);
        b5.setEnabled(false);
        b6.setEnabled(false);
        b7.setEnabled(false);
        b8.setEnabled(false);
        b9.setEnabled(false);
    }
}
