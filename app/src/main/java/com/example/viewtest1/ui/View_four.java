package com.example.viewtest1.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import com.example.viewtest1.R;

public class View_four extends AppCompatActivity {
    /*
    弹性滑动——使用Scroller
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_four);
    }
    public static void startView_Four(Context context){
        Intent intent = new Intent(context,View_four.class);
        context.startActivity(intent);
    }
}