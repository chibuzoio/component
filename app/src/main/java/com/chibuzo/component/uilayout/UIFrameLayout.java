package com.chibuzo.component.uilayout;

import android.content.Context;
import android.widget.FrameLayout;

import androidx.annotation.NonNull;

import com.chibuzo.component.model.constants.UIConst;
import com.chibuzo.component.uiinterface.UILayout;

public class UIFrameLayout extends FrameLayout implements UILayout {
    private int layoutType;
    private int layoutParamsType;

    public UIFrameLayout(@NonNull Context context) {
        super(context);

        FrameLayout.LayoutParams frameLayoutParams = new FrameLayout.LayoutParams(
                FrameLayout.LayoutParams.MATCH_PARENT, FrameLayout.LayoutParams.MATCH_PARENT);

        layoutParamsType = UIConst.MATCH_WIDTH_MATCH_HEIGHT_PARAMS;
        layoutType = UIConst.FRAMELAYOUT_LAYOUT_TYPE;
        setLayoutParams(frameLayoutParams);
    }

    public int getLayoutType() {
        return layoutType;
    }

    public int getLayoutParamsType() {
        return layoutParamsType;
    }
}


