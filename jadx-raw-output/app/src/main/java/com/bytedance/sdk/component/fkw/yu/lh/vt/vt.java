package com.bytedance.sdk.component.fkw.yu.lh.vt;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.widget.ImageView;

/* JADX INFO: loaded from: classes9.dex */
public final class vt {
    public static final ImageView.ScaleType ouw = ImageView.ScaleType.CENTER_INSIDE;
    public static final Bitmap.Config vt = Bitmap.Config.ARGB_4444;
    private int fkw;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    private final int f11766le;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    private final Bitmap.Config f11767lh;
    private final ImageView.ScaleType pno;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    private final int f11768ra;
    private int yu;
    private final int bly = 1280;
    private final int tlj = 83886080;

    private static int ouw(int i10, int i11, int i12, int i13) {
        if (i10 == 0 && i11 == 0) {
            return i12;
        }
        if (i10 == 0) {
            return (int) (((double) i12) * (((double) i11) / ((double) i13)));
        }
        if (i11 == 0) {
            return i10;
        }
        double d10 = ((double) i13) / ((double) i12);
        double d11 = i11;
        return ((double) i10) * d10 > d11 ? (int) (d11 / d10) : i10;
    }

    private static int ouw(int i10, int i11, int i12, int i13, int i14, int i15) {
        double dMin = Math.min(((double) i10) / ((double) i12), ((double) i11) / ((double) i13));
        if (i14 > 0 && i15 > 0) {
            dMin = Math.max(dMin, Math.min(((double) Math.max(i10, i11)) / ((double) Math.max(i14, i15)), ((double) Math.min(i10, i11)) / ((double) Math.min(i14, i15))));
        }
        return Integer.highestOneBit((int) dMin);
    }

    public vt(int i10, int i11, ImageView.ScaleType scaleType, Bitmap.Config config, int i12, int i13) {
        this.f11767lh = config;
        this.yu = i10;
        this.fkw = i11;
        this.pno = scaleType;
        this.f11766le = i12;
        this.f11768ra = i13;
        if (i10 > 1280 && i11 > 1280) {
            if (i10 > i11) {
                this.yu = 1280;
                this.fkw = (i11 * 1280) / i10;
                return;
            } else {
                this.yu = (i10 * 1280) / i11;
                this.fkw = 1280;
                return;
            }
        }
        if (i10 > 1280) {
            this.yu = 1280;
            this.fkw = (i11 * 1280) / i10;
        } else if (i11 > 1280) {
            this.yu = (i10 * 1280) / i11;
            this.fkw = 1280;
        }
    }

    public final Bitmap ouw(byte[] bArr) {
        Bitmap bitmapDecodeByteArray;
        BitmapFactory.Options options = new BitmapFactory.Options();
        if (this.yu == 0 && this.fkw == 0) {
            options.inPreferredConfig = this.f11767lh;
            bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
        } else {
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
            int i10 = options.outWidth;
            int i11 = options.outHeight;
            int iOuw = ouw(this.yu, this.fkw, i10, i11);
            int iOuw2 = ouw(this.fkw, this.yu, i11, i10);
            options.inJustDecodeBounds = false;
            options.inSampleSize = ouw(i10, i11, iOuw, iOuw2, this.f11766le, this.f11768ra);
            bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
            if (bitmapDecodeByteArray != null && (bitmapDecodeByteArray.getWidth() > iOuw || bitmapDecodeByteArray.getHeight() > iOuw2)) {
                Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmapDecodeByteArray, iOuw, iOuw2, true);
                if (bitmapCreateScaledBitmap != bitmapDecodeByteArray) {
                    bitmapDecodeByteArray.recycle();
                }
                bitmapDecodeByteArray = bitmapCreateScaledBitmap;
            }
        }
        if (bitmapDecodeByteArray != null && bitmapDecodeByteArray.getByteCount() > 83886080) {
            int width = bitmapDecodeByteArray.getWidth() / 2;
            int height = bitmapDecodeByteArray.getHeight() / 2;
            if (width > 0 && height > 0) {
                Bitmap bitmapCreateScaledBitmap2 = Bitmap.createScaledBitmap(bitmapDecodeByteArray, width, height, true);
                if (bitmapCreateScaledBitmap2 != bitmapDecodeByteArray) {
                    bitmapDecodeByteArray.recycle();
                }
                return bitmapCreateScaledBitmap2;
            }
        }
        return bitmapDecodeByteArray;
    }
}
