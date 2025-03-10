package com.example.trivia11a;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class InstructionActivity extends AppCompatActivity implements View.OnClickListener {
Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.instruction);
        btn=findViewById(R.id.btnn);

        btn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        finish();
    }
}