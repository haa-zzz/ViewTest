package com.example.viewtest1.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;

import com.example.viewtest1.R;

public class View_Three extends AppCompatActivity {

    /*
   View的滑动—— 改变布局参数
    */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view__three);
        AppCompatButton button = findViewById(R.id.three_button);

        button.setOnClickListener(v -> {

            ViewGroup.MarginLayoutParams params = (ViewGroup.MarginLayoutParams) button.getLayoutParams();
           // params.width+=300;
            params.leftMargin+=300;
            button.requestLayout();
            //或者 button.setLayoutParams(params);
        });
    }
    public static void startView_Three(Context context){
        Intent intent = new Intent(context,View_Three.class);
        context.startActivity(intent);
    }
}