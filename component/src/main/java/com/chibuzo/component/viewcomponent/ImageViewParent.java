package com.chibuzo.component.viewcomponent;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.content.ContextCompat;
import androidx.core.view.ViewCompat;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.bitmap.CenterCrop;
import com.bumptech.glide.load.resource.bitmap.RoundedCorners;
import com.bumptech.glide.request.RequestOptions;
import com.chibuzo.component.GenericLayoutParams;
import com.chibuzo.component.utility.AU;
import com.chibuzo.component.utility.Utility;

import java.io.File;

public abstract class ImageViewParent extends AppCompatImageView {
    protected Object object;
    private float layoutWeight;
    private ViewGroup viewGroup;
    protected int cornerRadius, placeholder;
    protected GenericLayoutParams genericLayoutParams;

    public ImageViewParent(ViewGroup viewGroup, Object object, int placeholder) {
        this(viewGroup, object, placeholder,
                GenericLayoutParams.WRAP_CONTENT, GenericLayoutParams.WRAP_CONTENT);
    }

    public ImageViewParent(ViewGroup viewGroup, Object object, int placeholder, int cornerRadius) {
        this(viewGroup, object, placeholder, cornerRadius,
                GenericLayoutParams.WRAP_CONTENT, GenericLayoutParams.WRAP_CONTENT);
    }

    public ImageViewParent(ViewGroup viewGroup, Object object,
                           int placeholder, int horizontalParam, int verticalParam) {
        this(viewGroup, object, placeholder, 0, horizontalParam, verticalParam);
    }

    public ImageViewParent(ViewGroup viewGroup, Object object, int placeholder,
                           int cornerRadius, int horizontalParam, int verticalParam) {
        super(viewGroup.getContext());

        if (cornerRadius < 1) {
            cornerRadius = 1;
        }

        this.cornerRadius = cornerRadius;
        this.placeholder = placeholder;
        this.viewGroup = viewGroup;
        this.object = object;

        genericLayoutParams = new GenericLayoutParams(viewGroup, horizontalParam, verticalParam);

        setLayoutParams(genericLayoutParams.getLayoutParams());

        if (object instanceof byte[]) {
            setRoundCornerCenterImage((byte[]) object);
        } else if (object instanceof Bitmap) {
            setRoundCornerCenterImage((Bitmap) object);
        } else if (object instanceof Uri) {
            setRoundCornerCenterImage((Uri) object);
        } else if (object instanceof File) {
            setRoundCornerCenterImage((File) object);
        } else if (object instanceof Drawable) {
            setRoundCornerCenterImage((Drawable) object);
        } else if (object instanceof String) {
            setRoundCornerCenterImage((String) object);
        } else if (object instanceof Integer) {
            setRoundCornerCenterImage((Integer) object);
        } else {
            setRoundCornerCenterImage(object);
        }

        viewGroup.addView(this);
    }

    public void setLayoutParams(int horizontalParam, int verticalParam) {
        genericLayoutParams = new GenericLayoutParams(viewGroup, horizontalParam, verticalParam);
        setLayoutParams(genericLayoutParams.getLayoutParams());
    }

    public void setLayoutGravity(int gravity) {
        genericLayoutParams.setLayoutGravity(this, gravity);
    }

    public float getActualImageWidth(Object object) {
        float imageWidth = 0;

        if (object instanceof byte[]) {
            imageWidth = Utility.getByteArrayImageWidth((byte[]) object);
        } else if (object instanceof Bitmap) {
            imageWidth = ((Bitmap) object).getWidth();
        } else if (object instanceof Uri) {
            imageWidth = Utility.getUriImageWidth(getContext(), (Uri) object);
        } else if (object instanceof File) {
            imageWidth = Utility.getFileImageWidth((File) object);
        } else if (object instanceof Drawable) {
            imageWidth = Utility.getDrawableImageWidth((Drawable) object);
        } else if (object instanceof String) {
            imageWidth = Utility.getStringImageWidth((String) object);
        } else if (object instanceof Integer) {
            imageWidth = Utility.getResourceImageWidth(getContext(), (Integer) object);
        } else {
            return imageWidth;
        }

        return imageWidth;
    }

    public float getActualImageHeight(Object object) {
        float imageHeight = 0;

        if (object instanceof byte[]) {
            imageHeight = Utility.getByteArrayImageHeight((byte[]) object);
        } else if (object instanceof Bitmap) {
            imageHeight = ((Bitmap) object).getHeight();
        } else if (object instanceof Uri) {
            imageHeight = Utility.getUriImageHeight(getContext(), (Uri) object);
        } else if (object instanceof File) {
            imageHeight = Utility.getFileImageHeight((File) object);
        } else if (object instanceof Drawable) {
            imageHeight = Utility.getDrawableImageHeight((Drawable) object);
        } else if (object instanceof String) {
            imageHeight = Utility.getStringImageHeight((String) object);
        } else if (object instanceof Integer) {
            imageHeight = Utility.getResourceImageHeight(getContext(), (Integer) object);
        } else {
            return imageHeight;
        }

        return imageHeight;
    }

    public void setComponentColor(int color) {
        setBackgroundColor(ContextCompat.getColor(getContext(), color));
    }

    public void setBackground(int background) {
        setDrawable(ContextCompat.getDrawable(getContext(), background));
    }

    public void setDrawable(Drawable drawable) {
        ViewCompat.setBackground(this, drawable);
    }

    public void setWidthByDevice(int rightMargin) {
        getGenericLayoutParams().getLayoutParams().width =
                AU.getDeviceWidth(getContext()) - AU.dimen(getContext(), rightMargin);
    }

    public void setHeightByDevice(int height) {
        getGenericLayoutParams().getLayoutParams().height = height;
    }

    public void setImageWidth(float imageWidth) {
        getGenericLayoutParams().getLayoutParams().width = AU.dimen(getContext(), imageWidth);
    }

    public void setImageHeight(float imageHeight) {
        getGenericLayoutParams().getLayoutParams().height = AU.dimen(getContext(), imageHeight);
    }

    public void setRoundCornerImage(int imageResource) {
        Glide.with(getContext()).load(imageResource)
                .apply(new RequestOptions().placeholder(ContextCompat.getDrawable(getContext(), placeholder)))
                .transform(new RoundedCorners(AU.dimen(getContext(), cornerRadius)))
                .into(this);
    }

    public void setRoundCornerImage(Uri imageUri) {
        Glide.with(getContext()).load(imageUri)
                .apply(new RequestOptions().placeholder(ContextCompat.getDrawable(getContext(), placeholder)))
                .transform(new RoundedCorners(AU.dimen(getContext(), cornerRadius)))
                .into(this);
    }

    public void setImageObject(Object object) {
        if (object instanceof byte[]) {
            Glide.with(getContext()).load((byte[]) object).into(this);
        } else if (object instanceof Bitmap) {
            Glide.with(getContext()).load((Bitmap) object).into(this);
        } else if (object instanceof Uri) {
            Glide.with(getContext()).load((Uri) object).into(this);
        } else if (object instanceof File) {
            Glide.with(getContext()).load((File) object).into(this);
        } else if (object instanceof Drawable) {
            Glide.with(getContext()).load((Drawable) object).into(this);
        } else if (object instanceof String) {
            Glide.with(getContext()).load((String) object).into(this);
        } else if (object instanceof Integer) {
            Glide.with(getContext()).load((Integer) object).into(this);
        } else {
            Glide.with(getContext()).load(placeholder).into(this);
        }
    }

    public void setCircularCenterImage(Integer integer) {
        if (integer == null) {
            Glide.with(getContext()).load(placeholder).apply(RequestOptions.circleCropTransform())
                    .into(this);
        } else {
            Glide.with(getContext()).load(integer)
                    .apply(RequestOptions.circleCropTransform()).into(this);
        }
    }

    public void setCircularCenterImage(Object object) {
        if (object == null) {
            Glide.with(getContext()).load(placeholder).apply(RequestOptions.circleCropTransform())
                    .into(this);
        } else {
            Glide.with(getContext()).load(object)
                    .apply(RequestOptions.circleCropTransform()).into(this);
        }
    }

    public void setCircularCenterImage(String string) {
        if (string == null) {
            Glide.with(getContext()).load(placeholder).apply(RequestOptions.circleCropTransform())
                    .into(this);
        } else {
            Glide.with(getContext()).load(string)
                    .apply(RequestOptions.circleCropTransform()).into(this);
        }
    }

    public void setCircularCenterImage(Drawable drawable) {
        if (drawable == null) {
            Glide.with(getContext()).load(placeholder).apply(RequestOptions.circleCropTransform())
                    .into(this);
        } else {
            Glide.with(getContext()).load(drawable)
                    .apply(RequestOptions.circleCropTransform()).into(this);
        }
    }

    public void setCircularCenterImage(File file) {
        if (file == null) {
            Glide.with(getContext()).load(placeholder).apply(RequestOptions.circleCropTransform())
                    .into(this);
        } else {
            Glide.with(getContext()).load(file)
                    .apply(RequestOptions.circleCropTransform()).into(this);
        }
    }

    public void setCircularCenterImage(Uri uri) {
        if (uri == null) {
            Glide.with(getContext()).load(placeholder).apply(RequestOptions.circleCropTransform())
                    .into(this);
        } else {
            Glide.with(getContext()).load(uri)
                    .apply(RequestOptions.circleCropTransform()).into(this);
        }
    }

    public void setCircularCenterImage(byte[] byteArray) {
        if (byteArray == null) {
            Glide.with(getContext()).load(placeholder).apply(RequestOptions.circleCropTransform())
                    .into(this);
        } else {
            Glide.with(getContext()).load(byteArray)
                    .apply(RequestOptions.circleCropTransform()).into(this);
        }
    }

    public void setCircularCenterImage(Bitmap bitmap) {
        if (bitmap == null) {
            Glide.with(getContext()).load(placeholder).apply(RequestOptions.circleCropTransform())
                    .into(this);
        } else {
            Glide.with(getContext()).load(bitmap)
                    .apply(RequestOptions.circleCropTransform()).into(this);
        }
    }

    public void setRoundCornerCenterImage(Integer integer) {
        if (integer == null) {
            Glide.with(getContext()).load(placeholder)
                    .transform(new CenterCrop(), new RoundedCorners(AU.dimen(getContext(), cornerRadius)))
                    .into(this);
        } else {
            Glide.with(getContext()).load(integer)
                    .transform(new CenterCrop(), new RoundedCorners(AU.dimen(getContext(), cornerRadius)))
                    .into(this);
        }
    }

    public void setRoundCornerCenterImage(Object object) {
        if (object == null) {
            Glide.with(getContext()).load(placeholder)
                    .transform(new CenterCrop(), new RoundedCorners(AU.dimen(getContext(), cornerRadius)))
                    .into(this);
        } else {
            Glide.with(getContext()).load(object)
                    .transform(new CenterCrop(), new RoundedCorners(AU.dimen(getContext(), cornerRadius)))
                    .into(this);
        }
    }

    public void setRoundCornerCenterImage(String string) {
        if (string == null) {
            Glide.with(getContext()).load(placeholder)
                    .transform(new CenterCrop(), new RoundedCorners(AU.dimen(getContext(), cornerRadius)))
                    .into(this);
        } else {
            Glide.with(getContext()).load(string)
                    .transform(new CenterCrop(), new RoundedCorners(AU.dimen(getContext(), cornerRadius)))
                    .into(this);
        }
    }

    public void setRoundCornerCenterImage(Drawable drawable) {
        if (drawable == null) {
            Glide.with(getContext()).load(placeholder)
                    .transform(new CenterCrop(), new RoundedCorners(AU.dimen(getContext(), cornerRadius)))
                    .into(this);
        } else {
            Glide.with(getContext()).load(drawable)
                    .transform(new CenterCrop(), new RoundedCorners(AU.dimen(getContext(), cornerRadius)))
                    .into(this);
        }
    }

    public void setRoundCornerCenterImage(File file) {
        if (file == null) {
            Glide.with(getContext()).load(placeholder)
                    .transform(new CenterCrop(), new RoundedCorners(AU.dimen(getContext(), cornerRadius)))
                    .into(this);
        } else {
            Glide.with(getContext()).load(file)
                    .transform(new CenterCrop(), new RoundedCorners(AU.dimen(getContext(), cornerRadius)))
                    .into(this);
        }
    }

    public void setRoundCornerCenterImage(Uri uri) {
        if (uri == null) {
            Glide.with(getContext()).load(placeholder)
                    .transform(new CenterCrop(), new RoundedCorners(AU.dimen(getContext(), cornerRadius)))
                    .into(this);
        } else {
            Glide.with(getContext()).load(uri)
                    .transform(new CenterCrop(), new RoundedCorners(AU.dimen(getContext(), cornerRadius)))
                    .into(this);
        }
    }

    public void setRoundCornerCenterImage(byte[] byteArray) {
        if (byteArray == null) {
            Glide.with(getContext()).load(placeholder)
                    .transform(new CenterCrop(), new RoundedCorners(AU.dimen(getContext(), cornerRadius)))
                    .into(this);
        } else {
            Glide.with(getContext()).load(byteArray)
                    .transform(new CenterCrop(), new RoundedCorners(AU.dimen(getContext(), cornerRadius)))
                    .into(this);
        }
    }

    public void setRoundCornerCenterImage(Bitmap bitmap) {
        if (bitmap == null) {
            Glide.with(getContext()).load(placeholder)
                    .transform(new CenterCrop(), new RoundedCorners(AU.dimen(getContext(), cornerRadius)))
                    .into(this);
        } else {
            Glide.with(getContext()).load(bitmap)
                    .transform(new CenterCrop(), new RoundedCorners(AU.dimen(getContext(), cornerRadius)))
                    .into(this);
        }
    }

    public float getLayoutWeight() {
        return layoutWeight;
    }

    public void setLayoutWeight(float layoutWeight) {
        if (genericLayoutParams.getLayoutParams() instanceof LinearLayout.LayoutParams) {
            ((LinearLayout.LayoutParams) genericLayoutParams.getLayoutParams()).weight = layoutWeight;
        }

        this.layoutWeight = layoutWeight;
    }

    @Override
    public void setPadding(int left, int top, int right, int bottom) {
        super.setPadding(AU.dimen(getContext(), left), AU.dimen(getContext(), top),
                AU.dimen(getContext(), right), AU.dimen(getContext(), bottom));
    }

    public void setMargins(float left, float top, float right, float bottom) {
        genericLayoutParams.setLayoutMargin(this, left, top, right, bottom);
    }

    public GenericLayoutParams getGenericLayoutParams() {
        return genericLayoutParams;
    }

    public void setGenericLayoutParams(GenericLayoutParams genericLayoutParams) {
        setLayoutParams(genericLayoutParams.getLayoutParams());
        this.genericLayoutParams = genericLayoutParams;
    }
}


