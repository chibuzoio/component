package com.chibuzo.component.viewcomponent;

import android.graphics.drawable.Drawable;
import android.text.InputType;
import android.view.Gravity;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import androidx.appcompat.widget.AppCompatEditText;
import androidx.core.content.ContextCompat;
import androidx.core.view.ViewCompat;

import com.chibuzo.component.R;
import com.chibuzo.component.GenericLayoutParams;
import com.chibuzo.component.utility.AU;

public class EditTextComponent extends AppCompatEditText {
    private float layoutWeight;
    private int editorInputType;
    private GenericLayoutParams genericLayoutParams;

    public static final int INPUT_TYPE_TEXT = 0;
    public static final int INPUT_TYPE_NUMBER = 1;
    public static final int INPUT_TYPE_DATE_TIME = 2;
    public static final int INPUT_TYPE_PHONE = 3;
    public static final int INPUT_TYPE_TEXT_PASSWORD = 4;
    public static final int INPUT_TYPE_NUMBER_PASSWORD = 5;

    public EditTextComponent(ViewGroup viewGroup, String hint) {
        this(viewGroup, hint, INPUT_TYPE_TEXT);
    }

    public EditTextComponent(ViewGroup viewGroup, String hint, int editorInputType) {
        super(viewGroup.getContext());

        int horizontalParam = GenericLayoutParams.MATCH_PARENT;
        int verticalParam = GenericLayoutParams.WRAP_CONTENT;

        genericLayoutParams = new GenericLayoutParams(viewGroup, horizontalParam, verticalParam);

        genericLayoutParams.getLayoutParams().height = AU.dimen(getContext(), 43);

        setLayoutParams(genericLayoutParams.getLayoutParams());

        setPadding(7, 0, 7, 0);

        setHint(hint);
        setGravity(Gravity.CENTER_VERTICAL);
        setEditorInputType(editorInputType);
        setTextColor(ContextCompat.getColor(getContext(), R.color.genericBlackColor));

        ViewCompat.setBackground(this, ContextCompat.getDrawable(getContext(), R.drawable.generic_edit_text));

        viewGroup.addView(this);
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

    public int getEditorInputType() {
        return editorInputType;
    }

    public void setEditorInputType(int editorInputType) {
        this.editorInputType = editorInputType;

        switch (editorInputType) {
            case INPUT_TYPE_NUMBER:
                setInputType(InputType.TYPE_CLASS_NUMBER);
                break;
            case INPUT_TYPE_DATE_TIME:
                setInputType(InputType.TYPE_CLASS_DATETIME);
                break;
            case INPUT_TYPE_PHONE:
                setInputType(InputType.TYPE_CLASS_PHONE);
                break;
            case INPUT_TYPE_TEXT_PASSWORD:
                setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_VARIATION_PASSWORD);
                break;
            case INPUT_TYPE_NUMBER_PASSWORD:
                setInputType(InputType.TYPE_CLASS_NUMBER | InputType.TYPE_NUMBER_VARIATION_PASSWORD);
                break;
            case INPUT_TYPE_TEXT:
            default:
                setInputType(InputType.TYPE_CLASS_TEXT);
                break;
        }
    }
}


