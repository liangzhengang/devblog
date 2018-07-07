package com.devblog.autosize;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    // 默认设置
    public void defaultSet(View view) {
        startActivity(new Intent(getApplicationContext(), DefaultSetActivity.class));
    }
    // 粒度设置
    public void granularitySet(View view) {
        startActivity(new Intent(getApplicationContext(), GranularitySetActivity.class));
    }
    // 预设大小设置
    public void presetSizesSet(View view) {
        startActivity(new Intent(getApplicationContext(), PresetSizesSetActivity.class));
    }
}
