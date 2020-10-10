package com.chibuzo.component.utility.customviews;

import android.graphics.drawable.Drawable;
import android.view.Gravity;
import android.view.ViewGroup;

import androidx.core.content.ContextCompat;

import com.chibuzo.component.R;
import com.chibuzo.component.GenericLayoutParams;
import com.chibuzo.component.layoutcomponent.HorizontalLinearLayout;
import com.chibuzo.component.viewcomponent.ImageViewComponent;
import com.chibuzo.component.viewcomponent.TextViewComponent;
import com.chibuzo.component.utility.AU;

public class ActivityActionBar extends HorizontalLinearLayout {
    private int cartItemQuantity;
    private TextViewComponent cartItemQuantityView;
    private Drawable menuIcon, companyLogo, cartIcon, userLoginIcon;
    private HorizontalLinearLayout cartDetailLayout, companyLogoLayout;
    private ImageViewComponent menuIconView, companyLogoView, cartIconView, userLoginIconView;

    public ActivityActionBar(ViewGroup viewGroup, int companyLogo) {
        this(viewGroup, companyLogo, 0);
    }

    public ActivityActionBar(ViewGroup viewGroup, int companyLogo, int itemCount) {
        super(viewGroup.getContext(), viewGroup,
                GenericLayoutParams.MATCH_PARENT, GenericLayoutParams.WRAP_CONTENT);

        getGenericLayoutParams().getLayoutParams().height = AU.dimen(getContext(), (float) 55.555);

        AU.disableDefaultActionBar(viewGroup.getContext());

        setBackgroundColor(ContextCompat.getColor(getContext(), R.color.colorPrimary));
        setPadding(11, 7, 11, 7);
        setGravity(Gravity.CENTER_VERTICAL);
        setElevation(15);
        setWeightSum(9);

        setMenuIconView(R.drawable.icon_menu);
        setCompanyLogoLayout(companyLogo);
        setCartDetailLayout(R.drawable.icon_cart, itemCount);
        setUserLoginIconView(R.drawable.icon_login);
    }

    public Drawable getMenuIcon() {
        return menuIcon;
    }

    public void setMenuIcon(int menuIcon) {
        setMenuIcon(ContextCompat.getDrawable(getContext(), menuIcon));
    }

    public void setMenuIcon(Drawable menuIcon) {
        this.menuIcon = menuIcon;
        menuIconView.setImageObject(menuIcon);
    }

    public Drawable getCompanyLogo() {
        return companyLogo;
    }

    public void setCompanyLogo(int companyLogo) {
        setCompanyLogo(ContextCompat.getDrawable(getContext(), companyLogo));
    }

    public void setCompanyLogo(Drawable companyLogo) {
        this.companyLogo = companyLogo;
        companyLogoView.setImageObject(companyLogo);
    }

    public Drawable getCartIcon() {
        return cartIcon;
    }

    public void setCartIcon(int cartIcon) {
        setCartIcon(ContextCompat.getDrawable(getContext(), cartIcon));
    }

    public void setCartIcon(Drawable cartIcon) {
        this.cartIcon = cartIcon;
        cartIconView.setImageObject(cartIcon);
    }

    public Drawable getUserLoginIcon() {
        return userLoginIcon;
    }

    public void setUserLoginIcon(int userLoginIcon) {
        setUserLoginIcon(ContextCompat.getDrawable(getContext(), userLoginIcon));
    }

    public void setUserLoginIcon(Drawable userLoginIcon) {
        this.userLoginIcon = userLoginIcon;
        userLoginIconView.setImageObject(userLoginIcon);
    }

    public int getCartItemQuantity() {
        return cartItemQuantity;
    }

    public void setCartItemQuantity(int cartItemQuantity) {
        this.cartItemQuantity = cartItemQuantity;
        cartItemQuantityView.setText(String.valueOf(cartItemQuantity));
    }

    public ImageViewComponent getMenuIconView() {
        return menuIconView;
    }

    private void setMenuIconView(int drawableResource) {
        menuIconView = new ImageViewComponent(this, drawableResource);
        menuIconView.getGenericLayoutParams().getLayoutParams().height = AU.dimen(getContext(), 25);
        menuIconView.setImageObject(drawableResource);
        menuIconView.setLayoutWeight(1);
        menuIcon = ContextCompat.getDrawable(getContext(), drawableResource);
    }

    public HorizontalLinearLayout getCompanyLogoLayout() {
        return companyLogoLayout;
    }

    private void setCompanyLogoLayout(int drawableResource) {
        companyLogoLayout = new HorizontalLinearLayout(getContext(), this,
                GenericLayoutParams.ZERO_SPACE, GenericLayoutParams.WRAP_CONTENT);
        companyLogoLayout.setPadding(11, 0, 11, 0);
        companyLogoLayout.setGravity(Gravity.CENTER_VERTICAL);
        companyLogoLayout.setLayoutWeight(5.5f);
        setCompanyLogoView(drawableResource);
    }

    public ImageViewComponent getCompanyLogoView() {
        return companyLogoView;
    }

    private void setCompanyLogoView(int drawableResource) {
        companyLogoView = new ImageViewComponent(companyLogoLayout, drawableResource);
        companyLogoView.getGenericLayoutParams().getLayoutParams().height = AU.dimen(getContext(), 25);
        companyLogoView.setImageObject(drawableResource);
        companyLogo = ContextCompat.getDrawable(getContext(), drawableResource);
    }

    public HorizontalLinearLayout getCartDetailLayout() {
        return cartDetailLayout;
    }

    private void setCartDetailLayout(int drawableResource, int itemCount) {
        cartDetailLayout = new HorizontalLinearLayout(getContext(), this,
                GenericLayoutParams.ZERO_SPACE, GenericLayoutParams.WRAP_CONTENT);
        cartDetailLayout.setGravity(Gravity.CENTER);
        cartDetailLayout.setLayoutWeight(1.5f);
        setCartIconView(drawableResource);
        setCartItemQuantityView(itemCount, 7);
    }

    public ImageViewComponent getCartIconView() {
        return cartIconView;
    }

    private void setCartIconView(int drawableResource) {
        cartIconView = new ImageViewComponent(cartDetailLayout, drawableResource);
        cartIconView.getGenericLayoutParams().getLayoutParams().height = AU.dimen(getContext(), 25);
        cartIconView.setImageObject(drawableResource);
        cartIcon = ContextCompat.getDrawable(getContext(), drawableResource);
    }

    public TextViewComponent getCartItemQuantityView() {
        return cartItemQuantityView;
    }

    private void setCartItemQuantityView(int itemCount, int textSize) {
        cartItemQuantityView = new TextViewComponent(cartDetailLayout, String.valueOf(itemCount), textSize);
        cartItemQuantityView.setTextColor(ContextCompat.getColor(getContext(), R.color.whiteColor));
        cartItemQuantityView.setMargins(5, 0, 0, 0);
        cartItemQuantity = itemCount;
    }

    public ImageViewComponent getUserLoginIconView() {
        return userLoginIconView;
    }

    private void setUserLoginIconView(int drawableResource) {
        userLoginIconView = new ImageViewComponent(this, drawableResource);
        userLoginIconView.getGenericLayoutParams().getLayoutParams().height = AU.dimen(getContext(), 25);
        userLoginIconView.setImageObject(drawableResource);
        userLoginIconView.setLayoutWeight(1);
        userLoginIcon = ContextCompat.getDrawable(getContext(), drawableResource);
    }
}


