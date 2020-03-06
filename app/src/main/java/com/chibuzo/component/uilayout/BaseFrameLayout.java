package com.chibuzo.component.uilayout;

import android.content.Context;
import android.widget.FrameLayout;

import androidx.annotation.NonNull;

public class BaseFrameLayout extends FrameLayout {

    public BaseFrameLayout(@NonNull Context context) {
        super(context);

        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(
                LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT);

        setLayoutParams(layoutParams);
    }
}


