package com.chibuzo.component.viewcomponent;

import android.graphics.Typeface;
import android.view.Gravity;
import android.view.ViewGroup;

import androidx.core.content.ContextCompat;

import com.chibuzo.component.R;
import com.chibuzo.component.GenericLayoutParams;
import com.chibuzo.component.layoutcomponent.VerticalLinearLayout;
import com.chibuzo.component.utility.AU;

public class ButtonComponent extends VerticalLinearLayout {
    private int labelSize;
    private String buttonLabel;
    private TextViewComponent textViewComponent;

    public ButtonComponent(ViewGroup viewGroup, String buttonLabel) {
        this(viewGroup, buttonLabel, 5);
    }

    public ButtonComponent(ViewGroup viewGroup, String buttonLabel, int labelSize) {
        super(viewGroup.getContext(), viewGroup,
                GenericLayoutParams.MATCH_PARENT, GenericLayoutParams.WRAP_CONTENT);

        this.buttonLabel = buttonLabel;
        this.labelSize = labelSize;

        getGenericLayoutParams().getLayoutParams().height = AU.dimen(viewGroup.getContext(), 47);

        setDrawable(AU.curveBackgroundCorner(viewGroup.getContext(), R.color.royalBlue, 11.111f));
        setFocusableInTouchMode(false);
        setGravity(Gravity.CENTER);

        setButtonLabel();
    }

    public TextViewComponent getButtonLabel() {
        return textViewComponent;
    }

    public void setButtonLabel() {
        textViewComponent = new TextViewComponent(this, buttonLabel, labelSize);
        textViewComponent.setTextColor(ContextCompat.getColor(getContext(), R.color.whiteColor));
        textViewComponent.setTypeface(Typeface.DEFAULT_BOLD);
        textViewComponent.setGravity(Gravity.CENTER);
    }
}


