package com.chibuzo.component.uicomponent;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import androidx.appcompat.widget.AppCompatButton;

import com.chibuzo.component.model.constants.UIComponentParams;
import com.chibuzo.component.model.constants.UIComponentPosition;
import com.chibuzo.component.model.constants.UIComponentSize;
import com.chibuzo.component.model.constants.UILayoutType;
import com.chibuzo.component.uiinterface.UIComponent;
import com.chibuzo.component.uilayout.UIFrameLayout;
import com.chibuzo.component.utility.AU;

public class UIButton extends AppCompatButton implements UIComponent {
    private Context context;
    private ViewGroup uiComponentLayout, uiParentLayout;
    private int uiLayoutType, uiLayoutParamsType, uiParentLayoutType;
    private int marginTop, marginLeft, marginRight, marginBottom, uiParentSize;
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
        setUIComponentSize(UIComponentSize.WIDE_COMPONENT_SIZE);
        setUIMargin(marginLeft, marginTop, marginRight, marginBottom);
        setUIPadding(paddingLeft, paddingTop, paddingRight, paddingBottom);
        setUILayoutParamsType(UIComponentParams.MATCH_WIDTH_WRAP_HEIGHT_PARAMS);
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
            case UIComponentPosition.LEFT_COMPONENT_POSITION:

                break;
            case UIComponentPosition.CENTER_COMPONENT_POSITION:

                break;
            case UIComponentPosition.RIGHT_COMPONENT_POSITION:

                break;
            case UIComponentPosition.LEFT_TOP_COMPONENT_POSITION:

                break;
            case UIComponentPosition.CENTER_TOP_COMPONENT_POSITION:

                break;
            case UIComponentPosition.RIGHT_TOP_COMPONENT_POSITION:

                break;
            case UIComponentPosition.LEFT_BOTTOM_COMPONENT_POSITION:

                break;
                case UIComponentPosition.CENTER_BOTTOM_COMPONENT_POSITION:

                break;
            case UIComponentPosition.RIGHT_BOTTOM_COMPONENT_POSITION:

                break;
                default:
                    // make it left button
        }

        return this;
    }

    @Override
    public void setUIParentLayoutType(ViewGroup viewGroup) {
        if (viewGroup instanceof FrameLayout) {
            this.uiParentLayoutType = UILayoutType.FRAMELAYOUT_LAYOUT_TYPE;
        } else if (viewGroup instanceof LinearLayout) {
            this.uiParentLayoutType = UILayoutType.LINEARLAYOUT_LAYOUT_TYPE;
        } else if (viewGroup instanceof RelativeLayout) {
            this.uiParentLayoutType = UILayoutType.RELATIVELAYOUT_LAYOUT_TYPE;
        }
    }

    @Override
    public int getUILayoutType() {
        return uiLayoutType;
    }

    @Override
    public int getUIParentSize() {
        return uiParentSize;
    }

    @Override
    public ViewGroup getUIComponentLayout() {
        return uiComponentLayout;
    }

    @Override
    public int getUIComponentSize() {
        return uiComponentSize;
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

            setUILayoutType(UILayoutType.LINEARLAYOUT_LAYOUT_TYPE);
        } else if (getUIParentLayout() instanceof RelativeLayout) {
            uiButtonLayoutParams = new RelativeLayout.LayoutParams(
                    RelativeLayout.LayoutParams.MATCH_PARENT, RelativeLayout.LayoutParams.WRAP_CONTENT);

            setUILayoutType(UILayoutType.RELATIVELAYOUT_LAYOUT_TYPE);
        } else {
            uiButtonLayoutParams = new FrameLayout.LayoutParams(
                    FrameLayout.LayoutParams.MATCH_PARENT, FrameLayout.LayoutParams.WRAP_CONTENT);

            setUILayoutType(UILayoutType.FRAMELAYOUT_LAYOUT_TYPE);
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
    public void setUIComponentLayout(ViewGroup uiComponentLayout) {
        this.uiComponentLayout = uiComponentLayout;
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


