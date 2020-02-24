package com.chibuzo.component.uilayout;

import android.content.Context;
import android.widget.FrameLayout;

import androidx.annotation.NonNull;

public class UIFrameLayout extends FrameLayout {

    public UIFrameLayout(@NonNull Context context) {
        super(context);

        FrameLayout.LayoutParams frameLayoutParams = new FrameLayout.LayoutParams(
                FrameLayout.LayoutParams.MATCH_PARENT, FrameLayout.LayoutParams.MATCH_PARENT);

        setLayoutParams(frameLayoutParams);
    }
}


