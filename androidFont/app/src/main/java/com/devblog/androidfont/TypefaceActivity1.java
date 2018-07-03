package com.devblog.androidfont;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class TypefaceActivity1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_typeface1);
        TextView textView1 = findViewById(R.id.textView1);
        TextView textView2 = findViewById(R.id.textView2);
        // 直接设置
        textView1.setTypeface(Typeface.createFromAsset(getAssets(), "fonts/aa.ttf"));
        textView2.setTypeface(Typeface.createFromAsset(getAssets(), "fonts/bb.ttf"));
    }
}
