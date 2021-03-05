package com.example.viewtest1.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

import com.example.viewtest1.MainActivity;
import com.example.viewtest1.R;

public class View_Two extends AppCompatActivity {

    /*
    View的滑动—— 使用动画
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view__two);
        AppCompatButton button = findViewById(R.id.two_button);

        button.setOnClickListener(v -> {
            /*

            Animation animation = AnimationUtils.loadAnimation(View_Two.this, R.anim.translate);
            button.startAnimation(animation);
             */
            //属性动画
            ObjectAnimator.ofFloat(button,"translationX",0,300).setDuration(1000).start();

        });
    }
    public static void startView_Two(Context context){
        Intent intent = new Intent(context,View_Two.class);
        context.startActivity(intent);
    }
}