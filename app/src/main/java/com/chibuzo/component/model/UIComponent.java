package com.chibuzo.component.model;

import android.view.View;

public class UIComponent {
    private int UIMarginTop;
    private int UIMarginLeft;
    private int UIPaddingTop;
    private View UIComponent;
    private int UIMarginRight;
    private int UIPaddingLeft;
    private int UIPaddingRight;
    private int UIMarginBottom;
    private int UIPaddingBottom;
    private int UILayoutParamsType;

    public UIComponent(View UIComponent) {
        this.UIComponent = UIComponent;
    }

    public View getUIComponent() {
        return UIComponent;
    }

    public int getUIMarginTop() {
        return UIMarginTop;
    }

    public void setUIMarginTop(int UIMarginTop) {
        this.UIMarginTop = UIMarginTop;
    }

    public int getUIMarginLeft() {
        return UIMarginLeft;
    }

    public void setUIMarginLeft(int UIMarginLeft) {
        this.UIMarginLeft = UIMarginLeft;
    }

    public int getUIPaddingTop() {
        return UIPaddingTop;
    }

    public void setUIPaddingTop(int UIPaddingTop) {
        this.UIPaddingTop = UIPaddingTop;
    }

    public int getUIMarginRight() {
        return UIMarginRight;
    }

    public void setUIMarginRight(int UIMarginRight) {
        this.UIMarginRight = UIMarginRight;
    }

    public int getUIPaddingLeft() {
        return UIPaddingLeft;
    }

    public void setUIPaddingLeft(int UIPaddingLeft) {
        this.UIPaddingLeft = UIPaddingLeft;
    }

    public int getUIPaddingRight() {
        return UIPaddingRight;
    }

    public void setUIPaddingRight(int UIPaddingRight) {
        this.UIPaddingRight = UIPaddingRight;
    }

    public int getUIMarginBottom() {
        return UIMarginBottom;
    }

    public void setUIMarginBottom(int UIMarginBottom) {
        this.UIMarginBottom = UIMarginBottom;
    }

    public int getUIPaddingBottom() {
        return UIPaddingBottom;
    }

    public void setUIPaddingBottom(int UIPaddingBottom) {
        this.UIPaddingBottom = UIPaddingBottom;
    }

    public int getUILayoutParamsType() {
        return UILayoutParamsType;
    }

    public void setUILayoutParamsType(int UILayoutParamsType) {
        this.UILayoutParamsType = UILayoutParamsType;
    }
}


