package com.chibuzo.component.layoutcomponent;

import android.content.Context;
import android.view.ViewGroup;

public class VerticalLinearLayout extends LinearLayoutComponent {

    public VerticalLinearLayout(Context context, int horizontalParam, int verticalParam) {
        this(context, null, horizontalParam, verticalParam);
    }

    public VerticalLinearLayout(Context context, ViewGroup viewGroup,
                                int horizontalParam, int verticalParam) {
        super(context, viewGroup, horizontalParam, verticalParam);

        setOrientation(VERTICAL);
    }
}


