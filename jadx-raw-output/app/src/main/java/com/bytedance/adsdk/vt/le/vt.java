package com.bytedance.adsdk.vt.le;

/* JADX INFO: loaded from: classes2.dex */
public final class vt {
    private static float ouw(float f10) {
        return f10 <= 0.0031308f ? f10 * 12.92f : (float) ((Math.pow(f10, 0.4166666567325592d) * 1.0549999475479126d) - 0.054999999701976776d);
    }

    public static int ouw(float f10, int i10, int i11) {
        if (i10 == i11) {
            return i10;
        }
        float f11 = ((i10 >> 24) & 255) / 255.0f;
        float fVt = vt(((i10 >> 16) & 255) / 255.0f);
        float fVt2 = vt(((i10 >> 8) & 255) / 255.0f);
        float fVt3 = vt((i10 & 255) / 255.0f);
        float fVt4 = vt(((i11 >> 16) & 255) / 255.0f);
        float f12 = f11 + (((((i11 >> 24) & 255) / 255.0f) - f11) * f10);
        float fVt5 = fVt2 + ((vt(((i11 >> 8) & 255) / 255.0f) - fVt2) * f10);
        float fVt6 = fVt3 + (f10 * (vt((i11 & 255) / 255.0f) - fVt3));
        return (Math.round(ouw(fVt + ((fVt4 - fVt) * f10)) * 255.0f) << 16) | (Math.round(f12 * 255.0f) << 24) | (Math.round(ouw(fVt5) * 255.0f) << 8) | Math.round(ouw(fVt6) * 255.0f);
    }

    private static float vt(float f10) {
        if (f10 <= 0.04045f) {
            return f10 / 12.92f;
        }
        return (float) Math.pow((f10 + 0.055f) / 1.055f, 2.4000000953674316d);
    }
}
