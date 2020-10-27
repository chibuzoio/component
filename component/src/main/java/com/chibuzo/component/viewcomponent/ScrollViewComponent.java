package com.chibuzo.component.viewcomponent;

import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ScrollView;

import com.chibuzo.component.GenericLayoutParams;
import com.chibuzo.component.utility.AU;

public class ScrollViewComponent extends ScrollView {
    private float layoutWeight;
    private ViewGroup viewGroup;
    private GenericLayoutParams genericLayoutParams;

    public ScrollViewComponent(ViewGroup viewGroup) {
        super(viewGroup.getContext());

        int horizontalParam = GenericLayoutParams.MATCH_PARENT;
        int verticalParam = GenericLayoutParams.MATCH_PARENT;

        this.viewGroup = viewGroup;

        genericLayoutParams = new GenericLayoutParams(viewGroup, horizontalParam, verticalParam);

        setLayoutParams(genericLayoutParams.getLayoutParams());
        setHorizontalScrollBarEnabled(false);
        setVerticalScrollBarEnabled(false);

        viewGroup.addView(this);
    }

    public void setLayoutParams(int horizontalParam, int verticalParam) {
        genericLayoutParams = new GenericLayoutParams(viewGroup, horizontalParam, verticalParam);
        setLayoutParams(genericLayoutParams.getLayoutParams());
    }

    public void setLayoutGravity(int gravity) {
        genericLayoutParams.setLayoutGravity(this, gravity);
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

    public void setPadding(int left, int top, int right, int bottom) {
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


