package com.chibuzo.component.uicomponent;

import android.content.Context;
import android.util.Log;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import androidx.appcompat.widget.AppCompatButton;

import com.chibuzo.component.utility.AU;

public class UIButton extends AppCompatButton {
    private Context context;
    private ViewGroup viewGroup;
    private int marginTop, marginLeft, marginRight, marginBottom;
    private int paddingTop, paddingLeft, paddingRight, paddingBottom;

    public UIButton(ViewGroup viewGroup) {
        super(viewGroup.getContext());

        this.viewGroup = viewGroup;
        this.context = viewGroup.getContext();

        marginTop = AU.dimen(context, 7);
        marginLeft = AU.dimen(context, 7);
        marginRight = AU.dimen(context, 7);
        marginBottom = AU.dimen(context, 7);
        paddingTop = AU.dimen(context, 7);
        paddingLeft = AU.dimen(context, 7);
        paddingRight = AU.dimen(context, 7);
        paddingBottom = AU.dimen(context, 7);

        setUIText("Submit");
        setUIMargin(marginLeft, marginTop, marginRight, marginBottom);
        setUIPadding(paddingLeft, paddingTop, paddingRight, paddingBottom);
        viewGroup.addView(this);
    }

    public UIButton setUIMarginBottom(int bottom) {
        marginBottom = AU.dimen(context, bottom);
        setUIMargin(marginLeft, marginTop, marginRight, marginBottom);
        return this;
    }

    public UIButton setUIMarginRight(int right) {
        marginRight = AU.dimen(context, right);
        setUIMargin(marginLeft, marginTop, marginRight, marginBottom);
        return this;
    }

    public UIButton setUIMarginLeft(int left) {
        marginLeft = AU.dimen(context, left);
        setUIMargin(marginLeft, marginTop, marginRight, marginBottom);
        return this;
    }

    public UIButton setUIMarginTop(int top) {
        marginTop = AU.dimen(context, top);
        setUIMargin(marginLeft, marginTop, marginRight, marginBottom);
        return this;
    }

    public UIButton setUIMargin(int left, int top, int right, int bottom) {
        if (viewGroup instanceof FrameLayout) {
            FrameLayout.LayoutParams uiButtonLayoutParams =
                    new FrameLayout.LayoutParams(FrameLayout.LayoutParams.MATCH_PARENT,
                            FrameLayout.LayoutParams.WRAP_CONTENT);

            Log.e("context", "Context value here is " + context);

            marginTop = AU.dimen(context, top);
            marginLeft = AU.dimen(context, left);
            marginRight = AU.dimen(context, right);
            marginBottom = AU.dimen(context, bottom);

            uiButtonLayoutParams.setMargins(marginLeft, marginTop, marginRight, marginBottom);

            setLayoutParams(uiButtonLayoutParams);
        } else if (viewGroup instanceof LinearLayout) {

        } else if (viewGroup instanceof RelativeLayout) {

        }

        return this;
    }

    public UIButton setUIPaddingBottom(int bottom) {
        paddingBottom = AU.dimen(context, bottom);
        super.setPadding(paddingLeft, paddingTop, paddingRight, paddingBottom);
        return this;
    }

    public UIButton setUIPaddingRight(int right) {
        paddingRight = AU.dimen(context, right);
        super.setPadding(paddingLeft, paddingTop, paddingRight, paddingBottom);
        return this;
    }

    public UIButton setUIPaddingLeft(int left) {
        paddingLeft = AU.dimen(context, left);
        super.setPadding(paddingLeft, paddingTop, paddingRight, paddingBottom);
        return this;
    }

    public UIButton setUIPaddingTop(int top) {
        paddingTop = AU.dimen(context, top);
        super.setPadding(paddingLeft, paddingTop, paddingRight, paddingBottom);
        return this;
    }

    public UIButton setUIText(String buttonText) {
        super.setText(buttonText);
        return this;
    }

    public UIButton setUIPadding(int left, int top, int right, int bottom) {
        paddingTop = AU.dimen(context, top);
        paddingLeft = AU.dimen(context, left);
        paddingRight = AU.dimen(context, right);
        paddingBottom = AU.dimen(context, bottom);
        super.setPadding(paddingLeft, paddingTop, paddingRight, paddingBottom);
        return this;
    }
}


