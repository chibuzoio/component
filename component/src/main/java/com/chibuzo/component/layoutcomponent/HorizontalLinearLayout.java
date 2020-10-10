package com.chibuzo.component.layoutcomponent;

import android.content.Context;
import android.view.ViewGroup;

public class HorizontalLinearLayout extends LinearLayoutComponent {

    public HorizontalLinearLayout(Context context, int horizontalParam, int verticalParam) {
        this(context, null, horizontalParam, verticalParam);
    }

    public HorizontalLinearLayout(Context context, ViewGroup viewGroup,
                                int horizontalParam, int verticalParam) {
        super(context, viewGroup, horizontalParam, verticalParam);

        setOrientation(HORIZONTAL);
    }
}


