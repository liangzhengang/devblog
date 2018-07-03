package com.devblog.androidfont;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void jump1(View view) {
        // 直接设置
        startActivity(new Intent(getApplicationContext(), TypefaceActivity1.class));
    }

    public void jump2(View view) {
        // 反射设置
        startActivity(new Intent(getApplicationContext(), TypefaceActivity2.class));
    }

    public void jump3(View view) {
        // fontFamily设置
        startActivity(new Intent(getApplicationContext(), TypefaceActivity3.class));
    }
}
