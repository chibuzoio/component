package com.chibuzo.component;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import androidx.drawerlayout.widget.DrawerLayout;

import com.chibuzo.component.utility.AU;

public class GenericLayoutParams {
    private ViewGroup.LayoutParams layoutParams;

    public static final int ZERO_SPACE = 0;
    public static final int MATCH_PARENT = 1;
    public static final int WRAP_CONTENT = -1;

    public GenericLayoutParams(ViewGroup viewGroup, int horizontalParam, int verticalParam) {
        if (horizontalParam < 0 && verticalParam < 0) {
            if (viewGroup instanceof FrameLayout) {
                layoutParams = new FrameLayout.LayoutParams(FrameLayout.LayoutParams.WRAP_CONTENT,
                        FrameLayout.LayoutParams.WRAP_CONTENT);
            } else if (viewGroup instanceof LinearLayout) {
                layoutParams = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT,
                        LinearLayout.LayoutParams.WRAP_CONTENT);
            } else if (viewGroup instanceof RelativeLayout) {
                layoutParams = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT,
                        RelativeLayout.LayoutParams.WRAP_CONTENT);
            } else if (viewGroup instanceof DrawerLayout) {
                layoutParams = new DrawerLayout.LayoutParams(DrawerLayout.LayoutParams.WRAP_CONTENT,
                        DrawerLayout.LayoutParams.WRAP_CONTENT);
            } else {
                layoutParams = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT,
                        LinearLayout.LayoutParams.WRAP_CONTENT);
            }
        } else if (horizontalParam > 0 && verticalParam < 0) {
            if (viewGroup instanceof FrameLayout) {
                layoutParams = new FrameLayout.LayoutParams(FrameLayout.LayoutParams.MATCH_PARENT,
                        FrameLayout.LayoutParams.WRAP_CONTENT);
            } else if (viewGroup instanceof LinearLayout) {
                layoutParams = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,
                        LinearLayout.LayoutParams.WRAP_CONTENT);
            } else if (viewGroup instanceof RelativeLayout) {
                layoutParams = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.MATCH_PARENT,
                        RelativeLayout.LayoutParams.WRAP_CONTENT);
            } else if (viewGroup instanceof DrawerLayout) {
                layoutParams = new DrawerLayout.LayoutParams(DrawerLayout.LayoutParams.MATCH_PARENT,
                        DrawerLayout.LayoutParams.WRAP_CONTENT);
            } else {
                layoutParams = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,
                        LinearLayout.LayoutParams.WRAP_CONTENT);
            }
        } else if (horizontalParam > 0 && verticalParam > 0) {
            if (viewGroup instanceof FrameLayout) {
                layoutParams = new FrameLayout.LayoutParams(FrameLayout.LayoutParams.MATCH_PARENT,
                        FrameLayout.LayoutParams.MATCH_PARENT);
            } else if (viewGroup instanceof LinearLayout) {
                layoutParams = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,
                        LinearLayout.LayoutParams.MATCH_PARENT);
            } else if (viewGroup instanceof RelativeLayout) {
                layoutParams = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.MATCH_PARENT,
                        RelativeLayout.LayoutParams.MATCH_PARENT);
            } else if (viewGroup instanceof DrawerLayout) {
                layoutParams = new DrawerLayout.LayoutParams(DrawerLayout.LayoutParams.MATCH_PARENT,
                        DrawerLayout.LayoutParams.MATCH_PARENT);
            } else {
                layoutParams = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,
                        LinearLayout.LayoutParams.MATCH_PARENT);
            }
        } else if (horizontalParam < 0 && verticalParam > 0) {
            if (viewGroup instanceof FrameLayout) {
                layoutParams = new FrameLayout.LayoutParams(FrameLayout.LayoutParams.WRAP_CONTENT,
                        FrameLayout.LayoutParams.MATCH_PARENT);
            } else if (viewGroup instanceof LinearLayout) {
                layoutParams = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT,
                        LinearLayout.LayoutParams.MATCH_PARENT);
            } else if (viewGroup instanceof RelativeLayout) {
                layoutParams = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT,
                        RelativeLayout.LayoutParams.MATCH_PARENT);
            } else if (viewGroup instanceof DrawerLayout) {
                layoutParams = new DrawerLayout.LayoutParams(DrawerLayout.LayoutParams.WRAP_CONTENT,
                        DrawerLayout.LayoutParams.MATCH_PARENT);
            } else {
                layoutParams = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT,
                        LinearLayout.LayoutParams.MATCH_PARENT);
            }
        } else if (horizontalParam == 0 && verticalParam < 0) {
            if (viewGroup instanceof FrameLayout) {
                layoutParams = new FrameLayout.LayoutParams(ZERO_SPACE, FrameLayout.LayoutParams.WRAP_CONTENT);
            } else if (viewGroup instanceof LinearLayout) {
                layoutParams = new LinearLayout.LayoutParams(ZERO_SPACE, LinearLayout.LayoutParams.WRAP_CONTENT);
            } else if (viewGroup instanceof RelativeLayout) {
                layoutParams = new RelativeLayout.LayoutParams(ZERO_SPACE, RelativeLayout.LayoutParams.WRAP_CONTENT);
            } else if (viewGroup instanceof DrawerLayout) {
                layoutParams = new DrawerLayout.LayoutParams(ZERO_SPACE, DrawerLayout.LayoutParams.WRAP_CONTENT);
            } else {
                layoutParams = new LinearLayout.LayoutParams(ZERO_SPACE, LinearLayout.LayoutParams.WRAP_CONTENT);
            }
        } else if (horizontalParam == 0 && verticalParam > 0) {
            if (viewGroup instanceof FrameLayout) {
                layoutParams = new FrameLayout.LayoutParams(ZERO_SPACE, FrameLayout.LayoutParams.MATCH_PARENT);
            } else if (viewGroup instanceof LinearLayout) {
                layoutParams = new LinearLayout.LayoutParams(ZERO_SPACE, LinearLayout.LayoutParams.MATCH_PARENT);
            } else if (viewGroup instanceof RelativeLayout) {
                layoutParams = new RelativeLayout.LayoutParams(ZERO_SPACE, RelativeLayout.LayoutParams.MATCH_PARENT);
            } else if (viewGroup instanceof DrawerLayout) {
                layoutParams = new DrawerLayout.LayoutParams(ZERO_SPACE, DrawerLayout.LayoutParams.MATCH_PARENT);
            } else {
                layoutParams = new LinearLayout.LayoutParams(ZERO_SPACE, LinearLayout.LayoutParams.MATCH_PARENT);
            }
        } else if (horizontalParam < 0) {
            if (viewGroup instanceof FrameLayout) {
                layoutParams = new FrameLayout.LayoutParams(FrameLayout.LayoutParams.WRAP_CONTENT, ZERO_SPACE);
            } else if (viewGroup instanceof LinearLayout) {
                layoutParams = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, ZERO_SPACE);
            } else if (viewGroup instanceof RelativeLayout) {
                layoutParams = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT, ZERO_SPACE);
            } else if (viewGroup instanceof DrawerLayout) {
                layoutParams = new DrawerLayout.LayoutParams(DrawerLayout.LayoutParams.WRAP_CONTENT, ZERO_SPACE);
            } else {
                layoutParams = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, ZERO_SPACE);
            }
        } else if (horizontalParam > 0) {
            if (viewGroup instanceof FrameLayout) {
                layoutParams = new FrameLayout.LayoutParams(FrameLayout.LayoutParams.MATCH_PARENT, ZERO_SPACE);
            } else if (viewGroup instanceof LinearLayout) {
                layoutParams = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, ZERO_SPACE);
            } else if (viewGroup instanceof RelativeLayout) {
                layoutParams = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.MATCH_PARENT, ZERO_SPACE);
            } else if (viewGroup instanceof DrawerLayout) {
                layoutParams = new DrawerLayout.LayoutParams(DrawerLayout.LayoutParams.MATCH_PARENT, ZERO_SPACE);
            } else {
                layoutParams = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, ZERO_SPACE);
            }
        } else {
            if (viewGroup instanceof FrameLayout) {
                layoutParams = new FrameLayout.LayoutParams(ZERO_SPACE, ZERO_SPACE);
            } else if (viewGroup instanceof LinearLayout) {
                layoutParams = new LinearLayout.LayoutParams(ZERO_SPACE, ZERO_SPACE);
            } else if (viewGroup instanceof RelativeLayout) {
                layoutParams = new RelativeLayout.LayoutParams(ZERO_SPACE, ZERO_SPACE);
            } else if (viewGroup instanceof DrawerLayout) {
                layoutParams = new DrawerLayout.LayoutParams(ZERO_SPACE, ZERO_SPACE);
            } else {
                layoutParams = new LinearLayout.LayoutParams(ZERO_SPACE, ZERO_SPACE);
            }
        }
    }

    public void setLayoutMargin(View view, float left, float top, float right, float bottom) {
        Context context = view.getContext();
        ViewGroup.LayoutParams viewGroupLayoutParams = view.getLayoutParams();

        if (viewGroupLayoutParams instanceof FrameLayout.LayoutParams) {
            FrameLayout.LayoutParams frameLayoutParams = (FrameLayout.LayoutParams) viewGroupLayoutParams;
            frameLayoutParams.setMargins(AU.dimen(context, left), AU.dimen(context, top),
                    AU.dimen(context, right), AU.dimen(context, bottom));
            view.setLayoutParams(frameLayoutParams);
        } else if (viewGroupLayoutParams instanceof LinearLayout.LayoutParams) {
            LinearLayout.LayoutParams linearLayoutParams = (LinearLayout.LayoutParams) viewGroupLayoutParams;
            linearLayoutParams.setMargins(AU.dimen(context, left), AU.dimen(context, top),
                    AU.dimen(context, right), AU.dimen(context, bottom));
            view.setLayoutParams(linearLayoutParams);
        } else if (viewGroupLayoutParams instanceof RelativeLayout.LayoutParams) {
            RelativeLayout.LayoutParams relativeLayoutParams = (RelativeLayout.LayoutParams) viewGroupLayoutParams;
            relativeLayoutParams.setMargins(AU.dimen(context, left), AU.dimen(context, top),
                    AU.dimen(context, right), AU.dimen(context, bottom));
            view.setLayoutParams(relativeLayoutParams);
        } else if (viewGroupLayoutParams instanceof DrawerLayout.LayoutParams) {
            DrawerLayout.LayoutParams drawerLayoutParams = (DrawerLayout.LayoutParams) viewGroupLayoutParams;
            drawerLayoutParams.setMargins(AU.dimen(context, left), AU.dimen(context, top),
                    AU.dimen(context, right), AU.dimen(context, bottom));
            view.setLayoutParams(drawerLayoutParams);
        }
    }

    public void setLayoutGravity(View view, int gravity) {
        ViewGroup.LayoutParams viewGroupLayoutParams = view.getLayoutParams();

        if (viewGroupLayoutParams instanceof FrameLayout.LayoutParams) {
            FrameLayout.LayoutParams frameLayoutParams = (FrameLayout.LayoutParams) viewGroupLayoutParams;
            frameLayoutParams.gravity = gravity;
            view.setLayoutParams(frameLayoutParams);
        } else if (viewGroupLayoutParams instanceof LinearLayout.LayoutParams) {
            LinearLayout.LayoutParams linearLayoutParams = (LinearLayout.LayoutParams) viewGroupLayoutParams;
            linearLayoutParams.gravity = gravity;
            view.setLayoutParams(linearLayoutParams);
        }
    }

    public ViewGroup.LayoutParams getLayoutParams() {
        return layoutParams;
    }
}


