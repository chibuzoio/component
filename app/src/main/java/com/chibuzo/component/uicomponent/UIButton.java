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
    private ViewGroup viewGroup;
    private ViewGroup uiComponentLayout;
    private int layoutType, layoutParamsType, uiComponentType;
    private int marginTop, marginLeft, marginRight, marginBottom;
    private int paddingTop, paddingLeft, paddingRight, paddingBottom;

    public UIButton(ViewGroup viewGroup) {
        super(viewGroup.getContext());

        viewGroup.addView(this);

        this.viewGroup = viewGroup;
        this.context = viewGroup.getContext();

        setUIParentLayout(viewGroup);
        setLayoutType(viewGroup);
        setUIComponentType(UIConst.WIDE_COMPONENT_SIZE);

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

    @Override
    public ViewGroup getUIComponentLayout() {
        return uiComponentLayout;
    }

    @Override
    public int getUIComponentType() {
        return uiComponentType;
    }

    @Override
    public void setUIComponentLayout(ViewGroup viewGroup) {
        if (viewGroup instanceof FrameLayout) {
            uiComponentLayout = (UIFrameLayout) viewGroup;
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

    @Override
    public int getUILayoutType() {
        return 0;
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
        return 0;
    }

    @Override
    public ViewGroup getUIParentLayout() {
        return null;
    }

    public void setLayoutParamsType(int layoutParamsType) {
        this.layoutParamsType = layoutParamsType;
    }

    @Override
    public void setUIParentLayout(ViewGroup uiParentLayout) {
        ViewGroup.LayoutParams uiButtonLayoutParams;

        switch (getUIComponentLayout().getLayoutType()) {
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
    }

    @Override
    public void setUILayoutParamsType(int layoutParamsType) {

    }

    @Override
    public void setUIParentLayoutType(int uiParentLayoutType) {

    }

    @Override
    public void setUIComponentType(int uiComponentType) {
        this.uiComponentType = uiComponentType;
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

        switch (getUIComponentLayout().getLayoutType()) {
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
agrwhdf
        return this;
    }

    public UIComponent setUIPaddingBottom(int bottom) {
        paddingBottom = AU.dimen(context, bottom);
        super.setPadding(paddingLeft, paddingTop, paddingRight, paddingBottom);
        return this;
    }

    @Override
    public void setUIComponentSize(int uiComponentSize) {

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

    @Override
    public void setUILayout(ViewGroup uiLayout) {

    }

    @Override
    public void setUILayoutType(int layoutType) {

    }

    public void setLayoutType(ViewGroup viewGroup) {
        ViewGroup.LayoutParams uiButtonLayoutParams;
gadgshhsd
        switch (getUIComponentLayout().getLayoutType()) {
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


