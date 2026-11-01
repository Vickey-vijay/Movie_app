package io.bidmachine.iab.mraid;

import java.util.Locale;

/* JADX INFO: loaded from: classes11.dex */
public enum MraidPlacementType {
    INLINE,
    INTERSTITIAL;

    public String b() {
        return toString().toLowerCase(Locale.US);
    }
}
