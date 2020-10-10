package com.chibuzo.component.viewcomponent;

import android.content.Context;
import android.view.Gravity;

import androidx.core.content.ContextCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import com.chibuzo.component.GenericLayoutParams;
import com.chibuzo.component.R;
import com.chibuzo.component.layoutcomponent.DrawerLayoutComponent;
import com.chibuzo.component.layoutcomponent.HorizontalLinearLayout;
import com.chibuzo.component.layoutcomponent.VerticalLinearLayout;
import com.chibuzo.component.utility.AU;

public class SlideMenuComponent extends DrawerLayoutComponent {
    private HorizontalLinearLayout toolbarLayout;
    private VerticalLinearLayout slideMenuLayout;
    private VerticalLinearLayout parentContainerLayout;

    public SlideMenuComponent(Context context) {
        super(context);

        AU.disableDefaultActionBar(context);

        setParentContainerLayout();
        setSlideMenuLayout();
    }

    public VerticalLinearLayout getParentContainerLayout() {
        return parentContainerLayout;
    }

    public void setParentContainerLayout(VerticalLinearLayout parentContainerLayout) {
        this.parentContainerLayout = parentContainerLayout;
    }

    public void setParentContainerLayout() {
        parentContainerLayout = new VerticalLinearLayout(getContext(), this,
                GenericLayoutParams.MATCH_PARENT, GenericLayoutParams.MATCH_PARENT);

        parentContainerLayout.setBackgroundColor(ContextCompat.getColor(getContext(), R.color.whiteColor));

        setToolbarLayout();
    }

    public HorizontalLinearLayout getToolbarLayout() {
        return toolbarLayout;
    }

    public void setToolbarLayout(HorizontalLinearLayout toolbarLayout) {
        parentContainerLayout.removeView(this.toolbarLayout);
        this.toolbarLayout = toolbarLayout;
    }

    public void setToolbarLayout() {
        toolbarLayout = new HorizontalLinearLayout(getContext(), parentContainerLayout,
                GenericLayoutParams.MATCH_PARENT, GenericLayoutParams.WRAP_CONTENT);

        toolbarLayout.getGenericLayoutParams().getLayoutParams().height = AU.dimen(getContext(), (float) 55.555);

        toolbarLayout.setBackgroundColor(ContextCompat.getColor(getContext(), R.color.colorPrimary));
        toolbarLayout.setPadding(11, 7, 11, 7);
        toolbarLayout.setGravity(Gravity.CENTER_VERTICAL);
        toolbarLayout.setElevation(15);
    }

    public VerticalLinearLayout getSlideMenuLayout() {
        return slideMenuLayout;
    }

    public void setSlideMenuLayout(VerticalLinearLayout slideMenuLayout) {
        this.slideMenuLayout = slideMenuLayout;
    }

    public void setSlideMenuLayout() {
        VerticalLinearLayout slideMenuParentLayout = new VerticalLinearLayout(getContext(), this,
                GenericLayoutParams.WRAP_CONTENT, GenericLayoutParams.MATCH_PARENT);

        DrawerLayout.LayoutParams slideMenuParentLayoutParams =
                (DrawerLayout.LayoutParams) slideMenuParentLayout.getGenericLayoutParams().getLayoutParams();

        slideMenuParentLayoutParams.width = AU.dimen(getContext(), 300);
        slideMenuParentLayoutParams.gravity = Gravity.START;

        slideMenuParentLayout.setLayoutParams(slideMenuParentLayoutParams);
        slideMenuParentLayout.setBackgroundColor(ContextCompat.getColor(getContext(), R.color.whiteColor));

        ScrollViewComponent scrollViewComponent = new ScrollViewComponent(slideMenuParentLayout);

        slideMenuLayout = new VerticalLinearLayout(getContext(), scrollViewComponent,
                GenericLayoutParams.MATCH_PARENT, GenericLayoutParams.MATCH_PARENT);
    }
}


