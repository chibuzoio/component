package com.chibuzo.component.utility;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.provider.MediaStore;
import android.util.Base64;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Utility {

    public static float getStringImageWidth(String imageString) {
        byte[] decodedString = Base64.decode(imageString, Base64.DEFAULT);
        Bitmap bitmap = BitmapFactory.decodeByteArray(decodedString, 0, decodedString.length);
        return bitmap.getWidth();
    }

    public static float getStringImageHeight(String imageString) {
        byte[] decodedString = Base64.decode(imageString, Base64.DEFAULT);
        Bitmap bitmap = BitmapFactory.decodeByteArray(decodedString, 0, decodedString.length);
        return bitmap.getHeight();
    }

    public static float getResourceImageWidth(Context context, Integer imageResource) {
        Bitmap bitmap = BitmapFactory.decodeResource(context.getResources(), imageResource);
        return bitmap.getWidth();
    }

    public static float getResourceImageHeight(Context context, Integer imageResource) {
        Bitmap bitmap = BitmapFactory.decodeResource(context.getResources(), imageResource);
        return bitmap.getHeight();
    }

    public static float getDrawableImageWidth(Drawable drawable) {
        Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
        return bitmap.getWidth();
    }

    public static float getDrawableImageHeight(Drawable drawable) {
        Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
        return bitmap.getHeight();
    }

    public static float getFileImageWidth(File file) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inPreferredConfig = Bitmap.Config.ARGB_8888;

        try {
            Bitmap bitmap = BitmapFactory.decodeStream(new FileInputStream(file), null, options);

            if (bitmap != null) {
                return bitmap.getWidth();
            }
        } catch (FileNotFoundException exception) {
            exception.printStackTrace();
        }

        return 0;
    }

    public static float getFileImageHeight(File file) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inPreferredConfig = Bitmap.Config.ARGB_8888;

        try {
            Bitmap bitmap = BitmapFactory.decodeStream(new FileInputStream(file), null, options);

            if (bitmap != null) {
                return bitmap.getHeight();
            }
        } catch (FileNotFoundException exception) {
            exception.printStackTrace();
        }

        return 0;
    }

    public static float getUriImageWidth(Context context, Uri uri) {
        try {
            Bitmap bitmap = MediaStore.Images.Media.getBitmap(context.getContentResolver(), uri);
            return bitmap.getWidth();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return 0;
    }

    public static float getUriImageHeight(Context context, Uri uri) {
        try {
            Bitmap bitmap = MediaStore.Images.Media.getBitmap(context.getContentResolver(), uri);
            return bitmap.getHeight();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return 0;
    }

    public static float getByteArrayImageWidth(byte[] byteArray) {
        Bitmap bitmap = BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length);
        return bitmap.getWidth();
    }

    public static float getByteArrayImageHeight(byte[] byteArray) {
        Bitmap bitmap = BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length);
        return bitmap.getHeight();
    }
}


