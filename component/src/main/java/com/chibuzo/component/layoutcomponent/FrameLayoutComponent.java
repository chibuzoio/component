package com.chibuzo.component.layoutcomponent;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;

import androidx.core.content.ContextCompat;
import androidx.core.view.ViewCompat;

import com.chibuzo.component.GenericLayoutParams;
import com.chibuzo.component.utility.AU;

public class FrameLayoutComponent extends FrameLayout {
    private float layoutWeight;
    private GenericLayoutParams genericLayoutParams;

    public FrameLayoutComponent(Context context, int horizontalParams, int verticalParams) {
        this(context, null, horizontalParams, verticalParams);
    }

    public FrameLayoutComponent(Context context, ViewGroup viewGroup,
                                int horizontalParam, int verticalParam) {
        super(context);

        genericLayoutParams = new GenericLayoutParams(viewGroup, horizontalParam, verticalParam);

        setLayoutParams(genericLayoutParams.getLayoutParams());

        setFocusableInTouchMode(true);

        if (viewGroup != null) {
            viewGroup.addView(this);
        }
    }

    public void setLayoutGravity(int gravity) {
        genericLayoutParams.setLayoutGravity(this, gravity);
    }

    public void setComponentColor(int color) {
        setBackgroundColor(ContextCompat.getColor(getContext(), color));
    }

    public void setBackground(int background) {
        setDrawable(ContextCompat.getDrawable(getContext(), background));
    }

    public void setDrawable(Drawable drawable) {
        ViewCompat.setBackground(this, drawable);
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
        super.setPadding(AU.dimen(getContext(), left), AU.dimen(getContext(), top),
                AU.dimen(getContext(), right), AU.dimen(getContext(), bottom));
    }

    public void setMargins(float left, float top, float right, float bottom) {
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


