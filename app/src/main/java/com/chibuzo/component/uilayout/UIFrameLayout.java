package com.chibuzo.component.uilayout;

import android.view.ViewGroup;
import android.widget.FrameLayout;

import com.chibuzo.component.control.UIDimensionController;
import com.chibuzo.component.model.constants.UIComponentParams;
import com.chibuzo.component.model.constants.UIComponentSize;
import com.chibuzo.component.model.constants.UILayoutType;
import com.chibuzo.component.uiinterface.UIComponent;

public class UIFrameLayout extends FrameLayout implements UIComponent {
    private UIDimensionController uiDimensionController;
    private com.chibuzo.component.model.UIComponent uiComponent;

    public UIFrameLayout(ViewGroup viewGroup) {
        super(viewGroup.getContext());

        FrameLayout.LayoutParams frameLayoutParams = new FrameLayout.LayoutParams(
                FrameLayout.LayoutParams.MATCH_PARENT, FrameLayout.LayoutParams.MATCH_PARENT);

        setUILayoutParamsType(UIComponentParams.MATCH_WIDTH_MATCH_HEIGHT_PARAMS);
        setUIComponentSize(UIComponentSize.WIDE_COMPONENT_SIZE);
        setUILayoutType(UILayoutType.FRAMELAYOUT_LAYOUT_TYPE);
        setLayoutParams(frameLayoutParams);

        viewGroup.addView(this);

        uiComponent = new com.chibuzo.component.model.UIComponent(viewGroup, this);
        uiDimensionController = new UIDimensionController(uiComponent);

        setParentLayoutProperties(viewGroup);
    }

    @Override
    public void setUILayoutParamsType(int uiLayoutParamsType) {
        uiComponent.setUILayoutParamsType(uiLayoutParamsType);
    }

    @Override
    public void setParentLayoutProperties(ViewGroup viewGroup) {
        setUIParentLayoutType(viewGroup);
        setUIParentSize(viewGroup);
    }

    @Override
    public UIComponent setUIComponentPosition(int buttonPosition) {
        return null;
    }

    @Override
    public void setUIParentLayoutType(ViewGroup viewGroup) {
        uiDimensionController.setUIParentLayoutType(viewGroup);
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
    public void setUIComponentLayout(ViewGroup uiLayout) {

    }

    @Override
    public void setUILayoutType(int uiLayoutType) {
        uiComponent.setUILayoutType(uiLayoutType);
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
    public void setUILayoutType(ViewGroup viewGroup) {

    }

    @Override
    public void setUIParentSize(ViewGroup viewGroup) {

    }

    @Override
    public UIComponent setUIMarginBottom(int bottom) {
        return null;
    }

    @Override
    public UIComponent setUIPaddingBottom(int bottom) {
        return null;
    }

    @Override
    public void setUIComponentSize(int uiComponentSize) {

    }
}


