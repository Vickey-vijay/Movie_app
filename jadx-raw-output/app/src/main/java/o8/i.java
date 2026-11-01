package o8;

import android.content.ContentValues;
import android.content.Context;
import android.net.Uri;
import android.os.Environment;
import android.provider.MediaStore;
import android.text.TextUtils;
import com.luck.picture.lib.config.PictureSelectionConfig;
import java.io.File;

/* JADX INFO: compiled from: MediaStoreUtils.java */
/* JADX INFO: loaded from: classes6.dex */
public class i {
    public static Uri c(Context context, PictureSelectionConfig pictureSelectionConfig) {
        String str;
        if (TextUtils.isEmpty(pictureSelectionConfig.U)) {
            str = "";
        } else if (pictureSelectionConfig.f32202c) {
            str = pictureSelectionConfig.U;
        } else {
            str = System.currentTimeMillis() + "_" + pictureSelectionConfig.U;
        }
        if (l.e() && TextUtils.isEmpty(pictureSelectionConfig.X)) {
            Uri uriE = e(context, str, pictureSelectionConfig.f32210g);
            pictureSelectionConfig.f32201b0 = uriE != null ? uriE.toString() : null;
            return uriE;
        }
        File fileB = k.b(context, 1, str, pictureSelectionConfig.f32206e, pictureSelectionConfig.X);
        pictureSelectionConfig.f32201b0 = fileB.getAbsolutePath();
        return k.p(context, fileB);
    }

    public static Uri d(Context context, PictureSelectionConfig pictureSelectionConfig) {
        String str;
        if (TextUtils.isEmpty(pictureSelectionConfig.V)) {
            str = "";
        } else if (pictureSelectionConfig.f32202c) {
            str = pictureSelectionConfig.V;
        } else {
            str = System.currentTimeMillis() + "_" + pictureSelectionConfig.V;
        }
        if (l.e() && TextUtils.isEmpty(pictureSelectionConfig.X)) {
            Uri uriF = f(context, str, pictureSelectionConfig.f32212h);
            pictureSelectionConfig.f32201b0 = uriF != null ? uriF.toString() : "";
            return uriF;
        }
        File fileB = k.b(context, 2, str, pictureSelectionConfig.f32208f, pictureSelectionConfig.X);
        pictureSelectionConfig.f32201b0 = fileB.getAbsolutePath();
        return k.p(context, fileB);
    }

    public static ContentValues a(String str, String str2) {
        String strG = s.g(Long.valueOf(System.currentTimeMillis()));
        ContentValues contentValues = new ContentValues(3);
        if (TextUtils.isEmpty(str) || str.lastIndexOf(".") == -1) {
            contentValues.put("_display_name", d.c("IMG_"));
        } else {
            contentValues.put("_display_name", str.replaceAll(str.substring(str.lastIndexOf(".")), ""));
        }
        if (TextUtils.isEmpty(str2) || str2.startsWith("video")) {
            str2 = "image/jpeg";
        }
        contentValues.put("mime_type", str2);
        if (l.e()) {
            contentValues.put("datetaken", strG);
            contentValues.put("relative_path", "DCIM/Camera");
        }
        return contentValues;
    }

    public static ContentValues b(String str, String str2) {
        String strG = s.g(Long.valueOf(System.currentTimeMillis()));
        ContentValues contentValues = new ContentValues(3);
        if (TextUtils.isEmpty(str) || str.lastIndexOf(".") == -1) {
            contentValues.put("_display_name", d.c("VID_"));
        } else {
            contentValues.put("_display_name", str.replaceAll(str.substring(str.lastIndexOf(".")), ""));
        }
        if (TextUtils.isEmpty(str2) || str2.startsWith("image")) {
            str2 = "video/mp4";
        }
        contentValues.put("mime_type", str2);
        if (l.e()) {
            contentValues.put("datetaken", strG);
            contentValues.put("relative_path", Environment.DIRECTORY_MOVIES);
        }
        return contentValues;
    }

    public static Uri e(Context context, String str, String str2) {
        Context applicationContext = context.getApplicationContext();
        Uri[] uriArr = {null};
        String externalStorageState = Environment.getExternalStorageState();
        ContentValues contentValuesA = a(str, str2);
        if (externalStorageState.equals("mounted")) {
            uriArr[0] = applicationContext.getContentResolver().insert(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, contentValuesA);
        } else {
            uriArr[0] = applicationContext.getContentResolver().insert(MediaStore.Images.Media.INTERNAL_CONTENT_URI, contentValuesA);
        }
        return uriArr[0];
    }

    public static Uri f(Context context, String str, String str2) {
        Context applicationContext = context.getApplicationContext();
        Uri[] uriArr = {null};
        String externalStorageState = Environment.getExternalStorageState();
        ContentValues contentValuesB = b(str, str2);
        if (externalStorageState.equals("mounted")) {
            uriArr[0] = applicationContext.getContentResolver().insert(MediaStore.Video.Media.EXTERNAL_CONTENT_URI, contentValuesB);
        } else {
            uriArr[0] = applicationContext.getContentResolver().insert(MediaStore.Video.Media.INTERNAL_CONTENT_URI, contentValuesB);
        }
        return uriArr[0];
    }
}
