package com.sohun.tasbeeh;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    AppCompatButton incrementBtn;
    ImageButton restartBtn;
    TextView displayView;
    int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        incrementBtn = findViewById(R.id.incrementBtn);
        displayView = findViewById(R.id.displayView);
        restartBtn = findViewById(R.id.restartBtn);

//        ========================= Increment button ============================

        incrementBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                count++;
                displayView.setText("" + count);

            }
        });

//        ========================= Restart button ============================

        restartBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                count = 0;
                displayView.setText("" + count);

            }
        });

    }
}