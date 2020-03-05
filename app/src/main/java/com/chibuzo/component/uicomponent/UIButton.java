package com.chibuzo.component.uicomponent;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import androidx.appcompat.widget.AppCompatButton;

import com.chibuzo.component.control.UIComponentController;
import com.chibuzo.component.model.constants.UIComponentParams;
import com.chibuzo.component.model.constants.UIComponentPosition;
import com.chibuzo.component.model.constants.UIComponentSize;
import com.chibuzo.component.model.constants.UILayoutType;
import com.chibuzo.component.uiinterface.UIComponent;
import com.chibuzo.component.uilayout.UIFrameLayout;
import com.chibuzo.component.utility.AU;

public class UIButton extends AppCompatButton implements UIComponent {
    private Context context;
    private ViewGroup uiComponentLayout, uiParentLayout;
    private UIComponentController uiComponentController;
    private com.chibuzo.component.model.UIComponent uiComponent;
    private int uiLayoutType, uiLayoutParamsType, uiParentLayoutType, uiParentSize;

    public UIButton(ViewGroup viewGroup) {
        super(viewGroup.getContext());

        viewGroup.addView(this);

        this.context = viewGroup.getContext();

        setParentLayoutProperties(viewGroup);

        uiComponent = new com.chibuzo.component.model.UIComponent(viewGroup, this);
        uiComponentController = new UIComponentController(uiComponent);

        setUIText("Submit");
        setUILayoutType(viewGroup);
        setUIPadding(7, 7, 7, 7);
        setUIComponentSize(UIComponentSize.WIDE_COMPONENT_SIZE);
        setUILayoutParamsType(UIComponentParams.MATCH_WIDTH_WRAP_HEIGHT_PARAMS);
        uiComponentController.setMarginBase(0, 0, 0, 0);
    }

    @Override
    public UIComponent setUIComponentPosition(int uiComponentPosition) {
        uiComponentController.setUIComponentPosition(uiComponentPosition);
        return this;
    }

    @Override
    public void setUIParentLayoutType(ViewGroup viewGroup) {
        uiComponentController.setUIParentLayoutType(viewGroup);
    }

    @Override
    public int getUILayoutType() {
        return uiLayoutType;
    }

    @Override
    public int getUIParentSize() {
        return uiParentSize;
    }

    @Override
    public ViewGroup getUIComponentLayout() {
        return uiComponentLayout;
    }

    @Override
    public int getUIComponentSize() {
        return uiComponentSize;
    }

    @Override
    public int getUILayoutParamsType() {
        return uiLayoutParamsType;
    }

    @Override
    public int getUIParentLayoutType() {
        return uiParentLayoutType;
    }

    @Override
    public ViewGroup getUIParentLayout() {
        return uiParentLayout;
    }

    @Override
    public void setUIParentLayout(ViewGroup uiParentLayout) {
        this.uiParentLayout = uiParentLayout;
    }

    @Override
    public void setUILayoutParamsType(int uiLayoutParamsType) {
        this.uiLayoutParamsType = uiLayoutParamsType;
    }

    @Override
    public void setUIParentLayoutType(int uiParentLayoutType) {
        this.uiParentLayoutType = uiParentLayoutType;
    }

    @Override
    public void setParentLayoutProperties(ViewGroup viewGroup) {
        setUIParentLayoutType(viewGroup);
        setUIParentLayout(viewGroup);
        setUIParentSize(viewGroup);
    }

    @Override
    public UIComponent setUIMarginBottom(int bottom) {
        uiComponentController.setUIMarginBottom(bottom);
        return this;
    }

    @Override
    public UIComponent setUIMarginRight(int right) {
        uiComponentController.setUIMarginRight(right);
        return this;
    }

    @Override
    public UIComponent setUIMarginLeft(int left) {
        uiComponentController.setUIMarginLeft(left);
        return this;
    }

    @Override
    public void setUIParentSize(int uiParentSize) {
        this.uiParentSize = uiParentSize;
    }

    @Override
    public UIComponent setUIMarginTop(int top) {
        uiComponentController.setUIMarginTop(top);
        return this;
    }

    @Override
    public UIComponent setUIMargin(int left, int top, int right, int bottom) {
        uiComponentController.setUIMargin(left, top, right, bottom);
        return this;
    }

    @Override
    public UIComponent setUIPaddingBottom(int bottom) {
        uiComponentController.setUIPaddingBottom(bottom);
        return this;
    }

    @Override
    public void setUIComponentSize(int uiComponentSize) {
        uiComponentController.setUIComponentSize(uiComponentSize);
    }

    @Override
    public UIComponent setUIPaddingRight(int right) {
        uiComponentController.setUIPaddingRight(right);
        return this;
    }

    @Override
    public void setUILayoutType(ViewGroup viewGroup) {
        uiComponentController.setUILayoutType(viewGroup);
    }

    @Override
    public void setUIParentSize(ViewGroup viewGroup) {
        uiComponentController.setUIParentSize(viewGroup);
    }

    @Override
    public UIComponent setUIPaddingLeft(int left) {
        uiComponentController.setUIPaddingLeft(left);
        return this;
    }

    @Override
    public void setUIComponentLayout(ViewGroup uiComponentLayout) {
        this.uiComponentLayout = uiComponentLayout;
    }

    @Override
    public void setUILayoutType(int uiLayoutType) {
        this.uiLayoutType = uiLayoutType;
    }

    @Override
    public UIComponent setUIPaddingTop(int top) {
        uiComponentController.setUIPaddingTop(top);
        return this;
    }

    public UIButton setUIText(String buttonText) {
        super.setText(buttonText);
        return this;
    }

    @Override
    public UIComponent setUIPadding(int left, int top, int right, int bottom) {
        uiComponentController.setUIPadding(left, top, right, bottom);
        return this;
    }
}


