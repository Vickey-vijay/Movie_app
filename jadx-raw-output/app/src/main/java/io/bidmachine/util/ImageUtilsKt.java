package io.bidmachine.util;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import ck.p;
import io.bidmachine.util.file.FileUtilsKt;
import java.io.File;
import java.io.OutputStream;
import kotlin.Metadata;
import mj.r;

/* JADX INFO: compiled from: ImageUtils.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\u001a\u0012\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001\u001a\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001\u001a&\u0010\r\u001a\u00020\f*\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n\u001a\n\u0010\u000f\u001a\u00020\u000e*\u00020\u0003\u001a\u0012\u0010\u0012\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0010¨\u0006\u0013"}, d2 = {"Ljava/io/File;", "Landroid/graphics/BitmapFactory$Options;", "bitmapFactoryOptions", "Landroid/graphics/Bitmap;", "decodeToBitmap", "decodeToBitmapSafely", "Ljava/io/OutputStream;", "outputStream", "Landroid/graphics/Bitmap$CompressFormat;", "compressFormat", "", "quality", "", "compressSafely", "Lmj/r;", "recycleSafely", "", "downscaleFactor", "createDownscaledBitmapSafely", "bidmachine-android-util_d_0_13_0"}, k = 2, mv = {1, 7, 1})
public final class ImageUtilsKt {
    public static final boolean compressSafely(Bitmap bitmap, OutputStream outputStream, Bitmap.CompressFormat compressFormat, int i10) {
        boolean z10;
        p.j(bitmap, "<this>");
        p.j(outputStream, "outputStream");
        p.j(compressFormat, "compressFormat");
        try {
            bitmap.compress(compressFormat, i10, outputStream);
            z10 = true;
        } catch (Throwable unused) {
            z10 = false;
        }
        recycleSafely(bitmap);
        return z10;
    }

    public static /* synthetic */ boolean compressSafely$default(Bitmap bitmap, OutputStream outputStream, Bitmap.CompressFormat compressFormat, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            compressFormat = Bitmap.CompressFormat.PNG;
        }
        if ((i11 & 4) != 0) {
            i10 = 85;
        }
        return compressSafely(bitmap, outputStream, compressFormat, i10);
    }

    public static final Bitmap createDownscaledBitmapSafely(Bitmap bitmap, double d10) {
        Bitmap bitmapCreateScaledBitmap;
        p.j(bitmap, "<this>");
        if (d10 <= 1.0d) {
            return bitmap;
        }
        try {
            bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, (int) (((double) bitmap.getWidth()) / d10), (int) (((double) bitmap.getHeight()) / d10), true);
        } catch (Throwable unused) {
            bitmapCreateScaledBitmap = null;
        }
        return bitmapCreateScaledBitmap == null ? bitmap : bitmapCreateScaledBitmap;
    }

    public static final Bitmap decodeToBitmap(File file, BitmapFactory.Options options) throws Throwable {
        p.j(file, "<this>");
        p.j(options, "bitmapFactoryOptions");
        Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(file.getPath(), options);
        p.i(bitmapDecodeFile, "decodeFile(path, bitmapFactoryOptions)");
        return bitmapDecodeFile;
    }

    public static final Bitmap decodeToBitmapSafely(File file, BitmapFactory.Options options) {
        p.j(file, "<this>");
        p.j(options, "bitmapFactoryOptions");
        if (!FileUtilsKt.hasContent(file)) {
            return null;
        }
        try {
            return decodeToBitmap(file, options);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static final void recycleSafely(Bitmap bitmap) {
        p.j(bitmap, "<this>");
        try {
            bitmap.recycle();
            r rVar = r.f64562a;
        } catch (Throwable unused) {
        }
    }
}
