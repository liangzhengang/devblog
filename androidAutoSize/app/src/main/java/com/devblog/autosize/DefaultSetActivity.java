package com.devblog.autosize;

import android.os.Build;
import android.support.v4.widget.TextViewCompat;
import android.widget.TextView;

/**
 * 默认设置
 */
public class DefaultSetActivity extends BaseActivity {

    @Override
    public void loadContentView() {
        setContentView(R.layout.activity_default_set);
    }

    @Override
    public void initView() {
        // 原生代码设置
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            textView2.setAutoSizeTextTypeWithDefaults(TextView.AUTO_SIZE_TEXT_TYPE_UNIFORM);
        }
        // 兼容库代码设置
        TextViewCompat.setAutoSizeTextTypeWithDefaults(textView4, TextViewCompat.AUTO_SIZE_TEXT_TYPE_UNIFORM);
    }
}
