package com.examp.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import android.graphics.*;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ConstraintLayout layout = findViewById(R.id.layout);

        Button button = findViewById(R.id.change);

        button.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                int red = (int) (Math.random() * 255);
                int blue = (int)(Math.random() * 255);
                int green = (int) (Math.random() * 255);

                layout.setBackgroundColor(Color.rgb(red, green, blue));
            }
        });
    }
}
