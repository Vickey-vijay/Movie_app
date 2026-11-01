package androidx.privacysandbox.ads.adservices.adid;

import ck.i;
import ck.p;
import com.ironsource.sdk.controller.f;

/* JADX INFO: compiled from: AdId.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class AdId {
    private final String adId;
    private final boolean isLimitAdTrackingEnabled;

    public AdId(String str, boolean z10) {
        p.j(str, f.b.f30919c);
        this.adId = str;
        this.isLimitAdTrackingEnabled = z10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdId)) {
            return false;
        }
        AdId adId = (AdId) obj;
        return p.e(this.adId, adId.adId) && this.isLimitAdTrackingEnabled == adId.isLimitAdTrackingEnabled;
    }

    public final String getAdId() {
        return this.adId;
    }

    public int hashCode() {
        return (this.adId.hashCode() * 31) + Boolean.hashCode(this.isLimitAdTrackingEnabled);
    }

    public final boolean isLimitAdTrackingEnabled() {
        return this.isLimitAdTrackingEnabled;
    }

    public String toString() {
        return "AdId: adId=" + this.adId + ", isLimitAdTrackingEnabled=" + this.isLimitAdTrackingEnabled;
    }

    public /* synthetic */ AdId(String str, boolean z10, int i10, i iVar) {
        this(str, (i10 & 2) != 0 ? false : z10);
    }
}
