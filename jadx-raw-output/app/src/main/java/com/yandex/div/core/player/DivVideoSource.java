package com.yandex.div.core.player;

import android.net.Uri;
import ck.p;

/* JADX INFO: compiled from: DivVideoSource.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class DivVideoSource {
    private final Long bitrate;
    private final String mimeType;
    private final DivVideoResolution resolution;
    private final Uri url;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DivVideoSource)) {
            return false;
        }
        DivVideoSource divVideoSource = (DivVideoSource) obj;
        return p.e(this.url, divVideoSource.url) && p.e(this.mimeType, divVideoSource.mimeType) && p.e(this.resolution, divVideoSource.resolution) && p.e(this.bitrate, divVideoSource.bitrate);
    }

    public int hashCode() {
        int iHashCode = ((this.url.hashCode() * 31) + this.mimeType.hashCode()) * 31;
        DivVideoResolution divVideoResolution = this.resolution;
        int iHashCode2 = (iHashCode + (divVideoResolution == null ? 0 : divVideoResolution.hashCode())) * 31;
        Long l10 = this.bitrate;
        return iHashCode2 + (l10 != null ? l10.hashCode() : 0);
    }

    public String toString() {
        return "DivVideoSource(url=" + this.url + ", mimeType=" + this.mimeType + ", resolution=" + this.resolution + ", bitrate=" + this.bitrate + ')';
    }

    public DivVideoSource(Uri uri, String str, DivVideoResolution divVideoResolution, Long l10) {
        this.url = uri;
        this.mimeType = str;
        this.resolution = divVideoResolution;
        this.bitrate = l10;
    }
}
