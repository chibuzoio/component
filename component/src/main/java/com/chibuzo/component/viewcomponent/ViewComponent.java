package com.chibuzo.component.viewcomponent;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import androidx.core.content.ContextCompat;
import androidx.core.view.ViewCompat;

import com.chibuzo.component.GenericLayoutParams;
import com.chibuzo.component.utility.AU;

public class ViewComponent extends View {
    private int componentColor;
    private GenericLayoutParams genericLayoutParams;
    private float componentWidth, componentHeight, layoutWeight;

    public ViewComponent(ViewGroup viewGroup, int componentColor, float componentHeight) {
        super(viewGroup.getContext());

        int horizontalParam = GenericLayoutParams.MATCH_PARENT;
        int verticalParam = GenericLayoutParams.WRAP_CONTENT;

        genericLayoutParams = new GenericLayoutParams(viewGroup, horizontalParam, verticalParam);

        setLayoutParams(genericLayoutParams.getLayoutParams());

        this.componentHeight = componentHeight;
        this.componentColor = componentColor;

        setComponentHeight(componentHeight);
        setComponentColor(componentColor);

        viewGroup.addView(this);
    }

    public void setLayoutGravity(int gravity) {
        genericLayoutParams.setLayoutGravity(this, gravity);
    }

    public int getComponentColor() {
        return componentColor;
    }

    public void setComponentColor(int componentColor) {
        setBackgroundColor(ContextCompat.getColor(getContext(), componentColor));
        this.componentColor = componentColor;
    }

    public float getComponentWidth() {
        return componentWidth;
    }

    public void setComponentWidth(float componentWidth) {
        genericLayoutParams.getLayoutParams().width = AU.dimen(getContext(), componentWidth);
        this.componentWidth = componentWidth;
    }

    public float getComponentHeight() {
        return componentHeight;
    }

    public void setComponentHeight(float componentHeight) {
        genericLayoutParams.getLayoutParams().height = AU.dimen(getContext(), componentHeight);
        this.componentHeight = componentHeight;
    }

    public void setBackground(int background) {
        setDrawable(ContextCompat.getDrawable(getContext(), background));
    }

    public void setDrawable(Drawable drawable) {
        ViewCompat.setBackground(this, drawable);
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


