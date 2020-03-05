package com.chibuzo.component.control;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import com.chibuzo.component.model.constants.UIComponentPosition;
import com.chibuzo.component.model.constants.UIComponentSize;
import com.chibuzo.component.model.constants.UILayoutType;
import com.chibuzo.component.uiinterface.UIComponent;
import com.chibuzo.component.utility.AU;

public class UIComponentController {
    private View view;
    private Context context;
    private com.chibuzo.component.model.UIComponent uiComponent;

    public UIComponentController(View view, com.chibuzo.component.model.UIComponent uiComponent) {
        this.uiComponent = uiComponent;
        context = view.getContext();
        this.view = view;
    }

    public void setUIPaddingLeft(int left) {
        uiComponent.setUIPaddingLeft(AU.dimen(context, left));
        view.setPadding(uiComponent.getUIPaddingLeft(), uiComponent.getUIPaddingTop(),
                uiComponent.getUIPaddingRight(), uiComponent.getUIPaddingBottom());
    }

    public void setUIPaddingTop(int top) {
        uiComponent.setUIPaddingTop(AU.dimen(context, top));
        view.setPadding(uiComponent.getUIPaddingLeft(), uiComponent.getUIPaddingTop(),
                uiComponent.getUIPaddingRight(), uiComponent.getUIPaddingBottom());
    }

    public void setUIPaddingBottom(int bottom) {
        uiComponent.setUIPaddingBottom(AU.dimen(context, bottom));
        view.setPadding(uiComponent.getUIPaddingLeft(), uiComponent.getUIPaddingTop(),
                uiComponent.getUIPaddingRight(), uiComponent.getUIPaddingBottom());
    }

    public void setUIPaddingRight(int right) {
        uiComponent.setUIPaddingRight(AU.dimen(context, right));
        view.setPadding(uiComponent.getUIPaddingLeft(), uiComponent.getUIPaddingTop(),
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

    public void resetComponentPosition() {
        uiComponent.setUIMarginTop(AU.dimen(context, 0));
        uiComponent.setUIMarginLeft(AU.dimen(context, 0));
        uiComponent.setUIMarginRight(AU.dimen(context, 0));
        uiComponent.setUIMarginBottom(AU.dimen(context, 0));
        setUIComponentSize(UIComponentSize.NARROW_COMPONENT_SIZE);
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

    public void setUIComponentSize(int uiComponentSize) {
set ui component size explicitly here
    }

    public void setUIParentLayoutType(ViewGroup viewGroup) {
        if (viewGroup instanceof FrameLayout) {
            uiComponent.setUIParentLayoutType(UILayoutType.FRAMELAYOUT_LAYOUT_TYPE);
        } else if (viewGroup instanceof LinearLayout) {
            uiComponent.setUIParentLayoutType(UILayoutType.LINEARLAYOUT_LAYOUT_TYPE);
        } else if (viewGroup instanceof RelativeLayout) {
            uiComponent.setUIParentLayoutType(UILayoutType.RELATIVELAYOUT_LAYOUT_TYPE);
        }
    }

    public int changeUIComponentSize(int uiComponentSize) {
        switch (getUILayoutType()) {
            case UILayoutType.LINEARLAYOUT_LAYOUT_TYPE:
                if (uiComponentSize == UIComponentSize.NARROW_COMPONENT_SIZE) {
                    LinearLayout.LayoutParams uiComponentSizeParams = new LinearLayout.LayoutParams(
                            LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);
                    setLayoutParams(uiComponentSizeParams);
                } else if (uiComponentSize == UIComponentSize.WIDE_COMPONENT_SIZE) {
                    LinearLayout.LayoutParams uiComponentSizeParams = new LinearLayout.LayoutParams(
                            LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
                    setLayoutParams(uiComponentSizeParams);
                }
                break;
            case UILayoutType.RELATIVELAYOUT_LAYOUT_TYPE:
                if (uiComponentSize == UIComponentSize.NARROW_COMPONENT_SIZE) {
                    RelativeLayout.LayoutParams uiComponentSizeParams = new RelativeLayout.LayoutParams(
                            RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT);
                    setLayoutParams(uiComponentSizeParams);
                } else if (uiComponentSize == UIComponentSize.WIDE_COMPONENT_SIZE) {
                    RelativeLayout.LayoutParams uiComponentSizeParams = new RelativeLayout.LayoutParams(
                            RelativeLayout.LayoutParams.MATCH_PARENT, RelativeLayout.LayoutParams.WRAP_CONTENT);
                    setLayoutParams(uiComponentSizeParams);
                }
                break;
            case UILayoutType.FRAMELAYOUT_LAYOUT_TYPE:
            default:
                if (uiComponentSize == UIComponentSize.NARROW_COMPONENT_SIZE) {
                    FrameLayout.LayoutParams uiComponentSizeParams = new FrameLayout.LayoutParams(
                            FrameLayout.LayoutParams.WRAP_CONTENT, FrameLayout.LayoutParams.WRAP_CONTENT);
                    setLayoutParams(uiComponentSizeParams);
                } else if (uiComponentSize == UIComponentSize.WIDE_COMPONENT_SIZE) {
                    FrameLayout.LayoutParams uiComponentSizeParams = new FrameLayout.LayoutParams(
                            FrameLayout.LayoutParams.MATCH_PARENT, FrameLayout.LayoutParams.WRAP_CONTENT);
                    setLayoutParams(uiComponentSizeParams);
                }
        }

        return uiComponentSize;
    }

    public void setUIComponentPosition(int uiComponentPosition) {
        resetComponentPosition();

        int marginTop, marginLeft;
        int childWidth = view.getWidth();
        int childHeight = view.getHeight();
        int parentWidth = ((ViewGroup) view.getParent()).getWidth();
        int parentHeight = ((ViewGroup) view.getParent()).getHeight();
        int relativeRight = parentWidth - childWidth;
        int relativeBottom = parentHeight - childHeight;

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

    public void setMarginBase(int marginLeft, int marginTop, int marginRight, int marginBottom) {
        ViewGroup.LayoutParams uiButtonLayoutParams;

        if (getUIComponentSize() == UIComponentSize.WIDE_COMPONENT_SIZE) {
            if (getUIParentLayout() instanceof LinearLayout) {
                uiButtonLayoutParams = new LinearLayout.LayoutParams(
                        LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);

                ((LinearLayout.LayoutParams) uiButtonLayoutParams).setMargins(marginLeft, marginTop, marginRight, marginBottom);
                setUILayoutType(UILayoutType.LINEARLAYOUT_LAYOUT_TYPE);
            } else if (getUIParentLayout() instanceof RelativeLayout) {
                uiButtonLayoutParams = new RelativeLayout.LayoutParams(
                        RelativeLayout.LayoutParams.MATCH_PARENT, RelativeLayout.LayoutParams.WRAP_CONTENT);

                ((RelativeLayout.LayoutParams) uiButtonLayoutParams).setMargins(marginLeft, marginTop, marginRight, marginBottom);
                setUILayoutType(UILayoutType.RELATIVELAYOUT_LAYOUT_TYPE);
            } else {
                uiButtonLayoutParams = new FrameLayout.LayoutParams(
                        FrameLayout.LayoutParams.MATCH_PARENT, FrameLayout.LayoutParams.WRAP_CONTENT);

                ((FrameLayout.LayoutParams) uiButtonLayoutParams).setMargins(marginLeft, marginTop, marginRight, marginBottom);
                setUILayoutType(UILayoutType.FRAMELAYOUT_LAYOUT_TYPE);
            }
        } else {
            if (getUIParentLayout() instanceof LinearLayout) {
                uiButtonLayoutParams = new LinearLayout.LayoutParams(
                        LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);

                ((LinearLayout.LayoutParams) uiButtonLayoutParams).setMargins(marginLeft, marginTop, marginRight, marginBottom);
                setUILayoutType(UILayoutType.LINEARLAYOUT_LAYOUT_TYPE);
            } else if (getUIParentLayout() instanceof RelativeLayout) {
                uiButtonLayoutParams = new RelativeLayout.LayoutParams(
                        RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT);

                ((RelativeLayout.LayoutParams) uiButtonLayoutParams).setMargins(marginLeft, marginTop, marginRight, marginBottom);
                setUILayoutType(UILayoutType.RELATIVELAYOUT_LAYOUT_TYPE);
            } else {
                uiButtonLayoutParams = new FrameLayout.LayoutParams(
                        FrameLayout.LayoutParams.WRAP_CONTENT, FrameLayout.LayoutParams.WRAP_CONTENT);

                ((FrameLayout.LayoutParams) uiButtonLayoutParams).setMargins(marginLeft, marginTop, marginRight, marginBottom);
                setUILayoutType(UILayoutType.FRAMELAYOUT_LAYOUT_TYPE);
            }
        }

        setLayoutParams(uiButtonLayoutParams);
    }
}


