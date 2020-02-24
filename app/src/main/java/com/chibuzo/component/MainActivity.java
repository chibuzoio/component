package com.chibuzo.component;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.chibuzo.component.uicomponent.UIButton;
import com.chibuzo.component.uilayout.UIFrameLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        UIFrameLayout uiFrameLayout = new UIFrameLayout(this);
        setContentView(uiFrameLayout);

        UIButton uiButton = new UIButton(uiFrameLayout);
        uiButton.setUIMargin(23, 23, 23, 23);
    }
}


