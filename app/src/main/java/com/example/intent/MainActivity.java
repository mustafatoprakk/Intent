package com.example.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button button;
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button=findViewById(R.id.button);
        editText=findViewById(R.id.editText);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String value=editText.getText().toString();

                Intent intent=new Intent(getApplicationContext(),SecondActivity.class);
                intent.putExtra("value",value);
                intent.putExtra("image",R.drawable.ic_car);
                startActivity(intent);
            }
        });


    }
}