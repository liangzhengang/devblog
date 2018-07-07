package com.devblog.autosize;

import android.os.Build;
import android.support.v4.widget.TextViewCompat;
import android.util.TypedValue;

/**
 * 预设大小
 */
public class PresetSizesSetActivity extends BaseActivity {


    @Override
    public void loadContentView() {
        setContentView(R.layout.activity_preset_sizes_set);
    }

    @Override
    public void initView() {
        int[] presetSizes = getResources().getIntArray(R.array.auto_size_text_sizes_code);
        // 原生代码设置
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            textView2.setAutoSizeTextTypeUniformWithPresetSizes(presetSizes, TypedValue.COMPLEX_UNIT_SP);
        }
        // 兼容库代码设置
        TextViewCompat.setAutoSizeTextTypeUniformWithPresetSizes(textView4, presetSizes, TypedValue.COMPLEX_UNIT_SP);

    }
}
