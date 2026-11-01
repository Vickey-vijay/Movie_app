package androidx.privacysandbox.ads.adservices.adselection;

import android.net.Uri;
import ck.p;

/* JADX INFO: compiled from: AdSelectionOutcome.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class AdSelectionOutcome {
    private final long adSelectionId;
    private final Uri renderUri;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdSelectionOutcome)) {
            return false;
        }
        AdSelectionOutcome adSelectionOutcome = (AdSelectionOutcome) obj;
        return this.adSelectionId == adSelectionOutcome.adSelectionId && p.e(this.renderUri, adSelectionOutcome.renderUri);
    }

    public AdSelectionOutcome(long j10, Uri uri) {
        p.j(uri, "renderUri");
        this.adSelectionId = j10;
        this.renderUri = uri;
    }

    public final long getAdSelectionId() {
        return this.adSelectionId;
    }

    public final Uri getRenderUri() {
        return this.renderUri;
    }

    public int hashCode() {
        return (Long.hashCode(this.adSelectionId) * 31) + this.renderUri.hashCode();
    }

    public String toString() {
        return "AdSelectionOutcome: adSelectionId=" + this.adSelectionId + ", renderUri=" + this.renderUri;
    }
}
