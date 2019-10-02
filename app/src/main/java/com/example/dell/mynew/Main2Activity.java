package com.example.dell.mynew;

import android.support.v7.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Main2Activity extends AppCompatActivity {
    private EditText nim,nama; private Button btnenter;
    @Override protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        nim = findViewById(R.id.edit1);
        nama = findViewById(R.id.edit2);
        btnenter = (Button) findViewById(R.id.btnenter);
        btnenter.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View view) {
                Intent i = new Intent(Main2Activity.this,Main3Activity.class);
                i.putExtra("i_nama", nama.getText().toString());
                startActivity(i);// i.putExtra("i_nim",nim.getText());
                // i.putExtra("i_nama",nama.getText().toString()); startActivity(i); } }); } }
            }});}}