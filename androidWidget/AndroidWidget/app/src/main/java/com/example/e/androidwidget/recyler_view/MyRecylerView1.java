package com.example.e.androidwidget.recyler_view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;

/**
 * Created by e on 2016/4/19.
 */
public class MyRecylerView1 extends RecyclerView {
    public MyRecylerView1(Context context) {
        super(context);
    }

    public MyRecylerView1(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public MyRecylerView1(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }


    @Override
    public void onDraw(Canvas c) {
        super.onDraw(c);

        Path path = new Path();
//        path.move
    }

    @Override
    public boolean postDelayed(Runnable action, long delayMillis) {
        return super.postDelayed(action, delayMillis);
    }
}
