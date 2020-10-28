package com.chibuzo.component.viewcomponent;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.Gravity;
import android.view.ViewGroup;

import androidx.core.content.ContextCompat;

import com.chibuzo.component.GenericLayoutParams;
import com.chibuzo.component.R;
import com.chibuzo.component.layoutcomponent.VerticalLinearLayout;
import com.chibuzo.component.utility.AU;

public class IconOnlyButton extends VerticalLinearLayout {
    private Context context;
    private ImageViewComponent buttonIcon;

    public IconOnlyButton(ViewGroup viewGroup, int drawableResource) {
        this(viewGroup, ContextCompat.getDrawable(viewGroup.getContext(), drawableResource));
    }

    public IconOnlyButton(ViewGroup viewGroup, Drawable drawable) {
        super(viewGroup.getContext(), viewGroup,
                GenericLayoutParams.MATCH_PARENT, GenericLayoutParams.WRAP_CONTENT);

        this.context = viewGroup.getContext();

        getGenericLayoutParams().getLayoutParams().width = AU.dimen(context, 47);
        getGenericLayoutParams().getLayoutParams().height = AU.dimen(context, 47);

        setBackground(R.drawable.generic_round_corner);
        setPadding(7, 7, 7, 7);
        setFocusableInTouchMode(false);
        setGravity(Gravity.CENTER);
        setElevation(15);

        setButtonIcon(drawable);
    }

    public ImageViewComponent getButtonIcon() {
        return buttonIcon;
    }

    public void setButtonIcon(Drawable drawable) {
        buttonIcon = new ImageViewComponent(this, drawable);
        buttonIcon.setBackground(R.drawable.generic_round_corner);
        buttonIcon.setRoundCornerCenterImage(drawable);
    }

    public void setButtonIcon(int drawableResource) {
        setButtonIcon(ContextCompat.getDrawable(context, drawableResource));
    }
}


