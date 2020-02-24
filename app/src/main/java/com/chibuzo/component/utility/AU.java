package com.chibuzo.component.utility;

import android.content.Context;
import android.util.DisplayMetrics;

public class AU {

    public static int dimen(Context context, float densityPixel) {
        return (int) (densityPixel * ((float) context.getResources().getDisplayMetrics().densityDpi / DisplayMetrics.DENSITY_DEFAULT));
    }
}


