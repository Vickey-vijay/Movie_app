package io.bidmachine.rendering.utils;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes2.dex */
public class ImageUtils {
    public static void compressBitmap(@Nullable Bitmap bitmap, @NonNull OutputStream outputStream) {
        if (bitmap == null) {
            return;
        }
        bitmap.compress(Bitmap.CompressFormat.PNG, 85, outputStream);
        bitmap.recycle();
    }

    @NonNull
    public static BitmapFactory.Options createDefaultBitmapFactoryOptions() {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inPreferredConfig = Bitmap.Config.RGB_565;
        return options;
    }

    @Nullable
    public static Bitmap getImageByFile(@NonNull File file, @NonNull BitmapFactory.Options options) {
        if (FileUtils.isEmpty(file)) {
            return null;
        }
        return BitmapFactory.decodeFile(file.getPath(), options);
    }

    public static void saveImage(@NonNull File file, @NonNull byte[] bArr) throws Throwable {
        saveImage(file, bArr, createDefaultBitmapFactoryOptions());
    }

    @Nullable
    public static Bitmap toBitmap(@NonNull File file, @NonNull BitmapFactory.Options options) {
        return BitmapFactory.decodeFile(file.getPath(), options);
    }

    public static void writeBitmap(@NonNull byte[] bArr, @NonNull OutputStream outputStream) {
        writeBitmap(bArr, outputStream, createDefaultBitmapFactoryOptions());
    }

    public static void saveImage(@NonNull File file, @NonNull byte[] bArr, @NonNull BitmapFactory.Options options) throws Throwable {
        options.inJustDecodeBounds = false;
        FileOutputStream fileOutputStream = null;
        try {
            FileOutputStream fileOutputStream2 = new FileOutputStream(file);
            try {
                writeBitmap(bArr, fileOutputStream2, options);
                io.bidmachine.iab.utils.Utils.flush(fileOutputStream2);
                io.bidmachine.iab.utils.Utils.close(fileOutputStream2);
            } catch (Throwable th2) {
                th = th2;
                fileOutputStream = fileOutputStream2;
                io.bidmachine.iab.utils.Utils.flush(fileOutputStream);
                io.bidmachine.iab.utils.Utils.close(fileOutputStream);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    @Nullable
    public static Bitmap toBitmap(@NonNull byte[] bArr) {
        return toBitmap(bArr, createDefaultBitmapFactoryOptions());
    }

    public static void writeBitmap(@NonNull byte[] bArr, @NonNull OutputStream outputStream, @NonNull BitmapFactory.Options options) {
        compressBitmap(BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options), outputStream);
    }

    @Nullable
    public static Bitmap toBitmap(@NonNull byte[] bArr, @NonNull BitmapFactory.Options options) throws Throwable {
        options.inJustDecodeBounds = false;
        ByteArrayOutputStream byteArrayOutputStream = null;
        try {
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream(bArr.length);
            try {
                writeBitmap(bArr, byteArrayOutputStream2, options);
                Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(new ByteArrayInputStream(byteArrayOutputStream2.toByteArray()));
                io.bidmachine.iab.utils.Utils.flush(byteArrayOutputStream2);
                io.bidmachine.iab.utils.Utils.close(byteArrayOutputStream2);
                return bitmapDecodeStream;
            } catch (Throwable th2) {
                th = th2;
                byteArrayOutputStream = byteArrayOutputStream2;
                io.bidmachine.iab.utils.Utils.flush(byteArrayOutputStream);
                io.bidmachine.iab.utils.Utils.close(byteArrayOutputStream);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }
}
