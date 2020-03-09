package com.chibuzo.component.control;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import com.chibuzo.component.model.constants.UIComponentParams;
import com.chibuzo.component.model.constants.UIComponentPosition;
import com.chibuzo.component.utility.AU;

public class UIDimensionController {
    private Context context;
    private View uiComponentView;
    private com.chibuzo.component.model.UIComponent uiComponent;

    public UIDimensionController(View uiComponentView,
                                 com.chibuzo.component.model.UIComponent uiComponent) {
        this.uiComponent = uiComponent;
        this.uiComponentView = uiComponentView;
        context = uiComponentView.getContext();
    }

    public void setUILayoutParamsType(int uiLayoutParamsType) {
        if (uiComponentView.getParent() instanceof LinearLayout) {
            LinearLayout.LayoutParams layoutParams;

            switch (uiLayoutParamsType) {
                case UIComponentParams.MATCH_WIDTH_MATCH_HEIGHT_PARAMS:
                    layoutParams = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,
                            LinearLayout.LayoutParams.MATCH_PARENT);
                    break;
                case UIComponentParams.WRAP_WIDTH_MATCH_HEIGHT_PARAMS:
                    layoutParams = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT,
                            LinearLayout.LayoutParams.MATCH_PARENT);
                    break;
                case UIComponentParams.WRAP_WIDTH_WRAP_HEIGHT_PARAMS:
                    layoutParams = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT,
                            LinearLayout.LayoutParams.WRAP_CONTENT);
                    break;
                case UIComponentParams.MATCH_WIDTH_WRAP_HEIGHT_PARAMS:
                default:
                    layoutParams = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,
                            LinearLayout.LayoutParams.WRAP_CONTENT);
            }

            uiComponentView.setLayoutParams(layoutParams);
        } else if (uiComponentView.getParent() instanceof RelativeLayout) {
            RelativeLayout.LayoutParams layoutParams;

            switch (uiLayoutParamsType) {
                case UIComponentParams.MATCH_WIDTH_MATCH_HEIGHT_PARAMS:
                    layoutParams = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.MATCH_PARENT,
                            RelativeLayout.LayoutParams.MATCH_PARENT);
                    break;
                case UIComponentParams.WRAP_WIDTH_MATCH_HEIGHT_PARAMS:
                    layoutParams = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT,
                            RelativeLayout.LayoutParams.MATCH_PARENT);
                    break;
                case UIComponentParams.WRAP_WIDTH_WRAP_HEIGHT_PARAMS:
                    layoutParams = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT,
                            RelativeLayout.LayoutParams.WRAP_CONTENT);
                    break;
                case UIComponentParams.MATCH_WIDTH_WRAP_HEIGHT_PARAMS:
                default:
                    layoutParams = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.MATCH_PARENT,
                            RelativeLayout.LayoutParams.WRAP_CONTENT);
            }

            uiComponentView.setLayoutParams(layoutParams);
        } else {
            FrameLayout.LayoutParams layoutParams;

            switch (uiLayoutParamsType) {
                case UIComponentParams.MATCH_WIDTH_MATCH_HEIGHT_PARAMS:
                    layoutParams = new FrameLayout.LayoutParams(FrameLayout.LayoutParams.MATCH_PARENT,
                            FrameLayout.LayoutParams.MATCH_PARENT);
                    break;
                case UIComponentParams.WRAP_WIDTH_MATCH_HEIGHT_PARAMS:
                    layoutParams = new FrameLayout.LayoutParams(FrameLayout.LayoutParams.WRAP_CONTENT,
                            FrameLayout.LayoutParams.MATCH_PARENT);
                    break;
                case UIComponentParams.WRAP_WIDTH_WRAP_HEIGHT_PARAMS:
                    layoutParams = new FrameLayout.LayoutParams(FrameLayout.LayoutParams.WRAP_CONTENT,
                            FrameLayout.LayoutParams.WRAP_CONTENT);
                    break;
                case UIComponentParams.MATCH_WIDTH_WRAP_HEIGHT_PARAMS:
                default:
                    layoutParams = new FrameLayout.LayoutParams(FrameLayout.LayoutParams.MATCH_PARENT,
                            FrameLayout.LayoutParams.WRAP_CONTENT);
            }

            uiComponentView.setLayoutParams(layoutParams);
        }

        uiComponent.setUILayoutParamsType(uiLayoutParamsType);
    }

    public void setUIPadding(int left, int top, int right, int bottom) {
        uiComponent.setUIPaddingTop(AU.dimen(context, top));
        uiComponent.setUIPaddingLeft(AU.dimen(context, left));
        uiComponent.setUIPaddingRight(AU.dimen(context, right));
        uiComponent.setUIPaddingBottom(AU.dimen(context, bottom));
        uiComponentView.setPadding(uiComponent.getUIPaddingLeft(), uiComponent.getUIPaddingTop(),
                uiComponent.getUIPaddingRight(), uiComponent.getUIPaddingBottom());
    }

    public void setUIPaddingLeft(int left) {
        uiComponent.setUIPaddingLeft(AU.dimen(context, left));
        uiComponentView.setPadding(uiComponent.getUIPaddingLeft(), uiComponent.getUIPaddingTop(),
                uiComponent.getUIPaddingRight(), uiComponent.getUIPaddingBottom());
    }

    public void setUIPaddingTop(int top) {
        uiComponent.setUIPaddingTop(AU.dimen(context, top));
        uiComponentView.setPadding(uiComponent.getUIPaddingLeft(), uiComponent.getUIPaddingTop(),
                uiComponent.getUIPaddingRight(), uiComponent.getUIPaddingBottom());
    }

    public void setUIPaddingBottom(int bottom) {
        uiComponent.setUIPaddingBottom(AU.dimen(context, bottom));
        uiComponentView.setPadding(uiComponent.getUIPaddingLeft(), uiComponent.getUIPaddingTop(),
                uiComponent.getUIPaddingRight(), uiComponent.getUIPaddingBottom());
    }

    public void setUIPaddingRight(int right) {
        uiComponent.setUIPaddingRight(AU.dimen(context, right));
        uiComponentView.setPadding(uiComponent.getUIPaddingLeft(), uiComponent.getUIPaddingTop(),
                uiComponent.getUIPaddingRight(), uiComponent.getUIPaddingBottom());
    }

    public void setUIMarginBottom(int bottom) {
        uiComponent.setUIMarginBottom(uiComponent.getUIMarginBottom() + AU.dimen(context, bottom));
        setMarginBase(uiComponent.getUIMarginLeft(), uiComponent.getUIMarginTop(),
                uiComponent.getUIMarginRight(), uiComponent.getUIMarginBottom());
    }

    public void setUIMarginRight(int right) {
        uiComponent.setUIMarginRight(uiComponent.getUIMarginRight() + AU.dimen(context, right));
        setMarginBase(uiComponent.getUIMarginLeft(), uiComponent.getUIMarginTop(),
                uiComponent.getUIMarginRight(), uiComponent.getUIMarginBottom());
    }

    public void setUIMarginLeft(int left) {
        uiComponent.setUIMarginLeft(uiComponent.getUIMarginLeft() + AU.dimen(context, left));
        setMarginBase(uiComponent.getUIMarginLeft(), uiComponent.getUIMarginTop(),
                uiComponent.getUIMarginRight(), uiComponent.getUIMarginBottom());
    }

    public void setUIMarginTop(int top) {
        uiComponent.setUIMarginTop(uiComponent.getUIMarginTop() + AU.dimen(context, top));
        setMarginBase(uiComponent.getUIMarginLeft(), uiComponent.getUIMarginTop(),
                uiComponent.getUIMarginRight(), uiComponent.getUIMarginBottom());
    }

    private void resetComponentPosition() {
        uiComponent.setUIMarginTop(AU.dimen(context, 0));
        uiComponent.setUIMarginLeft(AU.dimen(context, 0));
        uiComponent.setUIMarginRight(AU.dimen(context, 0));
        uiComponent.setUIMarginBottom(AU.dimen(context, 0));
        setMarginBase(uiComponent.getUIMarginLeft(), uiComponent.getUIMarginTop(),
                uiComponent.getUIMarginRight(), uiComponent.getUIMarginBottom());
    }

    public void setUIMargin(int left, int top, int right, int bottom) {
        uiComponent.setUIMarginTop(uiComponent.getUIMarginTop() + AU.dimen(context, top));
        uiComponent.setUIMarginLeft(uiComponent.getUIMarginLeft() + AU.dimen(context, left));
        uiComponent.setUIMarginRight(uiComponent.getUIMarginRight() + AU.dimen(context, right));
        uiComponent.setUIMarginBottom(uiComponent.getUIMarginBottom() + AU.dimen(context, bottom));
        setMarginBase(uiComponent.getUIMarginLeft(), uiComponent.getUIMarginTop(),
                uiComponent.getUIMarginRight(), uiComponent.getUIMarginBottom());
    }

    public void setUIComponentPosition(int uiComponentPosition) {
        resetComponentPosition();

        int marginTop, marginLeft;
        int childWidth = uiComponentView.getWidth();
        int childHeight = uiComponentView.getHeight();
        int parentWidth = ((ViewGroup) uiComponentView.getParent()).getWidth();
        int parentHeight = ((ViewGroup) uiComponentView.getParent()).getHeight();
        int relativeRight = parentWidth - childWidth;
        int relativeBottom = parentHeight - childHeight;

        Log.e("childWidth", "childWidth here is " + childWidth);
        Log.e("childHeight", "childHeight here is " + childHeight);
        Log.e("parentWidth", "parentWidth here is " + parentWidth);
        Log.e("parentHeight", "parentHeight here is " + parentHeight);

        switch (uiComponentPosition) {
            case UIComponentPosition.VERTICAL_LEFT:
                marginTop = relativeBottom / 2;
                setMarginBase(0, marginTop, 0, 0);
                uiComponent.setUIMarginTop(marginTop);
                break;
            case UIComponentPosition.CENTER:
                marginTop = relativeBottom / 2;
                marginLeft = relativeRight / 2;
                setMarginBase(marginLeft, marginTop, 0, 0);
                uiComponent.setUIMarginLeft(marginLeft);
                uiComponent.setUIMarginTop(marginTop);
                break;
            case UIComponentPosition.VERTICAL_RIGHT:
                marginLeft = relativeRight;
                marginTop = relativeBottom / 2;
                setMarginBase(marginLeft, marginTop, 0, 0);
                uiComponent.setUIMarginLeft(marginLeft);
                uiComponent.setUIMarginTop(marginTop);
                break;
            case UIComponentPosition.TOP_CENTER:
                marginLeft = relativeRight / 2;
                setMarginBase(marginLeft, 0, 0, 0);
                uiComponent.setUIMarginLeft(marginLeft);
                break;
            case UIComponentPosition.TOP_RIGHT:
                marginLeft = relativeRight;
                setMarginBase(marginLeft, 0, 0, 0);
                uiComponent.setUIMarginLeft(marginLeft);
                break;
            case UIComponentPosition.BOTTOM_LEFT:
                marginTop = relativeBottom;
                setMarginBase(0, marginTop, 0, 0);
                uiComponent.setUIMarginTop(marginTop);
                break;
            case UIComponentPosition.BOTTOM_CENTER:
                marginTop = relativeBottom;
                marginLeft = relativeRight / 2;
                setMarginBase(marginLeft, marginTop, 0, 0);
                uiComponent.setUIMarginLeft(marginLeft);
                uiComponent.setUIMarginTop(marginTop);
                break;
            case UIComponentPosition.BOTTOM_RIGHT:
                marginTop = relativeBottom;
                marginLeft = relativeRight;
                setMarginBase(marginLeft, marginTop, 0, 0);
                uiComponent.setUIMarginLeft(marginLeft);
                uiComponent.setUIMarginTop(marginTop);
                break;
            case UIComponentPosition.DEFAULT:
            case UIComponentPosition.TOP_LEFT:
            default:
                resetComponentPosition();
        }
    }

    private void setMarginBase(int marginLeft, int marginTop, int marginRight, int marginBottom) {
        ViewGroup.LayoutParams layoutParams;

        switch (uiComponent.getUILayoutParamsType()) {
            case UIComponentParams.MATCH_WIDTH_MATCH_HEIGHT_PARAMS:
                if (uiComponentView.getParent() instanceof LinearLayout) {
                    layoutParams = new LinearLayout.LayoutParams(
                            LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT);

                    ((LinearLayout.LayoutParams) layoutParams).setMargins(marginLeft, marginTop, marginRight, marginBottom);
                } else if (uiComponentView.getParent() instanceof RelativeLayout) {
                    layoutParams = new RelativeLayout.LayoutParams(
                            RelativeLayout.LayoutParams.MATCH_PARENT, RelativeLayout.LayoutParams.MATCH_PARENT);

                    ((RelativeLayout.LayoutParams) layoutParams).setMargins(marginLeft, marginTop, marginRight, marginBottom);
                } else {
                    layoutParams = new FrameLayout.LayoutParams(
                            FrameLayout.LayoutParams.MATCH_PARENT, FrameLayout.LayoutParams.MATCH_PARENT);

                    ((FrameLayout.LayoutParams) layoutParams).setMargins(marginLeft, marginTop, marginRight, marginBottom);
                }

                break;
            case UIComponentParams.MATCH_WIDTH_WRAP_HEIGHT_PARAMS:
                if (uiComponentView.getParent() instanceof LinearLayout) {
                    layoutParams = new LinearLayout.LayoutParams(
                            LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);

                    ((LinearLayout.LayoutParams) layoutParams).setMargins(marginLeft, marginTop, marginRight, marginBottom);
                } else if (uiComponentView.getParent() instanceof RelativeLayout) {
                    layoutParams = new RelativeLayout.LayoutParams(
                            RelativeLayout.LayoutParams.MATCH_PARENT, RelativeLayout.LayoutParams.WRAP_CONTENT);

                    ((RelativeLayout.LayoutParams) layoutParams).setMargins(marginLeft, marginTop, marginRight, marginBottom);
                } else {
                    layoutParams = new FrameLayout.LayoutParams(
                            FrameLayout.LayoutParams.MATCH_PARENT, FrameLayout.LayoutParams.WRAP_CONTENT);

                    ((FrameLayout.LayoutParams) layoutParams).setMargins(marginLeft, marginTop, marginRight, marginBottom);
                }

                break;
            case UIComponentParams.WRAP_WIDTH_MATCH_HEIGHT_PARAMS:
                if (uiComponentView.getParent() instanceof LinearLayout) {
                    layoutParams = new LinearLayout.LayoutParams(
                            LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.MATCH_PARENT);

                    ((LinearLayout.LayoutParams) layoutParams).setMargins(marginLeft, marginTop, marginRight, marginBottom);
                } else if (uiComponentView.getParent() instanceof RelativeLayout) {
                    layoutParams = new RelativeLayout.LayoutParams(
                            RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.MATCH_PARENT);

                    ((RelativeLayout.LayoutParams) layoutParams).setMargins(marginLeft, marginTop, marginRight, marginBottom);
                } else {
                    layoutParams = new FrameLayout.LayoutParams(
                            FrameLayout.LayoutParams.WRAP_CONTENT, FrameLayout.LayoutParams.MATCH_PARENT);

                    ((FrameLayout.LayoutParams) layoutParams).setMargins(marginLeft, marginTop, marginRight, marginBottom);
                }

                break;
            case UIComponentParams.WRAP_WIDTH_WRAP_HEIGHT_PARAMS:
            default:
                    if (uiComponentView.getParent() instanceof LinearLayout) {
                        layoutParams = new LinearLayout.LayoutParams(
                                LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);

                        ((LinearLayout.LayoutParams) layoutParams).setMargins(marginLeft, marginTop, marginRight, marginBottom);
                    } else if (uiComponentView.getParent() instanceof RelativeLayout) {
                        layoutParams = new RelativeLayout.LayoutParams(
                                RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT);

                        ((RelativeLayout.LayoutParams) layoutParams).setMargins(marginLeft, marginTop, marginRight, marginBottom);
                    } else {
                        layoutParams = new FrameLayout.LayoutParams(
                                FrameLayout.LayoutParams.WRAP_CONTENT, FrameLayout.LayoutParams.WRAP_CONTENT);

                        ((FrameLayout.LayoutParams) layoutParams).setMargins(marginLeft, marginTop, marginRight, marginBottom);
                    }
        }

        uiComponentView.setLayoutParams(layoutParams);
    }
}


