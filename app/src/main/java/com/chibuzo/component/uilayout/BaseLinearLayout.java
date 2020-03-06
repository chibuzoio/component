package com.chibuzo.component.uilayout;

import android.content.Context;
import android.widget.LinearLayout;

public class BaseLinearLayout extends LinearLayout {

    public BaseLinearLayout(Context context) {
        super(context);

        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT);

        setLayoutParams(layoutParams);

        setOrientation(VERTICAL);
    }
}


