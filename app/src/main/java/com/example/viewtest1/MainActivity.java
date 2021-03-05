package com.example.viewtest1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.os.Bundle;
import android.view.View;

import static com.example.viewtest1.ui.View_Five.startView_Five;
import static com.example.viewtest1.ui.View_One.startView_One;
import static com.example.viewtest1.ui.View_Three.startView_Three;
import static com.example.viewtest1.ui.View_Two.startView_Two;
import static com.example.viewtest1.ui.View_four.startView_Four;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private AppCompatButton button1;
    private AppCompatButton button2;
    private AppCompatButton button3;
    private AppCompatButton button4;
    private AppCompatButton button5;
    private AppCompatButton button6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        button1 = findViewById(R.id.button1);
        button1.setOnClickListener(this);

        button2 = findViewById(R.id.button2);
        button2.setOnClickListener(this);

        button3 = findViewById(R.id.button3);
        button3.setOnClickListener(this);

        button4 = findViewById(R.id.button4);
        button4.setOnClickListener(this);

        button5 = findViewById(R.id.button5);
        button5.setOnClickListener(this);

        button6 = findViewById(R.id.button6);
        button6.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.button1:
                startView_One(this);
                break;
            case R.id.button2:
            case R.id.button5:
                startView_Two(this);
                break;
            case R.id.button3:
                startView_Three(this);
                break;
            case R.id.button4:
                startView_Four(this);
                break;
            case R.id.button6:
                startView_Five(this);

        }

    }
}