package com.chibuzo.component.viewcomponent;

import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.view.Gravity;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.content.ContextCompat;
import androidx.core.view.ViewCompat;

import com.chibuzo.component.GenericLayoutParams;
import com.chibuzo.component.R;
import com.chibuzo.component.utility.AU;

public class TextViewComponent extends AppCompatTextView {
    private float layoutWeight;
    private int alignment, textViewColor;
    private GenericLayoutParams genericLayoutParams;

    public static final int TEXT_ALIGN_LEFT = 0;
    public static final int TEXT_ALIGN_CENTER = 1;
    public static final int TEXT_ALIGN_RIGHT = 2;

    public static final int NORMAL_TEXT = 0;
    public static final int BOLD_TEXT = 1;

    public TextViewComponent(ViewGroup viewGroup, String text, float textSize) {
        this(viewGroup, text, textSize, NORMAL_TEXT);
    }

    public TextViewComponent(ViewGroup viewGroup, String text, float textSize, int textStyle) {
        this(viewGroup, text, textSize, textStyle, TEXT_ALIGN_LEFT);
    }

    public TextViewComponent(ViewGroup viewGroup, String text, float textSize, int textStyle, int alignment) {
        super(viewGroup.getContext());

        int horizontalParam = GenericLayoutParams.MATCH_PARENT;
        int verticalParam = GenericLayoutParams.WRAP_CONTENT;

        genericLayoutParams = new GenericLayoutParams(viewGroup, horizontalParam, verticalParam);

        setLayoutParams(genericLayoutParams.getLayoutParams());

        setText(text);
        setAlignment(alignment);
        setTextStyle(textStyle);
        setTextViewColor(R.color.genericBlackColor);
        setTextSize(AU.dimen(viewGroup.getContext(), textSize));

        viewGroup.addView(this);
    }

    public int getTextViewColor() {
        return textViewColor;
    }

    public void setTextViewColor(int textViewColor) {
        setTextColor(ContextCompat.getColor(getContext(), textViewColor));
        this.textViewColor = textViewColor;
    }

    public void setLayoutGravity(int gravity) {
        genericLayoutParams.setLayoutGravity(this, gravity);
    }

    public void setComponentColor(int color) {
        setBackgroundColor(ContextCompat.getColor(getContext(), color));
    }

    public void setBackground(int background) {
        setDrawable(ContextCompat.getDrawable(getContext(), background));
    }

    public void setDrawable(Drawable drawable) {
        ViewCompat.setBackground(this, drawable);
    }

    public float getLayoutWeight() {
        return layoutWeight;
    }

    public void setLayoutWeight(float layoutWeight) {
        if (genericLayoutParams.getLayoutParams() instanceof LinearLayout.LayoutParams) {
            ((LinearLayout.LayoutParams) genericLayoutParams.getLayoutParams()).weight = layoutWeight;
        }

        this.layoutWeight = layoutWeight;
    }

    public void setPadding(float left, float top, float right, float bottom) {
        setPadding(AU.dimen(getContext(), left), AU.dimen(getContext(), top),
                AU.dimen(getContext(), right), AU.dimen(getContext(), bottom));
    }

    public void setMargins(float left, float top, float right, float bottom) {
        genericLayoutParams.setLayoutMargin(this, left, top, right, bottom);
    }

    public GenericLayoutParams getGenericLayoutParams() {
        return genericLayoutParams;
    }

    public void setGenericLayoutParams(GenericLayoutParams genericLayoutParams) {
        setLayoutParams(genericLayoutParams.getLayoutParams());
        this.genericLayoutParams = genericLayoutParams;
    }

    public int getAlignment() {
        return alignment;
    }

    public void setTextStyle(int textStyle) {
        switch (textStyle) {
            case BOLD_TEXT:
                setTypeface(Typeface.DEFAULT_BOLD);
                break;
            case NORMAL_TEXT:
            default:
                setTypeface(Typeface.DEFAULT);
        }
    }

    public void setAlignment(int alignment) {
        this.alignment = alignment;

        switch (alignment) {
            case TEXT_ALIGN_CENTER:
                setGravity(Gravity.CENTER);
                break;
            case TEXT_ALIGN_RIGHT:
                setGravity(Gravity.RIGHT);
                break;
            case TEXT_ALIGN_LEFT:
            default:
                setGravity(Gravity.LEFT);
        }
    }
}


