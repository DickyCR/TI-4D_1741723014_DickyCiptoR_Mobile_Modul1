package com.example.dell.mynew;

        import android.support.v7.app.AppCompatActivity;
        import android.content.Intent;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;
        import android.widget.TextView;

public class Main3Activity extends AppCompatActivity {
    private Button BtnBack;
    private TextView txtHai;
    @Override protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState); setContentView(R.layout.activity_main3);
        txtHai = (TextView) findViewById(R.id.txtHai);
        Intent i = getIntent();
        String nama = i.getStringExtra("i_nama");
        txtHai.setText("Hai " + nama + "!!!!!!");
        BtnBack = (Button) findViewById(R.id.BtnBack);
        BtnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { Intent start = new Intent(getApplicationContext(), Main2Activity.class);
                startActivity(start); }
        })
        ; }}

