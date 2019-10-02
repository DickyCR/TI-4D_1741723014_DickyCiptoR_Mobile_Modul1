package com.example.dell.mynew;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
        private Button btnStart;
        @Override protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            btnStart = (Button) findViewById(R.id.btnSrtated);
            btnStart.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent strat = new Intent(getApplicationContext(),
                            Main2Activity.class);
                    startActivity(strat);
                }
            }
            );
        } }



