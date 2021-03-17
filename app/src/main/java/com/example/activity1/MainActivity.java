package com.example.activity1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btn_red, btn_blue, btn_green, btn_yellow, btn_pink, btn_reset;
    View bg_view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_red=(Button)findViewById(R.id.btn_red);
        btn_blue=(Button)findViewById(R.id.btn_blue);
        btn_green=(Button)findViewById(R.id.btn_green);
        btn_yellow=(Button)findViewById(R.id.btn_yellow);
        btn_pink=(Button)findViewById(R.id.btn_pink);
        btn_reset=(Button)findViewById(R.id.btn_reset);

        bg_view=this.getWindow().getDecorView();

        btn_red.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(btn_red.getText().equals("RED"))
                {
                    bg_view.setBackgroundResource(R.color.red);
                    Toast.makeText(MainActivity.this, "You changed the background color to red!",Toast.LENGTH_LONG).show();

                }
            }

        });
        btn_blue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(btn_blue.getText().equals("BLUE"))
                {
                    bg_view.setBackgroundResource(R.color.blue);
                    Toast.makeText(MainActivity.this, "You changed the background color to blue!", Toast.LENGTH_LONG).show();
                }
            }
        });
        btn_green.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(btn_green.getText().equals("GREEN"))
                {
                    bg_view.setBackgroundResource(R.color.green);
                    Toast.makeText(MainActivity.this, "You changed the background color to green!", Toast.LENGTH_LONG).show();
                }
            }
        });
        btn_yellow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(btn_yellow.getText().equals("YELLOW"))
                {
                    bg_view.setBackgroundResource(R.color.yellow);
                    Toast.makeText(MainActivity.this, "You changed the background color to yellow!", Toast.LENGTH_LONG).show();
                }
            }
        });
        btn_pink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(btn_pink.getText().equals("PINK"))
                {
                    bg_view.setBackgroundResource(R.color.pink);
                    Toast.makeText(MainActivity.this, "You changed the background color to pink!", Toast.LENGTH_LONG).show();
                }
            }
        });
        btn_reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(btn_reset.getText().equals("RESET"))
                {
                    bg_view.setBackgroundResource(R.color.white);
                    Toast.makeText(MainActivity.this, "You changed the background color back to white!", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}