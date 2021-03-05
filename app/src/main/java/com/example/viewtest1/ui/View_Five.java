package com.example.viewtest1.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;

import com.example.viewtest1.R;

public class View_Five extends AppCompatActivity {
    private static final int MESSAGE_SCROLL_TO = 1;
    private static final int FRAME_COUNT  = 30;
    private static final int DELAYED_TIME = 33;

    private int mCount = 0;
    AppCompatButton button;
    @SuppressLint("HandlerLeak")
    private final Handler mHandler = new Handler(){
        public void handleMessage(Message msg){
            if (msg.what == MESSAGE_SCROLL_TO) {
                mCount++;
                if (mCount <= FRAME_COUNT) {
                    float fraction = mCount / (float) FRAME_COUNT;
                    int scrollX = (int) (fraction * 100);
                    button.scrollTo(-scrollX, 0);

                    mHandler.sendEmptyMessageDelayed(MESSAGE_SCROLL_TO,
                            DELAYED_TIME);
                }
            }
        }
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view__five);
        button = findViewById(R.id.five_button);
        button.setOnClickListener(v -> {
            Message message = mHandler.obtainMessage();
            message.what = MESSAGE_SCROLL_TO;
            mHandler.sendMessage(message);
        });

    }
    public static void startView_Five(Context context){
        Intent intent = new Intent(context,View_Five.class);
        context.startActivity(intent);
    }
}