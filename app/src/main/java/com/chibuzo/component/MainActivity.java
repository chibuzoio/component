package com.chibuzo.component;

import android.os.Bundle;
import android.util.DisplayMetrics;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

import com.chibuzo.component.model.constants.UIComponentParams;
import com.chibuzo.component.model.constants.UIComponentPosition;
import com.chibuzo.component.uicomponent.UIButton;
import com.chibuzo.component.uilayout.BaseFrameLayout;
import com.chibuzo.component.uilayout.UIFrameLayout;
import com.chibuzo.component.utility.Utility;

public class MainActivity extends AppCompatActivity {
    private int deviceDisplayWidth, deviceDisplayHeight;
    private int screenWidth, buttonWidth, buttonLeft, buttonRight, horizontalTotal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        DisplayMetrics displayMetrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);

        deviceDisplayWidth = displayMetrics.widthPixels;
        deviceDisplayHeight = displayMetrics.heightPixels;

//        uiButton.setUIMargin(23, 23, 23, 23);

//        uiButton.setUIMargin(111, 0, 0, 0);

//        UIButton second = new UIButton(uiFrameLayout);
//        second.setUIText("delete");

        // Put any code you want to run after complete
        // rendering of the UI inside this construct
        getWindow().getDecorView().post(() -> {
            screenWidth = deviceDisplayWidth;

//            second.setVisibility(View.GONE);
            BaseFrameLayout baseFrameLayout = new BaseFrameLayout(MainActivity.this);
            setContentView(baseFrameLayout);

            UIFrameLayout uiFrameLayout = new UIFrameLayout(MainActivity.this, baseFrameLayout);
            UIButton uiButton = new UIButton(MainActivity.this, uiFrameLayout);

            buttonWidth = uiButton.getWidth();
            Log.e("buttonWidth", "buttonWidth value here is " + buttonWidth);
            buttonLeft = Utility.getRelativeLeft(uiButton);
            buttonRight = screenWidth - buttonWidth - buttonLeft;
            horizontalTotal = buttonLeft + buttonWidth + buttonRight;

            Log.e("uiFrameLayout", "uiFrameLayout width value here is " + uiFrameLayout.getWidth());
            Log.e("buttonLeft", "buttonLeft value here is " + buttonLeft);
            Log.e("buttonRight", "buttonRight value here is " + buttonRight);
            Log.e("buttonWidth", "buttonWidth value here is " + buttonWidth);
            Log.e("screenWidth", "screenWidth value here is " + screenWidth);
            Log.e("horizontalTotal", "horizontalTotal value here is " + horizontalTotal);

            uiButton.setUILayoutParamsType(UIComponentParams.WRAP_WIDTH_WRAP_HEIGHT_PARAMS);
//            second.setUILayoutParamsType(UIComponentParams.WRAP_WIDTH_WRAP_HEIGHT_PARAMS);
            uiButton.setUIComponentPosition(UIComponentPosition.VERTICAL_RIGHT);

            // set and get previous margin for addition and multiplication
//            uiButton.setUIMargin(0, 223, 0, 0);
//            uiButton.setUIComponentPosition(UIComponentPosition.CENTER);
//            uiButton.setUIMargin(0, -223, 0, 0);

            if (deviceDisplayHeight > deviceDisplayWidth) { // Vertical Alignment

            } else if (deviceDisplayWidth > deviceDisplayHeight) { // Horizontal alignment

            }
        });
    }
}


