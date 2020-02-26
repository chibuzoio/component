package com.chibuzo.component.uilayout;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;

import androidx.annotation.NonNull;

import com.chibuzo.component.model.constants.UIConst;
import com.chibuzo.component.uiinterface.UIComponent;

public class UIFrameLayout extends FrameLayout implements UIComponent {
    private int layoutType;
    private int layoutParamsType;

    public UIFrameLayout(@NonNull Context context) {
        super(context);

        FrameLayout.LayoutParams frameLayoutParams = new FrameLayout.LayoutParams(
                FrameLayout.LayoutParams.MATCH_PARENT, FrameLayout.LayoutParams.MATCH_PARENT);

        setLayoutParamsType(UIConst.MATCH_WIDTH_MATCH_HEIGHT_PARAMS);
        setLayoutType(UIConst.FRAMELAYOUT_LAYOUT_TYPE);
        setLayoutParams(frameLayoutParams);
    }

    public void setLayoutType(int layoutType) {
        this.layoutType = layoutType;
    }

    public int getLayoutType() {
        return layoutType;
    }

    public void setLayoutParamsType(int layoutParamsType) {
        this.layoutParamsType = layoutParamsType;
    }

    @Override
    public void setUIParentLayout(ViewGroup uiParentLayout) {

    }

    @Override
    public void setUILayoutParamsType(int layoutParamsType) {

    }

    @Override
    public void setUIParentLayoutType(int uiParentLayoutType) {

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

    public int getLayoutParamsType() {
        return layoutParamsType;
    }

    @Override
    public int getUILayoutType() {
        return 0;
    }

    @Override
    public ViewGroup getUILayout() {
        return null;
    }

    @Override
    public int getUIComponentSize() {
        return 0;
    }

    @Override
    public int getUILayoutParamsType() {
        return 0;
    }

    @Override
    public int getUIParentLayoutType() {
        return 0;
    }

    @Override
    public ViewGroup getUIParentLayout() {
        return null;
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
    public void setUILayout(ViewGroup uiLayout) {

    }

    @Override
    public void setUILayoutType(int layoutType) {

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

    @Override
    public void setUIComponentSize(int uiComponentSize) {

    }
}


