package com.devblog.androidfont;

import android.content.Context;
import android.graphics.Typeface;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

/**
 * 描述:
 *
 * @author zhangrq
 * 2018/7/2 17:27
 */
public class FontsUtils {
    private static Map<String, Typeface> typefaceMap = new HashMap<>();

    /**
     * 获取字体类型，使用map进行缓存
     *
     * @param context      上下文
     * @param typefacePath Assets目录下的字型路径
     * @return 字体类型
     */
    public static Typeface getTypeface(Context context, String typefacePath) {
        Typeface typeface = typefaceMap.get(typefacePath);
        if (typeface == null) {
            typeface = Typeface.createFromAsset(context.getAssets(), typefacePath);
            typefaceMap.put(typefacePath, typeface);
        }
        return typeface;
    }

    /**
     * 设置全局字体样式
     *
     * @param oldTypeface 原来设置的字体类型名：SANS_SERIF、SERIF、MONOSPACE
     * @param newTypeface 要设置的字体类型
     */
    public static void setTypeface(String oldTypeface, Typeface newTypeface) {
        try {
            Field field = Typeface.class.getDeclaredField(oldTypeface);
            field.setAccessible(true);
            field.set(null, newTypeface);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
