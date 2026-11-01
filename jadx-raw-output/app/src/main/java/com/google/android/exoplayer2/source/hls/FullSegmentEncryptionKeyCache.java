package com.google.android.exoplayer2.source.hls;

import android.net.Uri;
import androidx.annotation.Nullable;
import g5.a;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public final class FullSegmentEncryptionKeyCache {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap<Uri, byte[]> f19554a;

    @Nullable
    public byte[] a(@Nullable Uri uri) {
        if (uri == null) {
            return null;
        }
        return this.f19554a.get(uri);
    }

    @Nullable
    public byte[] b(Uri uri, byte[] bArr) {
        return this.f19554a.put((Uri) a.e(uri), (byte[]) a.e(bArr));
    }

    @Nullable
    public byte[] c(Uri uri) {
        return this.f19554a.remove(a.e(uri));
    }

    public FullSegmentEncryptionKeyCache(final int i10) {
        this.f19554a = new LinkedHashMap<Uri, byte[]>(i10 + 1, 1.0f, false) { // from class: com.google.android.exoplayer2.source.hls.FullSegmentEncryptionKeyCache.1
            @Override // java.util.LinkedHashMap
            public boolean removeEldestEntry(Map.Entry<Uri, byte[]> entry) {
                if (size() > i10) {
                    return true;
                }
                return false;
            }
        };
    }
}
