package com.chibuzo.component.uicomponent;

import android.content.Context;
import android.view.ViewGroup;

import androidx.appcompat.widget.AppCompatButton;

import com.chibuzo.component.control.UIDimensionController;
import com.chibuzo.component.uiinterface.UIComponent;

public class UIButton extends AppCompatButton implements UIComponent {
    private UIDimensionController uiDimensionController;
    private com.chibuzo.component.model.UIComponent uiComponent;

    public UIButton(Context context, ViewGroup viewGroup) {
        super(context);

        viewGroup.addView(this);

        uiComponent = new com.chibuzo.component.model.UIComponent(this);
        uiDimensionController = new UIDimensionController(this, uiComponent);

        setUIText("Submit");
    }

    @Override
    public UIComponent setUIComponentPosition(int uiComponentPosition) {
        uiDimensionController.setUIComponentPosition(uiComponentPosition);
        return this;
    }

    @Override
    public UIComponent setUIMarginBottom(int bottom) {
        uiDimensionController.setUIMarginBottom(bottom);
        return this;
    }

    @Override
    public UIComponent setUIMarginRight(int right) {
        uiDimensionController.setUIMarginRight(right);
        return this;
    }

    @Override
    public UIComponent setUIMarginLeft(int left) {
        uiDimensionController.setUIMarginLeft(left);
        return this;
    }

    @Override
    public int getUILayoutParamsType() {
        return uiComponent.getUILayoutParamsType();
    }

    @Override
    public UIComponent setUIMarginTop(int top) {
        uiDimensionController.setUIMarginTop(top);
        return this;
    }

    @Override
    public UIComponent setUIMargin(int left, int top, int right, int bottom) {
        uiDimensionController.setUIMargin(left, top, right, bottom);
        return this;
    }

    @Override
    public UIComponent setUIPaddingBottom(int bottom) {
        uiDimensionController.setUIPaddingBottom(bottom);
        return this;
    }

    @Override
    public void setUILayoutParamsType(int uiLayoutParamsType) {
        uiDimensionController.setUILayoutParamsType(uiLayoutParamsType);
    }

    @Override
    public UIComponent setUIPaddingRight(int right) {
        uiDimensionController.setUIPaddingRight(right);
        return this;
    }

    @Override
    public UIComponent setUIPaddingLeft(int left) {
        uiDimensionController.setUIPaddingLeft(left);
        return this;
    }

    @Override
    public UIComponent setUIPaddingTop(int top) {
        uiDimensionController.setUIPaddingTop(top);
        return this;
    }

    public UIButton setUIText(String buttonText) {
        super.setText(buttonText);
        return this;
    }

    @Override
    public UIComponent setUIPadding(int left, int top, int right, int bottom) {
        uiDimensionController.setUIPadding(left, top, right, bottom);
        return this;
    }
}


