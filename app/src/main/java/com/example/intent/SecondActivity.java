package com.example.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Message;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    TextView textView;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        textView = findViewById(R.id.textView);
        imageView = findViewById(R.id.imageView);

        Bundle bundle = getIntent().getExtras();

        if (bundle != null) {
            String cameValue = bundle.getString("value");
            int cameImage = bundle.getInt("image");

            textView.setText(cameValue);
            imageView.setImageResource(cameImage);
        } else {
            Toast.makeText(this, "null", Toast.LENGTH_SHORT).show();
        }

    }
}