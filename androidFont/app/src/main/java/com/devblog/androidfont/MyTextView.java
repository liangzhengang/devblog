package com.devblog.androidfont;

import android.content.Context;
import android.graphics.Typeface;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.widget.TextView;

/**
 * 描述:
 *
 * @author zhangrq
 * 2018/7/2 16:20
 */
public class MyTextView extends TextView {
    public MyTextView(Context context) {
        super(context);
    }

    public MyTextView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public MyTextView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public Typeface getTypeface() {
        return Typeface.createFromAsset(getContext().getAssets(), "fonts/aa.ttf");
    }

}
