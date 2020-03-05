package com.chibuzo.component.model;

import android.view.View;
import android.view.ViewGroup;

public class UIComponent {
    private int UIMarginTop;
    private int UILayoutType;
    private int UIMarginLeft;
    private int UIParentSize;
    private int UIPaddingTop;
    private View UIComponent;
    private int UIMarginRight;
    private int UIPaddingLeft;
    private int UIPaddingRight;
    private int UIMarginBottom;
    private int UIPaddingBottom;
    private int UIComponentSize;
    private int UILayoutParamsType;
    private int UIParentLayoutType;
    private ViewGroup UIParentLayout;
    private ViewGroup UIComponentLayout;

    public UIComponent(ViewGroup UIParentLayout, View UIComponent) {
        this.UIParentLayout = UIParentLayout;
        this.UIComponent = UIComponent;
    }

    public View getUIComponent() {
        return UIComponent;
    }

    public ViewGroup getUIParentLayout() {
        return UIParentLayout;
    }

    public ViewGroup getUIComponentLayout() {
        return UIComponentLayout;
    }

    public void setUIComponentLayout(ViewGroup UIComponentLayout) {
        this.UIComponentLayout = UIComponentLayout;
    }

    public int getUIMarginTop() {
        return UIMarginTop;
    }

    public void setUIMarginTop(int UIMarginTop) {
        this.UIMarginTop = UIMarginTop;
    }

    public int getUILayoutType() {
        return UILayoutType;
    }

    public void setUILayoutType(int UILayoutType) {
        this.UILayoutType = UILayoutType;
    }

    public int getUIMarginLeft() {
        return UIMarginLeft;
    }

    public void setUIMarginLeft(int UIMarginLeft) {
        this.UIMarginLeft = UIMarginLeft;
    }

    public int getUIParentSize() {
        return UIParentSize;
    }

    public void setUIParentSize(int UIParentSize) {
        this.UIParentSize = UIParentSize;
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

    public int getUIComponentSize() {
        return UIComponentSize;
    }

    public void setUIComponentSize(int UIComponentSize) {
        this.UIComponentSize = UIComponentSize;
    }

    public int getUILayoutParamsType() {
        return UILayoutParamsType;
    }

    public void setUILayoutParamsType(int UILayoutParamsType) {
        this.UILayoutParamsType = UILayoutParamsType;
    }

    public int getUIParentLayoutType() {
        return UIParentLayoutType;
    }

    public void setUIParentLayoutType(int UIParentLayoutType) {
        this.UIParentLayoutType = UIParentLayoutType;
    }
}


