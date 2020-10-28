package com.chibuzo.component.viewcomponent;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.Gravity;
import android.view.ViewGroup;

import androidx.core.content.ContextCompat;

import com.chibuzo.component.GenericLayoutParams;
import com.chibuzo.component.R;
import com.chibuzo.component.layoutcomponent.HorizontalLinearLayout;
import com.chibuzo.component.utility.AU;

public class IconLabelButton extends HorizontalLinearLayout {
    private int labelSize;
    private Context context;
    private TextViewComponent buttonLabel;
    private ImageViewComponent buttonIcon;

    public IconLabelButton(ViewGroup viewGroup, int drawableResource, String buttonLabel) {
        this(viewGroup, drawableResource, buttonLabel, 5);
    }

    public IconLabelButton(ViewGroup viewGroup, Drawable drawable, String buttonLabel) {
        this(viewGroup, drawable, buttonLabel, 5);
    }

    public IconLabelButton(ViewGroup viewGroup, int drawableResource, String buttonLabel, int labelSize) {
        this(viewGroup, ContextCompat.getDrawable(viewGroup.getContext(), drawableResource), buttonLabel, labelSize);
    }

    public IconLabelButton(ViewGroup viewGroup, Drawable drawable, String buttonLabel, int labelSize) {
        super(viewGroup.getContext(), viewGroup,
                GenericLayoutParams.MATCH_PARENT, GenericLayoutParams.WRAP_CONTENT);

        this.context = viewGroup.getContext();
        this.labelSize = labelSize;

        getGenericLayoutParams().setLayoutMargin(this, 0, 23, 0, 23);
        getGenericLayoutParams().getLayoutParams().height = AU.dimen(context, 47);

        setBackground(R.drawable.generic_button);
        setFocusableInTouchMode(false);
        setGravity(Gravity.CENTER);

        setButtonIcon(drawable);
        setButtonLabel(buttonLabel);
    }

    public TextViewComponent getButtonLabel() {
        return buttonLabel;
    }

    public void setButtonLabel(String buttonLabel) {
        this.buttonLabel = new TextViewComponent(this, buttonLabel, labelSize, TextViewComponent.BOLD_TEXT);
        this.buttonLabel.setTextColor(ContextCompat.getColor(context, R.color.whiteColor));

        GenericLayoutParams genericLayoutParams = new GenericLayoutParams(this,
                GenericLayoutParams.WRAP_CONTENT, GenericLayoutParams.WRAP_CONTENT);

        this.buttonLabel.setGenericLayoutParams(genericLayoutParams);
        this.buttonLabel.setMargins(11, 0, 0, 0);
    }

    public void setButtonLabel(TextViewComponent buttonLabel) {
        this.buttonLabel = buttonLabel;
    }

    public ImageViewComponent getButtonIcon() {
        return buttonIcon;
    }

    public void setButtonIcon(int drawableResource) {
        setButtonIcon(ContextCompat.getDrawable(context, drawableResource));
    }

    public void setButtonIcon(Drawable drawable) {
        buttonIcon = new ImageViewComponent(this, drawable);
        buttonIcon.getGenericLayoutParams().getLayoutParams().width = AU.dimen(context, 25);
        buttonIcon.getGenericLayoutParams().getLayoutParams().height = AU.dimen(context, 25);
    }
}


