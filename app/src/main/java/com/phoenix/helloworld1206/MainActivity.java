package com.phoenix.helloworld1206;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {

    EditText editText; //username
    EditText editTex2; //password
    Button submitButton; //simple button action

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = (EditText)findViewById(R.id.editText);
        editTex2 = (EditText)findViewById(R.id.editText2);
        submitButton = (Button)findViewById(R.id.submitButton);

        submitButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String str = editText.getText().toString();

                // passing data to next activity please
                Intent intent = new Intent(getApplicationContext(), quizActivity.class);
                intent.putExtra("MSKmessage", str);
                startActivity(intent);
            }
        });
    }
}
