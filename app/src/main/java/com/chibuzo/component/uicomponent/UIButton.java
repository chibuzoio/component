package com.chibuzo.component.uicomponent;

import android.view.ViewGroup;

import androidx.appcompat.widget.AppCompatButton;

import com.chibuzo.component.control.UIDimensionController;
import com.chibuzo.component.model.constants.UIComponentParams;
import com.chibuzo.component.model.constants.UIComponentSize;
import com.chibuzo.component.uiinterface.UIComponent;

public class UIButton extends AppCompatButton implements UIComponent {
    private UIDimensionController uiDimensionController;
    private com.chibuzo.component.model.UIComponent uiComponent;

    public UIButton(ViewGroup viewGroup) {
        super(viewGroup.getContext());

        viewGroup.addView(this);

        uiComponent = new com.chibuzo.component.model.UIComponent(viewGroup, this);
        uiDimensionController = new UIDimensionController(uiComponent);

        setParentLayoutProperties(viewGroup);

        setUIText("Submit");
        setUILayoutType(viewGroup);
        setUIComponentSize(UIComponentSize.WIDE_COMPONENT_SIZE);
        setUILayoutParamsType(UIComponentParams.MATCH_WIDTH_WRAP_HEIGHT_PARAMS);
    }

    @Override
    public UIComponent setUIComponentPosition(int uiComponentPosition) {
        uiDimensionController.setUIComponentPosition(uiComponentPosition);
        return this;
    }

    @Override
    public void setUIParentLayoutType(ViewGroup viewGroup) {
        uiDimensionController.setUIParentLayoutType(viewGroup);
    }

    @Override
    public int getUILayoutType() {
        return uiComponent.getUILayoutType();
    }

    @Override
    public int getUIParentSize() {
        return uiComponent.getUIParentSize();
    }

    @Override
    public ViewGroup getUIComponentLayout() {
        return uiComponent.getUIComponentLayout();
    }

    @Override
    public int getUIComponentSize() {
        return uiComponent.getUIComponentSize();
    }

    @Override
    public int getUILayoutParamsType() {
        return uiComponent.getUILayoutParamsType();
    }

    @Override
    public int getUIParentLayoutType() {
        return uiComponent.getUIParentLayoutType();
    }

    @Override
    public ViewGroup getUIParentLayout() {
        return uiComponent.getUIParentLayout();
    }

    @Override
    public void setUILayoutParamsType(int uiLayoutParamsType) {
        uiDimensionController.setUILayoutParamsType(uiLayoutParamsType);
    }

    @Override
    public void setParentLayoutProperties(ViewGroup viewGroup) {
        setUIParentLayoutType(viewGroup);
        setUIParentSize(viewGroup);
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
    public void setUIComponentSize(int uiComponentSize) {
        uiDimensionController.setUIComponentSize(uiComponentSize);
    }

    @Override
    public UIComponent setUIPaddingRight(int right) {
        uiDimensionController.setUIPaddingRight(right);
        return this;
    }

    @Override
    public void setUILayoutType(ViewGroup viewGroup) {
        uiDimensionController.setUILayoutType(viewGroup);
    }

    @Override
    public void setUIParentSize(ViewGroup viewGroup) {
        uiDimensionController.setUIParentSize(viewGroup);
    }

    @Override
    public UIComponent setUIPaddingLeft(int left) {
        uiDimensionController.setUIPaddingLeft(left);
        return this;
    }

    @Override
    public void setUIComponentLayout(ViewGroup uiComponentLayout) {
        uiComponent.setUIComponentLayout(uiComponentLayout);
    }

    @Override
    public void setUILayoutType(int uiLayoutType) {
        uiComponent.setUILayoutType(uiLayoutType);
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


