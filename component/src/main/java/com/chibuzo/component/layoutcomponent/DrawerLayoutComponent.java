package com.chibuzo.component.layoutcomponent;

import android.content.Context;
import android.graphics.drawable.Drawable;

import androidx.core.content.ContextCompat;
import androidx.core.view.ViewCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import com.chibuzo.component.GenericLayoutParams;

public class DrawerLayoutComponent extends DrawerLayout {
    private GenericLayoutParams genericLayoutParams;

    public DrawerLayoutComponent(Context context) {
        super(context);

        genericLayoutParams = new GenericLayoutParams(null,
                GenericLayoutParams.MATCH_PARENT, GenericLayoutParams.MATCH_PARENT);

        setLayoutParams(genericLayoutParams.getLayoutParams());

        setFocusableInTouchMode(true);
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

    public GenericLayoutParams getGenericLayoutParams() {
        return genericLayoutParams;
    }

    public void setGenericLayoutParams(GenericLayoutParams genericLayoutParams) {
        setLayoutParams(genericLayoutParams.getLayoutParams());
        this.genericLayoutParams = genericLayoutParams;
    }
}


