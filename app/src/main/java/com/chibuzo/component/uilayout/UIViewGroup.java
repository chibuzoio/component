package com.chibuzo.component.uilayout;

import android.content.Context;
import android.view.ViewGroup;

public class UIViewGroup extends ViewGroup {

    public UIViewGroup(Context context) {
        super(context);

        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);

        setLayoutParams(layoutParams);
    }

    @Override
    protected void onLayout(boolean changed, int l, int t, int r, int b) {

    }
}


