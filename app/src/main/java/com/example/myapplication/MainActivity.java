package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onBtnClick (View view){
        TextView helloTxt = findViewById(R.id.txtHello);
        EditText editText = findViewById(R.id.editTextName);

        helloTxt.setText("Hey, "+ editText.getText().toString());
    }
}