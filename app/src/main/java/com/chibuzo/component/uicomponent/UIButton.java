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
    private int uiLayoutType, uiLayoutParamsType, uiComponentType, uiParentLayoutType;
    private int paddingTop, paddingLeft, paddingRight, paddingBottom, uiComponentSize;

    public UIButton(ViewGroup viewGroup) {
        super(viewGroup.getContext());

        viewGroup.addView(this);

        this.context = viewGroup.getContext();

        setParentLayoutProperties(viewGroup);

        marginTop = AU.dimen(context, 7);
        marginLeft = AU.dimen(context, 7);
        marginRight = AU.dimen(context, 7);
        marginBottom = AU.dimen(context, 7);
        paddingTop = AU.dimen(context, 7);
        paddingLeft = AU.dimen(context, 7);
        paddingRight = AU.dimen(context, 7);
        paddingBottom = AU.dimen(context, 7);

        setUIText("Submit");
        setUILayoutType(viewGroup);
        setUIComponentSize(UIConst.WIDE_COMPONENT_SIZE);
        setUIMargin(marginLeft, marginTop, marginRight, marginBottom);
        setUILayoutParamsType(UIConst.MATCH_WIDTH_WRAP_HEIGHT_PARAMS);
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
        return uiLayoutParamsType;
    }

    @Override
    public int getUIParentLayoutType() {
        return uiParentLayoutType;
    }

    @Override
    public ViewGroup getUIParentLayout() {
        return uiParentLayout;
    }

    @Override
    public void setUIParentLayout(ViewGroup uiParentLayout) {
        this.uiParentLayout = uiParentLayout;
    }

    @Override
    public void setUILayoutParamsType(int uiLayoutParamsType) {
        this.uiLayoutParamsType = uiLayoutParamsType;
    }

    @Override
    public void setUIParentLayoutType(int uiParentLayoutType) {
        this.uiParentLayoutType = uiParentLayoutType;
    }

    @Override
    public void setParentLayoutProperties(ViewGroup viewGroup) {
        setUIParentLayoutType(viewGroup);
        setUIParentLayout(viewGroup);
        setUIParentSize(viewGroup);
    }

    @Override
    public UIComponent setUIMarginBottom(int bottom) {
        marginBottom = AU.dimen(context, bottom);
        setUIMargin(marginLeft, marginTop, marginRight, marginBottom);
        return this;
    }

    @Override
    public UIComponent setUIMarginRight(int right) {
        marginRight = AU.dimen(context, right);
        setUIMargin(marginLeft, marginTop, marginRight, marginBottom);
        return this;
    }

    @Override
    public UIComponent setUIMarginLeft(int left) {
        marginLeft = AU.dimen(context, left);
        setUIMargin(marginLeft, marginTop, marginRight, marginBottom);
        return this;
    }

    @Override
    public void setUIParentSize(int uiParentSize) {
        this.uiParentSize = uiParentSize;
    }

    @Override
    public UIComponent setUIMarginTop(int top) {
        marginTop = AU.dimen(context, top);
        setUIMargin(marginLeft, marginTop, marginRight, marginBottom);
        return this;
    }

    @Override
    public UIComponent setUIMargin(int left, int top, int right, int bottom) {
        ViewGroup.LayoutParams uiButtonLayoutParams;

        marginTop = AU.dimen(context, top);
        marginLeft = AU.dimen(context, left);
        marginRight = AU.dimen(context, right);
        marginBottom = AU.dimen(context, bottom);

        if (getUIParentLayout() instanceof LinearLayout) {
            uiButtonLayoutParams = new LinearLayout.LayoutParams(
                    LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);

            ((LinearLayout.LayoutParams) uiButtonLayoutParams).setMargins(marginLeft, marginTop, marginRight, marginBottom);
            setUILayoutType(UIConst.LINEARLAYOUT_LAYOUT_TYPE);
        } else if (getUIParentLayout() instanceof RelativeLayout) {
            uiButtonLayoutParams = new RelativeLayout.LayoutParams(
                    RelativeLayout.LayoutParams.MATCH_PARENT, RelativeLayout.LayoutParams.WRAP_CONTENT);

            ((RelativeLayout.LayoutParams) uiButtonLayoutParams).setMargins(marginLeft, marginTop, marginRight, marginBottom);
            setUILayoutType(UIConst.RELATIVELAYOUT_LAYOUT_TYPE);
        } else {
            uiButtonLayoutParams = new FrameLayout.LayoutParams(
                    FrameLayout.LayoutParams.MATCH_PARENT, FrameLayout.LayoutParams.WRAP_CONTENT);

            ((FrameLayout.LayoutParams) uiButtonLayoutParams).setMargins(marginLeft, marginTop, marginRight, marginBottom);
            setUILayoutType(UIConst.FRAMELAYOUT_LAYOUT_TYPE);
        }

        setLayoutParams(uiButtonLayoutParams);

        return this;
    }

    @Override
    public UIComponent setUIPaddingBottom(int bottom) {
        paddingBottom = AU.dimen(context, bottom);
        super.setPadding(paddingLeft, paddingTop, paddingRight, paddingBottom);
        return this;
    }

    @Override
    public void setUIComponentSize(int uiComponentSize) {
        this.uiComponentSize = uiComponentSize;
    }

    @Override
    public UIComponent setUIPaddingRight(int right) {
        paddingRight = AU.dimen(context, right);
        super.setPadding(paddingLeft, paddingTop, paddingRight, paddingBottom);
        return this;
    }

    @Override
    public void setUILayoutType(ViewGroup viewGroup) {
        ViewGroup.LayoutParams uiButtonLayoutParams;

        if (getUIParentLayout() instanceof  LinearLayout) {
            uiButtonLayoutParams = new LinearLayout.LayoutParams(
                    LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);

            setUILayoutType(UIConst.LINEARLAYOUT_LAYOUT_TYPE);
        } else if (getUIParentLayout() instanceof RelativeLayout) {
            uiButtonLayoutParams = new RelativeLayout.LayoutParams(
                    RelativeLayout.LayoutParams.MATCH_PARENT, RelativeLayout.LayoutParams.WRAP_CONTENT);

            setUILayoutType(UIConst.RELATIVELAYOUT_LAYOUT_TYPE);
        } else {
            uiButtonLayoutParams = new FrameLayout.LayoutParams(
                    FrameLayout.LayoutParams.MATCH_PARENT, FrameLayout.LayoutParams.WRAP_CONTENT);

            setUILayoutType(UIConst.FRAMELAYOUT_LAYOUT_TYPE);
        }

        setLayoutParams(uiButtonLayoutParams);
    }

    @Override
    public void setUIParentSize(ViewGroup viewGroup) {
        if (viewGroup instanceof FrameLayout) {
            setUIParentSize(((UIFrameLayout) viewGroup).getUIComponentSize());
        } else if (viewGroup instanceof LinearLayout) {

        } else if (viewGroup instanceof RelativeLayout) {

        }
    }

    @Override
    public UIComponent setUIPaddingLeft(int left) {
        paddingLeft = AU.dimen(context, left);
        super.setPadding(paddingLeft, paddingTop, paddingRight, paddingBottom);
        return this;
    }

    @Override
    public void setUILayout(ViewGroup uiLayout) {

    }

    @Override
    public void setUILayoutType(int uiLayoutType) {
        this.uiLayoutType = uiLayoutType;
    }

    @Override
    public UIComponent setUIPaddingTop(int top) {
        paddingTop = AU.dimen(context, top);
        super.setPadding(paddingLeft, paddingTop, paddingRight, paddingBottom);
        return this;
    }

    public UIButton setUIText(String buttonText) {
        super.setText(buttonText);
        return this;
    }

    @Override
    public UIComponent setUIPadding(int left, int top, int right, int bottom) {
        paddingTop = AU.dimen(context, top);
        paddingLeft = AU.dimen(context, left);
        paddingRight = AU.dimen(context, right);
        paddingBottom = AU.dimen(context, bottom);
        super.setPadding(paddingLeft, paddingTop, paddingRight, paddingBottom);
        return this;
    }
}


