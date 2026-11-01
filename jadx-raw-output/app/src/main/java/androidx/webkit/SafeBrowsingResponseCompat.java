package androidx.webkit;

import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes3.dex */
public abstract class SafeBrowsingResponseCompat {
    public abstract void backToSafety(boolean z10);

    public abstract void proceed(boolean z10);

    public abstract void showInterstitial(boolean z10);

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public SafeBrowsingResponseCompat() {
    }
}
