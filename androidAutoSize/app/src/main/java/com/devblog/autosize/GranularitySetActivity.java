package com.devblog.autosize;

import android.os.Build;
import android.support.v4.widget.TextViewCompat;
import android.util.TypedValue;

/**
 * 粒度设置
 */
public class GranularitySetActivity extends BaseActivity {

    @Override
    public void loadContentView() {
        setContentView(R.layout.activity_granularity_set);
    }

    @Override
    public void initView() {
        // 原生代码设置
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            textView2.setAutoSizeTextTypeUniformWithConfiguration(30, 50, 2, TypedValue.COMPLEX_UNIT_SP);
        }
        // 兼容库代码设置
        TextViewCompat.setAutoSizeTextTypeUniformWithConfiguration(textView4, 30, 50, 2, TypedValue.COMPLEX_UNIT_SP);
    }
}
