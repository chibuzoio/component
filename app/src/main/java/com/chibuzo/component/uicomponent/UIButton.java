package com.chibuzo.component.uicomponent;

import android.content.Context;
import android.util.Log;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import androidx.appcompat.widget.AppCompatButton;

import com.chibuzo.component.model.constants.UIConst;
import com.chibuzo.component.uiinterface.UIComponent;
import com.chibuzo.component.uiinterface.UILayout;
import com.chibuzo.component.uilayout.UIFrameLayout;
import com.chibuzo.component.utility.AU;

public class UIButton extends AppCompatButton implements UIComponent {
    private Context context;
    private UILayout uiLayout;
    private ViewGroup viewGroup;
    private int layoutType, layoutParamsType;
    private int marginTop, marginLeft, marginRight, marginBottom;
    private int paddingTop, paddingLeft, paddingRight, paddingBottom;

    public UIButton(ViewGroup viewGroup) {
        super(viewGroup.getContext());

        viewGroup.addView(this);

        this.viewGroup = viewGroup;
        this.context = viewGroup.getContext();

        setUiLayout(viewGroup);

        marginTop = AU.dimen(context, 7);
        marginLeft = AU.dimen(context, 7);
        marginRight = AU.dimen(context, 7);
        marginBottom = AU.dimen(context, 7);
        paddingTop = AU.dimen(context, 7);
        paddingLeft = AU.dimen(context, 7);
        paddingRight = AU.dimen(context, 7);
        paddingBottom = AU.dimen(context, 7);

        setUIText("Submit");
        setUIMargin(marginLeft, marginTop, marginRight, marginBottom);
        setUIPadding(paddingLeft, paddingTop, paddingRight, paddingBottom);
    }

    public UILayout getUiLayout() {
        return uiLayout;
    }

    public void setUiLayout(ViewGroup viewGroup) {
        if (viewGroup instanceof FrameLayout) {
            uiLayout = (UIFrameLayout) viewGroup;
        } else if (viewGroup instanceof LinearLayout) {

        } else if (viewGroup instanceof RelativeLayout) {

        }
    }

    /*
    * wrap content both horizontally and vertically. Then, use
    * padding to add weight and size to the button. Use gravity to
    * position the button left, right, center, top or bottom
    * */
    public UIComponent setUIComponentPosition(int buttonPosition) {
        // first set button wrap content for height and width


        switch (buttonPosition) {
            case UIConst.LEFT_COMPONENT_POSITION:

                break;
            case UIConst.CENTER_COMPONENT_POSITION:

                break;
            case UIConst.RIGHT_COMPONENT_POSITION:

                break;
            case UIConst.LEFT_TOP_COMPONENT_POSITION:

                break;
            case UIConst.CENTER_TOP_COMPONENT_POSITION:

                break;
            case UIConst.RIGHT_TOP_COMPONENT_POSITION:

                break;
            case UIConst.LEFT_BOTTOM_COMPONENT_POSITION:

                break;
                case UIConst.CENTER_BOTTOM_COMPONENT_POSITION:

                break;
            case UIConst.RIGHT_BOTTOM_COMPONENT_POSITION:

                break;
                default:
                    // make it left button
        }

        return this;
    }

    public int getLayoutType() {
        return layoutType;
    }

    public void setLayoutType(int layoutType) {
        this.layoutType = layoutType;
    }

    public int getLayoutParamsType() {
        return layoutParamsType;
    }

    public void setLayoutParamsType(int layoutParamsType) {
        this.layoutParamsType = layoutParamsType;
    }

    public UIComponent setUIMarginBottom(int bottom) {
        marginBottom = AU.dimen(context, bottom);
        setUIMargin(marginLeft, marginTop, marginRight, marginBottom);
        return this;
    }

    public UIComponent setUIMarginRight(int right) {
        marginRight = AU.dimen(context, right);
        setUIMargin(marginLeft, marginTop, marginRight, marginBottom);
        return this;
    }

    public UIComponent setUIMarginLeft(int left) {
        marginLeft = AU.dimen(context, left);
        setUIMargin(marginLeft, marginTop, marginRight, marginBottom);
        return this;
    }

    public UIComponent setUIMarginTop(int top) {
        marginTop = AU.dimen(context, top);
        setUIMargin(marginLeft, marginTop, marginRight, marginBottom);
        return this;
    }

    public UIComponent setUIMargin(int left, int top, int right, int bottom) {
        ViewGroup.LayoutParams uiButtonLayoutParams;

        marginTop = AU.dimen(context, top);
        marginLeft = AU.dimen(context, left);
        marginRight = AU.dimen(context, right);
        marginBottom = AU.dimen(context, bottom);

        switch (getUiLayout().getLayoutType()) {
            case UIConst.LINEARLAYOUT_LAYOUT_TYPE:
                uiButtonLayoutParams = new LinearLayout.LayoutParams(
                        LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);

                ((LinearLayout.LayoutParams) uiButtonLayoutParams).setMargins(marginLeft, marginTop, marginRight, marginBottom);
                setLayoutType(UIConst.LINEARLAYOUT_LAYOUT_TYPE);
                break;
            case UIConst.RELATIVELAYOUT_LAYOUT_TYPE:
                uiButtonLayoutParams = new RelativeLayout.LayoutParams(
                        RelativeLayout.LayoutParams.MATCH_PARENT, RelativeLayout.LayoutParams.WRAP_CONTENT);

                ((RelativeLayout.LayoutParams) uiButtonLayoutParams).setMargins(marginLeft, marginTop, marginRight, marginBottom);
                setLayoutType(UIConst.RELATIVELAYOUT_LAYOUT_TYPE);
                break;
            case UIConst.FRAMELAYOUT_LAYOUT_TYPE:
            default:
                    uiButtonLayoutParams = new FrameLayout.LayoutParams(
                            FrameLayout.LayoutParams.MATCH_PARENT, FrameLayout.LayoutParams.WRAP_CONTENT);

                ((FrameLayout.LayoutParams) uiButtonLayoutParams).setMargins(marginLeft, marginTop, marginRight, marginBottom);
                setLayoutType(UIConst.FRAMELAYOUT_LAYOUT_TYPE);
        }

        setLayoutParamsType(UIConst.MATCH_WIDTH_WRAP_HEIGHT_PARAMS);
        setLayoutParams(uiButtonLayoutParams);

        return this;
    }

    public UIComponent setUIPaddingBottom(int bottom) {
        paddingBottom = AU.dimen(context, bottom);
        super.setPadding(paddingLeft, paddingTop, paddingRight, paddingBottom);
        return this;
    }

    public UIComponent setUIPaddingRight(int right) {
        paddingRight = AU.dimen(context, right);
        super.setPadding(paddingLeft, paddingTop, paddingRight, paddingBottom);
        return this;
    }

    public UIComponent setUIPaddingLeft(int left) {
        paddingLeft = AU.dimen(context, left);
        super.setPadding(paddingLeft, paddingTop, paddingRight, paddingBottom);
        return this;
    }

    public UIComponent setUIPaddingTop(int top) {
        paddingTop = AU.dimen(context, top);
        super.setPadding(paddingLeft, paddingTop, paddingRight, paddingBottom);
        return this;
    }

    public UIButton setUIText(String buttonText) {
        super.setText(buttonText);
        return this;
    }

    public UIComponent setUIPadding(int left, int top, int right, int bottom) {
        paddingTop = AU.dimen(context, top);
        paddingLeft = AU.dimen(context, left);
        paddingRight = AU.dimen(context, right);
        paddingBottom = AU.dimen(context, bottom);
        super.setPadding(paddingLeft, paddingTop, paddingRight, paddingBottom);
        return this;
    }
}


