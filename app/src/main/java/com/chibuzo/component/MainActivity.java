package com.chibuzo.component;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.DisplayMetrics;
import android.util.Log;

import com.chibuzo.component.model.constants.UIComponentSize;
import com.chibuzo.component.uicomponent.UIButton;
import com.chibuzo.component.uilayout.UIFrameLayout;
import com.chibuzo.component.utility.Utility;

public class MainActivity extends AppCompatActivity {
    private int deviceDisplayWidth;
    private int deviceDisplayHeight;

    private int screenWidth, buttonWidth, buttonLeft, buttonRight, horizontalTotal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        DisplayMetrics displayMetrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);

        deviceDisplayWidth = displayMetrics.widthPixels;
        deviceDisplayHeight = displayMetrics.heightPixels;

        UIFrameLayout uiFrameLayout = new UIFrameLayout(this);
        setContentView(uiFrameLayout);

        UIButton uiButton = new UIButton(uiFrameLayout);
        uiButton.setUIMargin(23, 23, 23, 23);
        uiButton.setUIComponentSize(UIComponentSize.NARROW_COMPONENT_SIZE);

        uiButton.setUIMargin(111, 0, 0, 0);

        uiFrameLayout.setOnClickListener((view) -> {
            screenWidth = deviceDisplayWidth;

            buttonWidth = uiButton.getWidth();
            buttonLeft = Utility.getRelativeLeft(uiButton);
            buttonRight = screenWidth - buttonWidth - buttonLeft;
            horizontalTotal = buttonLeft + buttonWidth + buttonRight;

            Log.e("buttonLeft", "buttonLeft value here is " + buttonLeft);
            Log.e("buttonRight", "buttonRight value here is " + buttonRight);
            Log.e("buttonWidth", "buttonWidth value here is " + buttonWidth);
            Log.e("screenWidth", "screenWidth value here is " + screenWidth);
            Log.e("horizontalTotal", "horizontalTotal value here is " + horizontalTotal);
        });
    }
}


