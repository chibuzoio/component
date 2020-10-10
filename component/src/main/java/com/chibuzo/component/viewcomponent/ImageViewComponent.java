package com.chibuzo.component.viewcomponent;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.view.ViewGroup;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.bitmap.RoundedCorners;
import com.chibuzo.component.GenericLayoutParams;
import com.chibuzo.component.utility.AU;

public class ImageViewComponent extends ImageViewParent {
    private Bitmap bitmap;

    public ImageViewComponent(ViewGroup viewGroup, Object object) {
        this(viewGroup, object, 0);
    }

    public ImageViewComponent(ViewGroup viewGroup, Object object, int placeholder) {
        this(viewGroup, object, placeholder, 0);
    }

    public ImageViewComponent(ViewGroup viewGroup, Object object, int placeholder, int cornerRadius) {
        this(viewGroup, object, placeholder, cornerRadius,
                GenericLayoutParams.WRAP_CONTENT, GenericLayoutParams.WRAP_CONTENT);
    }

    public ImageViewComponent(ViewGroup viewGroup, Object object,
                              int placeholder, int horizontalParam, int verticalParam) {
        this(viewGroup, object, placeholder, 0, horizontalParam, verticalParam);
    }

    public ImageViewComponent(ViewGroup viewGroup, Object object, int placeholder,
                              int cornerRadius, int horizontalParam, int verticalParam) {
        super(viewGroup, object, placeholder, cornerRadius, horizontalParam, verticalParam);
    }

    private String processCurrentImage(Uri uri) {
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
        Glide.with(getContext()).load(placeholder).into(this);
    }

    public void setImageSize(float allSides) {
        setImageSize(allSides, allSides);
    }

    public void setImageSize(float width, float height) {
        getGenericLayoutParams().getLayoutParams().width = AU.dimen(getContext(), width);
        getGenericLayoutParams().getLayoutParams().height = AU.dimen(getContext(), height);
    }

    public void setRoundCornerPlaceholder(int placeholder) {
        Glide.with(getContext()).load(placeholder)
                .transform(new RoundedCorners(AU.dimen(getContext(), cornerRadius)))
                .into(this);
    }
}


