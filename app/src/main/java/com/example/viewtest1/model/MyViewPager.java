package com.example.viewtest1.model;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;

/**
 * 随手势滑动水平移动，使用scrollTo
 */
public class MyViewPager extends ViewGroup {
    private int mLastX;
    public MyViewPager(Context context) {
        super(context);
        init();
    }
    public MyViewPager(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public MyViewPager(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }
    private void init() {
    }


    @Override
    protected void onLayout(boolean changed, int l, int t, int r, int b) {
        int count = getChildCount();
        for(int i = 0; i < count; i++){
            View child = getChildAt(i);
            child.layout(i * getWidth(), t, (i+1) * getWidth(), b);
        }

    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        int count = getChildCount();
        for(int i = 0; i < count; i++){
            View child = getChildAt(i);
            child.measure(widthMeasureSpec,heightMeasureSpec);
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {

        int x = (int) event.getX();
        switch (event.getAction()){
            case MotionEvent.ACTION_DOWN:
                mLastX = x;
                break;
            case MotionEvent.ACTION_MOVE:
                int dx = mLastX - x;            //本次手势滑动了多大距离
                int oldScrollX = getScrollX();  //原来的偏移量
                int preScrollX = oldScrollX + dx;//本次滑动后形成的偏移量
                if(preScrollX > (getChildCount() - 1) * getWidth()){
                    preScrollX = (getChildCount() - 1) * getWidth();
                }
                if(preScrollX < 0){
                    preScrollX = 0;
                }
                scrollTo(preScrollX,getScrollY());
                mLastX = x;
                break;
        }
        return true;
    }

}
