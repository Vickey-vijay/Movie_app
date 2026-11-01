package androidx.privacysandbox.ads.adservices.common;

import android.net.Uri;
import ck.p;

/* JADX INFO: compiled from: AdData.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class AdData {
    private final String metadata;
    private final Uri renderUri;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdData)) {
            return false;
        }
        AdData adData = (AdData) obj;
        return p.e(this.renderUri, adData.renderUri) && p.e(this.metadata, adData.metadata);
    }

    public AdData(Uri uri, String str) {
        p.j(uri, "renderUri");
        p.j(str, "metadata");
        this.renderUri = uri;
        this.metadata = str;
    }

    public final String getMetadata() {
        return this.metadata;
    }

    public final Uri getRenderUri() {
        return this.renderUri;
    }

    public int hashCode() {
        return (this.renderUri.hashCode() * 31) + this.metadata.hashCode();
    }

    public String toString() {
        return "AdData: renderUri=" + this.renderUri + ", metadata='" + this.metadata + '\'';
    }
}
