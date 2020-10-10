package com.chibuzo.component.utility.customviews;

import android.content.Context;
import android.view.Gravity;
import android.view.ViewGroup;

import com.chibuzo.component.GenericLayoutParams;
import com.chibuzo.component.layoutcomponent.HorizontalLinearLayout;
import com.chibuzo.component.layoutcomponent.VerticalLinearLayout;
import com.chibuzo.component.viewcomponent.ImageViewComponent;
import com.chibuzo.component.viewcomponent.TextViewComponent;
import com.chibuzo.component.model.ProductCategoryMenu;
import com.chibuzo.component.utility.AU;

import java.util.ArrayList;

public class ProductCategoryLayout extends VerticalLinearLayout {
    private Context context;
    private ViewGroup viewGroup;
    private ArrayList<ProductCategoryMenu> productCategoryMenuArrayList;
    private int counter, boxLayoutSize, menuLabelSize, fourMoreCategories;

    public ProductCategoryLayout(ViewGroup viewGroup, int menuLabelSize) {
        super(viewGroup.getContext(), viewGroup,
                GenericLayoutParams.MATCH_PARENT, GenericLayoutParams.WRAP_CONTENT);

        counter = 0;
        fourMoreCategories = 0;
        this.viewGroup = viewGroup;
        this.menuLabelSize = menuLabelSize;
        this.context = viewGroup.getContext();
        boxLayoutSize = AU.getDeviceWidth(context) / 4;
    }

    public void setProductCategoryMenuArrayList(ArrayList<ProductCategoryMenu> productCategoryMenuArrayList) {
        this.productCategoryMenuArrayList = productCategoryMenuArrayList;
    }

    public VerticalLinearLayout getCategoryMenuLayout(int menuIcon, String menuLabel) {
        VerticalLinearLayout verticalLinearLayout = new VerticalLinearLayout(context,
                GenericLayoutParams.WRAP_CONTENT, GenericLayoutParams.WRAP_CONTENT);

        verticalLinearLayout.setGravity(Gravity.CENTER);

        ImageViewComponent imageViewComponent =
                new ImageViewComponent(verticalLinearLayout, menuIcon, menuIcon, (int) 11.111);
        imageViewComponent.getGenericLayoutParams().getLayoutParams().width = AU.dimen(context, 47);
        imageViewComponent.getGenericLayoutParams().getLayoutParams().height = AU.dimen(context, 47);

        TextViewComponent textViewComponent = new TextViewComponent(verticalLinearLayout,
                menuLabel, menuLabelSize, TextViewComponent.TEXT_ALIGN_CENTER);

        textViewComponent.setGravity(Gravity.CENTER);

        verticalLinearLayout.getGenericLayoutParams().getLayoutParams().width = boxLayoutSize;
        verticalLinearLayout.getGenericLayoutParams().getLayoutParams().height = boxLayoutSize;

        return verticalLinearLayout;
    }

    public void buildCategoryMenuLayout() {
        HorizontalLinearLayout horizontalLinearLayout = new HorizontalLinearLayout(context,
                viewGroup, GenericLayoutParams.WRAP_CONTENT, GenericLayoutParams.WRAP_CONTENT);

        setFourMoreCategories();

        for (int i = counter; i < fourMoreCategories; i++) {
            horizontalLinearLayout.addView(productCategoryMenuArrayList.get(i).getProductCategoryMenuLayout());
        }

        counter = fourMoreCategories;

        if (productCategoryMenuArrayList.size() > fourMoreCategories) {
            buildCategoryMenuLayout();
        }
    }

    private void setFourMoreCategories() {
        int productCategoryRemnant = productCategoryMenuArrayList.size() - counter;

        if (productCategoryRemnant > 4) {
            fourMoreCategories = counter + 4;
        } else if (productCategoryRemnant > 0) {
            fourMoreCategories = counter + productCategoryRemnant;
        }
    }
}


