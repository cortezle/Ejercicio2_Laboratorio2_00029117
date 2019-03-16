package com.example.ejercicio2;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnLongClickListener;
import android.widget.TextView;




public class MainActivity extends AppCompatActivity {

    private TextView tx1,tx2,tx3,tx4,tx5,tx6,tx7,tx8,tx9;
    private int random,uno,idn;
    private String t;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tx1 = findViewById(R.id.uno);
        tx2 = findViewById(R.id.dos);
        tx3 = findViewById(R.id.tres);
        tx4 = findViewById(R.id.cuatro);
        tx5 = findViewById(R.id.cinco);
        tx6 = findViewById(R.id.seis);
        tx7 = findViewById(R.id.siete);
        tx8 = findViewById(R.id.ocho);
        tx9 = findViewById(R.id.nueve);

        tx1.setOnLongClickListener(new OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                tx1.setBackgroundColor(Color.rgb((int) (Math.random() * 255),(int) (Math.random() * 255),(int) (Math.random() * 255)));
                return false;
            }
        });
        tx2.setOnLongClickListener(new OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                tx2.setBackgroundColor(Color.rgb((int) (Math.random() * 255),(int) (Math.random() * 255),(int) (Math.random() * 255)));
                return false;
            }
        });
        tx3.setOnLongClickListener(new OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                tx3.setBackgroundColor(Color.rgb((int) (Math.random() * 255),(int) (Math.random() * 255),(int) (Math.random() * 255)));
                return false;
            }
        });
        tx4.setOnLongClickListener(new OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                tx4.setBackgroundColor(Color.rgb((int) (Math.random() * 255),(int) (Math.random() * 255),(int) (Math.random() * 255)));
                return false;
            }
        });
        tx5.setOnLongClickListener(new OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                tx5.setBackgroundColor(Color.rgb((int) (Math.random() * 255),(int) (Math.random() * 255),(int) (Math.random() * 255)));
                return false;
            }
        });
        tx6.setOnLongClickListener(new OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                tx6.setBackgroundColor(Color.rgb((int) (Math.random() * 255),(int) (Math.random() * 255),(int) (Math.random() * 255)));
                return false;
            }
        });
        tx7.setOnLongClickListener(new OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                tx7.setBackgroundColor(Color.rgb((int) (Math.random() * 255),(int) (Math.random() * 255),(int) (Math.random() * 255)));
                return false;
            }
        });
        tx8.setOnLongClickListener(new OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                tx8.setBackgroundColor(Color.rgb((int) (Math.random() * 255),(int) (Math.random() * 255),(int) (Math.random() * 255)));
                return false;
            }
        });
        tx9.setOnLongClickListener(new OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                tx9.setBackgroundColor(Color.rgb((int) (Math.random() * 255),(int) (Math.random() * 255),(int) (Math.random() * 255)));
                return false;
            }
        });




    }


}
