package androidx.media3.exoplayer.dash.manifest;

import android.net.Uri;
import androidx.annotation.Nullable;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.UriUtil;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* JADX INFO: loaded from: classes9.dex */
@UnstableApi
public final class RangedUri {
    private int hashCode;
    public final long length;
    private final String referenceUri;
    public final long start;

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || RangedUri.class != obj.getClass()) {
            return false;
        }
        RangedUri rangedUri = (RangedUri) obj;
        return this.start == rangedUri.start && this.length == rangedUri.length && this.referenceUri.equals(rangedUri.referenceUri);
    }

    public int hashCode() {
        if (this.hashCode == 0) {
            this.hashCode = ((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + ((int) this.start)) * 31) + ((int) this.length)) * 31) + this.referenceUri.hashCode();
        }
        return this.hashCode;
    }

    public Uri resolveUri(String str) {
        return UriUtil.resolveToUri(str, this.referenceUri);
    }

    public String resolveUriString(String str) {
        return UriUtil.resolve(str, this.referenceUri);
    }

    public String toString() {
        return "RangedUri(referenceUri=" + this.referenceUri + ", start=" + this.start + ", length=" + this.length + ")";
    }

    public RangedUri(@Nullable String str, long j10, long j11) {
        this.referenceUri = str == null ? "" : str;
        this.start = j10;
        this.length = j11;
    }

    @Nullable
    public RangedUri attemptMerge(@Nullable RangedUri rangedUri, String str) {
        String strResolveUriString = resolveUriString(str);
        if (rangedUri != null && strResolveUriString.equals(rangedUri.resolveUriString(str))) {
            long j10 = this.length;
            long j11 = -1;
            if (j10 != -1) {
                long j12 = this.start;
                if (j12 + j10 == rangedUri.start) {
                    long j13 = rangedUri.length;
                    if (j13 != -1) {
                        j11 = j10 + j13;
                    }
                    return new RangedUri(strResolveUriString, j12, j11);
                }
            }
            long j14 = rangedUri.length;
            if (j14 != -1) {
                long j15 = rangedUri.start;
                if (j15 + j14 == this.start) {
                    if (j10 != -1) {
                        j11 = j14 + j10;
                    }
                    return new RangedUri(strResolveUriString, j15, j11);
                }
            }
        }
        return null;
    }
}
