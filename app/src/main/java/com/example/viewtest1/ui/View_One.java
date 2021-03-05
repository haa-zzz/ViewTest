package com.example.viewtest1.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import com.example.viewtest1.R;

public class View_One extends AppCompatActivity {
    /*
    View的滑动—— 使用scrollTo/scrollBy
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view__one);
    }
    public static void startView_One(Context context){
        Intent intent = new Intent(context,View_One.class);
        context.startActivity(intent);
    }
}