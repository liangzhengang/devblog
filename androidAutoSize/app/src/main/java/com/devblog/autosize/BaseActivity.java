package com.devblog.autosize;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.DisplayMetrics;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import android.widget.TextView;

public abstract class BaseActivity extends AppCompatActivity {

    public TextView textView1;
    public TextView textView2;
    public TextView textView3;
    public TextView textView4;
    private int screenWidth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        loadContentView();
        // 找控件
        textView1 = findViewById(R.id.textView1);
        textView2 = findViewById(R.id.textView2);
        textView3 = findViewById(R.id.textView3);
        textView4 = findViewById(R.id.textView4);
        SeekBar seekBar = findViewById(R.id.seekBar);
        // 获取屏幕宽
        DisplayMetrics dm = getResources().getDisplayMetrics();
        screenWidth = dm.widthPixels;
        // 改变控件的宽
        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                // 设置控件宽
                setTextViewWidth(textView1, i);
                setTextViewWidth(textView2, i);
                setTextViewWidth(textView3, i);
                setTextViewWidth(textView4, i);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
        initView();
    }

    public abstract void loadContentView();
    public abstract void initView();

    private void setTextViewWidth(TextView textView, int i) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) textView.getLayoutParams();
        layoutParams.width = screenWidth * i / 100;
        textView.setLayoutParams(layoutParams);
    }
}
