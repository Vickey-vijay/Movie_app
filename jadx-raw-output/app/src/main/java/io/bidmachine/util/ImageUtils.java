package io.bidmachine.util;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import ck.p;
import com.ironsource.C3426d4;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import kotlin.Metadata;

/* JADX INFO: compiled from: ImageUtils.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\b\u0010\u0003\u001a\u00020\u0002H\u0007J\u001a\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002H\u0007J\u001a\u0010\u000b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0002H\u0007J\u001a\u0010\f\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0002H\u0007J\u0012\u0010\r\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\tH\u0007J\u001a\u0010\r\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0002H\u0007J\u0018\u0010\u0011\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u000eH\u0007J\"\u0010\u0011\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0006\u001a\u00020\u0002H\u0007J\u0018\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u000eH\u0007J\u0010\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u0007H\u0007J\u0018\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0007J \u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0002H\u0007¨\u0006\u0019"}, d2 = {"Lio/bidmachine/util/ImageUtils;", "", "Landroid/graphics/BitmapFactory$Options;", "createDefaultBitmapFactoryOptions", "Ljava/io/File;", C3426d4.i.f28530b, "bitmapFactoryOptions", "Landroid/graphics/Bitmap;", "decodeFileToBitmapSafely", "", "byteImage", "decodeBytesToBitmap", "decodeBytesToBitmapSafely", "toBitmapWithCompress", "Ljava/io/OutputStream;", "outputStream", "", "writeBitmapWithCompress", "bitmap", "compressSafely", "Lmj/r;", "recycleSafely", "saveImageWithCompress", "<init>", "()V", "bidmachine-android-util_d_0_13_0"}, k = 1, mv = {1, 7, 1})
public final class ImageUtils {
    public static final ImageUtils INSTANCE = new ImageUtils();

    private ImageUtils() {
    }

    public static final boolean saveImageWithCompress(File file, byte[] byteImage) {
        p.j(file, C3426d4.i.f28530b);
        p.j(byteImage, "byteImage");
        return saveImageWithCompress(file, byteImage, createDefaultBitmapFactoryOptions());
    }

    public static final Bitmap toBitmapWithCompress(byte[] byteImage) {
        p.j(byteImage, "byteImage");
        return toBitmapWithCompress(byteImage, createDefaultBitmapFactoryOptions());
    }

    public static final boolean writeBitmapWithCompress(byte[] byteImage, OutputStream outputStream) {
        p.j(byteImage, "byteImage");
        p.j(outputStream, "outputStream");
        return writeBitmapWithCompress(byteImage, outputStream, createDefaultBitmapFactoryOptions());
    }

    public static final boolean compressSafely(Bitmap bitmap, OutputStream outputStream) {
        p.j(bitmap, "bitmap");
        p.j(outputStream, "outputStream");
        return ImageUtilsKt.compressSafely$default(bitmap, outputStream, null, 0, 6, null);
    }

    public static final BitmapFactory.Options createDefaultBitmapFactoryOptions() {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inPreferredConfig = Bitmap.Config.RGB_565;
        return options;
    }

    public static final Bitmap decodeBytesToBitmap(byte[] byteImage, BitmapFactory.Options bitmapFactoryOptions) throws Throwable {
        p.j(byteImage, "byteImage");
        p.j(bitmapFactoryOptions, "bitmapFactoryOptions");
        return BitmapFactory.decodeByteArray(byteImage, 0, byteImage.length, bitmapFactoryOptions);
    }

    public static final Bitmap decodeBytesToBitmapSafely(byte[] byteImage, BitmapFactory.Options bitmapFactoryOptions) {
        p.j(byteImage, "byteImage");
        p.j(bitmapFactoryOptions, "bitmapFactoryOptions");
        try {
            return decodeBytesToBitmap(byteImage, bitmapFactoryOptions);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static final Bitmap decodeFileToBitmapSafely(File file, BitmapFactory.Options bitmapFactoryOptions) {
        p.j(file, C3426d4.i.f28530b);
        p.j(bitmapFactoryOptions, "bitmapFactoryOptions");
        return ImageUtilsKt.decodeToBitmapSafely(file, bitmapFactoryOptions);
    }

    public static final void recycleSafely(Bitmap bitmap) {
        p.j(bitmap, "bitmap");
        ImageUtilsKt.recycleSafely(bitmap);
    }

    public static final boolean saveImageWithCompress(File file, byte[] byteImage, BitmapFactory.Options bitmapFactoryOptions) {
        p.j(file, C3426d4.i.f28530b);
        p.j(byteImage, "byteImage");
        p.j(bitmapFactoryOptions, "bitmapFactoryOptions");
        bitmapFactoryOptions.inJustDecodeBounds = false;
        FileOutputStream fileOutputStream = null;
        try {
            FileOutputStream fileOutputStream2 = new FileOutputStream(file);
            try {
                writeBitmapWithCompress(byteImage, fileOutputStream2, bitmapFactoryOptions);
                UtilsKt.finalize(fileOutputStream2);
                return true;
            } catch (Throwable unused) {
                fileOutputStream = fileOutputStream2;
                UtilsKt.finalize(fileOutputStream);
                return false;
            }
        } catch (Throwable unused2) {
        }
    }

    public static final Bitmap toBitmapWithCompress(byte[] byteImage, BitmapFactory.Options bitmapFactoryOptions) {
        ByteArrayInputStream byteArrayInputStream;
        ByteArrayOutputStream byteArrayOutputStream;
        p.j(byteImage, "byteImage");
        p.j(bitmapFactoryOptions, "bitmapFactoryOptions");
        bitmapFactoryOptions.inJustDecodeBounds = false;
        try {
            byteArrayOutputStream = new ByteArrayOutputStream(byteImage.length);
            try {
                if (!writeBitmapWithCompress(byteImage, byteArrayOutputStream, bitmapFactoryOptions)) {
                    UtilsKt.finalize(byteArrayOutputStream);
                    UtilsKt.closeSafely(null);
                    return null;
                }
                byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
                try {
                    Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(byteArrayInputStream);
                    UtilsKt.finalize(byteArrayOutputStream);
                    UtilsKt.closeSafely(byteArrayInputStream);
                    return bitmapDecodeStream;
                } catch (Throwable unused) {
                }
            } catch (Throwable unused2) {
                byteArrayInputStream = null;
            }
        } catch (Throwable unused3) {
            byteArrayInputStream = null;
            byteArrayOutputStream = null;
        }
        UtilsKt.finalize(byteArrayOutputStream);
        UtilsKt.closeSafely(byteArrayInputStream);
        return null;
    }

    public static final boolean writeBitmapWithCompress(byte[] byteImage, OutputStream outputStream, BitmapFactory.Options bitmapFactoryOptions) {
        p.j(byteImage, "byteImage");
        p.j(outputStream, "outputStream");
        p.j(bitmapFactoryOptions, "bitmapFactoryOptions");
        Bitmap bitmapDecodeBytesToBitmapSafely = decodeBytesToBitmapSafely(byteImage, bitmapFactoryOptions);
        if (bitmapDecodeBytesToBitmapSafely != null) {
            return ImageUtilsKt.compressSafely$default(bitmapDecodeBytesToBitmapSafely, outputStream, null, 0, 6, null);
        }
        return false;
    }

    public static /* synthetic */ boolean writeBitmapWithCompress$default(byte[] bArr, OutputStream outputStream, BitmapFactory.Options options, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            options = createDefaultBitmapFactoryOptions();
        }
        return writeBitmapWithCompress(bArr, outputStream, options);
    }
}
