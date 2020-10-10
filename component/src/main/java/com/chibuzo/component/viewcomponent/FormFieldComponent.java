package com.chibuzo.component.viewcomponent;

import android.graphics.Typeface;
import android.view.ViewGroup;

import com.chibuzo.component.GenericLayoutParams;
import com.chibuzo.component.layoutcomponent.VerticalLinearLayout;

public class FormFieldComponent extends VerticalLinearLayout {
    private String formLabel, hint;
    private int labelSize, editorInputType;
    private EditTextComponent editTextComponent;
    private TextViewComponent textViewComponent;

    public FormFieldComponent(ViewGroup viewGroup, String formLabel, String hint) {
        this(viewGroup, formLabel, hint, EditTextComponent.INPUT_TYPE_TEXT);
    }

    public FormFieldComponent(ViewGroup viewGroup, String formLabel,
                              String hint, int editorInputType) {
        this(viewGroup, formLabel, 5, hint, editorInputType);
    }

    public FormFieldComponent(ViewGroup viewGroup, String formLabel,
                              int labelSize, String hint, int editorInputType) {
        super(viewGroup.getContext(), viewGroup,
                GenericLayoutParams.MATCH_PARENT, GenericLayoutParams.WRAP_CONTENT);

        this.editorInputType = editorInputType;
        this.formLabel = formLabel;
        this.labelSize = labelSize;
        this.hint = hint;

        getGenericLayoutParams().setLayoutMargin(this, 0, (int) 11.111, 0, 0);

        setFormLabel();
        setFormInput();
    }

    public EditTextComponent getFormInput() {
        return editTextComponent;
    }

    public void setFormInput() {
        editTextComponent = new EditTextComponent(this, hint, editorInputType);
    }

    public TextViewComponent getFormLabel() {
        return textViewComponent;
    }

    public void setFormLabel() {
        textViewComponent = new TextViewComponent(this, formLabel, labelSize);
        textViewComponent.setTypeface(Typeface.DEFAULT_BOLD);
    }
}


