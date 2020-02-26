package com.chibuzo.component.uiinterface;

import android.view.ViewGroup;

public interface UIComponent {
    int getUILayoutType();
    ViewGroup getUILayout();
    int getUIComponentSize();
    int getUILayoutParamsType();
    int getUIParentLayoutType();
    ViewGroup getUIParentLayout();
    UIComponent setUIMarginTop(int top);
    void setUILayout(ViewGroup uiLayout);
    void setUILayoutType(int layoutType);
    UIComponent setUIPaddingTop(int top);
    UIComponent setUIMarginLeft(int left);
    UIComponent setUIPaddingLeft(int left);
    UIComponent setUIMarginRight(int right);
    UIComponent setUIPaddingRight(int right);
    UIComponent setUIMarginBottom(int bottom);
    UIComponent setUIPaddingBottom(int bottom);
    void setUIComponentSize(int uiComponentSize);
    void setUIParentLayout(ViewGroup uiParentLayout);
    void setUILayoutParamsType(int layoutParamsType);
    void setUIParentLayoutType(int uiParentLayoutType);
    UIComponent setUIComponentPosition(int buttonPosition);
    UIComponent setUIMargin(int left, int top, int right, int bottom);
    UIComponent setUIPadding(int left, int top, int right, int bottom);
}


