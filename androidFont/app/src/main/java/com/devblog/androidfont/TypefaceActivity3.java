package com.devblog.androidfont;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class TypefaceActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_typeface3);
        // fontFamily设置
        // textView1 未使用版本兼容
        // textView2 使用了版本兼容
    }
}
