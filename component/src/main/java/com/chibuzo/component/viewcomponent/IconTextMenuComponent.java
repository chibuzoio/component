package com.chibuzo.component.viewcomponent;

import android.view.Gravity;
import android.view.ViewGroup;

import com.chibuzo.component.GenericLayoutParams;
import com.chibuzo.component.R;
import com.chibuzo.component.layoutcomponent.HorizontalLinearLayout;
import com.chibuzo.component.layoutcomponent.VerticalLinearLayout;

public class IconTextMenuComponent extends VerticalLinearLayout {
    private Object menuIcon;
    private String menuLabel;
    private ViewComponent separatorView;
    private TextViewComponent menuLabelView;
    private ImageViewComponent menuIconView;
    private float menuIconSize, menuLabelSize;
    private HorizontalLinearLayout parentContainerLayout;

    public IconTextMenuComponent(ViewGroup viewGroup, Object menuIcon, String menuLabel) {
        this(viewGroup, menuIcon, menuLabel, 33.333f);
    }

    public IconTextMenuComponent(ViewGroup viewGroup, Object menuIcon, String menuLabel, float menuIconSize) {
        this(viewGroup, menuIcon, menuLabel, menuIconSize, 6);
    }

    public IconTextMenuComponent(ViewGroup viewGroup, Object menuIcon,
                                 String menuLabel, float menuIconSize, float menuLabelSize) {
        super(viewGroup.getContext(), viewGroup,
                GenericLayoutParams.MATCH_PARENT, GenericLayoutParams.WRAP_CONTENT);

        setComponentColor(R.color.whiteColor);

        this.menuIcon = menuIcon;
        this.menuLabel = menuLabel;
        this.menuIconSize = menuIconSize;
        this.menuLabelSize = menuLabelSize;

        setParentContainerLayout();
        setSeparatorView();
    }

    public Object getMenuIcon() {
        return menuIcon;
    }

    public void setMenuIcon(Object menuIcon) {
        menuIconView.setImageObject(menuIcon);
        this.menuIcon = menuIcon;
    }

    public String getMenuLabel() {
        return menuLabel;
    }

    public void setMenuLabel(String menuLabel) {
        menuLabelView.setText(menuLabel);
        this.menuLabel = menuLabel;
    }

    public float getMenuLabelSize() {
        return menuLabelSize;
    }

    public void setMenuLabelSize(int menuLabelSize) {
        menuLabelView.setTextSize(menuLabelSize);
        this.menuLabelSize = menuLabelSize;
    }

    public float getMenuIconSize() {
        return menuIconSize;
    }

    public void setMenuIconSize(float menuIconSize) {
        menuIconView.setImageSize(menuIconSize);
        this.menuIconSize = menuIconSize;
    }

    public HorizontalLinearLayout getParentContainerLayout() {
        return parentContainerLayout;
    }

    private void setParentContainerLayout() {
        parentContainerLayout = new HorizontalLinearLayout(getContext(), this,
                GenericLayoutParams.MATCH_PARENT, GenericLayoutParams.WRAP_CONTENT);

        parentContainerLayout.setMargins(0, 7, 0, 0);
        parentContainerLayout.setGravity(Gravity.CENTER_VERTICAL);

        setMenuIconView();
        setMenuLabelView();
    }

    public ImageViewComponent getMenuIconView() {
        return menuIconView;
    }

    private void setMenuIconView() {
        menuIconView = new ImageViewComponent(parentContainerLayout, menuIcon);
        menuIconView.setMargins(11.111f, 0, 11.111f, 0);
        menuIconView.setImageSize(menuIconSize);
        menuIconView.setImageObject(menuIcon);
    }

    public TextViewComponent getMenuLabelView() {
        return menuLabelView;
    }

    private void setMenuLabelView() {
        menuLabelView = new TextViewComponent(parentContainerLayout, menuLabel,
                menuLabelSize, TextViewComponent.NORMAL_TEXT);
    }

    public ViewComponent getSeparatorView() {
        return separatorView;
    }

    private void setSeparatorView() {
        separatorView = new ViewComponent(this, R.color.faintLine, 1);
        separatorView.setMargins(menuIconSize + 22.222f, 7, 11.111f, 0);
    }
}


