package com.chibuzo.component.viewcomponent;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.DisplayMetrics;
import android.view.ViewGroup;

import androidx.core.content.ContextCompat;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.bitmap.RoundedCorners;
import com.chibuzo.component.utility.AU;

public class ImageViewScreen extends ImageViewParent {
    private Bitmap bitmap;
    private int densityPixel, deviceDisplayWidth, deviceDisplayHeight;

    public ImageViewScreen(ViewGroup viewGroup, Object object) {
        this(viewGroup, object, 0);
    }

    public ImageViewScreen(ViewGroup viewGroup, Object object, int placeholder) {
        this(viewGroup, object, placeholder, 0);
    }

    public ImageViewScreen(ViewGroup viewGroup, Object object, int placeholder, int cornerRadius) {
        this(viewGroup, object, placeholder, cornerRadius, 0);
    }

    public ImageViewScreen(ViewGroup viewGroup, Object object, int placeholder, int cornerRadius, int densityPixel) {
        super(viewGroup, object, placeholder, cornerRadius);

        this.densityPixel = densityPixel;

        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((Activity) getContext()).getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);

        deviceDisplayWidth = displayMetrics.widthPixels;
        deviceDisplayHeight = displayMetrics.heightPixels;
    }

    private String processCurrentImage(Uri uri) {
        int imageWidth = bitmap.getWidth();
        int imageHeight = bitmap.getHeight();

        int contextImageWidth = deviceDisplayWidth - AU.dimen(getContext(), densityPixel); // 46
        int contextImageHeight = (imageHeight * (deviceDisplayWidth - AU.dimen(getContext(), densityPixel))) / imageWidth; // 46

        getLayoutParams().width = contextImageWidth;
        getLayoutParams().height = contextImageHeight;

        setRoundCornerImage(uri);

        return AU.encodeUploadImage(bitmap);
    }

    public String loadDeviceStorageImage(int requestCode, int resultCode, Intent intent) {
        String base64StringImage = "";

        if (requestCode == 1 && resultCode == Activity.RESULT_OK && intent != null && intent.getData() != null) {
            Uri uri = intent.getData();

            try {
                bitmap = AU.decodeSampledBitmapFromUri(getContext(), uri, 333, 333);
                base64StringImage = processCurrentImage(uri);
            } catch (Exception exception) {
                exception.printStackTrace();

                try {
                    bitmap = AU.getHigherVersionBitmapImage(getContext(), uri, 333, 333);
                    base64StringImage = processCurrentImage(uri);
                } catch (Exception localException) {
                    localException.printStackTrace();
                }
            }
        }

        return base64StringImage;
    }

    public void setImagePlaceholder(int placeholder) {
        setImageSize(placeholder);

        Glide.with(getContext()).load(placeholder).into(this);
    }

    private void setImageSize(int placeholder) {
        Drawable drawable = ContextCompat.getDrawable(getContext(), placeholder);
        int imageHeight = drawable.getIntrinsicHeight();
        int imageWidth = drawable.getIntrinsicWidth();

        int contextImageWidth = deviceDisplayWidth - AU.dimen(getContext(), densityPixel); // 46
        int contextImageHeight = (imageHeight * (deviceDisplayWidth - AU.dimen(getContext(), densityPixel))) / imageWidth; // 46

        getLayoutParams().width = contextImageWidth;
        getLayoutParams().height = contextImageHeight;
    }

    public void setRoundCornerPlaceholder(int placeholder) {
        setImageSize(placeholder);

        Glide.with(getContext()).load(placeholder)
                .transform(new RoundedCorners(AU.dimen(getContext(), cornerRadius)))
                .into(this);
    }
}


