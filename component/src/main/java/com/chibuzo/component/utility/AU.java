package com.chibuzo.component.utility;

import android.Manifest;
import android.app.Activity;
import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.os.Build;
import android.provider.MediaStore;
import android.util.Base64;
import android.util.DisplayMetrics;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import com.chibuzo.component.R;
import com.chibuzo.component.model.C;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class AU {

    public static void disableDefaultActionBar(Context context) {
        if (((AppCompatActivity) context).getSupportActionBar() != null) {
            ((AppCompatActivity) context).getSupportActionBar().hide();
        }

        if (((Activity) context).getActionBar() != null) {
            ((Activity) context).getActionBar().hide();
        }
    }

    public static GradientDrawable curveBackgroundCorner(Context context) {
        return curveBackgroundCorner(context, 11.111f);
    }

    public static GradientDrawable curveBackgroundCorner(Context context, float cornerRadius) {
        return curveBackgroundCorner(context, cornerRadius, R.color.whiteColor);
    }

    public static GradientDrawable curveBackgroundCorner(Context context, float cornerRadius, int color) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(ContextCompat.getColor(context, color));
        gradientDrawable.setCornerRadius(dimen(context, cornerRadius));
        return gradientDrawable;
    }

    public static int getDeviceWidth(Context context) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((Activity) context).getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics.widthPixels;
    }

    public static int getDeviceHeight(Context context) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((Activity) context).getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics.heightPixels;
    }

    public static int genericBitmapSize(Bitmap bitmap) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            return bitmap.getAllocationByteCount();
        } else if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB_MR1) {
            return bitmap.getByteCount();
        } else {
            return bitmap.getRowBytes() * bitmap.getHeight();
        }
    }

    public static Bitmap getHigherVersionBitmapImage(Context context, Uri imageUri, int reqWidth, int reqHeight) {
        Bitmap bitmap = null;

        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            File file = new File(getContentRealPathFromUri(context, imageUri));
            InputStream iStream = new FileInputStream(file); // context.getContentResolver().openInputStream(imageUri);

            options.inJustDecodeBounds = true;
            BitmapFactory.decodeStream(iStream, null, options);

            iStream.close();

            options.inSampleSize = calculateInSampleSize(options, reqWidth, reqHeight);

            iStream = new FileInputStream(file);

            options.inJustDecodeBounds = false;
            bitmap = BitmapFactory.decodeStream(iStream, null, options);
        } catch (IOException exception) {
            exception.printStackTrace();
        }

        return bitmap;
    }

    public static Bitmap decodeSampledBitmapFromUri(Context context, Uri imageUri, int reqWidth, int reqHeight) {
        Bitmap bitmap = null;

        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            File file = new File(getContentURIRealPath(context, imageUri));
            InputStream iStream = new FileInputStream(file); // context.getContentResolver().openInputStream(imageUri);

            options.inJustDecodeBounds = true;
            BitmapFactory.decodeStream(iStream, null, options);

            iStream.close();

            options.inSampleSize = calculateInSampleSize(options, reqWidth, reqHeight);

            iStream = new FileInputStream(file);

            options.inJustDecodeBounds = false;
            bitmap = BitmapFactory.decodeStream(iStream, null, options);
        } catch (IOException exception) {
            exception.printStackTrace();
        }

        return bitmap;
    }

    public static String encodeUploadImage(Bitmap bitmap) {
        ByteArrayOutputStream byteArrayOutputStreamObject = new ByteArrayOutputStream();
        int currentBitmapSize = genericBitmapSize(bitmap);

        if (currentBitmapSize > 174747195) {
            bitmap.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStreamObject);
            byte[] byteArrayVar = byteArrayOutputStreamObject.toByteArray();
            return Base64.encodeToString(byteArrayVar, Base64.DEFAULT);
        } else if (currentBitmapSize > 109216997) {
            bitmap.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStreamObject);
            byte[] byteArrayVar = byteArrayOutputStreamObject.toByteArray();
            return Base64.encodeToString(byteArrayVar, Base64.DEFAULT);
        } else if (currentBitmapSize > 65530198) {
            bitmap.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStreamObject);
            byte[] byteArrayVar = byteArrayOutputStreamObject.toByteArray();
            return Base64.encodeToString(byteArrayVar, Base64.DEFAULT);
        } else if (currentBitmapSize > 43686798) {
            bitmap.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStreamObject);
            byte[] byteArrayVar = byteArrayOutputStreamObject.toByteArray();
            return Base64.encodeToString(byteArrayVar, Base64.DEFAULT);
        } else if (currentBitmapSize > 32765100) {
            bitmap.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStreamObject);
            byte[] byteArrayVar = byteArrayOutputStreamObject.toByteArray();
            return Base64.encodeToString(byteArrayVar, Base64.DEFAULT);
        } else if (currentBitmapSize > 21843400) {
            bitmap.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStreamObject);
            byte[] byteArrayVar = byteArrayOutputStreamObject.toByteArray();
            return Base64.encodeToString(byteArrayVar, Base64.DEFAULT);
        } else if (currentBitmapSize > 16062577) {
            bitmap.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStreamObject);
            byte[] byteArrayVar = byteArrayOutputStreamObject.toByteArray();
            return Base64.encodeToString(byteArrayVar, Base64.DEFAULT);
        } else if (currentBitmapSize > 11838951) {
            bitmap.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStreamObject);
            byte[] byteArrayVar = byteArrayOutputStreamObject.toByteArray();
            return Base64.encodeToString(byteArrayVar, Base64.DEFAULT);
        } else if (currentBitmapSize > 7530000) {
            bitmap.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStreamObject);
            byte[] byteArrayVar = byteArrayOutputStreamObject.toByteArray();
            return Base64.encodeToString(byteArrayVar, Base64.DEFAULT);
        } else {
            bitmap.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStreamObject);
            byte[] byteArrayVar = byteArrayOutputStreamObject.toByteArray();
            return Base64.encodeToString(byteArrayVar, Base64.DEFAULT);
        }
    }

    private static String getContentURIRealPath(Context context, Uri uri) {
        String result;
        Cursor cursor = context.getContentResolver().query(uri, null, null, null, null);

        if (cursor == null) {
            result = uri.getPath();
        } else {
            cursor.moveToFirst();
            int index = cursor.getColumnIndex(MediaStore.Images.ImageColumns.DATA);
            result = cursor.getString(index);
            cursor.close();
        }

        return result;
    }

    public static String getContentRealPathFromUri(Context context, Uri uri) {
        String gottenImagePath = null;
        String scheme = uri.getScheme();
        String[] filePathColumn = {MediaStore.Images.Media.DATA};

        if (ContentResolver.SCHEME_CONTENT.equals(scheme)) {
            Cursor cursor = context.getContentResolver().query(uri, null, null, null, null);

            cursor.moveToFirst();

            String imageId = cursor.getString(0);

            imageId = imageId.substring(imageId.lastIndexOf(":") + 1);

            cursor.close();

            cursor = context.getContentResolver().query(MediaStore.Images.Media.EXTERNAL_CONTENT_URI,
                    null, MediaStore.Images.Media._ID + " = ?", new String[]{imageId}, null);

            cursor.moveToFirst();

            gottenImagePath = cursor.getString(cursor.getColumnIndex(MediaStore.Images.Media.DATA));

            cursor.close();
        } else if (ContentResolver.SCHEME_FILE.equals(scheme)) {
            gottenImagePath = uri.getPath();
        }

        return gottenImagePath;
    }

    private static int calculateInSampleSize(BitmapFactory.Options options, int reqWidth, int reqHeight) {
        // Raw height and width of image
        final int height = options.outHeight;
        final int width = options.outWidth;
        int inSampleSize = 1;

        if (height > reqHeight || width > reqWidth) {
            final int halfHeight = height / 2;
            final int halfWidth = width / 2;

            // Calculate the largest inSampleSize value that is a power of 2 and keeps both
            // height and width larger than the requested height and width.
            while ((halfHeight / inSampleSize) >= reqHeight && (halfWidth / inSampleSize) >= reqWidth) {
                inSampleSize *= 2;
            }
        }

        return inSampleSize;
    }

    private static boolean storageAccessible(Context context) {
        int firstResult = ContextCompat.checkSelfPermission(context, Manifest.permission.READ_EXTERNAL_STORAGE);
        int secondResult = ContextCompat.checkSelfPermission(context, Manifest.permission.MANAGE_DOCUMENTS);
        int thirdResult = ContextCompat.checkSelfPermission(context, Manifest.permission.WRITE_EXTERNAL_STORAGE);

        if (firstResult == PackageManager.PERMISSION_GRANTED
                && secondResult == PackageManager.PERMISSION_GRANTED
                && thirdResult == PackageManager.PERMISSION_GRANTED) {
            return true;
        } else {
            return false;
        }
    }

    public static void checkStoragePermission(Context context) {
        if (Build.VERSION.SDK_INT >= 23) {
            if (storageAccessible(context) == false) {
                ActivityCompat.requestPermissions((Activity) context,
                        new String[]{Manifest.permission.READ_EXTERNAL_STORAGE,
                                Manifest.permission.MANAGE_DOCUMENTS,
                                Manifest.permission.WRITE_EXTERNAL_STORAGE},
                        C.STORAGE_PERMISSION_CODE);
            }
        }
    }

    public static int dimen(Context context, float densityPixel) {
        return (int) (densityPixel * ((float) context.getResources().getDisplayMetrics().densityDpi / DisplayMetrics.DENSITY_DEFAULT));
    }
}


