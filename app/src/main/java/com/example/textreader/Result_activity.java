package com.example.textreader;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class Result_activity extends AppCompatActivity {

    private ImageButton backButon;
    private TextView resultTextView;
    private String resultText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result_activity);

        backButon = findViewById(R.id.back_button);
        resultTextView = findViewById(R.id.result_textview);

        resultText = getIntent().getStringExtra(Text_Recognization.RESULT_TEXT);

        resultTextView.setText(resultText);
        backButon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }
}