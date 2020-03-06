package com.chibuzo.component.uiinterface;

public interface UIComponent {
    int getUILayoutParamsType();
    UIComponent setUIMarginTop(int top);
    UIComponent setUIPaddingTop(int top);
    UIComponent setUIMarginLeft(int left);
    UIComponent setUIPaddingLeft(int left);
    UIComponent setUIMarginRight(int right);
    UIComponent setUIPaddingRight(int right);
    UIComponent setUIMarginBottom(int bottom);
    UIComponent setUIPaddingBottom(int bottom);
    void setUILayoutParamsType(int uiLayoutParamsType);
    UIComponent setUIComponentPosition(int uiComponentPosition);
    UIComponent setUIMargin(int left, int top, int right, int bottom);
    UIComponent setUIPadding(int left, int top, int right, int bottom);
}


