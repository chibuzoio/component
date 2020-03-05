package com.chibuzo.component.uiinterface;

import android.view.ViewGroup;

public interface UIComponent {
    int getUILayoutType();
    int getUIParentSize();
    int getUIComponentSize();
    int getUILayoutParamsType();
    int getUIParentLayoutType();
    ViewGroup getUIParentLayout();
    ViewGroup getUIComponentLayout();
    UIComponent setUIMarginTop(int top);
    UIComponent setUIPaddingTop(int top);
    UIComponent setUIMarginLeft(int left);
    void setUIParentSize(int uiParentSize);
    void setUILayoutType(int uiLayoutType);
    UIComponent setUIPaddingLeft(int left);
    UIComponent setUIMarginRight(int right);
    UIComponent setUIPaddingRight(int right);
    void setUILayoutType(ViewGroup viewGroup);
    void setUIParentSize(ViewGroup viewGroup);
    UIComponent setUIMarginBottom(int bottom);
    UIComponent setUIPaddingBottom(int bottom);
    void setUIComponentSize(int uiComponentSize);
    void setUILayoutParamsType(int uiLayoutParamsType);
    void setUIParentLayoutType(int uiParentLayoutType);
    void setParentLayoutProperties(ViewGroup viewGroup);
    void setUIComponentLayout(ViewGroup uiComponentLayout);
    void setUIParentLayoutType(ViewGroup uiParentLayoutType);
    UIComponent setUIComponentPosition(int uiComponentPosition);
    UIComponent setUIMargin(int left, int top, int right, int bottom);
    UIComponent setUIPadding(int left, int top, int right, int bottom);
}


