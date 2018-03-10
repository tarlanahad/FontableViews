package com.tarlanahad.fontableviews;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.support.annotation.Nullable;
import android.support.v7.widget.AppCompatEditText;
import android.util.AttributeSet;


public class FontableEditText extends AppCompatEditText {
    public FontableEditText(Context context) {
        super(context);
    }

    public FontableEditText(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        TypedArray ta = context.obtainStyledAttributes(attrs, R.styleable.FontableEditText, 0, 0);
        try {
            setFont(ta.getString(R.styleable.FontableEditText_et_font));
        } finally {
            ta.recycle();
        }
    }

   public void setFont(String FontName) {
        try {
            setTypeface(Typeface.createFromAsset(getContext().getAssets(), "fonts/" + FontName));
        } catch (Exception e) {
        }
    }

    public FontableEditText(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }
}