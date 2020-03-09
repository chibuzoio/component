package com.chibuzo.component.uilayout;

import android.content.Context;
import android.util.Log;
import android.view.ViewGroup;
import android.widget.FrameLayout;

import com.chibuzo.component.control.UIDimensionController;
import com.chibuzo.component.model.constants.UIComponentParams;
import com.chibuzo.component.uiinterface.UIComponent;

public class UIFrameLayout extends FrameLayout implements UIComponent {
    private UIDimensionController uiDimensionController;
    private com.chibuzo.component.model.UIComponent uiComponent;

    public UIFrameLayout(Context context, ViewGroup viewGroup) {
        super(context);

        FrameLayout.LayoutParams frameLayoutParams = new FrameLayout.LayoutParams(
                FrameLayout.LayoutParams.MATCH_PARENT, FrameLayout.LayoutParams.MATCH_PARENT);

        setLayoutParams(frameLayoutParams);

        viewGroup.addView(this);

        uiComponent = new com.chibuzo.component.model.UIComponent(this);
        uiDimensionController = new UIDimensionController(this, uiComponent);

        uiComponent.setUILayoutParamsType(UIComponentParams.MATCH_WIDTH_MATCH_HEIGHT_PARAMS);
    }

    @Override
    public void setUILayoutParamsType(int uiLayoutParamsType) {
        uiComponent.setUILayoutParamsType(uiLayoutParamsType);
    }

    @Override
    public UIComponent setUIComponentPosition(int buttonPosition) {
        return null;
    }

    @Override
    public UIComponent setUIMargin(int left, int top, int right, int bottom) {
        return null;
    }

    @Override
    public UIComponent setUIPadding(int left, int top, int right, int bottom) {
        return null;
    }

    @Override
    public int getUILayoutParamsType() {
        return uiComponent.getUILayoutParamsType();
    }

    @Override
    public UIComponent setUIMarginTop(int top) {
        return null;
    }

    @Override
    public UIComponent setUIPaddingTop(int top) {
        return null;
    }

    @Override
    public UIComponent setUIMarginLeft(int left) {
        return null;
    }

    @Override
    public UIComponent setUIPaddingLeft(int left) {
        return null;
    }

    @Override
    public UIComponent setUIMarginRight(int right) {
        return null;
    }

    @Override
    public UIComponent setUIPaddingRight(int right) {
        return null;
    }

    @Override
    public UIComponent setUIMarginBottom(int bottom) {
        return null;
    }

    @Override
    public UIComponent setUIPaddingBottom(int bottom) {
        return null;
    }
}


