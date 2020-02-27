package com.chibuzo.component.uiinterface;

import android.view.ViewGroup;

public interface UIComponent {
    int getUILayoutType();
    int getUIParentSize();
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
    void setUIParentSize(int uiParentSize);
    UIComponent setUIPaddingLeft(int left);
    UIComponent setUIMarginRight(int right);
    UIComponent setUIPaddingRight(int right);
    void setUIParentSize(ViewGroup viewGroup);
    UIComponent setUIMarginBottom(int bottom);
    UIComponent setUIPaddingBottom(int bottom);
    void setUIComponentSize(int uiComponentSize);
    void setUIParentLayout(ViewGroup uiParentLayout);
    void setUILayoutParamsType(int layoutParamsType);
    void setUIParentLayoutType(int uiParentLayoutType);
    void setUIParentLayoutType(ViewGroup uiParentLayoutType);
    UIComponent setUIComponentPosition(int uiComponentPosition);
    UIComponent setUIMargin(int left, int top, int right, int bottom);
    UIComponent setUIPadding(int left, int top, int right, int bottom);
}


