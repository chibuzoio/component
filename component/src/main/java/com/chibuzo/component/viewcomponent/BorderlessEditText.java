package com.chibuzo.component.viewcomponent;

import android.view.Gravity;
import android.view.ViewGroup;

import com.chibuzo.component.GenericLayoutParams;
import com.chibuzo.component.R;
import com.chibuzo.component.layoutcomponent.HorizontalLinearLayout;
import com.chibuzo.component.layoutcomponent.VerticalLinearLayout;

public class BorderlessEditText extends VerticalLinearLayout {
    private String editTextHint;
    private ViewComponent editTextUnderline;
    private ImageViewComponent editTextIconView;
    private EditTextComponent borderlessEditTextView;
    private int editTextIcon, editTextBackgroundColor;
    private HorizontalLinearLayout borderlessEditTextLayout;

    public BorderlessEditText(ViewGroup viewGroup, int editTextIcon, String editTextHint) {
        super(viewGroup.getContext(), viewGroup,
                GenericLayoutParams.MATCH_PARENT, GenericLayoutParams.WRAP_CONTENT);

        this.editTextIcon = editTextIcon;
        this.editTextHint = editTextHint;

        setBorderlessEditTextLayout();
        setEditTextUnderline();
    }

    public String getEditTextHint() {
        return editTextHint;
    }

    public void setEditTextHint(String editTextHint) {
        borderlessEditTextView.setHint(editTextHint);
        this.editTextHint = editTextHint;
    }

    public int getEditTextIcon() {
        return editTextIcon;
    }

    public void setEditTextIcon(int editTextIcon) {
        editTextIconView.setImageObject(editTextIcon);
        this.editTextIcon = editTextIcon;
    }

    public int getEditTextBackgroundColor() {
        return editTextBackgroundColor;
    }

    public void setEditTextBackgroundColor(int editTextBackgroundColor) {
        borderlessEditTextView.setComponentColor(editTextBackgroundColor);
        this.editTextBackgroundColor = editTextBackgroundColor;
    }

    public HorizontalLinearLayout getBorderlessEditTextLayout() {
        return borderlessEditTextLayout;
    }

    private void setBorderlessEditTextLayout() {
        borderlessEditTextLayout = new HorizontalLinearLayout(getContext(), this,
                GenericLayoutParams.MATCH_PARENT, GenericLayoutParams.WRAP_CONTENT);
        setEditTextIconView();
        setBorderlessEditTextView();
    }

    public ViewComponent getEditTextUnderline() {
        return editTextUnderline;
    }

    private void setEditTextUnderline() {
        editTextUnderline = new ViewComponent(this, R.color.faintLine, 1);
    }

    public ImageViewComponent getEditTextIconView() {
        return editTextIconView;
    }

    private void setEditTextIconView() {
        editTextIconView = new ImageViewComponent(borderlessEditTextLayout, editTextIcon);
        editTextIconView.setLayoutGravity(Gravity.CENTER_VERTICAL);
        editTextIconView.setImageObject(editTextIcon);
        editTextIconView.setImageSize(27);
    }

    public EditTextComponent getBorderlessEditTextView() {
        return borderlessEditTextView;
    }

    private void setBorderlessEditTextView() {
        borderlessEditTextView = new EditTextComponent(borderlessEditTextLayout, editTextHint);
        borderlessEditTextView.setMargins(5, 0, 0, 0);
        setEditTextBackgroundColor(R.color.whiteColor);
    }
}


