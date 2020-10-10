package com.chibuzo.component.layoutcomponent;

import android.content.Context;
import android.os.Build;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import androidx.annotation.NonNull;
import androidx.core.view.ViewCompat;
import androidx.viewpager.widget.ViewPager;

import com.chibuzo.component.GenericLayoutParams;
import com.chibuzo.component.utility.AU;

public class ViewPagerComponent extends ViewPager {
    private float layoutWeight;
    private GenericLayoutParams genericLayoutParams;

    public ViewPagerComponent(@NonNull Context context,
                              ViewGroup viewGroup, int horizontalParam, int verticalParam) {
        super(context);

        genericLayoutParams = new GenericLayoutParams(viewGroup, horizontalParam, verticalParam);

        setLayoutParams(genericLayoutParams.getLayoutParams());

        setId(ViewCompat.generateViewId());
        setFocusableInTouchMode(true);

        if (viewGroup != null) {
            viewGroup.addView(this);
        }
    }

    public void setLayoutGravity(int gravity) {
        genericLayoutParams.setLayoutGravity(this, gravity);
    }

    @Override
    public void setElevation(float elevation) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            super.setElevation(elevation);
        }
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

    public void setMargins(int left, int top, int right, int bottom) {
        genericLayoutParams.setLayoutMargin(this, left, top, right, bottom);
    }

    public GenericLayoutParams getGenericLayoutParams() {
        return genericLayoutParams;
    }

    public void setGenericLayoutParams(GenericLayoutParams genericLayoutParams) {
        setLayoutParams(genericLayoutParams.getLayoutParams());
        this.genericLayoutParams = genericLayoutParams;
    }
}


