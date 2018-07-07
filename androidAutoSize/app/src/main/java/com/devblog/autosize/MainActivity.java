package com.devblog.autosize;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // https://developer.android.com/guide/topics/ui/look-and-feel/autosizing-textview
        setContentView(R.layout.activity_main);
    }
}
