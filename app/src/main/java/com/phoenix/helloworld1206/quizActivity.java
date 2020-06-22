package com.phoenix.helloworld1206;

import com.phoenix.helloworld1206.R;


import android.os.Bundle;
import android.widget.TextView;

import android.content.Intent;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class quizActivity extends AppCompatActivity {
    TextView textView2;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity2_testing);
    textView2 = (TextView)findViewById(R.id.textView2);

// retrieving through intents
        Intent intent = getIntent();
        String str = intent.getStringExtra("MSKmessage");
        textView2.setText(str);
    }
}
