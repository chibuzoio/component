package com.chibuzo.component.uicomponent;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import androidx.appcompat.widget.AppCompatButton;

import com.chibuzo.component.model.constants.UIConst;
import com.chibuzo.component.uiinterface.UIComponent;
import com.chibuzo.component.uilayout.UIFrameLayout;
import com.chibuzo.component.utility.AU;

public class UIButton extends AppCompatButton implements UIComponent {
    private Context context;
    private ViewGroup uiComponentLayout, uiParentLayout;
    private int marginTop, marginLeft, marginRight, marginBottom, uiParentSize;
    private int layoutType, layoutParamsType, uiComponentType, uiParentLayoutType;
    private int paddingTop, paddingLeft, paddingRight, paddingBottom, uiComponentSize;

    public UIButton(ViewGroup viewGroup) {
        super(viewGroup.getContext());

        viewGroup.addView(this);

        this.context = viewGroup.getContext();

        setUIParentLayoutType(viewGroup);
        setUIParentLayout(viewGroup);
        setUIParentSize(viewGroup);

        /*
        *
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
    * */

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

    /*
    * wrap content both horizontally and vertically. Then, use
    * padding to add weight and size to the button. Use gravity to
    * position the button left, right, center, top or bottom
    * */
    @Override
    public UIComponent setUIComponentPosition(int uiComponentPosition) {
        // first set button wrap content for height and width


        switch (uiComponentPosition) {
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

    @Override
    public void setUIParentLayoutType(ViewGroup viewGroup) {
        if (viewGroup instanceof FrameLayout) {
            this.uiParentLayoutType = UIConst.FRAMELAYOUT_LAYOUT_TYPE;
        } else if (viewGroup instanceof LinearLayout) {
            this.uiParentLayoutType = UIConst.LINEARLAYOUT_LAYOUT_TYPE;
        } else if (viewGroup instanceof RelativeLayout) {
            this.uiParentLayoutType = UIConst.RELATIVELAYOUT_LAYOUT_TYPE;
        }
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

    @Override
    public int getUILayoutType() {
        return 0;
    }

    @Override
    public int getUIParentSize() {
        return uiParentSize;
    }

    @Override
    public ViewGroup getUILayout() {
        return null;
    }

    @Override
    public int getUIComponentSize() {
        return 0;
    }

    @Override
    public int getUILayoutParamsType() {
        return 0;
    }

    @Override
    public int getUIParentLayoutType() {
        return uiParentLayoutType;
    }

    @Override
    public ViewGroup getUIParentLayout() {
        return uiParentLayout;
    }

    public void setLayoutParamsType(int layoutParamsType) {
        this.layoutParamsType = layoutParamsType;
    }

    @Override
    public void setUIParentLayout(ViewGroup uiParentLayout) {
        this.uiParentLayout = uiParentLayout;
    }

    @Override
    public void setUILayoutParamsType(int layoutParamsType) {

    }

    @Override
    public void setUIParentLayoutType(int uiParentLayoutType) {
        this.uiParentLayoutType = uiParentLayoutType;
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

    @Override
    public void setUIParentSize(int uiParentSize) {
        this.uiParentSize = uiParentSize;
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

        switch (getUIParentLayoutType()) {
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
        setUIComponentSize(UIConst.WIDE_COMPONENT_SIZE);
        setLayoutParams(uiButtonLayoutParams);

        return this;
    }

    public UIComponent setUIPaddingBottom(int bottom) {
        paddingBottom = AU.dimen(context, bottom);
        super.setPadding(paddingLeft, paddingTop, paddingRight, paddingBottom);
        return this;
    }

    @Override
    public void setUIComponentSize(int uiComponentSize) {
        this.uiComponentSize = uiComponentSize;
    }

    public UIComponent setUIPaddingRight(int right) {
        paddingRight = AU.dimen(context, right);
        super.setPadding(paddingLeft, paddingTop, paddingRight, paddingBottom);
        return this;
    }

    @Override
    public void setUIParentSize(ViewGroup viewGroup) {
        if (viewGroup instanceof FrameLayout) {
            setUIParentSize(((UIFrameLayout) viewGroup).getUIComponentSize());
        } else if (viewGroup instanceof LinearLayout) {

        } else if (viewGroup instanceof RelativeLayout) {

        }
    }

    public UIComponent setUIPaddingLeft(int left) {
        paddingLeft = AU.dimen(context, left);
        super.setPadding(paddingLeft, paddingTop, paddingRight, paddingBottom);
        return this;
    }

    @Override
    public void setUILayout(ViewGroup uiLayout) {

    }

    @Override
    public void setUILayoutType(int layoutType) {

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


