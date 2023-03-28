package com.ankit.funbackground;

import android.graphics.Color;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private LinearLayout Layout;
    private ImageButton btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Layout = findViewById(R.id.layout);
        btn = findViewById(R.id.imageButton);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random random =new Random();
                int color = Color.argb(247,random.nextInt(256),
                        random.nextInt(234),random.nextInt(345));
                Layout.setBackgroundColor(color);



            }
        });


    }
}