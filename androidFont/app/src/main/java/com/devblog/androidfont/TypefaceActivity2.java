package com.devblog.androidfont;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class TypefaceActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // 反射设置
        // 必须在设置文字之前调用，建议放到application的onCreate里面
        FontsUtils.setTypeface("SERIF", Typeface.createFromAsset(getAssets(), "fonts/aa.ttf"));
        FontsUtils.setTypeface("SANS_SERIF", Typeface.createFromAsset(getAssets(), "fonts/bb.ttf"));
        setContentView(R.layout.activity_typeface2);
    }
}
