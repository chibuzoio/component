package com.chibuzo.component.utility;

import android.content.Context;
import android.graphics.Typeface;
import android.text.InputType;
import android.view.Gravity;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

import androidx.core.content.ContextCompat;
import androidx.core.view.ViewCompat;

import com.chibuzo.component.R;
import com.chibuzo.component.viewcomponent.EditTextComponent;
import com.chibuzo.component.viewcomponent.TextViewComponent;

public class Component {

    public static LinearLayout getLinearLinearLayout(Context context) {
        LinearLayout.LayoutParams linearLinearLayoutParams =
                new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,
                        LinearLayout.LayoutParams.WRAP_CONTENT);

        LinearLayout linearLayout = new LinearLayout(context);

        linearLayout.setLayoutParams(linearLinearLayoutParams);
        linearLayout.setOrientation(LinearLayout.VERTICAL);

        return linearLayout;
    }

    public static ScrollView getLinearScrollView(Context context) {
        LinearLayout.LayoutParams linearScrollViewParams =
                new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,
                        LinearLayout.LayoutParams.WRAP_CONTENT);

        ScrollView scrollView = new ScrollView(context);

        scrollView.setLayoutParams(linearScrollViewParams);
        scrollView.setHorizontalScrollBarEnabled(false);
        scrollView.setVerticalScrollBarEnabled(false);

        return scrollView;
    }

    public static ImageView getLinearImageView(Context context) {
        LinearLayout.LayoutParams linearImageViewParams =
                new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,
                        LinearLayout.LayoutParams.WRAP_CONTENT);

        linearImageViewParams.setMargins(AU.dimen(context, 23),
                AU.dimen(context, 23), AU.dimen(context, 23),
                AU.dimen(context, 0));

        ImageView imageView = new ImageView(context);

        imageView.setLayoutParams(linearImageViewParams);

        return imageView;
    }

    public static View getLinearSpace(Context context) {
        return getLinearSpace(context, 23);
    }

    public static View getLinearSpace(Context context, int distance) {
        LinearLayout.LayoutParams linearSpaceParams =
                new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,
                        LinearLayout.LayoutParams.WRAP_CONTENT);

        linearSpaceParams.height = AU.dimen(context, distance);

        View view = new View(context);

        view.setLayoutParams(linearSpaceParams);

        return view;
    }

    public static EditText getLinearEditText(Context context, String hint, int inputType) {
        LinearLayout.LayoutParams linearEditTextParams =
                new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,
                        LinearLayout.LayoutParams.WRAP_CONTENT);

        linearEditTextParams.height = AU.dimen(context, 43);

        EditText editText = new EditText(context);

        editText.setLayoutParams(linearEditTextParams);

        editText.setPadding(AU.dimen(context, 7),
                AU.dimen(context, 0), AU.dimen(context, 7),
                AU.dimen(context, 0));

        editText.setHint(hint);
        editText.setGravity(Gravity.CENTER_VERTICAL);
        editText.setTextColor(ContextCompat.getColor(context, R.color.genericBlackColor));

        ViewCompat.setBackground(editText, ContextCompat.getDrawable(context, R.drawable.generic_edit_text));

        switch (inputType) {
            case EditTextComponent.INPUT_TYPE_NUMBER:
                editText.setInputType(InputType.TYPE_CLASS_NUMBER);
                break;
            case EditTextComponent.INPUT_TYPE_DATE_TIME:
                editText.setInputType(InputType.TYPE_CLASS_DATETIME);
                break;
            case EditTextComponent.INPUT_TYPE_PHONE:
                editText.setInputType(InputType.TYPE_CLASS_PHONE);
                break;
            case EditTextComponent.INPUT_TYPE_TEXT_PASSWORD:
                editText.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_VARIATION_PASSWORD);
                break;
            case EditTextComponent.INPUT_TYPE_NUMBER_PASSWORD:
                editText.setInputType(InputType.TYPE_CLASS_NUMBER | InputType.TYPE_NUMBER_VARIATION_PASSWORD);
                break;
            case EditTextComponent.INPUT_TYPE_TEXT:
            default:
                editText.setInputType(InputType.TYPE_CLASS_TEXT);
                break;
        }

        return editText;
    }

    public static LinearLayout getLinearFormField(Context context, String label, String hint, int inputType) {
        LinearLayout.LayoutParams linearFormFieldParams =
                new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,
                        LinearLayout.LayoutParams.WRAP_CONTENT);

        linearFormFieldParams.setMargins(AU.dimen(context, 23),
                AU.dimen(context, (float) 11.111), AU.dimen(context, 23),
                AU.dimen(context, 0));

        LinearLayout linearLayout = new LinearLayout(context);

        linearLayout.setLayoutParams(linearFormFieldParams);
        linearLayout.setOrientation(LinearLayout.VERTICAL);

        TextView textView = getLinearTextView(context, label);

        textView.setTypeface(Typeface.DEFAULT_BOLD);

        EditText editText = getLinearEditText(context, hint, inputType);

        linearLayout.addView(textView);
        linearLayout.addView(editText);

        return linearLayout;
    }

    public static TextView getLinearTextView(Context context, String text) {
        return getLinearTextView(context, text, 5, TextViewComponent.TEXT_ALIGN_LEFT);
    }

    public static TextView getLinearTextView(Context context, String text, int textSize) {
        return getLinearTextView(context, text, textSize, TextViewComponent.TEXT_ALIGN_LEFT);
    }

    public static TextView getLinearTextView(Context context, String text, int textSize, int alignment) {
        LinearLayout.LayoutParams linearTextViewParams =
                new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,
                        LinearLayout.LayoutParams.WRAP_CONTENT);

        TextView textView = new TextView(context);

        textView.setLayoutParams(linearTextViewParams);

        switch (alignment) {
            case TextViewComponent.TEXT_ALIGN_CENTER:
                textView.setGravity(Gravity.CENTER);
                break;
            case TextViewComponent.TEXT_ALIGN_RIGHT:
                textView.setGravity(Gravity.RIGHT);
                break;
            case TextViewComponent.TEXT_ALIGN_LEFT:
            default:
                textView.setGravity(Gravity.LEFT);
        }

        textView.setText(text);
        textView.setTextSize(AU.dimen(context, textSize));
        textView.setTextColor(ContextCompat.getColor(context, R.color.genericBlackColor));

        return textView;
    }

    public static LinearLayout getLinearButton(Context context, String label) {
        LinearLayout.LayoutParams linearButtonParams =
                new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,
                        LinearLayout.LayoutParams.WRAP_CONTENT);

        linearButtonParams.height = AU.dimen(context, 43);

        linearButtonParams.setMargins(AU.dimen(context, 23),
                AU.dimen(context, 23), AU.dimen(context, 23),
                AU.dimen(context, 0));

        LinearLayout linearButton = new LinearLayout(context);

        linearButton.setGravity(Gravity.CENTER);
        linearButton.setLayoutParams(linearButtonParams);
        ViewCompat.setBackground(linearButton, ContextCompat.getDrawable(context, R.drawable.generic_button));

        TextView textView = new TextView(context);

        textView.setText(label);
        textView.setTypeface(Typeface.DEFAULT_BOLD);
        textView.setTextSize(AU.dimen(context, (float) 5));
        textView.setTextColor(ContextCompat.getColor(context, R.color.whiteColor));

        linearButton.addView(textView);

        return linearButton;
    }
}


