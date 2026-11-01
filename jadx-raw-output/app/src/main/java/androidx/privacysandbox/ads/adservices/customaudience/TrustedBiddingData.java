package androidx.privacysandbox.ads.adservices.customaudience;

import android.net.Uri;
import ck.p;
import java.util.List;

/* JADX INFO: compiled from: TrustedBiddingData.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class TrustedBiddingData {
    private final List<String> trustedBiddingKeys;
    private final Uri trustedBiddingUri;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TrustedBiddingData)) {
            return false;
        }
        TrustedBiddingData trustedBiddingData = (TrustedBiddingData) obj;
        return p.e(this.trustedBiddingUri, trustedBiddingData.trustedBiddingUri) && p.e(this.trustedBiddingKeys, trustedBiddingData.trustedBiddingKeys);
    }

    public final List<String> getTrustedBiddingKeys() {
        return this.trustedBiddingKeys;
    }

    public final Uri getTrustedBiddingUri() {
        return this.trustedBiddingUri;
    }

    public int hashCode() {
        return (this.trustedBiddingUri.hashCode() * 31) + this.trustedBiddingKeys.hashCode();
    }

    public String toString() {
        return "TrustedBiddingData: trustedBiddingUri=" + this.trustedBiddingUri + " trustedBiddingKeys=" + this.trustedBiddingKeys;
    }

    public TrustedBiddingData(Uri uri, List<String> list) {
        p.j(uri, "trustedBiddingUri");
        p.j(list, "trustedBiddingKeys");
        this.trustedBiddingUri = uri;
        this.trustedBiddingKeys = list;
    }
}
