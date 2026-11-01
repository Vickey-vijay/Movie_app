package com.bytedance.sdk.component.fkw.lh.vt;

import android.graphics.Bitmap;
import android.widget.ImageView;

/* JADX INFO: loaded from: classes9.dex */
public final class ouw {
    public static final ImageView.ScaleType ouw = ImageView.ScaleType.CENTER_INSIDE;
    public static final Bitmap.Config vt = Bitmap.Config.ARGB_4444;
    public int fkw;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    public final int f11717le;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public final Bitmap.Config f11718lh;
    public final ImageView.ScaleType pno;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    public final int f11719ra;
    public int yu;
    private final int bly = 3840;
    private final int tlj = 104857600;

    public static int ouw(int i10, int i11, int i12, int i13, int i14, int i15) {
        double dMin = Math.min(((double) i10) / ((double) i12), ((double) i11) / ((double) i13));
        if (i14 > 0 && i15 > 0) {
            dMin = Math.max(dMin, Math.min(((double) Math.max(i10, i11)) / ((double) Math.max(i14, i15)), ((double) Math.min(i10, i11)) / ((double) Math.min(i14, i15))));
        }
        float f10 = 1.0f;
        while (true) {
            float f11 = 2.0f * f10;
            if (f11 > dMin) {
                return (int) f10;
            }
            f10 = f11;
        }
    }

    public ouw(int i10, int i11, ImageView.ScaleType scaleType, Bitmap.Config config, int i12, int i13) {
        this.f11718lh = config;
        this.yu = i10;
        this.fkw = i11;
        this.pno = scaleType;
        this.f11717le = i12;
        this.f11719ra = i13;
        if (i10 > 3840 && i11 > 3840) {
            if (i10 > i11) {
                this.yu = 3840;
                this.fkw = (i11 * 3840) / i10;
                return;
            } else {
                this.yu = (i10 * 3840) / i11;
                this.fkw = 3840;
                return;
            }
        }
        if (i10 > 3840) {
            this.yu = 3840;
            this.fkw = (i11 * 3840) / i10;
        } else if (i11 > 3840) {
            this.yu = (i10 * 3840) / i11;
            this.fkw = 3840;
        }
    }

    public static int ouw(int i10, int i11, int i12, int i13, ImageView.ScaleType scaleType) {
        if (i10 == 0 && i11 == 0) {
            return i12;
        }
        if (scaleType == ImageView.ScaleType.FIT_XY) {
            return i10 == 0 ? i12 : i10;
        }
        if (i10 == 0) {
            return (int) (((double) i12) * (((double) i11) / ((double) i13)));
        }
        if (i11 == 0) {
            return i10;
        }
        double d10 = ((double) i13) / ((double) i12);
        if (scaleType == ImageView.ScaleType.CENTER_CROP) {
            double d11 = i11;
            return ((double) i10) * d10 < d11 ? (int) (d11 / d10) : i10;
        }
        double d12 = i11;
        return ((double) i10) * d10 > d12 ? (int) (d12 / d10) : i10;
    }
}
