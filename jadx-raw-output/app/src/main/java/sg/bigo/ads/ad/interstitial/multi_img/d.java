package sg.bigo.ads.ad.interstitial.multi_img;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public enum d {
    NONE(0, 3, 20, 0, 1.0f, 1.0f),
    LTR(1, 1, 20, 12, 1.0f, 1.0f),
    CENTER(2, 2, 30, 12, 0.8f, 0.9f),
    FULL(3, 3, 20, 0, 1.0f, 1.0f),
    TILE(Integer.MIN_VALUE, Integer.MIN_VALUE, 20, 12, 1.0f, 1.0f);


    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f68680f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float f68681g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f68682h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f68683i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f68684j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final int f68685k;

    d(int i10, int i11, int i12, int i13, float f10, float f11) {
        this.f68685k = i10;
        this.f68684j = i11;
        this.f68683i = i12;
        this.f68680f = i13;
        this.f68681g = f10;
        this.f68682h = f11;
    }

    @NonNull
    public static d a(int i10) {
        if (i10 == Integer.MIN_VALUE) {
            return TILE;
        }
        if (i10 == 1) {
            return LTR;
        }
        if (i10 != 2) {
            return i10 != 3 ? NONE : FULL;
        }
        return CENTER;
    }
}
