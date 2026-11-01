package sg.bigo.ads.ad.interstitial.multi_img;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public enum c {
    FILL_MATCH_SELF(1, 1),
    FILL_MATCH_MAIN_VIEW(2, 2),
    FILL_MATCH_PARENT(3, 3);


    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f68672d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f68673e;

    c(int i10, int i11) {
        this.f68673e = i10;
        this.f68672d = i11;
    }

    @NonNull
    public static c a(int i10) {
        if (i10 != 2) {
            return i10 != 3 ? FILL_MATCH_SELF : FILL_MATCH_PARENT;
        }
        return FILL_MATCH_MAIN_VIEW;
    }
}
