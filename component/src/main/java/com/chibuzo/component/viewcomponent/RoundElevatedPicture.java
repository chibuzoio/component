package com.chibuzo.component.viewcomponent;

import android.graphics.drawable.GradientDrawable;
import android.view.ViewGroup;

import androidx.core.content.ContextCompat;

import com.chibuzo.component.GenericLayoutParams;
import com.chibuzo.component.R;
import com.chibuzo.component.layoutcomponent.FrameLayoutComponent;
import com.chibuzo.component.layoutcomponent.VerticalLinearLayout;
import com.chibuzo.component.utility.AU;

public class RoundElevatedPicture extends FrameLayoutComponent {
    private float imageSize;
    private Object imageObject;
    private int paletteColor, paletteElevation;
    private ImageViewComponent roundedPictureView;
    private VerticalLinearLayout roundedPicturePalette;

    public RoundElevatedPicture(ViewGroup viewGroup, Object imageObject, float imageSize) {
        super(viewGroup.getContext(), viewGroup,
                GenericLayoutParams.WRAP_CONTENT, GenericLayoutParams.WRAP_CONTENT);

        this.imageObject = imageObject;
        this.imageSize = imageSize;
        
        setFocusableInTouchMode(false);

        setRoundedPicturePalette();
    }

    public float getImageSize() {
        return imageSize;
    }

    public void setImageSize(float imageSize) {
        this.imageSize = imageSize;
        roundedPictureView.setImageWidth(imageSize);
        roundedPictureView.setImageHeight(imageSize);
    }

    public int getPaletteColor() {
        return paletteColor;
    }

    public void setPaletteColor(int paletteColor) {
        this.paletteColor = paletteColor;
        GradientDrawable roundedPicturePaletteDrawable = new GradientDrawable();
        roundedPicturePaletteDrawable.setColor(ContextCompat.getColor(getContext(), paletteColor));
        roundedPicturePaletteDrawable.setCornerRadius(AU.dimen(getContext(), 555));
        roundedPicturePalette.setBackground(roundedPicturePaletteDrawable);
    }

    public Object getImageObject() {
        return imageObject;
    }

    public void setImageObject(Object imageObject) {
        this.imageObject = imageObject;
        roundedPictureView.setCircularCenterImage(imageObject);
    }

    public int getPaletteElevation() {
        return paletteElevation;
    }

    public void setPaletteElevation(int paletteElevation) {
        this.paletteElevation = paletteElevation;
        roundedPicturePalette.setElevation(paletteElevation);
    }

    public void setPaletteMargin(float allSides) {
        roundedPicturePalette.setMargins(allSides, allSides, allSides, allSides);
    }

    public void setPalettePadding(int allSides) {
        roundedPicturePalette.setPadding(allSides, allSides, allSides, allSides);
    }

    public VerticalLinearLayout getRoundedPicturePalette() {
        return roundedPicturePalette;
    }

    private void setRoundedPicturePalette() {
        roundedPicturePalette = new VerticalLinearLayout(getContext(), this,
                GenericLayoutParams.WRAP_CONTENT, GenericLayoutParams.WRAP_CONTENT);
        roundedPicturePalette.setBackground(R.drawable.white_rounded_layout);
        setPaletteElevation(23);
        setPalettePadding(7);
        setPaletteMargin(7);
        setRoundedPictureView();
    }

    public ImageViewComponent getRoundedPictureView() {
        return roundedPictureView;
    }

    private void setRoundedPictureView() {
        roundedPictureView = new ImageViewComponent(roundedPicturePalette, imageObject);
        roundedPictureView.setCircularCenterImage(imageObject);
        setImageSize(imageSize);
    }
}


