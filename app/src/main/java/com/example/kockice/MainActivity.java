package com.example.kockice;
import androidx.appcompat.app.AppCompatActivity;
import android.graphics.Color;
import android.view.View;
import android.widget.Button;
import android.os.Bundle;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = findViewById(R.id.button);
        TextView t1 = (TextView)findViewById(R.id.textview1);
        View view = findViewById(R.id.layout);

        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                t1.setText((new Random().nextInt(6) + 1) + "   " + (new Random().nextInt(6) + 1));
                view.setBackgroundColor(Color.rgb(new Random().nextInt(256),new Random().nextInt(256),new Random().nextInt(256)));
            }
        });
    }
}
