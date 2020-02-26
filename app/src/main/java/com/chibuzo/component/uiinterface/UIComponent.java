package com.chibuzo.component.uiinterface;

import android.view.ViewGroup;

public interface UIComponent extends UILayout {
    UILayout getUiLayout();
    void setLayoutType(int layoutType);
    UIComponent setUIMarginTop(int top);
    UIComponent setUIPaddingTop(int top);
    void setUiLayout(ViewGroup viewGroup);
    UIComponent setUIMarginLeft(int left);
    UIComponent setUIPaddingLeft(int left);
    UIComponent setUIMarginRight(int right);
    UIComponent setUIPaddingRight(int right);
    UIComponent setUIMarginBottom(int bottom);
    UIComponent setUIPaddingBottom(int bottom);
    void setLayoutParamsType(int layoutParamsType);
    UIComponent setUIComponentPosition(int buttonPosition);
    UIComponent setUIMargin(int left, int top, int right, int bottom);
    UIComponent setUIPadding(int left, int top, int right, int bottom);
}


